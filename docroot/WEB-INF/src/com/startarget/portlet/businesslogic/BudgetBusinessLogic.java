package com.startarget.portlet.businesslogic;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.liferay.portal.kernel.exception.SystemException;
import com.startarget.portlet.model.BudgetArrival;
import com.startarget.portlet.service.BudgetArrivalLocalServiceUtil;
import com.startarget.portlet.service.BudgetLocalServiceUtil;

public class BudgetBusinessLogic implements BusinessLogic {

  private static Logger logger = LoggerFactory.getLogger(BudgetBusinessLogic.class);

  public void updateBudgetArrival(long operatorId, String operatorName, double arrivalTotal, String projectName,
      String budgetName) throws SystemException {
    logger.info("updateBudgetArrival");
    BudgetArrivalLocalServiceUtil.addBudgetArrival(operatorId, operatorName, arrivalTotal, projectName, budgetName);
    BudgetLocalServiceUtil.updateBudgetArraival(projectName, budgetName, arrivalTotal);
  }

  public List<BudgetArrival> getBudgetArrivals() throws SystemException {
    logger.info("getBudgetArrivals");
    List<BudgetArrival> budgetArrivals = BudgetArrivalLocalServiceUtil.getBudgetArrival();
    return budgetArrivals;
  }

}
