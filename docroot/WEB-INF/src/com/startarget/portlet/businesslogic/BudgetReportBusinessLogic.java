package com.startarget.portlet.businesslogic;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.startarget.portlet.businesslogic.model.BudgetReport;
import com.startarget.portlet.model.Budget;
import com.startarget.portlet.service.BudgetLocalServiceUtil;

public class BudgetReportBusinessLogic implements BusinessLogic {

  public List<BudgetReport> getBudgetReports() throws SystemException {
    List<Budget> budgets = BudgetLocalServiceUtil.getBudgets();
    List<BudgetReport> reports = new ArrayList<BudgetReport>();

    for (Budget b : budgets) {
      BudgetReport report = new BudgetReport(b);
      reports.add(report);
    }
    return reports;
  }

}
