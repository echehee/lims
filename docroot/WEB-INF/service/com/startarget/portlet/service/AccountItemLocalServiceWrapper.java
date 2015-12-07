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
 * Provides a wrapper for {@link AccountItemLocalService}.
 *
 * @author chaojie
 * @see AccountItemLocalService
 * @generated
 */
public class AccountItemLocalServiceWrapper implements AccountItemLocalService,
	ServiceWrapper<AccountItemLocalService> {
	public AccountItemLocalServiceWrapper(
		AccountItemLocalService accountItemLocalService) {
		_accountItemLocalService = accountItemLocalService;
	}

	/**
	* Adds the account item to the database. Also notifies the appropriate model listeners.
	*
	* @param accountItem the account item
	* @return the account item that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.startarget.portlet.model.AccountItem addAccountItem(
		com.startarget.portlet.model.AccountItem accountItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accountItemLocalService.addAccountItem(accountItem);
	}

	/**
	* Creates a new account item with the primary key. Does not add the account item to the database.
	*
	* @param accountItemId the primary key for the new account item
	* @return the new account item
	*/
	@Override
	public com.startarget.portlet.model.AccountItem createAccountItem(
		long accountItemId) {
		return _accountItemLocalService.createAccountItem(accountItemId);
	}

	/**
	* Deletes the account item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param accountItemId the primary key of the account item
	* @return the account item that was removed
	* @throws PortalException if a account item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.startarget.portlet.model.AccountItem deleteAccountItem(
		long accountItemId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _accountItemLocalService.deleteAccountItem(accountItemId);
	}

	/**
	* Deletes the account item from the database. Also notifies the appropriate model listeners.
	*
	* @param accountItem the account item
	* @return the account item that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.startarget.portlet.model.AccountItem deleteAccountItem(
		com.startarget.portlet.model.AccountItem accountItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accountItemLocalService.deleteAccountItem(accountItem);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accountItemLocalService.dynamicQuery();
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
		return _accountItemLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.startarget.portlet.model.impl.AccountItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _accountItemLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.startarget.portlet.model.impl.AccountItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _accountItemLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _accountItemLocalService.dynamicQueryCount(dynamicQuery);
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
		return _accountItemLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.startarget.portlet.model.AccountItem fetchAccountItem(
		long accountItemId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accountItemLocalService.fetchAccountItem(accountItemId);
	}

	/**
	* Returns the account item with the primary key.
	*
	* @param accountItemId the primary key of the account item
	* @return the account item
	* @throws PortalException if a account item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.startarget.portlet.model.AccountItem getAccountItem(
		long accountItemId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _accountItemLocalService.getAccountItem(accountItemId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _accountItemLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.startarget.portlet.model.AccountItem> getAccountItems(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accountItemLocalService.getAccountItems(start, end);
	}

	/**
	* Returns the number of account items.
	*
	* @return the number of account items
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAccountItemsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accountItemLocalService.getAccountItemsCount();
	}

	/**
	* Updates the account item in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param accountItem the account item
	* @return the account item that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.startarget.portlet.model.AccountItem updateAccountItem(
		com.startarget.portlet.model.AccountItem accountItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accountItemLocalService.updateAccountItem(accountItem);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _accountItemLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_accountItemLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _accountItemLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.startarget.portlet.model.AccountItem> getAccountItems()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accountItemLocalService.getAccountItems();
	}

	@Override
	public java.util.List<com.startarget.portlet.model.AccountItem> getAccountItemByItemCode(
		long itemCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accountItemLocalService.getAccountItemByItemCode(itemCode);
	}

	@Override
	public com.startarget.portlet.model.AccountItem addAccountItem(
		long itemCode, java.lang.String name, java.lang.String parentName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accountItemLocalService.addAccountItem(itemCode, name,
			parentName);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AccountItemLocalService getWrappedAccountItemLocalService() {
		return _accountItemLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAccountItemLocalService(
		AccountItemLocalService accountItemLocalService) {
		_accountItemLocalService = accountItemLocalService;
	}

	@Override
	public AccountItemLocalService getWrappedService() {
		return _accountItemLocalService;
	}

	@Override
	public void setWrappedService(
		AccountItemLocalService accountItemLocalService) {
		_accountItemLocalService = accountItemLocalService;
	}

	private AccountItemLocalService _accountItemLocalService;
}