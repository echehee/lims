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

package com.startarget.portlet.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.startarget.portlet.model.AccountItem;
import com.startarget.portlet.service.AccountItemLocalService;
import com.startarget.portlet.service.persistence.AccountItemPersistence;
import com.startarget.portlet.service.persistence.BudgetApplicationPersistence;
import com.startarget.portlet.service.persistence.BudgetArrivalPersistence;
import com.startarget.portlet.service.persistence.BudgetItemPersistence;
import com.startarget.portlet.service.persistence.BudgetPersistence;
import com.startarget.portlet.service.persistence.ProjectPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the account item local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.startarget.portlet.service.impl.AccountItemLocalServiceImpl}.
 * </p>
 *
 * @author chaojie
 * @see com.startarget.portlet.service.impl.AccountItemLocalServiceImpl
 * @see com.startarget.portlet.service.AccountItemLocalServiceUtil
 * @generated
 */
public abstract class AccountItemLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements AccountItemLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.startarget.portlet.service.AccountItemLocalServiceUtil} to access the account item local service.
	 */

	/**
	 * Adds the account item to the database. Also notifies the appropriate model listeners.
	 *
	 * @param accountItem the account item
	 * @return the account item that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AccountItem addAccountItem(AccountItem accountItem)
		throws SystemException {
		accountItem.setNew(true);

		return accountItemPersistence.update(accountItem);
	}

	/**
	 * Creates a new account item with the primary key. Does not add the account item to the database.
	 *
	 * @param accountItemId the primary key for the new account item
	 * @return the new account item
	 */
	@Override
	public AccountItem createAccountItem(long accountItemId) {
		return accountItemPersistence.create(accountItemId);
	}

	/**
	 * Deletes the account item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accountItemId the primary key of the account item
	 * @return the account item that was removed
	 * @throws PortalException if a account item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AccountItem deleteAccountItem(long accountItemId)
		throws PortalException, SystemException {
		return accountItemPersistence.remove(accountItemId);
	}

	/**
	 * Deletes the account item from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accountItem the account item
	 * @return the account item that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AccountItem deleteAccountItem(AccountItem accountItem)
		throws SystemException {
		return accountItemPersistence.remove(accountItem);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(AccountItem.class,
			clazz.getClassLoader());
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
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return accountItemPersistence.findWithDynamicQuery(dynamicQuery);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return accountItemPersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return accountItemPersistence.findWithDynamicQuery(dynamicQuery, start,
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return accountItemPersistence.countWithDynamicQuery(dynamicQuery);
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return accountItemPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public AccountItem fetchAccountItem(long accountItemId)
		throws SystemException {
		return accountItemPersistence.fetchByPrimaryKey(accountItemId);
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
	public AccountItem getAccountItem(long accountItemId)
		throws PortalException, SystemException {
		return accountItemPersistence.findByPrimaryKey(accountItemId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return accountItemPersistence.findByPrimaryKey(primaryKeyObj);
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
	public List<AccountItem> getAccountItems(int start, int end)
		throws SystemException {
		return accountItemPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of account items.
	 *
	 * @return the number of account items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getAccountItemsCount() throws SystemException {
		return accountItemPersistence.countAll();
	}

	/**
	 * Updates the account item in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param accountItem the account item
	 * @return the account item that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AccountItem updateAccountItem(AccountItem accountItem)
		throws SystemException {
		return accountItemPersistence.update(accountItem);
	}

	/**
	 * Returns the account item local service.
	 *
	 * @return the account item local service
	 */
	public com.startarget.portlet.service.AccountItemLocalService getAccountItemLocalService() {
		return accountItemLocalService;
	}

	/**
	 * Sets the account item local service.
	 *
	 * @param accountItemLocalService the account item local service
	 */
	public void setAccountItemLocalService(
		com.startarget.portlet.service.AccountItemLocalService accountItemLocalService) {
		this.accountItemLocalService = accountItemLocalService;
	}

	/**
	 * Returns the account item remote service.
	 *
	 * @return the account item remote service
	 */
	public com.startarget.portlet.service.AccountItemService getAccountItemService() {
		return accountItemService;
	}

	/**
	 * Sets the account item remote service.
	 *
	 * @param accountItemService the account item remote service
	 */
	public void setAccountItemService(
		com.startarget.portlet.service.AccountItemService accountItemService) {
		this.accountItemService = accountItemService;
	}

	/**
	 * Returns the account item persistence.
	 *
	 * @return the account item persistence
	 */
	public AccountItemPersistence getAccountItemPersistence() {
		return accountItemPersistence;
	}

	/**
	 * Sets the account item persistence.
	 *
	 * @param accountItemPersistence the account item persistence
	 */
	public void setAccountItemPersistence(
		AccountItemPersistence accountItemPersistence) {
		this.accountItemPersistence = accountItemPersistence;
	}

	/**
	 * Returns the budget local service.
	 *
	 * @return the budget local service
	 */
	public com.startarget.portlet.service.BudgetLocalService getBudgetLocalService() {
		return budgetLocalService;
	}

	/**
	 * Sets the budget local service.
	 *
	 * @param budgetLocalService the budget local service
	 */
	public void setBudgetLocalService(
		com.startarget.portlet.service.BudgetLocalService budgetLocalService) {
		this.budgetLocalService = budgetLocalService;
	}

	/**
	 * Returns the budget remote service.
	 *
	 * @return the budget remote service
	 */
	public com.startarget.portlet.service.BudgetService getBudgetService() {
		return budgetService;
	}

	/**
	 * Sets the budget remote service.
	 *
	 * @param budgetService the budget remote service
	 */
	public void setBudgetService(
		com.startarget.portlet.service.BudgetService budgetService) {
		this.budgetService = budgetService;
	}

	/**
	 * Returns the budget persistence.
	 *
	 * @return the budget persistence
	 */
	public BudgetPersistence getBudgetPersistence() {
		return budgetPersistence;
	}

	/**
	 * Sets the budget persistence.
	 *
	 * @param budgetPersistence the budget persistence
	 */
	public void setBudgetPersistence(BudgetPersistence budgetPersistence) {
		this.budgetPersistence = budgetPersistence;
	}

	/**
	 * Returns the budget application local service.
	 *
	 * @return the budget application local service
	 */
	public com.startarget.portlet.service.BudgetApplicationLocalService getBudgetApplicationLocalService() {
		return budgetApplicationLocalService;
	}

	/**
	 * Sets the budget application local service.
	 *
	 * @param budgetApplicationLocalService the budget application local service
	 */
	public void setBudgetApplicationLocalService(
		com.startarget.portlet.service.BudgetApplicationLocalService budgetApplicationLocalService) {
		this.budgetApplicationLocalService = budgetApplicationLocalService;
	}

	/**
	 * Returns the budget application remote service.
	 *
	 * @return the budget application remote service
	 */
	public com.startarget.portlet.service.BudgetApplicationService getBudgetApplicationService() {
		return budgetApplicationService;
	}

	/**
	 * Sets the budget application remote service.
	 *
	 * @param budgetApplicationService the budget application remote service
	 */
	public void setBudgetApplicationService(
		com.startarget.portlet.service.BudgetApplicationService budgetApplicationService) {
		this.budgetApplicationService = budgetApplicationService;
	}

	/**
	 * Returns the budget application persistence.
	 *
	 * @return the budget application persistence
	 */
	public BudgetApplicationPersistence getBudgetApplicationPersistence() {
		return budgetApplicationPersistence;
	}

	/**
	 * Sets the budget application persistence.
	 *
	 * @param budgetApplicationPersistence the budget application persistence
	 */
	public void setBudgetApplicationPersistence(
		BudgetApplicationPersistence budgetApplicationPersistence) {
		this.budgetApplicationPersistence = budgetApplicationPersistence;
	}

	/**
	 * Returns the budget arrival local service.
	 *
	 * @return the budget arrival local service
	 */
	public com.startarget.portlet.service.BudgetArrivalLocalService getBudgetArrivalLocalService() {
		return budgetArrivalLocalService;
	}

	/**
	 * Sets the budget arrival local service.
	 *
	 * @param budgetArrivalLocalService the budget arrival local service
	 */
	public void setBudgetArrivalLocalService(
		com.startarget.portlet.service.BudgetArrivalLocalService budgetArrivalLocalService) {
		this.budgetArrivalLocalService = budgetArrivalLocalService;
	}

	/**
	 * Returns the budget arrival remote service.
	 *
	 * @return the budget arrival remote service
	 */
	public com.startarget.portlet.service.BudgetArrivalService getBudgetArrivalService() {
		return budgetArrivalService;
	}

	/**
	 * Sets the budget arrival remote service.
	 *
	 * @param budgetArrivalService the budget arrival remote service
	 */
	public void setBudgetArrivalService(
		com.startarget.portlet.service.BudgetArrivalService budgetArrivalService) {
		this.budgetArrivalService = budgetArrivalService;
	}

	/**
	 * Returns the budget arrival persistence.
	 *
	 * @return the budget arrival persistence
	 */
	public BudgetArrivalPersistence getBudgetArrivalPersistence() {
		return budgetArrivalPersistence;
	}

	/**
	 * Sets the budget arrival persistence.
	 *
	 * @param budgetArrivalPersistence the budget arrival persistence
	 */
	public void setBudgetArrivalPersistence(
		BudgetArrivalPersistence budgetArrivalPersistence) {
		this.budgetArrivalPersistence = budgetArrivalPersistence;
	}

	/**
	 * Returns the budget item local service.
	 *
	 * @return the budget item local service
	 */
	public com.startarget.portlet.service.BudgetItemLocalService getBudgetItemLocalService() {
		return budgetItemLocalService;
	}

	/**
	 * Sets the budget item local service.
	 *
	 * @param budgetItemLocalService the budget item local service
	 */
	public void setBudgetItemLocalService(
		com.startarget.portlet.service.BudgetItemLocalService budgetItemLocalService) {
		this.budgetItemLocalService = budgetItemLocalService;
	}

	/**
	 * Returns the budget item remote service.
	 *
	 * @return the budget item remote service
	 */
	public com.startarget.portlet.service.BudgetItemService getBudgetItemService() {
		return budgetItemService;
	}

	/**
	 * Sets the budget item remote service.
	 *
	 * @param budgetItemService the budget item remote service
	 */
	public void setBudgetItemService(
		com.startarget.portlet.service.BudgetItemService budgetItemService) {
		this.budgetItemService = budgetItemService;
	}

	/**
	 * Returns the budget item persistence.
	 *
	 * @return the budget item persistence
	 */
	public BudgetItemPersistence getBudgetItemPersistence() {
		return budgetItemPersistence;
	}

	/**
	 * Sets the budget item persistence.
	 *
	 * @param budgetItemPersistence the budget item persistence
	 */
	public void setBudgetItemPersistence(
		BudgetItemPersistence budgetItemPersistence) {
		this.budgetItemPersistence = budgetItemPersistence;
	}

	/**
	 * Returns the project local service.
	 *
	 * @return the project local service
	 */
	public com.startarget.portlet.service.ProjectLocalService getProjectLocalService() {
		return projectLocalService;
	}

	/**
	 * Sets the project local service.
	 *
	 * @param projectLocalService the project local service
	 */
	public void setProjectLocalService(
		com.startarget.portlet.service.ProjectLocalService projectLocalService) {
		this.projectLocalService = projectLocalService;
	}

	/**
	 * Returns the project remote service.
	 *
	 * @return the project remote service
	 */
	public com.startarget.portlet.service.ProjectService getProjectService() {
		return projectService;
	}

	/**
	 * Sets the project remote service.
	 *
	 * @param projectService the project remote service
	 */
	public void setProjectService(
		com.startarget.portlet.service.ProjectService projectService) {
		this.projectService = projectService;
	}

	/**
	 * Returns the project persistence.
	 *
	 * @return the project persistence
	 */
	public ProjectPersistence getProjectPersistence() {
		return projectPersistence;
	}

	/**
	 * Sets the project persistence.
	 *
	 * @param projectPersistence the project persistence
	 */
	public void setProjectPersistence(ProjectPersistence projectPersistence) {
		this.projectPersistence = projectPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.startarget.portlet.model.AccountItem",
			accountItemLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.startarget.portlet.model.AccountItem");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return AccountItem.class;
	}

	protected String getModelClassName() {
		return AccountItem.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = accountItemPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.startarget.portlet.service.AccountItemLocalService.class)
	protected com.startarget.portlet.service.AccountItemLocalService accountItemLocalService;
	@BeanReference(type = com.startarget.portlet.service.AccountItemService.class)
	protected com.startarget.portlet.service.AccountItemService accountItemService;
	@BeanReference(type = AccountItemPersistence.class)
	protected AccountItemPersistence accountItemPersistence;
	@BeanReference(type = com.startarget.portlet.service.BudgetLocalService.class)
	protected com.startarget.portlet.service.BudgetLocalService budgetLocalService;
	@BeanReference(type = com.startarget.portlet.service.BudgetService.class)
	protected com.startarget.portlet.service.BudgetService budgetService;
	@BeanReference(type = BudgetPersistence.class)
	protected BudgetPersistence budgetPersistence;
	@BeanReference(type = com.startarget.portlet.service.BudgetApplicationLocalService.class)
	protected com.startarget.portlet.service.BudgetApplicationLocalService budgetApplicationLocalService;
	@BeanReference(type = com.startarget.portlet.service.BudgetApplicationService.class)
	protected com.startarget.portlet.service.BudgetApplicationService budgetApplicationService;
	@BeanReference(type = BudgetApplicationPersistence.class)
	protected BudgetApplicationPersistence budgetApplicationPersistence;
	@BeanReference(type = com.startarget.portlet.service.BudgetArrivalLocalService.class)
	protected com.startarget.portlet.service.BudgetArrivalLocalService budgetArrivalLocalService;
	@BeanReference(type = com.startarget.portlet.service.BudgetArrivalService.class)
	protected com.startarget.portlet.service.BudgetArrivalService budgetArrivalService;
	@BeanReference(type = BudgetArrivalPersistence.class)
	protected BudgetArrivalPersistence budgetArrivalPersistence;
	@BeanReference(type = com.startarget.portlet.service.BudgetItemLocalService.class)
	protected com.startarget.portlet.service.BudgetItemLocalService budgetItemLocalService;
	@BeanReference(type = com.startarget.portlet.service.BudgetItemService.class)
	protected com.startarget.portlet.service.BudgetItemService budgetItemService;
	@BeanReference(type = BudgetItemPersistence.class)
	protected BudgetItemPersistence budgetItemPersistence;
	@BeanReference(type = com.startarget.portlet.service.ProjectLocalService.class)
	protected com.startarget.portlet.service.ProjectLocalService projectLocalService;
	@BeanReference(type = com.startarget.portlet.service.ProjectService.class)
	protected com.startarget.portlet.service.ProjectService projectService;
	@BeanReference(type = ProjectPersistence.class)
	protected ProjectPersistence projectPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private AccountItemLocalServiceClpInvoker _clpInvoker = new AccountItemLocalServiceClpInvoker();
}