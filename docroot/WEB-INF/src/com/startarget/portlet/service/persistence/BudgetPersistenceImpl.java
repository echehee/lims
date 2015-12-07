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

import com.startarget.portlet.NoSuchBudgetException;
import com.startarget.portlet.model.Budget;
import com.startarget.portlet.model.impl.BudgetImpl;
import com.startarget.portlet.model.impl.BudgetModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the budget service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author chaojie
 * @see BudgetPersistence
 * @see BudgetUtil
 * @generated
 */
public class BudgetPersistenceImpl extends BasePersistenceImpl<Budget>
	implements BudgetPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BudgetUtil} to access the budget persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BudgetImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BudgetModelImpl.ENTITY_CACHE_ENABLED,
			BudgetModelImpl.FINDER_CACHE_ENABLED, BudgetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BudgetModelImpl.ENTITY_CACHE_ENABLED,
			BudgetModelImpl.FINDER_CACHE_ENABLED, BudgetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BudgetModelImpl.ENTITY_CACHE_ENABLED,
			BudgetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public BudgetPersistenceImpl() {
		setModelClass(Budget.class);
	}

	/**
	 * Caches the budget in the entity cache if it is enabled.
	 *
	 * @param budget the budget
	 */
	@Override
	public void cacheResult(Budget budget) {
		EntityCacheUtil.putResult(BudgetModelImpl.ENTITY_CACHE_ENABLED,
			BudgetImpl.class, budget.getPrimaryKey(), budget);

		budget.resetOriginalValues();
	}

	/**
	 * Caches the budgets in the entity cache if it is enabled.
	 *
	 * @param budgets the budgets
	 */
	@Override
	public void cacheResult(List<Budget> budgets) {
		for (Budget budget : budgets) {
			if (EntityCacheUtil.getResult(
						BudgetModelImpl.ENTITY_CACHE_ENABLED, BudgetImpl.class,
						budget.getPrimaryKey()) == null) {
				cacheResult(budget);
			}
			else {
				budget.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all budgets.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BudgetImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BudgetImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the budget.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Budget budget) {
		EntityCacheUtil.removeResult(BudgetModelImpl.ENTITY_CACHE_ENABLED,
			BudgetImpl.class, budget.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Budget> budgets) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Budget budget : budgets) {
			EntityCacheUtil.removeResult(BudgetModelImpl.ENTITY_CACHE_ENABLED,
				BudgetImpl.class, budget.getPrimaryKey());
		}
	}

	/**
	 * Creates a new budget with the primary key. Does not add the budget to the database.
	 *
	 * @param budgetId the primary key for the new budget
	 * @return the new budget
	 */
	@Override
	public Budget create(long budgetId) {
		Budget budget = new BudgetImpl();

		budget.setNew(true);
		budget.setPrimaryKey(budgetId);

		return budget;
	}

	/**
	 * Removes the budget with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param budgetId the primary key of the budget
	 * @return the budget that was removed
	 * @throws com.startarget.portlet.NoSuchBudgetException if a budget with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Budget remove(long budgetId)
		throws NoSuchBudgetException, SystemException {
		return remove((Serializable)budgetId);
	}

	/**
	 * Removes the budget with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the budget
	 * @return the budget that was removed
	 * @throws com.startarget.portlet.NoSuchBudgetException if a budget with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Budget remove(Serializable primaryKey)
		throws NoSuchBudgetException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Budget budget = (Budget)session.get(BudgetImpl.class, primaryKey);

			if (budget == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBudgetException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(budget);
		}
		catch (NoSuchBudgetException nsee) {
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
	protected Budget removeImpl(Budget budget) throws SystemException {
		budget = toUnwrappedModel(budget);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(budget)) {
				budget = (Budget)session.get(BudgetImpl.class,
						budget.getPrimaryKeyObj());
			}

			if (budget != null) {
				session.delete(budget);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (budget != null) {
			clearCache(budget);
		}

		return budget;
	}

	@Override
	public Budget updateImpl(com.startarget.portlet.model.Budget budget)
		throws SystemException {
		budget = toUnwrappedModel(budget);

		boolean isNew = budget.isNew();

		Session session = null;

		try {
			session = openSession();

			if (budget.isNew()) {
				session.save(budget);

				budget.setNew(false);
			}
			else {
				session.merge(budget);
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

		EntityCacheUtil.putResult(BudgetModelImpl.ENTITY_CACHE_ENABLED,
			BudgetImpl.class, budget.getPrimaryKey(), budget);

		return budget;
	}

	protected Budget toUnwrappedModel(Budget budget) {
		if (budget instanceof BudgetImpl) {
			return budget;
		}

		BudgetImpl budgetImpl = new BudgetImpl();

		budgetImpl.setNew(budget.isNew());
		budgetImpl.setPrimaryKey(budget.getPrimaryKey());

		budgetImpl.setBudgetId(budget.getBudgetId());
		budgetImpl.setGroupId(budget.getGroupId());
		budgetImpl.setCompanyId(budget.getCompanyId());
		budgetImpl.setUserId(budget.getUserId());
		budgetImpl.setUserName(budget.getUserName());
		budgetImpl.setCreateDate(budget.getCreateDate());
		budgetImpl.setModifiedDate(budget.getModifiedDate());
		budgetImpl.setProjectName(budget.getProjectName());
		budgetImpl.setBudgetName(budget.getBudgetName());
		budgetImpl.setBudgetStartYear(budget.getBudgetStartYear());
		budgetImpl.setBudgetEndYear(budget.getBudgetEndYear());
		budgetImpl.setBudgetTotal(budget.getBudgetTotal());
		budgetImpl.setBudgetArrival(budget.getBudgetArrival());

		return budgetImpl;
	}

	/**
	 * Returns the budget with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the budget
	 * @return the budget
	 * @throws com.startarget.portlet.NoSuchBudgetException if a budget with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Budget findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBudgetException, SystemException {
		Budget budget = fetchByPrimaryKey(primaryKey);

		if (budget == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBudgetException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return budget;
	}

	/**
	 * Returns the budget with the primary key or throws a {@link com.startarget.portlet.NoSuchBudgetException} if it could not be found.
	 *
	 * @param budgetId the primary key of the budget
	 * @return the budget
	 * @throws com.startarget.portlet.NoSuchBudgetException if a budget with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Budget findByPrimaryKey(long budgetId)
		throws NoSuchBudgetException, SystemException {
		return findByPrimaryKey((Serializable)budgetId);
	}

	/**
	 * Returns the budget with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the budget
	 * @return the budget, or <code>null</code> if a budget with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Budget fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Budget budget = (Budget)EntityCacheUtil.getResult(BudgetModelImpl.ENTITY_CACHE_ENABLED,
				BudgetImpl.class, primaryKey);

		if (budget == _nullBudget) {
			return null;
		}

		if (budget == null) {
			Session session = null;

			try {
				session = openSession();

				budget = (Budget)session.get(BudgetImpl.class, primaryKey);

				if (budget != null) {
					cacheResult(budget);
				}
				else {
					EntityCacheUtil.putResult(BudgetModelImpl.ENTITY_CACHE_ENABLED,
						BudgetImpl.class, primaryKey, _nullBudget);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(BudgetModelImpl.ENTITY_CACHE_ENABLED,
					BudgetImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return budget;
	}

	/**
	 * Returns the budget with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param budgetId the primary key of the budget
	 * @return the budget, or <code>null</code> if a budget with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Budget fetchByPrimaryKey(long budgetId) throws SystemException {
		return fetchByPrimaryKey((Serializable)budgetId);
	}

	/**
	 * Returns all the budgets.
	 *
	 * @return the budgets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Budget> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Budget> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<Budget> findAll(int start, int end,
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

		List<Budget> list = (List<Budget>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BUDGET);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BUDGET;

				if (pagination) {
					sql = sql.concat(BudgetModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Budget>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Budget>(list);
				}
				else {
					list = (List<Budget>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the budgets from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Budget budget : findAll()) {
			remove(budget);
		}
	}

	/**
	 * Returns the number of budgets.
	 *
	 * @return the number of budgets
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

				Query q = session.createQuery(_SQL_COUNT_BUDGET);

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
	 * Initializes the budget persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.startarget.portlet.model.Budget")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Budget>> listenersList = new ArrayList<ModelListener<Budget>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Budget>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(BudgetImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_BUDGET = "SELECT budget FROM Budget budget";
	private static final String _SQL_COUNT_BUDGET = "SELECT COUNT(budget) FROM Budget budget";
	private static final String _ORDER_BY_ENTITY_ALIAS = "budget.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Budget exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BudgetPersistenceImpl.class);
	private static Budget _nullBudget = new BudgetImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Budget> toCacheModel() {
				return _nullBudgetCacheModel;
			}
		};

	private static CacheModel<Budget> _nullBudgetCacheModel = new CacheModel<Budget>() {
			@Override
			public Budget toEntityModel() {
				return _nullBudget;
			}
		};
}