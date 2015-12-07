/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free Software Foundation; either version
 * 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

package com.startarget.portlet.service.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.startarget.portlet.model.BudgetItem;
import com.startarget.portlet.service.base.BudgetItemLocalServiceBaseImpl;

/**
 * The implementation of the budget item local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun
 * ServiceBuilder to copy their definitions into the
 * {@link com.startarget.portlet.service.BudgetItemLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the
 * propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author chaojie
 * @see com.startarget.portlet.service.base.BudgetItemLocalServiceBaseImpl
 * @see com.startarget.portlet.service.BudgetItemLocalServiceUtil
 */
public class BudgetItemLocalServiceImpl extends BudgetItemLocalServiceBaseImpl {
  /*
   * NOTE FOR DEVELOPERS:
   * 
   * Never reference this interface directly. Always use {@link
   * com.startarget.portlet.service.BudgetItemLocalServiceUtil} to access the budget item local
   * service.
   */
  @Override
  public BudgetItem addBudgetItem(long budgetId, long accountItemId, String accountItemName, long itemCode,
      double budgetTotal) throws SystemException {
    long budgetItemId = counterLocalService.increment();
    BudgetItem budgetItem = budgetItemPersistence.create(budgetItemId);
    budgetItem.setBudgetId(budgetId);
    budgetItem.setAccountItemId(accountItemId);
    budgetItem.setAccountItemName(accountItemName);
    budgetItem.setItemCode(itemCode);
    budgetItem.setBudgetTotal(budgetTotal);
    budgetItem.setBudgetUsed(0);
    budgetItemPersistence.update(budgetItem);
    return budgetItem;
  }

  public void deleteBudgetItemsByBudgetId(long budgetId) throws SystemException {
    DynamicQuery query = DynamicQueryFactoryUtil.forClass(BudgetItem.class);
    query.add(PropertyFactoryUtil.forName("budgetId").eq(budgetId));
    List<BudgetItem> items = budgetItemPersistence.findWithDynamicQuery(query);
    for (BudgetItem item : items) {
      budgetItemPersistence.remove(item);
    }

  }

  @Override
  public List<BudgetItem> getBudgetItemsByBudgetId(long budgetId) throws SystemException {
    DynamicQuery query = DynamicQueryFactoryUtil.forClass(BudgetItem.class);
    query.add(PropertyFactoryUtil.forName("budgetId").eq(budgetId));
    return budgetItemPersistence.findWithDynamicQuery(query);
  }


}
