package com.startarget.portlet.businesslogic.model;

import com.startarget.portlet.model.BudgetItem;

public class BudgetReportSummary implements Comparable<BudgetReportSummary> {

  private long budgetId;
  private long itemCode;
  private String itemName;
  private double budgetTotal;
  private double budgetUsed;
  private double budgetLeft;

  public BudgetReportSummary(BudgetItem item) {
    this.budgetId = item.getBudgetId();
    this.itemCode = item.getItemCode();
    this.itemName = item.getAccountItemName();
    this.budgetTotal = item.getBudgetTotal();
    this.budgetUsed = item.getBudgetUsed();
    this.budgetLeft = this.budgetTotal - this.budgetUsed;
  }

  public long getBudgetId() {
    return budgetId;
  }

  public void setBudgetId(long budgetId) {
    this.budgetId = budgetId;
  }

  public long getItemCode() {
    return itemCode;
  }

  public void setItemCode(long itemCode) {
    this.itemCode = itemCode;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public double getBudgetTotal() {
    return budgetTotal;
  }

  public void setBudgetTotal(double budgetTotal) {
    this.budgetTotal = budgetTotal;
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

  @Override
  public int compareTo(BudgetReportSummary o) {
    long l1 = this.getItemCode();
    long l2 = o.getItemCode();

    l1 = formatNumber(l1);
    l2 = formatNumber(l2);

    if (l1 < l2)
      return -1;
    if (l1 == l2) {
      return 0;
    }
    return 1;
  }

  private long formatNumber(long value) {
    if (value < 10000)
      return value * 10000;
    if (value < 1000000)
      return value * 100;
    return value;
  }



}
