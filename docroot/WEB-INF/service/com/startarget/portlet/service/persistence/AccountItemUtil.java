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

import com.startarget.portlet.model.AccountItem;

import java.util.List;

/**
 * The persistence utility for the account item service. This utility wraps {@link AccountItemPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author chaojie
 * @see AccountItemPersistence
 * @see AccountItemPersistenceImpl
 * @generated
 */
public class AccountItemUtil {
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
	public static void clearCache(AccountItem accountItem) {
		getPersistence().clearCache(accountItem);
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
	public static List<AccountItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AccountItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AccountItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static AccountItem update(AccountItem accountItem)
		throws SystemException {
		return getPersistence().update(accountItem);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static AccountItem update(AccountItem accountItem,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(accountItem, serviceContext);
	}

	/**
	* Caches the account item in the entity cache if it is enabled.
	*
	* @param accountItem the account item
	*/
	public static void cacheResult(
		com.startarget.portlet.model.AccountItem accountItem) {
		getPersistence().cacheResult(accountItem);
	}

	/**
	* Caches the account items in the entity cache if it is enabled.
	*
	* @param accountItems the account items
	*/
	public static void cacheResult(
		java.util.List<com.startarget.portlet.model.AccountItem> accountItems) {
		getPersistence().cacheResult(accountItems);
	}

	/**
	* Creates a new account item with the primary key. Does not add the account item to the database.
	*
	* @param accountItemId the primary key for the new account item
	* @return the new account item
	*/
	public static com.startarget.portlet.model.AccountItem create(
		long accountItemId) {
		return getPersistence().create(accountItemId);
	}

	/**
	* Removes the account item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param accountItemId the primary key of the account item
	* @return the account item that was removed
	* @throws com.startarget.portlet.NoSuchAccountItemException if a account item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.startarget.portlet.model.AccountItem remove(
		long accountItemId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.startarget.portlet.NoSuchAccountItemException {
		return getPersistence().remove(accountItemId);
	}

	public static com.startarget.portlet.model.AccountItem updateImpl(
		com.startarget.portlet.model.AccountItem accountItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(accountItem);
	}

	/**
	* Returns the account item with the primary key or throws a {@link com.startarget.portlet.NoSuchAccountItemException} if it could not be found.
	*
	* @param accountItemId the primary key of the account item
	* @return the account item
	* @throws com.startarget.portlet.NoSuchAccountItemException if a account item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.startarget.portlet.model.AccountItem findByPrimaryKey(
		long accountItemId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.startarget.portlet.NoSuchAccountItemException {
		return getPersistence().findByPrimaryKey(accountItemId);
	}

	/**
	* Returns the account item with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param accountItemId the primary key of the account item
	* @return the account item, or <code>null</code> if a account item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.startarget.portlet.model.AccountItem fetchByPrimaryKey(
		long accountItemId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(accountItemId);
	}

	/**
	* Returns all the account items.
	*
	* @return the account items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.startarget.portlet.model.AccountItem> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the account items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.startarget.portlet.model.impl.AccountItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of account items
	* @param end the upper bound of the range of account items (not inclusive)
	* @return the range of account items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.startarget.portlet.model.AccountItem> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the account items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.startarget.portlet.model.impl.AccountItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of account items
	* @param end the upper bound of the range of account items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of account items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.startarget.portlet.model.AccountItem> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the account items from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of account items.
	*
	* @return the number of account items
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AccountItemPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AccountItemPersistence)PortletBeanLocatorUtil.locate(com.startarget.portlet.service.ClpSerializer.getServletContextName(),
					AccountItemPersistence.class.getName());

			ReferenceRegistry.registerReference(AccountItemUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AccountItemPersistence persistence) {
	}

	private static AccountItemPersistence _persistence;
}