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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.startarget.portlet.model.BudgetItem;

import java.util.List;

/**
 * The persistence utility for the budget item service. This utility wraps {@link BudgetItemPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author chaojie
 * @see BudgetItemPersistence
 * @see BudgetItemPersistenceImpl
 * @generated
 */
public class BudgetItemUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(BudgetItem budgetItem) {
		getPersistence().clearCache(budgetItem);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<BudgetItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BudgetItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BudgetItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static BudgetItem update(BudgetItem budgetItem)
		throws SystemException {
		return getPersistence().update(budgetItem);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static BudgetItem update(BudgetItem budgetItem,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(budgetItem, serviceContext);
	}

	/**
	* Caches the budget item in the entity cache if it is enabled.
	*
	* @param budgetItem the budget item
	*/
	public static void cacheResult(
		com.startarget.portlet.model.BudgetItem budgetItem) {
		getPersistence().cacheResult(budgetItem);
	}

	/**
	* Caches the budget items in the entity cache if it is enabled.
	*
	* @param budgetItems the budget items
	*/
	public static void cacheResult(
		java.util.List<com.startarget.portlet.model.BudgetItem> budgetItems) {
		getPersistence().cacheResult(budgetItems);
	}

	/**
	* Creates a new budget item with the primary key. Does not add the budget item to the database.
	*
	* @param budgetItemId the primary key for the new budget item
	* @return the new budget item
	*/
	public static com.startarget.portlet.model.BudgetItem create(
		long budgetItemId) {
		return getPersistence().create(budgetItemId);
	}

	/**
	* Removes the budget item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param budgetItemId the primary key of the budget item
	* @return the budget item that was removed
	* @throws com.startarget.portlet.NoSuchBudgetItemException if a budget item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.startarget.portlet.model.BudgetItem remove(
		long budgetItemId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.startarget.portlet.NoSuchBudgetItemException {
		return getPersistence().remove(budgetItemId);
	}

	public static com.startarget.portlet.model.BudgetItem updateImpl(
		com.startarget.portlet.model.BudgetItem budgetItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(budgetItem);
	}

	/**
	* Returns the budget item with the primary key or throws a {@link com.startarget.portlet.NoSuchBudgetItemException} if it could not be found.
	*
	* @param budgetItemId the primary key of the budget item
	* @return the budget item
	* @throws com.startarget.portlet.NoSuchBudgetItemException if a budget item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.startarget.portlet.model.BudgetItem findByPrimaryKey(
		long budgetItemId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.startarget.portlet.NoSuchBudgetItemException {
		return getPersistence().findByPrimaryKey(budgetItemId);
	}

	/**
	* Returns the budget item with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param budgetItemId the primary key of the budget item
	* @return the budget item, or <code>null</code> if a budget item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.startarget.portlet.model.BudgetItem fetchByPrimaryKey(
		long budgetItemId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(budgetItemId);
	}

	/**
	* Returns all the budget items.
	*
	* @return the budget items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.startarget.portlet.model.BudgetItem> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the budget items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.startarget.portlet.model.impl.BudgetItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of budget items
	* @param end the upper bound of the range of budget items (not inclusive)
	* @return the range of budget items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.startarget.portlet.model.BudgetItem> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the budget items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.startarget.portlet.model.impl.BudgetItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of budget items
	* @param end the upper bound of the range of budget items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of budget items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.startarget.portlet.model.BudgetItem> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the budget items from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of budget items.
	*
	* @return the number of budget items
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static BudgetItemPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BudgetItemPersistence)PortletBeanLocatorUtil.locate(com.startarget.portlet.service.ClpSerializer.getServletContextName(),
					BudgetItemPersistence.class.getName());

			ReferenceRegistry.registerReference(BudgetItemUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(BudgetItemPersistence persistence) {
	}

	private static BudgetItemPersistence _persistence;
}