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

package com.startarget.portlet.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.startarget.portlet.model.BudgetArrival;

/**
 * The persistence interface for the budget arrival service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author chaojie
 * @see BudgetArrivalPersistenceImpl
 * @see BudgetArrivalUtil
 * @generated
 */
public interface BudgetArrivalPersistence extends BasePersistence<BudgetArrival> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BudgetArrivalUtil} to access the budget arrival persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the budget arrival in the entity cache if it is enabled.
	*
	* @param budgetArrival the budget arrival
	*/
	public void cacheResult(
		com.startarget.portlet.model.BudgetArrival budgetArrival);

	/**
	* Caches the budget arrivals in the entity cache if it is enabled.
	*
	* @param budgetArrivals the budget arrivals
	*/
	public void cacheResult(
		java.util.List<com.startarget.portlet.model.BudgetArrival> budgetArrivals);

	/**
	* Creates a new budget arrival with the primary key. Does not add the budget arrival to the database.
	*
	* @param budgetArrivalId the primary key for the new budget arrival
	* @return the new budget arrival
	*/
	public com.startarget.portlet.model.BudgetArrival create(
		long budgetArrivalId);

	/**
	* Removes the budget arrival with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param budgetArrivalId the primary key of the budget arrival
	* @return the budget arrival that was removed
	* @throws com.startarget.portlet.NoSuchBudgetArrivalException if a budget arrival with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.startarget.portlet.model.BudgetArrival remove(
		long budgetArrivalId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.startarget.portlet.NoSuchBudgetArrivalException;

	public com.startarget.portlet.model.BudgetArrival updateImpl(
		com.startarget.portlet.model.BudgetArrival budgetArrival)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the budget arrival with the primary key or throws a {@link com.startarget.portlet.NoSuchBudgetArrivalException} if it could not be found.
	*
	* @param budgetArrivalId the primary key of the budget arrival
	* @return the budget arrival
	* @throws com.startarget.portlet.NoSuchBudgetArrivalException if a budget arrival with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.startarget.portlet.model.BudgetArrival findByPrimaryKey(
		long budgetArrivalId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.startarget.portlet.NoSuchBudgetArrivalException;

	/**
	* Returns the budget arrival with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param budgetArrivalId the primary key of the budget arrival
	* @return the budget arrival, or <code>null</code> if a budget arrival with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.startarget.portlet.model.BudgetArrival fetchByPrimaryKey(
		long budgetArrivalId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the budget arrivals.
	*
	* @return the budget arrivals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.startarget.portlet.model.BudgetArrival> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the budget arrivals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.startarget.portlet.model.impl.BudgetArrivalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of budget arrivals
	* @param end the upper bound of the range of budget arrivals (not inclusive)
	* @return the range of budget arrivals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.startarget.portlet.model.BudgetArrival> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the budget arrivals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.startarget.portlet.model.impl.BudgetArrivalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of budget arrivals
	* @param end the upper bound of the range of budget arrivals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of budget arrivals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.startarget.portlet.model.BudgetArrival> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the budget arrivals from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of budget arrivals.
	*
	* @return the number of budget arrivals
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}