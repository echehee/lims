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

import com.startarget.portlet.model.BudgetArrival;

import java.util.List;

/**
 * The persistence utility for the budget arrival service. This utility wraps {@link BudgetArrivalPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author chaojie
 * @see BudgetArrivalPersistence
 * @see BudgetArrivalPersistenceImpl
 * @generated
 */
public class BudgetArrivalUtil {
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
	public static void clearCache(BudgetArrival budgetArrival) {
		getPersistence().clearCache(budgetArrival);
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
	public static List<BudgetArrival> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BudgetArrival> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BudgetArrival> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static BudgetArrival update(BudgetArrival budgetArrival)
		throws SystemException {
		return getPersistence().update(budgetArrival);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static BudgetArrival update(BudgetArrival budgetArrival,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(budgetArrival, serviceContext);
	}

	/**
	* Caches the budget arrival in the entity cache if it is enabled.
	*
	* @param budgetArrival the budget arrival
	*/
	public static void cacheResult(
		com.startarget.portlet.model.BudgetArrival budgetArrival) {
		getPersistence().cacheResult(budgetArrival);
	}

	/**
	* Caches the budget arrivals in the entity cache if it is enabled.
	*
	* @param budgetArrivals the budget arrivals
	*/
	public static void cacheResult(
		java.util.List<com.startarget.portlet.model.BudgetArrival> budgetArrivals) {
		getPersistence().cacheResult(budgetArrivals);
	}

	/**
	* Creates a new budget arrival with the primary key. Does not add the budget arrival to the database.
	*
	* @param budgetArrivalId the primary key for the new budget arrival
	* @return the new budget arrival
	*/
	public static com.startarget.portlet.model.BudgetArrival create(
		long budgetArrivalId) {
		return getPersistence().create(budgetArrivalId);
	}

	/**
	* Removes the budget arrival with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param budgetArrivalId the primary key of the budget arrival
	* @return the budget arrival that was removed
	* @throws com.startarget.portlet.NoSuchBudgetArrivalException if a budget arrival with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.startarget.portlet.model.BudgetArrival remove(
		long budgetArrivalId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.startarget.portlet.NoSuchBudgetArrivalException {
		return getPersistence().remove(budgetArrivalId);
	}

	public static com.startarget.portlet.model.BudgetArrival updateImpl(
		com.startarget.portlet.model.BudgetArrival budgetArrival)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(budgetArrival);
	}

	/**
	* Returns the budget arrival with the primary key or throws a {@link com.startarget.portlet.NoSuchBudgetArrivalException} if it could not be found.
	*
	* @param budgetArrivalId the primary key of the budget arrival
	* @return the budget arrival
	* @throws com.startarget.portlet.NoSuchBudgetArrivalException if a budget arrival with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.startarget.portlet.model.BudgetArrival findByPrimaryKey(
		long budgetArrivalId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.startarget.portlet.NoSuchBudgetArrivalException {
		return getPersistence().findByPrimaryKey(budgetArrivalId);
	}

	/**
	* Returns the budget arrival with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param budgetArrivalId the primary key of the budget arrival
	* @return the budget arrival, or <code>null</code> if a budget arrival with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.startarget.portlet.model.BudgetArrival fetchByPrimaryKey(
		long budgetArrivalId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(budgetArrivalId);
	}

	/**
	* Returns all the budget arrivals.
	*
	* @return the budget arrivals
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.startarget.portlet.model.BudgetArrival> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.startarget.portlet.model.BudgetArrival> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.startarget.portlet.model.BudgetArrival> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the budget arrivals from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of budget arrivals.
	*
	* @return the number of budget arrivals
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static BudgetArrivalPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BudgetArrivalPersistence)PortletBeanLocatorUtil.locate(com.startarget.portlet.service.ClpSerializer.getServletContextName(),
					BudgetArrivalPersistence.class.getName());

			ReferenceRegistry.registerReference(BudgetArrivalUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(BudgetArrivalPersistence persistence) {
	}

	private static BudgetArrivalPersistence _persistence;
}