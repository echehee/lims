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
import com.startarget.portlet.model.AccountItem;
import com.startarget.portlet.model.Budget;
import com.startarget.portlet.model.BudgetItem;
import com.startarget.portlet.model.Project;
import com.startarget.portlet.service.AccountItemLocalServiceUtil;
import com.startarget.portlet.service.BudgetItemLocalServiceUtil;
import com.startarget.portlet.service.BudgetLocalServiceUtil;
import com.startarget.portlet.service.ProjectLocalServiceUtil;
import com.startarget.util.AccountItemComparator;
import com.startarget.util.BudgetItemComparator;

/**
 * Portlet implementation class BudgetPortlet
 */
public class BudgetPortlet extends MVCPortlet {

  private static Logger logger = LoggerFactory.getLogger(BudgetPortlet.class);

  @Override
  public void render(RenderRequest request, RenderResponse response) throws IOException, PortletException {

    logger.info("render");

    try {
      List<Budget> budgets = BudgetLocalServiceUtil.getBudgets();
      logger.info("Budget size=" + budgets.size());
      request.setAttribute("budgets", budgets);

      // load account item template
      List<AccountItem> accountItems = AccountItemLocalServiceUtil.getAccountItems();
      List<AccountItem> accountItemList = new ArrayList<AccountItem>();
      accountItemList.addAll(accountItems);
      Collections.sort(accountItemList, new AccountItemComparator());
      request.setAttribute("accountItems", accountItemList);

      // load budget items
      long budgetId = loadCurrentBudget(request);
      if (budgetId != -1) {
        List<BudgetItem> budgetItems = BudgetItemLocalServiceUtil.getBudgetItemsByBudgetId(budgetId);
        List<BudgetItem> budgetItemList = new ArrayList<BudgetItem>();
        budgetItemList.addAll(budgetItems);
        Collections.sort(budgetItemList, new BudgetItemComparator());
        request.setAttribute("budgetItems", budgetItemList);

        for (BudgetItem item : budgetItems) {
          logger.info("accountItemId=" + item.getAccountItemId());
          logger.info("accountItemName=" + item.getAccountItemName());
          logger.info("budgetTotal=" + item.getBudgetTotal());
        }
      }

      // load projects
      List<Project> projects = ProjectLocalServiceUtil.getProjects();
      List<String> names = new ArrayList<String>();
      for (Project p : projects) {
        names.add(p.getProjectName());
      }
      request.setAttribute("projectNames", names);



    } catch (SystemException e) {
      e.printStackTrace();
    } catch (NumberFormatException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (PortalException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    super.render(request, response);
  }

  private long loadCurrentBudget(RenderRequest request) throws NumberFormatException, SystemException, PortalException {

    logger.info("loadCurrentBudget");

    String budgetId = ParamUtil.getString(request, "budgetId");
    logger.info("budgetId = " + budgetId);

    if (budgetId != null && !budgetId.equals("")) {
      Budget budget = BudgetLocalServiceUtil.getBudget(Long.valueOf(budgetId));
      request.setAttribute("currentBudget", budget);
      return Long.valueOf(budgetId);
    }
    return -1;
  }

  public void deleteBudget(ActionRequest request, ActionResponse response) throws PortalException, SystemException {
    logger.info("delete");
    long budgetId = Long.valueOf(ParamUtil.getString(request, "budgetId"));
    BudgetLocalServiceUtil.deleteBudget(budgetId);
    BudgetItemLocalServiceUtil.deleteBudgetItemsByBudgetId(budgetId);
  }

  public void editBudget(ActionRequest request, ActionResponse response) {
    try {
      logger.info("editBudget");

      long budgetId = ParamUtil.getLong(request, "budgetId");
      String projectName = ParamUtil.getString(request, "projectName");
      String budgetName = ParamUtil.getString(request, "budgetName");
      int budgetStartYear = Integer.valueOf(ParamUtil.getString(request, "budgetStartYear"));
      int budgetEndYear = Integer.valueOf(ParamUtil.getString(request, "budgetEndYear"));
      double budgetTotal = Double.valueOf(ParamUtil.getString(request, "budgetTotal"));

      Budget budget = BudgetLocalServiceUtil.getBudget(budgetId);
      budget.setProjectName(projectName);
      budget.setBudgetName(budgetName);
      budget.setBudgetStartYear(budgetStartYear);
      budget.setBudgetEndYear(budgetEndYear);
      budget.setBudgetTotal(budgetTotal);
      BudgetLocalServiceUtil.updateBudget(budget);

      List<BudgetItem> budgetItems = BudgetItemLocalServiceUtil.getBudgetItemsByBudgetId(budgetId);
      for (BudgetItem item : budgetItems) {
        long itemCode = item.getItemCode();
        String accountItemName = item.getAccountItemName();
        double value = ParamUtil.getDouble(request, accountItemName);
        long accountItemId = item.getAccountItemId();


        logger.info("budgetItemCode=" + itemCode);
        logger.info("budgetItemName=" + accountItemName);
        logger.info("budgetItemValue=" + value);
        logger.info("accountItemId=" + accountItemId);

        item.setBudgetTotal(value);

        BudgetItemLocalServiceUtil.updateBudgetItem(item);
      }

    } catch (SystemException e) {
      e.printStackTrace();
    } catch (PortalException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void addBudget(ActionRequest request, ActionResponse response) throws PortalException, SystemException {

    try {
      logger.info("addBudget");

      String projectName = ParamUtil.getString(request, "projectName");
      String budgetName = ParamUtil.getString(request, "budgetName");
      int budgetStartYear = Integer.valueOf(ParamUtil.getString(request, "budgetStartYear"));
      int budgetEndYear = Integer.valueOf(ParamUtil.getString(request, "budgetEndYear"));
      double budgetTotal = Double.valueOf(ParamUtil.getString(request, "budgetTotal"));

      List<Budget> budgets = BudgetLocalServiceUtil.getBudget(projectName, budgetName, budgetStartYear, budgetEndYear);

      if (budgets.size() == 0) {
        Budget budget =
            BudgetLocalServiceUtil.addBudget(projectName, budgetName, budgetStartYear, budgetEndYear, budgetTotal);
        long budgetId = budget.getBudgetId();

        logger.info("add new budget:");
        logger.info("projectName=" + projectName);
        logger.info("budgetName=" + budgetName);
        logger.info("budgetStartYear=" + budgetStartYear);
        logger.info("budgetEndYear=" + budgetEndYear);
        logger.info("budgetTotal=" + budgetTotal);

        List<AccountItem> accountItems = AccountItemLocalServiceUtil.getAccountItems();
        for (AccountItem item : accountItems) {
          long itemCode = item.getItemCode();
          String name = item.getName();
          String value = ParamUtil.getString(request, name);
          long accountItemId = item.getAccountItemId();

          logger.info("budgetItemCode=" + itemCode);
          logger.info("budgetItemName=" + name);
          logger.info("budgetItemValue=" + value);
          logger.info("accountItemId=" + accountItemId);

          BudgetItemLocalServiceUtil.addBudgetItem(budgetId, accountItemId, name, itemCode, Double.valueOf(value));
        }



        SessionMessages.add(request, "account item added");
      }

    } catch (SystemException e) {
      e.printStackTrace();
    }
  }


}
