package com.startarget.util;

import java.util.Comparator;

import com.startarget.portlet.model.AccountItem;

public class AccountItemComparator implements Comparator<AccountItem> {

  @Override
  public int compare(AccountItem o1, AccountItem o2) {
    long l1 = o1.getItemCode();
    long l2 = o2.getItemCode();

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
