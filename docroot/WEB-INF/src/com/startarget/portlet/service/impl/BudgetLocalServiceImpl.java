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

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.startarget.portlet.model.Budget;
import com.startarget.portlet.service.base.BudgetLocalServiceBaseImpl;

/**
 * The implementation of the budget local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun
 * ServiceBuilder to copy their definitions into the
 * {@link com.startarget.portlet.service.BudgetLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the
 * propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author chaojie
 * @see com.startarget.portlet.service.base.BudgetLocalServiceBaseImpl
 * @see com.startarget.portlet.service.BudgetLocalServiceUtil
 */
public class BudgetLocalServiceImpl extends BudgetLocalServiceBaseImpl {
  /*
   * NOTE FOR DEVELOPERS:
   * 
   * Never reference this interface directly. Always use {@link
   * com.startarget.portlet.service.BudgetLocalServiceUtil} to access the budget local service.
   */
  @Override
  public List<Budget> getBudgets() throws SystemException {
    return budgetPersistence.findAll();
  }

  @Override
  public Budget addBudget(String projectName, String budgetName, int budgetStartYear, int budgetEndYear,
      double budgetTotal) throws SystemException {
    long budgetId = counterLocalService.increment();
    Budget budget = budgetPersistence.create(budgetId);
    budget.setProjectName(projectName);
    budget.setBudgetName(budgetName);
    budget.setBudgetStartYear(budgetStartYear);
    budget.setBudgetEndYear(budgetEndYear);
    budget.setBudgetTotal(budgetTotal);
    budget.setBudgetArrival(0);

    budgetPersistence.update(budget);

    return budget;
  }

  @Override
  public Budget updateBudgetArraival(String projectName, String budgetName, double budgetArrival)
      throws SystemException {
    DynamicQuery query = DynamicQueryFactoryUtil.forClass(Budget.class);
    query.add(PropertyFactoryUtil.forName("projectName").eq(projectName));
    query.add(PropertyFactoryUtil.forName("budgetName").eq(budgetName));
    List<Budget> budgets = budgetPersistence.findWithDynamicQuery(query);

    if (budgets.size() != 1) {
      // TODO throw exception
    }

    Budget budget = budgets.get(0);
    budget.setBudgetArrival(budgetArrival);
    budgetPersistence.update(budget);
    return budget;

  }

  @Override
  public List<String> getDistinctBudgetNames() throws SystemException {
    List<Budget> budgets = budgetPersistence.findAll();
    List<String> names = new ArrayList<String>();

    for (Budget b : budgets) {
      if (!names.contains(b.getBudgetName())) {
        names.add(b.getBudgetName());
      }
    }
    return names;
  }

  @Override
  public List<Budget> getBudget(String projectName, String budgetName, int budgetStartYear, int budgetEndYear)
      throws SystemException {
    DynamicQuery query = DynamicQueryFactoryUtil.forClass(Budget.class);
    query.add(PropertyFactoryUtil.forName("projectName").eq(projectName));
    query.add(PropertyFactoryUtil.forName("budgetName").eq(budgetName));
    query.add(PropertyFactoryUtil.forName("budgetStartYear").eq(budgetStartYear));
    query.add(PropertyFactoryUtil.forName("budgetEndYear").eq(budgetEndYear));
    return budgetPersistence.findWithDynamicQuery(query);
  }

  @Override
  public List<Budget> getBudget(String projectName, String budgetName) throws SystemException {
    DynamicQuery query = DynamicQueryFactoryUtil.forClass(Budget.class);
    query.add(PropertyFactoryUtil.forName("projectName").eq(projectName));
    query.add(PropertyFactoryUtil.forName("budgetName").eq(budgetName));
    return budgetPersistence.findWithDynamicQuery(query);
  }

}
