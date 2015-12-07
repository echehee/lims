package com.startarget.portlet.businesslogic.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.liferay.portal.kernel.exception.SystemException;
import com.startarget.portlet.model.Budget;
import com.startarget.portlet.model.BudgetItem;
import com.startarget.portlet.model.Project;
import com.startarget.portlet.service.BudgetItemLocalServiceUtil;
import com.startarget.portlet.service.ProjectLocalServiceUtil;

public class BudgetReport {

  private static Logger logger = LoggerFactory.getLogger(BudgetReport.class);

  private Budget budget;

  private long budgetId;
  private String projectName;
  private String projectLeader;
  private String budgetName;
  private int budgetStartYear;
  private int budgetEndYear;
  private double budgetTotal;
  private double budgetArrival;
  private double budgetUsed;
  private double budgetLeft;

  private List<BudgetReportSummary> summary = new ArrayList<BudgetReportSummary>();

  public BudgetReport(Budget budget) {
    this.budget = budget;
    init();
  }

  private void init() {
    try {
      this.budgetId = this.budget.getBudgetId();
      this.projectName = this.budget.getProjectName();
      List<Project> projects = ProjectLocalServiceUtil.getProjectsByName(this.projectName);
      if (projects.size() != 1) {
        logger.warn("Fail to initizlize budget report for budgetId=" + budgetId);
      }
      this.projectLeader = projects.get(0).getProjectLeader();

      this.budgetName = this.budget.getBudgetName();
      this.budgetStartYear = this.budget.getBudgetStartYear();
      this.budgetEndYear = this.budget.getBudgetEndYear();
      this.budgetTotal = this.budget.getBudgetTotal();
      this.budgetArrival = this.budget.getBudgetArrival();
      this.budgetUsed = getBudgetTotal(this.budget.getBudgetId());
      this.budgetLeft = this.budgetArrival - this.budgetUsed;


      List<BudgetItem> items = BudgetItemLocalServiceUtil.getBudgetItemsByBudgetId(this.budgetId);
      for (BudgetItem item : items) {
        summary.add(new BudgetReportSummary(item));
      }
      Collections.sort(summary);

    } catch (SystemException e) {
      logger.warn("Fail to initizlize budget report for budgetId=" + budgetId);
    }
  }

  private double getBudgetTotal(long budgetId) throws SystemException {
    double total = 0;
    List<BudgetItem> budgetItems = BudgetItemLocalServiceUtil.getBudgetItemsByBudgetId(budgetId);
    for (BudgetItem item : budgetItems) {
      total += item.getBudgetUsed();
    }
    return total;
  }

  public long getBudgetId() {
    return budgetId;
  }

  public void setBudgetId(long budgetId) {
    this.budgetId = budgetId;
  }

  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public String getBudgetName() {
    return budgetName;
  }

  public void setBudgetName(String budgetName) {
    this.budgetName = budgetName;
  }

  public String getProjectLeader() {
    return projectLeader;
  }

  public void setProjectLeader(String projectLeader) {
    this.projectLeader = projectLeader;
  }

  public int getBudgetStartYear() {
    return budgetStartYear;
  }

  public void setBudgetStartYear(int budgetStartYear) {
    this.budgetStartYear = budgetStartYear;
  }

  public int getBudgetEndYear() {
    return budgetEndYear;
  }

  public void setBudgetEndYear(int budgetEndYear) {
    this.budgetEndYear = budgetEndYear;
  }

  public double getBudgetTotal() {
    return budgetTotal;
  }

  public void setBudgetTotal(double budgetTotal) {
    this.budgetTotal = budgetTotal;
  }

  public double getBudgetArrival() {
    return budgetArrival;
  }

  public void setBudgetArrival(double budgetArrival) {
    this.budgetArrival = budgetArrival;
  }

  public double getBudgetUsed() {
    return budgetUsed;
  }

  public void setBudgetUsed(double budgetUsed) {
    this.budgetUsed = budgetUsed;
  }

  public double getBudgetLeft() {
    return budgetLeft;
  }

  public void setBudgetLeft(double budgetLeft) {
    this.budgetLeft = budgetLeft;
  }

  public List<BudgetReportSummary> getSummary() {
    return summary;
  }

  public void setSummary(List<BudgetReportSummary> summary) {
    this.summary = summary;
  }



}
