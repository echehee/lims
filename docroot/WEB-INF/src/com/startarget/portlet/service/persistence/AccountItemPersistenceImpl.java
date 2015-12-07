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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.startarget.portlet.NoSuchAccountItemException;
import com.startarget.portlet.model.AccountItem;
import com.startarget.portlet.model.impl.AccountItemImpl;
import com.startarget.portlet.model.impl.AccountItemModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the account item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author chaojie
 * @see AccountItemPersistence
 * @see AccountItemUtil
 * @generated
 */
public class AccountItemPersistenceImpl extends BasePersistenceImpl<AccountItem>
	implements AccountItemPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AccountItemUtil} to access the account item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AccountItemImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AccountItemModelImpl.ENTITY_CACHE_ENABLED,
			AccountItemModelImpl.FINDER_CACHE_ENABLED, AccountItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AccountItemModelImpl.ENTITY_CACHE_ENABLED,
			AccountItemModelImpl.FINDER_CACHE_ENABLED, AccountItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AccountItemModelImpl.ENTITY_CACHE_ENABLED,
			AccountItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AccountItemPersistenceImpl() {
		setModelClass(AccountItem.class);
	}

	/**
	 * Caches the account item in the entity cache if it is enabled.
	 *
	 * @param accountItem the account item
	 */
	@Override
	public void cacheResult(AccountItem accountItem) {
		EntityCacheUtil.putResult(AccountItemModelImpl.ENTITY_CACHE_ENABLED,
			AccountItemImpl.class, accountItem.getPrimaryKey(), accountItem);

		accountItem.resetOriginalValues();
	}

	/**
	 * Caches the account items in the entity cache if it is enabled.
	 *
	 * @param accountItems the account items
	 */
	@Override
	public void cacheResult(List<AccountItem> accountItems) {
		for (AccountItem accountItem : accountItems) {
			if (EntityCacheUtil.getResult(
						AccountItemModelImpl.ENTITY_CACHE_ENABLED,
						AccountItemImpl.class, accountItem.getPrimaryKey()) == null) {
				cacheResult(accountItem);
			}
			else {
				accountItem.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all account items.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AccountItemImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AccountItemImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the account item.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AccountItem accountItem) {
		EntityCacheUtil.removeResult(AccountItemModelImpl.ENTITY_CACHE_ENABLED,
			AccountItemImpl.class, accountItem.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AccountItem> accountItems) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AccountItem accountItem : accountItems) {
			EntityCacheUtil.removeResult(AccountItemModelImpl.ENTITY_CACHE_ENABLED,
				AccountItemImpl.class, accountItem.getPrimaryKey());
		}
	}

	/**
	 * Creates a new account item with the primary key. Does not add the account item to the database.
	 *
	 * @param accountItemId the primary key for the new account item
	 * @return the new account item
	 */
	@Override
	public AccountItem create(long accountItemId) {
		AccountItem accountItem = new AccountItemImpl();

		accountItem.setNew(true);
		accountItem.setPrimaryKey(accountItemId);

		return accountItem;
	}

	/**
	 * Removes the account item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accountItemId the primary key of the account item
	 * @return the account item that was removed
	 * @throws com.startarget.portlet.NoSuchAccountItemException if a account item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AccountItem remove(long accountItemId)
		throws NoSuchAccountItemException, SystemException {
		return remove((Serializable)accountItemId);
	}

	/**
	 * Removes the account item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the account item
	 * @return the account item that was removed
	 * @throws com.startarget.portlet.NoSuchAccountItemException if a account item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AccountItem remove(Serializable primaryKey)
		throws NoSuchAccountItemException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AccountItem accountItem = (AccountItem)session.get(AccountItemImpl.class,
					primaryKey);

			if (accountItem == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAccountItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(accountItem);
		}
		catch (NoSuchAccountItemException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected AccountItem removeImpl(AccountItem accountItem)
		throws SystemException {
		accountItem = toUnwrappedModel(accountItem);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(accountItem)) {
				accountItem = (AccountItem)session.get(AccountItemImpl.class,
						accountItem.getPrimaryKeyObj());
			}

			if (accountItem != null) {
				session.delete(accountItem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (accountItem != null) {
			clearCache(accountItem);
		}

		return accountItem;
	}

	@Override
	public AccountItem updateImpl(
		com.startarget.portlet.model.AccountItem accountItem)
		throws SystemException {
		accountItem = toUnwrappedModel(accountItem);

		boolean isNew = accountItem.isNew();

		Session session = null;

		try {
			session = openSession();

			if (accountItem.isNew()) {
				session.save(accountItem);

				accountItem.setNew(false);
			}
			else {
				session.merge(accountItem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(AccountItemModelImpl.ENTITY_CACHE_ENABLED,
			AccountItemImpl.class, accountItem.getPrimaryKey(), accountItem);

		return accountItem;
	}

	protected AccountItem toUnwrappedModel(AccountItem accountItem) {
		if (accountItem instanceof AccountItemImpl) {
			return accountItem;
		}

		AccountItemImpl accountItemImpl = new AccountItemImpl();

		accountItemImpl.setNew(accountItem.isNew());
		accountItemImpl.setPrimaryKey(accountItem.getPrimaryKey());

		accountItemImpl.setAccountItemId(accountItem.getAccountItemId());
		accountItemImpl.setGroupId(accountItem.getGroupId());
		accountItemImpl.setCompanyId(accountItem.getCompanyId());
		accountItemImpl.setUserId(accountItem.getUserId());
		accountItemImpl.setUserName(accountItem.getUserName());
		accountItemImpl.setCreateDate(accountItem.getCreateDate());
		accountItemImpl.setModifiedDate(accountItem.getModifiedDate());
		accountItemImpl.setName(accountItem.getName());
		accountItemImpl.setParentName(accountItem.getParentName());
		accountItemImpl.setItemCode(accountItem.getItemCode());

		return accountItemImpl;
	}

	/**
	 * Returns the account item with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the account item
	 * @return the account item
	 * @throws com.startarget.portlet.NoSuchAccountItemException if a account item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AccountItem findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAccountItemException, SystemException {
		AccountItem accountItem = fetchByPrimaryKey(primaryKey);

		if (accountItem == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAccountItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return accountItem;
	}

	/**
	 * Returns the account item with the primary key or throws a {@link com.startarget.portlet.NoSuchAccountItemException} if it could not be found.
	 *
	 * @param accountItemId the primary key of the account item
	 * @return the account item
	 * @throws com.startarget.portlet.NoSuchAccountItemException if a account item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AccountItem findByPrimaryKey(long accountItemId)
		throws NoSuchAccountItemException, SystemException {
		return findByPrimaryKey((Serializable)accountItemId);
	}

	/**
	 * Returns the account item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the account item
	 * @return the account item, or <code>null</code> if a account item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AccountItem fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AccountItem accountItem = (AccountItem)EntityCacheUtil.getResult(AccountItemModelImpl.ENTITY_CACHE_ENABLED,
				AccountItemImpl.class, primaryKey);

		if (accountItem == _nullAccountItem) {
			return null;
		}

		if (accountItem == null) {
			Session session = null;

			try {
				session = openSession();

				accountItem = (AccountItem)session.get(AccountItemImpl.class,
						primaryKey);

				if (accountItem != null) {
					cacheResult(accountItem);
				}
				else {
					EntityCacheUtil.putResult(AccountItemModelImpl.ENTITY_CACHE_ENABLED,
						AccountItemImpl.class, primaryKey, _nullAccountItem);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AccountItemModelImpl.ENTITY_CACHE_ENABLED,
					AccountItemImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return accountItem;
	}

	/**
	 * Returns the account item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accountItemId the primary key of the account item
	 * @return the account item, or <code>null</code> if a account item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AccountItem fetchByPrimaryKey(long accountItemId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)accountItemId);
	}

	/**
	 * Returns all the account items.
	 *
	 * @return the account items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AccountItem> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<AccountItem> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<AccountItem> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<AccountItem> list = (List<AccountItem>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ACCOUNTITEM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ACCOUNTITEM;

				if (pagination) {
					sql = sql.concat(AccountItemModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AccountItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AccountItem>(list);
				}
				else {
					list = (List<AccountItem>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the account items from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AccountItem accountItem : findAll()) {
			remove(accountItem);
		}
	}

	/**
	 * Returns the number of account items.
	 *
	 * @return the number of account items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ACCOUNTITEM);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the account item persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.startarget.portlet.model.AccountItem")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AccountItem>> listenersList = new ArrayList<ModelListener<AccountItem>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AccountItem>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(AccountItemImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ACCOUNTITEM = "SELECT accountItem FROM AccountItem accountItem";
	private static final String _SQL_COUNT_ACCOUNTITEM = "SELECT COUNT(accountItem) FROM AccountItem accountItem";
	private static final String _ORDER_BY_ENTITY_ALIAS = "accountItem.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AccountItem exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AccountItemPersistenceImpl.class);
	private static AccountItem _nullAccountItem = new AccountItemImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AccountItem> toCacheModel() {
				return _nullAccountItemCacheModel;
			}
		};

	private static CacheModel<AccountItem> _nullAccountItemCacheModel = new CacheModel<AccountItem>() {
			@Override
			public AccountItem toEntityModel() {
				return _nullAccountItem;
			}
		};
}