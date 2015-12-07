package com.startarget.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.startarget.portlet.businesslogic.BudgetBusinessLogic;
import com.startarget.portlet.businesslogic.BusinessLogic;
import com.startarget.portlet.model.AccountItem;
import com.startarget.portlet.service.AccountItemLocalServiceUtil;
import com.startarget.util.AccountItemComparator;

/**
 * Portlet implementation class AccountItemPortlet
 */
public class AccountItemPortlet extends MVCPortlet {

  private static Logger logger = LoggerFactory.getLogger(AccountItemPortlet.class);

  private BusinessLogic businessLogic = new BudgetBusinessLogic();

  @Override
  public void render(RenderRequest request, RenderResponse response) throws PortletException, IOException {

    try {
      loadAllAccountItems(request);
      loadCurrentAccountItem(request);
    } catch (SystemException e) {
      logger.error(e.getMessage());
    } catch (NumberFormatException e) {
      logger.error(e.getMessage());
    } catch (PortalException e) {
      logger.error(e.getMessage());
    }

    super.render(request, response);

  }

  private void loadAllAccountItems(RenderRequest request) throws SystemException {

    logger.info("loadAllAccountItems");

    List<AccountItem> items = AccountItemLocalServiceUtil.getAccountItems();
    logger.info("account item number=" + items.size());
    List<AccountItem> itemLists = new ArrayList<AccountItem>();
    itemLists.addAll(items);
    Collections.sort(itemLists, new AccountItemComparator());
    request.setAttribute("items", itemLists);

    listAllItems(itemLists);
  }

  private void listAllItems(List<AccountItem> items) {
    for (AccountItem item : items) {
      logger.info("accountItemId=" + item.getAccountItemId());
      logger.info("accountItemCode=" + item.getItemCode());
      logger.info("accountItemName=" + item.getName());
      logger.info("accountItemParentName=" + item.getParentName());
    }
  }

  private void loadCurrentAccountItem(RenderRequest request) throws NumberFormatException, SystemException,
      PortalException {

    logger.info("loadCurrentAccountItem");

    String accountItemId = ParamUtil.getString(request, "accountItemId");
    logger.info("accountItemId = " + accountItemId);

    if (accountItemId != null && !accountItemId.equals("")) {
      AccountItem accountItem = AccountItemLocalServiceUtil.getAccountItem(Long.valueOf(accountItemId));
      request.setAttribute("currentAccountItem", accountItem);
    }
  }

  public void deleteAccountItem(ActionRequest request, ActionResponse response) throws PortalException, SystemException {
    long accountItemId = ParamUtil.getLong(request, "accountItemId");

    long itemCode = AccountItemLocalServiceUtil.getAccountItem(accountItemId).getItemCode();

    // delete all child nodes
    List<AccountItem> itemList = AccountItemLocalServiceUtil.getAccountItems();
    for (AccountItem item : itemList) {
      long tempCode = item.getItemCode();
      if (String.valueOf(tempCode).startsWith(String.valueOf(itemCode))) {
        AccountItemLocalServiceUtil.deleteAccountItem(item.getAccountItemId());
      }
    }
  }

  public void editAccountItem(ActionRequest request, ActionResponse response) {
    try {
      logger.info("editAccountItem");

      long accountItemId = ParamUtil.getLong(request, "accountItemId");
      long itemCode = ParamUtil.getLong(request, "itemCode");
      String name = ParamUtil.getString(request, "name");
      String parentName = ParamUtil.getString(request, "parentName");

      logger.info("accountItemId=" + accountItemId);
      logger.info("accountItemCode=" + itemCode);
      logger.info("accountItemName=" + name);
      logger.info("accountItemParentName=" + parentName);

      AccountItem accountItem = AccountItemLocalServiceUtil.getAccountItem(accountItemId);
      accountItem.setAccountItemId(accountItemId);
      accountItem.setItemCode(itemCode);
      accountItem.setName(name);
      accountItem.setParentName(parentName);

      AccountItemLocalServiceUtil.updateAccountItem(accountItem);
    } catch (SystemException e) {
      e.printStackTrace();
    } catch (PortalException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  public void addAccountItem(ActionRequest request, ActionResponse response) throws PortalException, SystemException {

    try {
      logger.info("addAccountItem");

      long itemCode = ParamUtil.getLong(request, "itemCode");
      String name = ParamUtil.getString(request, "name");
      String parentName = ParamUtil.getString(request, "parentName");

      logger.info("itemCode = " + itemCode);
      logger.info("name = " + name);
      logger.info("parentName = " + parentName);

      List<AccountItem> accountItems = AccountItemLocalServiceUtil.getAccountItemByItemCode(itemCode);

      if (accountItems.size() == 0) {
        AccountItemLocalServiceUtil.addAccountItem(itemCode, name, parentName);
        SessionMessages.add(request, "account item added");
      }

    } catch (SystemException e) {
      e.printStackTrace();
    }
  }


}
