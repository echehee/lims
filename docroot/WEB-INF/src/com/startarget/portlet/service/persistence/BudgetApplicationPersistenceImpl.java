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

import com.startarget.portlet.NoSuchBudgetApplicationException;
import com.startarget.portlet.model.BudgetApplication;
import com.startarget.portlet.model.impl.BudgetApplicationImpl;
import com.startarget.portlet.model.impl.BudgetApplicationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the budget application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author chaojie
 * @see BudgetApplicationPersistence
 * @see BudgetApplicationUtil
 * @generated
 */
public class BudgetApplicationPersistenceImpl extends BasePersistenceImpl<BudgetApplication>
	implements BudgetApplicationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BudgetApplicationUtil} to access the budget application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BudgetApplicationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BudgetApplicationModelImpl.ENTITY_CACHE_ENABLED,
			BudgetApplicationModelImpl.FINDER_CACHE_ENABLED,
			BudgetApplicationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BudgetApplicationModelImpl.ENTITY_CACHE_ENABLED,
			BudgetApplicationModelImpl.FINDER_CACHE_ENABLED,
			BudgetApplicationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BudgetApplicationModelImpl.ENTITY_CACHE_ENABLED,
			BudgetApplicationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public BudgetApplicationPersistenceImpl() {
		setModelClass(BudgetApplication.class);
	}

	/**
	 * Caches the budget application in the entity cache if it is enabled.
	 *
	 * @param budgetApplication the budget application
	 */
	@Override
	public void cacheResult(BudgetApplication budgetApplication) {
		EntityCacheUtil.putResult(BudgetApplicationModelImpl.ENTITY_CACHE_ENABLED,
			BudgetApplicationImpl.class, budgetApplication.getPrimaryKey(),
			budgetApplication);

		budgetApplication.resetOriginalValues();
	}

	/**
	 * Caches the budget applications in the entity cache if it is enabled.
	 *
	 * @param budgetApplications the budget applications
	 */
	@Override
	public void cacheResult(List<BudgetApplication> budgetApplications) {
		for (BudgetApplication budgetApplication : budgetApplications) {
			if (EntityCacheUtil.getResult(
						BudgetApplicationModelImpl.ENTITY_CACHE_ENABLED,
						BudgetApplicationImpl.class,
						budgetApplication.getPrimaryKey()) == null) {
				cacheResult(budgetApplication);
			}
			else {
				budgetApplication.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all budget applications.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BudgetApplicationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BudgetApplicationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the budget application.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BudgetApplication budgetApplication) {
		EntityCacheUtil.removeResult(BudgetApplicationModelImpl.ENTITY_CACHE_ENABLED,
			BudgetApplicationImpl.class, budgetApplication.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<BudgetApplication> budgetApplications) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (BudgetApplication budgetApplication : budgetApplications) {
			EntityCacheUtil.removeResult(BudgetApplicationModelImpl.ENTITY_CACHE_ENABLED,
				BudgetApplicationImpl.class, budgetApplication.getPrimaryKey());
		}
	}

	/**
	 * Creates a new budget application with the primary key. Does not add the budget application to the database.
	 *
	 * @param budgetApplicationId the primary key for the new budget application
	 * @return the new budget application
	 */
	@Override
	public BudgetApplication create(long budgetApplicationId) {
		BudgetApplication budgetApplication = new BudgetApplicationImpl();

		budgetApplication.setNew(true);
		budgetApplication.setPrimaryKey(budgetApplicationId);

		return budgetApplication;
	}

	/**
	 * Removes the budget application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param budgetApplicationId the primary key of the budget application
	 * @return the budget application that was removed
	 * @throws com.startarget.portlet.NoSuchBudgetApplicationException if a budget application with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BudgetApplication remove(long budgetApplicationId)
		throws NoSuchBudgetApplicationException, SystemException {
		return remove((Serializable)budgetApplicationId);
	}

	/**
	 * Removes the budget application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the budget application
	 * @return the budget application that was removed
	 * @throws com.startarget.portlet.NoSuchBudgetApplicationException if a budget application with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BudgetApplication remove(Serializable primaryKey)
		throws NoSuchBudgetApplicationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			BudgetApplication budgetApplication = (BudgetApplication)session.get(BudgetApplicationImpl.class,
					primaryKey);

			if (budgetApplication == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBudgetApplicationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(budgetApplication);
		}
		catch (NoSuchBudgetApplicationException nsee) {
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
	protected BudgetApplication removeImpl(BudgetApplication budgetApplication)
		throws SystemException {
		budgetApplication = toUnwrappedModel(budgetApplication);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(budgetApplication)) {
				budgetApplication = (BudgetApplication)session.get(BudgetApplicationImpl.class,
						budgetApplication.getPrimaryKeyObj());
			}

			if (budgetApplication != null) {
				session.delete(budgetApplication);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (budgetApplication != null) {
			clearCache(budgetApplication);
		}

		return budgetApplication;
	}

	@Override
	public BudgetApplication updateImpl(
		com.startarget.portlet.model.BudgetApplication budgetApplication)
		throws SystemException {
		budgetApplication = toUnwrappedModel(budgetApplication);

		boolean isNew = budgetApplication.isNew();

		Session session = null;

		try {
			session = openSession();

			if (budgetApplication.isNew()) {
				session.save(budgetApplication);

				budgetApplication.setNew(false);
			}
			else {
				session.merge(budgetApplication);
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

		EntityCacheUtil.putResult(BudgetApplicationModelImpl.ENTITY_CACHE_ENABLED,
			BudgetApplicationImpl.class, budgetApplication.getPrimaryKey(),
			budgetApplication);

		return budgetApplication;
	}

	protected BudgetApplication toUnwrappedModel(
		BudgetApplication budgetApplication) {
		if (budgetApplication instanceof BudgetApplicationImpl) {
			return budgetApplication;
		}

		BudgetApplicationImpl budgetApplicationImpl = new BudgetApplicationImpl();

		budgetApplicationImpl.setNew(budgetApplication.isNew());
		budgetApplicationImpl.setPrimaryKey(budgetApplication.getPrimaryKey());

		budgetApplicationImpl.setBudgetApplicationId(budgetApplication.getBudgetApplicationId());
		budgetApplicationImpl.setGroupId(budgetApplication.getGroupId());
		budgetApplicationImpl.setCompanyId(budgetApplication.getCompanyId());
		budgetApplicationImpl.setUserId(budgetApplication.getUserId());
		budgetApplicationImpl.setUserName(budgetApplication.getUserName());
		budgetApplicationImpl.setCreateDate(budgetApplication.getCreateDate());
		budgetApplicationImpl.setModifiedDate(budgetApplication.getModifiedDate());
		budgetApplicationImpl.setApplicantId(budgetApplication.getApplicantId());
		budgetApplicationImpl.setApplicantName(budgetApplication.getApplicantName());
		budgetApplicationImpl.setAuditorId(budgetApplication.getAuditorId());
		budgetApplicationImpl.setAuditorName(budgetApplication.getAuditorName());
		budgetApplicationImpl.setAuditDate(budgetApplication.getAuditDate());
		budgetApplicationImpl.setApproverId(budgetApplication.getApproverId());
		budgetApplicationImpl.setApproverName(budgetApplication.getApproverName());
		budgetApplicationImpl.setApproveDate(budgetApplication.getApproveDate());
		budgetApplicationImpl.setFinisherId(budgetApplication.getFinisherId());
		budgetApplicationImpl.setFinisherName(budgetApplication.getFinisherName());
		budgetApplicationImpl.setFinisherDate(budgetApplication.getFinisherDate());
		budgetApplicationImpl.setRejectReason(budgetApplication.getRejectReason());
		budgetApplicationImpl.setApplicationStatus(budgetApplication.getApplicationStatus());
		budgetApplicationImpl.setApplicationDescription(budgetApplication.getApplicationDescription());
		budgetApplicationImpl.setApplicationTotal(budgetApplication.getApplicationTotal());
		budgetApplicationImpl.setProjectName(budgetApplication.getProjectName());
		budgetApplicationImpl.setBudgetName(budgetApplication.getBudgetName());
		budgetApplicationImpl.setBudgetItemId(budgetApplication.getBudgetItemId());

		return budgetApplicationImpl;
	}

	/**
	 * Returns the budget application with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the budget application
	 * @return the budget application
	 * @throws com.startarget.portlet.NoSuchBudgetApplicationException if a budget application with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BudgetApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBudgetApplicationException, SystemException {
		BudgetApplication budgetApplication = fetchByPrimaryKey(primaryKey);

		if (budgetApplication == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBudgetApplicationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return budgetApplication;
	}

	/**
	 * Returns the budget application with the primary key or throws a {@link com.startarget.portlet.NoSuchBudgetApplicationException} if it could not be found.
	 *
	 * @param budgetApplicationId the primary key of the budget application
	 * @return the budget application
	 * @throws com.startarget.portlet.NoSuchBudgetApplicationException if a budget application with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BudgetApplication findByPrimaryKey(long budgetApplicationId)
		throws NoSuchBudgetApplicationException, SystemException {
		return findByPrimaryKey((Serializable)budgetApplicationId);
	}

	/**
	 * Returns the budget application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the budget application
	 * @return the budget application, or <code>null</code> if a budget application with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BudgetApplication fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		BudgetApplication budgetApplication = (BudgetApplication)EntityCacheUtil.getResult(BudgetApplicationModelImpl.ENTITY_CACHE_ENABLED,
				BudgetApplicationImpl.class, primaryKey);

		if (budgetApplication == _nullBudgetApplication) {
			return null;
		}

		if (budgetApplication == null) {
			Session session = null;

			try {
				session = openSession();

				budgetApplication = (BudgetApplication)session.get(BudgetApplicationImpl.class,
						primaryKey);

				if (budgetApplication != null) {
					cacheResult(budgetApplication);
				}
				else {
					EntityCacheUtil.putResult(BudgetApplicationModelImpl.ENTITY_CACHE_ENABLED,
						BudgetApplicationImpl.class, primaryKey,
						_nullBudgetApplication);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(BudgetApplicationModelImpl.ENTITY_CACHE_ENABLED,
					BudgetApplicationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return budgetApplication;
	}

	/**
	 * Returns the budget application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param budgetApplicationId the primary key of the budget application
	 * @return the budget application, or <code>null</code> if a budget application with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BudgetApplication fetchByPrimaryKey(long budgetApplicationId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)budgetApplicationId);
	}

	/**
	 * Returns all the budget applications.
	 *
	 * @return the budget applications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BudgetApplication> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the budget applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.startarget.portlet.model.impl.BudgetApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of budget applications
	 * @param end the upper bound of the range of budget applications (not inclusive)
	 * @return the range of budget applications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BudgetApplication> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the budget applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.startarget.portlet.model.impl.BudgetApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of budget applications
	 * @param end the upper bound of the range of budget applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of budget applications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BudgetApplication> findAll(int start, int end,
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

		List<BudgetApplication> list = (List<BudgetApplication>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BUDGETAPPLICATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BUDGETAPPLICATION;

				if (pagination) {
					sql = sql.concat(BudgetApplicationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<BudgetApplication>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BudgetApplication>(list);
				}
				else {
					list = (List<BudgetApplication>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the budget applications from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (BudgetApplication budgetApplication : findAll()) {
			remove(budgetApplication);
		}
	}

	/**
	 * Returns the number of budget applications.
	 *
	 * @return the number of budget applications
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

				Query q = session.createQuery(_SQL_COUNT_BUDGETAPPLICATION);

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
	 * Initializes the budget application persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.startarget.portlet.model.BudgetApplication")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<BudgetApplication>> listenersList = new ArrayList<ModelListener<BudgetApplication>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<BudgetApplication>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(BudgetApplicationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_BUDGETAPPLICATION = "SELECT budgetApplication FROM BudgetApplication budgetApplication";
	private static final String _SQL_COUNT_BUDGETAPPLICATION = "SELECT COUNT(budgetApplication) FROM BudgetApplication budgetApplication";
	private static final String _ORDER_BY_ENTITY_ALIAS = "budgetApplication.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BudgetApplication exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BudgetApplicationPersistenceImpl.class);
	private static BudgetApplication _nullBudgetApplication = new BudgetApplicationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<BudgetApplication> toCacheModel() {
				return _nullBudgetApplicationCacheModel;
			}
		};

	private static CacheModel<BudgetApplication> _nullBudgetApplicationCacheModel =
		new CacheModel<BudgetApplication>() {
			@Override
			public BudgetApplication toEntityModel() {
				return _nullBudgetApplication;
			}
		};
}