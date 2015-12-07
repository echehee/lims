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

import com.startarget.portlet.NoSuchBudgetArrivalException;
import com.startarget.portlet.model.BudgetArrival;
import com.startarget.portlet.model.impl.BudgetArrivalImpl;
import com.startarget.portlet.model.impl.BudgetArrivalModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the budget arrival service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author chaojie
 * @see BudgetArrivalPersistence
 * @see BudgetArrivalUtil
 * @generated
 */
public class BudgetArrivalPersistenceImpl extends BasePersistenceImpl<BudgetArrival>
	implements BudgetArrivalPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BudgetArrivalUtil} to access the budget arrival persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BudgetArrivalImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BudgetArrivalModelImpl.ENTITY_CACHE_ENABLED,
			BudgetArrivalModelImpl.FINDER_CACHE_ENABLED,
			BudgetArrivalImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BudgetArrivalModelImpl.ENTITY_CACHE_ENABLED,
			BudgetArrivalModelImpl.FINDER_CACHE_ENABLED,
			BudgetArrivalImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BudgetArrivalModelImpl.ENTITY_CACHE_ENABLED,
			BudgetArrivalModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public BudgetArrivalPersistenceImpl() {
		setModelClass(BudgetArrival.class);
	}

	/**
	 * Caches the budget arrival in the entity cache if it is enabled.
	 *
	 * @param budgetArrival the budget arrival
	 */
	@Override
	public void cacheResult(BudgetArrival budgetArrival) {
		EntityCacheUtil.putResult(BudgetArrivalModelImpl.ENTITY_CACHE_ENABLED,
			BudgetArrivalImpl.class, budgetArrival.getPrimaryKey(),
			budgetArrival);

		budgetArrival.resetOriginalValues();
	}

	/**
	 * Caches the budget arrivals in the entity cache if it is enabled.
	 *
	 * @param budgetArrivals the budget arrivals
	 */
	@Override
	public void cacheResult(List<BudgetArrival> budgetArrivals) {
		for (BudgetArrival budgetArrival : budgetArrivals) {
			if (EntityCacheUtil.getResult(
						BudgetArrivalModelImpl.ENTITY_CACHE_ENABLED,
						BudgetArrivalImpl.class, budgetArrival.getPrimaryKey()) == null) {
				cacheResult(budgetArrival);
			}
			else {
				budgetArrival.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all budget arrivals.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BudgetArrivalImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BudgetArrivalImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the budget arrival.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BudgetArrival budgetArrival) {
		EntityCacheUtil.removeResult(BudgetArrivalModelImpl.ENTITY_CACHE_ENABLED,
			BudgetArrivalImpl.class, budgetArrival.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<BudgetArrival> budgetArrivals) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (BudgetArrival budgetArrival : budgetArrivals) {
			EntityCacheUtil.removeResult(BudgetArrivalModelImpl.ENTITY_CACHE_ENABLED,
				BudgetArrivalImpl.class, budgetArrival.getPrimaryKey());
		}
	}

	/**
	 * Creates a new budget arrival with the primary key. Does not add the budget arrival to the database.
	 *
	 * @param budgetArrivalId the primary key for the new budget arrival
	 * @return the new budget arrival
	 */
	@Override
	public BudgetArrival create(long budgetArrivalId) {
		BudgetArrival budgetArrival = new BudgetArrivalImpl();

		budgetArrival.setNew(true);
		budgetArrival.setPrimaryKey(budgetArrivalId);

		return budgetArrival;
	}

	/**
	 * Removes the budget arrival with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param budgetArrivalId the primary key of the budget arrival
	 * @return the budget arrival that was removed
	 * @throws com.startarget.portlet.NoSuchBudgetArrivalException if a budget arrival with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BudgetArrival remove(long budgetArrivalId)
		throws NoSuchBudgetArrivalException, SystemException {
		return remove((Serializable)budgetArrivalId);
	}

	/**
	 * Removes the budget arrival with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the budget arrival
	 * @return the budget arrival that was removed
	 * @throws com.startarget.portlet.NoSuchBudgetArrivalException if a budget arrival with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BudgetArrival remove(Serializable primaryKey)
		throws NoSuchBudgetArrivalException, SystemException {
		Session session = null;

		try {
			session = openSession();

			BudgetArrival budgetArrival = (BudgetArrival)session.get(BudgetArrivalImpl.class,
					primaryKey);

			if (budgetArrival == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBudgetArrivalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(budgetArrival);
		}
		catch (NoSuchBudgetArrivalException nsee) {
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
	protected BudgetArrival removeImpl(BudgetArrival budgetArrival)
		throws SystemException {
		budgetArrival = toUnwrappedModel(budgetArrival);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(budgetArrival)) {
				budgetArrival = (BudgetArrival)session.get(BudgetArrivalImpl.class,
						budgetArrival.getPrimaryKeyObj());
			}

			if (budgetArrival != null) {
				session.delete(budgetArrival);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (budgetArrival != null) {
			clearCache(budgetArrival);
		}

		return budgetArrival;
	}

	@Override
	public BudgetArrival updateImpl(
		com.startarget.portlet.model.BudgetArrival budgetArrival)
		throws SystemException {
		budgetArrival = toUnwrappedModel(budgetArrival);

		boolean isNew = budgetArrival.isNew();

		Session session = null;

		try {
			session = openSession();

			if (budgetArrival.isNew()) {
				session.save(budgetArrival);

				budgetArrival.setNew(false);
			}
			else {
				session.merge(budgetArrival);
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

		EntityCacheUtil.putResult(BudgetArrivalModelImpl.ENTITY_CACHE_ENABLED,
			BudgetArrivalImpl.class, budgetArrival.getPrimaryKey(),
			budgetArrival);

		return budgetArrival;
	}

	protected BudgetArrival toUnwrappedModel(BudgetArrival budgetArrival) {
		if (budgetArrival instanceof BudgetArrivalImpl) {
			return budgetArrival;
		}

		BudgetArrivalImpl budgetArrivalImpl = new BudgetArrivalImpl();

		budgetArrivalImpl.setNew(budgetArrival.isNew());
		budgetArrivalImpl.setPrimaryKey(budgetArrival.getPrimaryKey());

		budgetArrivalImpl.setBudgetArrivalId(budgetArrival.getBudgetArrivalId());
		budgetArrivalImpl.setGroupId(budgetArrival.getGroupId());
		budgetArrivalImpl.setCompanyId(budgetArrival.getCompanyId());
		budgetArrivalImpl.setUserId(budgetArrival.getUserId());
		budgetArrivalImpl.setUserName(budgetArrival.getUserName());
		budgetArrivalImpl.setCreateDate(budgetArrival.getCreateDate());
		budgetArrivalImpl.setModifiedDate(budgetArrival.getModifiedDate());
		budgetArrivalImpl.setOperatorId(budgetArrival.getOperatorId());
		budgetArrivalImpl.setOperatorName(budgetArrival.getOperatorName());
		budgetArrivalImpl.setArrivalTotal(budgetArrival.getArrivalTotal());
		budgetArrivalImpl.setProjectName(budgetArrival.getProjectName());
		budgetArrivalImpl.setBudgetName(budgetArrival.getBudgetName());

		return budgetArrivalImpl;
	}

	/**
	 * Returns the budget arrival with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the budget arrival
	 * @return the budget arrival
	 * @throws com.startarget.portlet.NoSuchBudgetArrivalException if a budget arrival with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BudgetArrival findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBudgetArrivalException, SystemException {
		BudgetArrival budgetArrival = fetchByPrimaryKey(primaryKey);

		if (budgetArrival == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBudgetArrivalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return budgetArrival;
	}

	/**
	 * Returns the budget arrival with the primary key or throws a {@link com.startarget.portlet.NoSuchBudgetArrivalException} if it could not be found.
	 *
	 * @param budgetArrivalId the primary key of the budget arrival
	 * @return the budget arrival
	 * @throws com.startarget.portlet.NoSuchBudgetArrivalException if a budget arrival with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BudgetArrival findByPrimaryKey(long budgetArrivalId)
		throws NoSuchBudgetArrivalException, SystemException {
		return findByPrimaryKey((Serializable)budgetArrivalId);
	}

	/**
	 * Returns the budget arrival with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the budget arrival
	 * @return the budget arrival, or <code>null</code> if a budget arrival with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BudgetArrival fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		BudgetArrival budgetArrival = (BudgetArrival)EntityCacheUtil.getResult(BudgetArrivalModelImpl.ENTITY_CACHE_ENABLED,
				BudgetArrivalImpl.class, primaryKey);

		if (budgetArrival == _nullBudgetArrival) {
			return null;
		}

		if (budgetArrival == null) {
			Session session = null;

			try {
				session = openSession();

				budgetArrival = (BudgetArrival)session.get(BudgetArrivalImpl.class,
						primaryKey);

				if (budgetArrival != null) {
					cacheResult(budgetArrival);
				}
				else {
					EntityCacheUtil.putResult(BudgetArrivalModelImpl.ENTITY_CACHE_ENABLED,
						BudgetArrivalImpl.class, primaryKey, _nullBudgetArrival);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(BudgetArrivalModelImpl.ENTITY_CACHE_ENABLED,
					BudgetArrivalImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return budgetArrival;
	}

	/**
	 * Returns the budget arrival with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param budgetArrivalId the primary key of the budget arrival
	 * @return the budget arrival, or <code>null</code> if a budget arrival with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BudgetArrival fetchByPrimaryKey(long budgetArrivalId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)budgetArrivalId);
	}

	/**
	 * Returns all the budget arrivals.
	 *
	 * @return the budget arrivals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BudgetArrival> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<BudgetArrival> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<BudgetArrival> findAll(int start, int end,
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

		List<BudgetArrival> list = (List<BudgetArrival>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BUDGETARRIVAL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BUDGETARRIVAL;

				if (pagination) {
					sql = sql.concat(BudgetArrivalModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<BudgetArrival>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BudgetArrival>(list);
				}
				else {
					list = (List<BudgetArrival>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the budget arrivals from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (BudgetArrival budgetArrival : findAll()) {
			remove(budgetArrival);
		}
	}

	/**
	 * Returns the number of budget arrivals.
	 *
	 * @return the number of budget arrivals
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

				Query q = session.createQuery(_SQL_COUNT_BUDGETARRIVAL);

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
	 * Initializes the budget arrival persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.startarget.portlet.model.BudgetArrival")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<BudgetArrival>> listenersList = new ArrayList<ModelListener<BudgetArrival>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<BudgetArrival>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(BudgetArrivalImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_BUDGETARRIVAL = "SELECT budgetArrival FROM BudgetArrival budgetArrival";
	private static final String _SQL_COUNT_BUDGETARRIVAL = "SELECT COUNT(budgetArrival) FROM BudgetArrival budgetArrival";
	private static final String _ORDER_BY_ENTITY_ALIAS = "budgetArrival.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BudgetArrival exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BudgetArrivalPersistenceImpl.class);
	private static BudgetArrival _nullBudgetArrival = new BudgetArrivalImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<BudgetArrival> toCacheModel() {
				return _nullBudgetArrivalCacheModel;
			}
		};

	private static CacheModel<BudgetArrival> _nullBudgetArrivalCacheModel = new CacheModel<BudgetArrival>() {
			@Override
			public BudgetArrival toEntityModel() {
				return _nullBudgetArrival;
			}
		};
}