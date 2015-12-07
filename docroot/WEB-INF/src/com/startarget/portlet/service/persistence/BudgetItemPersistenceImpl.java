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

import com.startarget.portlet.NoSuchBudgetItemException;
import com.startarget.portlet.model.BudgetItem;
import com.startarget.portlet.model.impl.BudgetItemImpl;
import com.startarget.portlet.model.impl.BudgetItemModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the budget item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author chaojie
 * @see BudgetItemPersistence
 * @see BudgetItemUtil
 * @generated
 */
public class BudgetItemPersistenceImpl extends BasePersistenceImpl<BudgetItem>
	implements BudgetItemPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BudgetItemUtil} to access the budget item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BudgetItemImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BudgetItemModelImpl.ENTITY_CACHE_ENABLED,
			BudgetItemModelImpl.FINDER_CACHE_ENABLED, BudgetItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BudgetItemModelImpl.ENTITY_CACHE_ENABLED,
			BudgetItemModelImpl.FINDER_CACHE_ENABLED, BudgetItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BudgetItemModelImpl.ENTITY_CACHE_ENABLED,
			BudgetItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public BudgetItemPersistenceImpl() {
		setModelClass(BudgetItem.class);
	}

	/**
	 * Caches the budget item in the entity cache if it is enabled.
	 *
	 * @param budgetItem the budget item
	 */
	@Override
	public void cacheResult(BudgetItem budgetItem) {
		EntityCacheUtil.putResult(BudgetItemModelImpl.ENTITY_CACHE_ENABLED,
			BudgetItemImpl.class, budgetItem.getPrimaryKey(), budgetItem);

		budgetItem.resetOriginalValues();
	}

	/**
	 * Caches the budget items in the entity cache if it is enabled.
	 *
	 * @param budgetItems the budget items
	 */
	@Override
	public void cacheResult(List<BudgetItem> budgetItems) {
		for (BudgetItem budgetItem : budgetItems) {
			if (EntityCacheUtil.getResult(
						BudgetItemModelImpl.ENTITY_CACHE_ENABLED,
						BudgetItemImpl.class, budgetItem.getPrimaryKey()) == null) {
				cacheResult(budgetItem);
			}
			else {
				budgetItem.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all budget items.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BudgetItemImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BudgetItemImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the budget item.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BudgetItem budgetItem) {
		EntityCacheUtil.removeResult(BudgetItemModelImpl.ENTITY_CACHE_ENABLED,
			BudgetItemImpl.class, budgetItem.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<BudgetItem> budgetItems) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (BudgetItem budgetItem : budgetItems) {
			EntityCacheUtil.removeResult(BudgetItemModelImpl.ENTITY_CACHE_ENABLED,
				BudgetItemImpl.class, budgetItem.getPrimaryKey());
		}
	}

	/**
	 * Creates a new budget item with the primary key. Does not add the budget item to the database.
	 *
	 * @param budgetItemId the primary key for the new budget item
	 * @return the new budget item
	 */
	@Override
	public BudgetItem create(long budgetItemId) {
		BudgetItem budgetItem = new BudgetItemImpl();

		budgetItem.setNew(true);
		budgetItem.setPrimaryKey(budgetItemId);

		return budgetItem;
	}

	/**
	 * Removes the budget item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param budgetItemId the primary key of the budget item
	 * @return the budget item that was removed
	 * @throws com.startarget.portlet.NoSuchBudgetItemException if a budget item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BudgetItem remove(long budgetItemId)
		throws NoSuchBudgetItemException, SystemException {
		return remove((Serializable)budgetItemId);
	}

	/**
	 * Removes the budget item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the budget item
	 * @return the budget item that was removed
	 * @throws com.startarget.portlet.NoSuchBudgetItemException if a budget item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BudgetItem remove(Serializable primaryKey)
		throws NoSuchBudgetItemException, SystemException {
		Session session = null;

		try {
			session = openSession();

			BudgetItem budgetItem = (BudgetItem)session.get(BudgetItemImpl.class,
					primaryKey);

			if (budgetItem == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBudgetItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(budgetItem);
		}
		catch (NoSuchBudgetItemException nsee) {
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
	protected BudgetItem removeImpl(BudgetItem budgetItem)
		throws SystemException {
		budgetItem = toUnwrappedModel(budgetItem);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(budgetItem)) {
				budgetItem = (BudgetItem)session.get(BudgetItemImpl.class,
						budgetItem.getPrimaryKeyObj());
			}

			if (budgetItem != null) {
				session.delete(budgetItem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (budgetItem != null) {
			clearCache(budgetItem);
		}

		return budgetItem;
	}

	@Override
	public BudgetItem updateImpl(
		com.startarget.portlet.model.BudgetItem budgetItem)
		throws SystemException {
		budgetItem = toUnwrappedModel(budgetItem);

		boolean isNew = budgetItem.isNew();

		Session session = null;

		try {
			session = openSession();

			if (budgetItem.isNew()) {
				session.save(budgetItem);

				budgetItem.setNew(false);
			}
			else {
				session.merge(budgetItem);
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

		EntityCacheUtil.putResult(BudgetItemModelImpl.ENTITY_CACHE_ENABLED,
			BudgetItemImpl.class, budgetItem.getPrimaryKey(), budgetItem);

		return budgetItem;
	}

	protected BudgetItem toUnwrappedModel(BudgetItem budgetItem) {
		if (budgetItem instanceof BudgetItemImpl) {
			return budgetItem;
		}

		BudgetItemImpl budgetItemImpl = new BudgetItemImpl();

		budgetItemImpl.setNew(budgetItem.isNew());
		budgetItemImpl.setPrimaryKey(budgetItem.getPrimaryKey());

		budgetItemImpl.setBudgetItemId(budgetItem.getBudgetItemId());
		budgetItemImpl.setGroupId(budgetItem.getGroupId());
		budgetItemImpl.setCompanyId(budgetItem.getCompanyId());
		budgetItemImpl.setUserId(budgetItem.getUserId());
		budgetItemImpl.setUserName(budgetItem.getUserName());
		budgetItemImpl.setCreateDate(budgetItem.getCreateDate());
		budgetItemImpl.setModifiedDate(budgetItem.getModifiedDate());
		budgetItemImpl.setBudgetId(budgetItem.getBudgetId());
		budgetItemImpl.setAccountItemId(budgetItem.getAccountItemId());
		budgetItemImpl.setAccountItemName(budgetItem.getAccountItemName());
		budgetItemImpl.setItemCode(budgetItem.getItemCode());
		budgetItemImpl.setBudgetTotal(budgetItem.getBudgetTotal());
		budgetItemImpl.setBudgetUsed(budgetItem.getBudgetUsed());

		return budgetItemImpl;
	}

	/**
	 * Returns the budget item with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the budget item
	 * @return the budget item
	 * @throws com.startarget.portlet.NoSuchBudgetItemException if a budget item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BudgetItem findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBudgetItemException, SystemException {
		BudgetItem budgetItem = fetchByPrimaryKey(primaryKey);

		if (budgetItem == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBudgetItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return budgetItem;
	}

	/**
	 * Returns the budget item with the primary key or throws a {@link com.startarget.portlet.NoSuchBudgetItemException} if it could not be found.
	 *
	 * @param budgetItemId the primary key of the budget item
	 * @return the budget item
	 * @throws com.startarget.portlet.NoSuchBudgetItemException if a budget item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BudgetItem findByPrimaryKey(long budgetItemId)
		throws NoSuchBudgetItemException, SystemException {
		return findByPrimaryKey((Serializable)budgetItemId);
	}

	/**
	 * Returns the budget item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the budget item
	 * @return the budget item, or <code>null</code> if a budget item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BudgetItem fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		BudgetItem budgetItem = (BudgetItem)EntityCacheUtil.getResult(BudgetItemModelImpl.ENTITY_CACHE_ENABLED,
				BudgetItemImpl.class, primaryKey);

		if (budgetItem == _nullBudgetItem) {
			return null;
		}

		if (budgetItem == null) {
			Session session = null;

			try {
				session = openSession();

				budgetItem = (BudgetItem)session.get(BudgetItemImpl.class,
						primaryKey);

				if (budgetItem != null) {
					cacheResult(budgetItem);
				}
				else {
					EntityCacheUtil.putResult(BudgetItemModelImpl.ENTITY_CACHE_ENABLED,
						BudgetItemImpl.class, primaryKey, _nullBudgetItem);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(BudgetItemModelImpl.ENTITY_CACHE_ENABLED,
					BudgetItemImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return budgetItem;
	}

	/**
	 * Returns the budget item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param budgetItemId the primary key of the budget item
	 * @return the budget item, or <code>null</code> if a budget item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BudgetItem fetchByPrimaryKey(long budgetItemId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)budgetItemId);
	}

	/**
	 * Returns all the budget items.
	 *
	 * @return the budget items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BudgetItem> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<BudgetItem> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<BudgetItem> findAll(int start, int end,
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

		List<BudgetItem> list = (List<BudgetItem>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BUDGETITEM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BUDGETITEM;

				if (pagination) {
					sql = sql.concat(BudgetItemModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<BudgetItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BudgetItem>(list);
				}
				else {
					list = (List<BudgetItem>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the budget items from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (BudgetItem budgetItem : findAll()) {
			remove(budgetItem);
		}
	}

	/**
	 * Returns the number of budget items.
	 *
	 * @return the number of budget items
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

				Query q = session.createQuery(_SQL_COUNT_BUDGETITEM);

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
	 * Initializes the budget item persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.startarget.portlet.model.BudgetItem")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<BudgetItem>> listenersList = new ArrayList<ModelListener<BudgetItem>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<BudgetItem>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(BudgetItemImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_BUDGETITEM = "SELECT budgetItem FROM BudgetItem budgetItem";
	private static final String _SQL_COUNT_BUDGETITEM = "SELECT COUNT(budgetItem) FROM BudgetItem budgetItem";
	private static final String _ORDER_BY_ENTITY_ALIAS = "budgetItem.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BudgetItem exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BudgetItemPersistenceImpl.class);
	private static BudgetItem _nullBudgetItem = new BudgetItemImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<BudgetItem> toCacheModel() {
				return _nullBudgetItemCacheModel;
			}
		};

	private static CacheModel<BudgetItem> _nullBudgetItemCacheModel = new CacheModel<BudgetItem>() {
			@Override
			public BudgetItem toEntityModel() {
				return _nullBudgetItem;
			}
		};
}