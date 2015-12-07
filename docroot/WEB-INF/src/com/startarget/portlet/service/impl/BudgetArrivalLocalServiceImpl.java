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

import com.liferay.portal.kernel.exception.SystemException;
import com.startarget.portlet.model.BudgetArrival;
import com.startarget.portlet.service.base.BudgetArrivalLocalServiceBaseImpl;

/**
 * The implementation of the budget arrival local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun
 * ServiceBuilder to copy their definitions into the
 * {@link com.startarget.portlet.service.BudgetArrivalLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the
 * propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author chaojie
 * @see com.startarget.portlet.service.base.BudgetArrivalLocalServiceBaseImpl
 * @see com.startarget.portlet.service.BudgetArrivalLocalServiceUtil
 */
public class BudgetArrivalLocalServiceImpl extends BudgetArrivalLocalServiceBaseImpl {
  /*
   * NOTE FOR DEVELOPERS:
   * 
   * Never reference this interface directly. Always use {@link
   * com.startarget.portlet.service.BudgetArrivalLocalServiceUtil} to access the budget arrival
   * local service.
   */
  @Override
  public List<BudgetArrival> getBudgetArrival() throws SystemException {
    return budgetArrivalPersistence.findAll();
  }

  public BudgetArrival addBudgetArrival(long operatorId, String operatorName, double arrivalTotal, String projectName,
      String budgetName) throws SystemException {
    long budgetArrivalId = counterLocalService.increment();
    BudgetArrival budgetArrival = budgetArrivalPersistence.create(budgetArrivalId);
    budgetArrival.setOperatorId(operatorId);
    budgetArrival.setOperatorName(operatorName);
    budgetArrival.setArrivalTotal(arrivalTotal);
    budgetArrival.setProjectName(projectName);
    budgetArrival.setBudgetName(budgetName);

    budgetArrivalPersistence.update(budgetArrival);

    return budgetArrival;
  }
}
