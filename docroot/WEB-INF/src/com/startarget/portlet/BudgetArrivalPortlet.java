package com.startarget.portlet;

import java.io.IOException;

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

/**
 * Portlet implementation class BudgetArrivalPortlet
 */
public class BudgetArrivalPortlet extends MVCPortlet {

  private static Logger logger = LoggerFactory.getLogger(BudgetPortlet.class);

  private BudgetBusinessLogic businessLogic = new BudgetBusinessLogic();

  @Override
  public void render(RenderRequest request, RenderResponse response) throws IOException, PortletException {

    try {
      logger.info("render");
      request.setAttribute("budgetArrivals", businessLogic.getBudgetArrivals());
    } catch (SystemException e) {
      logger.warn("Fail to get budget arrivals.");
    }
    super.render(request, response);
  }

  public void addBudgetArrival(ActionRequest request, ActionResponse response) throws PortalException, SystemException {

    try {
      logger.info("addBudgetArrival");

      long operatorId = ParamUtil.getLong(request, "operatorId");
      String operatorName = ParamUtil.getString(request, "operatorName");
      double arrivalTotal = ParamUtil.getDouble(request, "arrivalTotal");
      String projectName = ParamUtil.getString(request, "projectName");
      String budgetName = ParamUtil.getString(request, "budgetName");

      businessLogic.updateBudgetArrival(operatorId, operatorName, arrivalTotal, projectName, budgetName);

      SessionMessages.add(request, "add budget arrival");

    } catch (SystemException e) {
      logger.warn("Fail to add budget arrivals");
    }
  }
}
