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

import com.startarget.portlet.model.Budget;

/**
 * The persistence interface for the budget service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author chaojie
 * @see BudgetPersistenceImpl
 * @see BudgetUtil
 * @generated
 */
public interface BudgetPersistence extends BasePersistence<Budget> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BudgetUtil} to access the budget persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the budget in the entity cache if it is enabled.
	*
	* @param budget the budget
	*/
	public void cacheResult(com.startarget.portlet.model.Budget budget);

	/**
	* Caches the budgets in the entity cache if it is enabled.
	*
	* @param budgets the budgets
	*/
	public void cacheResult(
		java.util.List<com.startarget.portlet.model.Budget> budgets);

	/**
	* Creates a new budget with the primary key. Does not add the budget to the database.
	*
	* @param budgetId the primary key for the new budget
	* @return the new budget
	*/
	public com.startarget.portlet.model.Budget create(long budgetId);

	/**
	* Removes the budget with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param budgetId the primary key of the budget
	* @return the budget that was removed
	* @throws com.startarget.portlet.NoSuchBudgetException if a budget with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.startarget.portlet.model.Budget remove(long budgetId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.startarget.portlet.NoSuchBudgetException;

	public com.startarget.portlet.model.Budget updateImpl(
		com.startarget.portlet.model.Budget budget)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the budget with the primary key or throws a {@link com.startarget.portlet.NoSuchBudgetException} if it could not be found.
	*
	* @param budgetId the primary key of the budget
	* @return the budget
	* @throws com.startarget.portlet.NoSuchBudgetException if a budget with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.startarget.portlet.model.Budget findByPrimaryKey(long budgetId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.startarget.portlet.NoSuchBudgetException;

	/**
	* Returns the budget with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param budgetId the primary key of the budget
	* @return the budget, or <code>null</code> if a budget with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.startarget.portlet.model.Budget fetchByPrimaryKey(long budgetId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the budgets.
	*
	* @return the budgets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.startarget.portlet.model.Budget> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.startarget.portlet.model.Budget> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the budgets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.startarget.portlet.model.impl.BudgetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of budgets
	* @param end the upper bound of the range of budgets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of budgets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.startarget.portlet.model.Budget> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the budgets from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of budgets.
	*
	* @return the number of budgets
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}