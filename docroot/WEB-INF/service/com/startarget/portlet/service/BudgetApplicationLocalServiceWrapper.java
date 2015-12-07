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
 * Provides a wrapper for {@link BudgetApplicationLocalService}.
 *
 * @author chaojie
 * @see BudgetApplicationLocalService
 * @generated
 */
public class BudgetApplicationLocalServiceWrapper
	implements BudgetApplicationLocalService,
		ServiceWrapper<BudgetApplicationLocalService> {
	public BudgetApplicationLocalServiceWrapper(
		BudgetApplicationLocalService budgetApplicationLocalService) {
		_budgetApplicationLocalService = budgetApplicationLocalService;
	}

	/**
	* Adds the budget application to the database. Also notifies the appropriate model listeners.
	*
	* @param budgetApplication the budget application
	* @return the budget application that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.startarget.portlet.model.BudgetApplication addBudgetApplication(
		com.startarget.portlet.model.BudgetApplication budgetApplication)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetApplicationLocalService.addBudgetApplication(budgetApplication);
	}

	/**
	* Creates a new budget application with the primary key. Does not add the budget application to the database.
	*
	* @param budgetApplicationId the primary key for the new budget application
	* @return the new budget application
	*/
	@Override
	public com.startarget.portlet.model.BudgetApplication createBudgetApplication(
		long budgetApplicationId) {
		return _budgetApplicationLocalService.createBudgetApplication(budgetApplicationId);
	}

	/**
	* Deletes the budget application with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param budgetApplicationId the primary key of the budget application
	* @return the budget application that was removed
	* @throws PortalException if a budget application with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.startarget.portlet.model.BudgetApplication deleteBudgetApplication(
		long budgetApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _budgetApplicationLocalService.deleteBudgetApplication(budgetApplicationId);
	}

	/**
	* Deletes the budget application from the database. Also notifies the appropriate model listeners.
	*
	* @param budgetApplication the budget application
	* @return the budget application that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.startarget.portlet.model.BudgetApplication deleteBudgetApplication(
		com.startarget.portlet.model.BudgetApplication budgetApplication)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetApplicationLocalService.deleteBudgetApplication(budgetApplication);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _budgetApplicationLocalService.dynamicQuery();
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
		return _budgetApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.startarget.portlet.model.impl.BudgetApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _budgetApplicationLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.startarget.portlet.model.impl.BudgetApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _budgetApplicationLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _budgetApplicationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _budgetApplicationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.startarget.portlet.model.BudgetApplication fetchBudgetApplication(
		long budgetApplicationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetApplicationLocalService.fetchBudgetApplication(budgetApplicationId);
	}

	/**
	* Returns the budget application with the primary key.
	*
	* @param budgetApplicationId the primary key of the budget application
	* @return the budget application
	* @throws PortalException if a budget application with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.startarget.portlet.model.BudgetApplication getBudgetApplication(
		long budgetApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _budgetApplicationLocalService.getBudgetApplication(budgetApplicationId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _budgetApplicationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the budget applications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.startarget.portlet.model.impl.BudgetApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of budget applications
	* @param end the upper bound of the range of budget applications (not inclusive)
	* @return the range of budget applications
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.startarget.portlet.model.BudgetApplication> getBudgetApplications(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetApplicationLocalService.getBudgetApplications(start, end);
	}

	/**
	* Returns the number of budget applications.
	*
	* @return the number of budget applications
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getBudgetApplicationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetApplicationLocalService.getBudgetApplicationsCount();
	}

	/**
	* Updates the budget application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param budgetApplication the budget application
	* @return the budget application that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.startarget.portlet.model.BudgetApplication updateBudgetApplication(
		com.startarget.portlet.model.BudgetApplication budgetApplication)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetApplicationLocalService.updateBudgetApplication(budgetApplication);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _budgetApplicationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_budgetApplicationLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _budgetApplicationLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public BudgetApplicationLocalService getWrappedBudgetApplicationLocalService() {
		return _budgetApplicationLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedBudgetApplicationLocalService(
		BudgetApplicationLocalService budgetApplicationLocalService) {
		_budgetApplicationLocalService = budgetApplicationLocalService;
	}

	@Override
	public BudgetApplicationLocalService getWrappedService() {
		return _budgetApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		BudgetApplicationLocalService budgetApplicationLocalService) {
		_budgetApplicationLocalService = budgetApplicationLocalService;
	}

	private BudgetApplicationLocalService _budgetApplicationLocalService;
}