/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.startarget.portlet.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BudgetLocalService}.
 *
 * @author chaojie
 * @see BudgetLocalService
 * @generated
 */
public class BudgetLocalServiceWrapper implements BudgetLocalService,
	ServiceWrapper<BudgetLocalService> {
	public BudgetLocalServiceWrapper(BudgetLocalService budgetLocalService) {
		_budgetLocalService = budgetLocalService;
	}

	/**
	* Adds the budget to the database. Also notifies the appropriate model listeners.
	*
	* @param budget the budget
	* @return the budget that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.startarget.portlet.model.Budget addBudget(
		com.startarget.portlet.model.Budget budget)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetLocalService.addBudget(budget);
	}

	/**
	* Creates a new budget with the primary key. Does not add the budget to the database.
	*
	* @param budgetId the primary key for the new budget
	* @return the new budget
	*/
	@Override
	public com.startarget.portlet.model.Budget createBudget(long budgetId) {
		return _budgetLocalService.createBudget(budgetId);
	}

	/**
	* Deletes the budget with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param budgetId the primary key of the budget
	* @return the budget that was removed
	* @throws PortalException if a budget with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.startarget.portlet.model.Budget deleteBudget(long budgetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _budgetLocalService.deleteBudget(budgetId);
	}

	/**
	* Deletes the budget from the database. Also notifies the appropriate model listeners.
	*
	* @param budget the budget
	* @return the budget that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.startarget.portlet.model.Budget deleteBudget(
		com.startarget.portlet.model.Budget budget)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetLocalService.deleteBudget(budget);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _budgetLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.startarget.portlet.model.impl.BudgetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.startarget.portlet.model.impl.BudgetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.startarget.portlet.model.Budget fetchBudget(long budgetId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetLocalService.fetchBudget(budgetId);
	}

	/**
	* Returns the budget with the primary key.
	*
	* @param budgetId the primary key of the budget
	* @return the budget
	* @throws PortalException if a budget with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.startarget.portlet.model.Budget getBudget(long budgetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _budgetLocalService.getBudget(budgetId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _budgetLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the budgets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.startarget.portlet.model.impl.BudgetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of budgets
	* @param end the upper bound of the range of budgets (not inclusive)
	* @return the range of budgets
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.startarget.portlet.model.Budget> getBudgets(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetLocalService.getBudgets(start, end);
	}

	/**
	* Returns the number of budgets.
	*
	* @return the number of budgets
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getBudgetsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetLocalService.getBudgetsCount();
	}

	/**
	* Updates the budget in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param budget the budget
	* @return the budget that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.startarget.portlet.model.Budget updateBudget(
		com.startarget.portlet.model.Budget budget)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetLocalService.updateBudget(budget);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _budgetLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_budgetLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _budgetLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.startarget.portlet.model.Budget> getBudgets()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetLocalService.getBudgets();
	}

	@Override
	public com.startarget.portlet.model.Budget addBudget(
		java.lang.String projectName, java.lang.String budgetName,
		int budgetStartYear, int budgetEndYear, double budgetTotal)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetLocalService.addBudget(projectName, budgetName,
			budgetStartYear, budgetEndYear, budgetTotal);
	}

	@Override
	public com.startarget.portlet.model.Budget updateBudgetArraival(
		java.lang.String projectName, java.lang.String budgetName,
		double budgetArrival)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetLocalService.updateBudgetArraival(projectName,
			budgetName, budgetArrival);
	}

	@Override
	public java.util.List<java.lang.String> getDistinctBudgetNames()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetLocalService.getDistinctBudgetNames();
	}

	@Override
	public java.util.List<com.startarget.portlet.model.Budget> getBudget(
		java.lang.String projectName, java.lang.String budgetName,
		int budgetStartYear, int budgetEndYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetLocalService.getBudget(projectName, budgetName,
			budgetStartYear, budgetEndYear);
	}

	@Override
	public java.util.List<com.startarget.portlet.model.Budget> getBudget(
		java.lang.String projectName, java.lang.String budgetName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetLocalService.getBudget(projectName, budgetName);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public BudgetLocalService getWrappedBudgetLocalService() {
		return _budgetLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedBudgetLocalService(
		BudgetLocalService budgetLocalService) {
		_budgetLocalService = budgetLocalService;
	}

	@Override
	public BudgetLocalService getWrappedService() {
		return _budgetLocalService;
	}

	@Override
	public void setWrappedService(BudgetLocalService budgetLocalService) {
		_budgetLocalService = budgetLocalService;
	}

	private BudgetLocalService _budgetLocalService;
}