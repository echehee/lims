package com.startarget.portlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.startarget.portlet.businesslogic.BudgetReportBusinessLogic;
import com.startarget.portlet.businesslogic.model.BudgetReport;

/**
 * Portlet implementation class QueryBudgetPortlet
 */
public class QueryBudgetPortlet extends MVCPortlet {

  private static Logger logger = LoggerFactory.getLogger(QueryBudgetPortlet.class);

  private BudgetReportBusinessLogic businessLogic = new BudgetReportBusinessLogic();

  @Override
  public void render(RenderRequest request, RenderResponse response) throws PortletException, IOException {

    try {
      logger.info("render");
      List<BudgetReport> reports = businessLogic.getBudgetReports();
      request.setAttribute("reports", reports);

    } catch (SystemException e) {
      logger.warn("Fail to initialize budget reports");
    }
    super.render(request, response);
  }
}
