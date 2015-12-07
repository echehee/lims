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

package com.startarget.portlet.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.startarget.portlet.model.BudgetArrival;
import com.startarget.portlet.model.BudgetArrivalModel;
import com.startarget.portlet.model.BudgetArrivalSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the BudgetArrival service. Represents a row in the &quot;lims_BudgetArrival&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.startarget.portlet.model.BudgetArrivalModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BudgetArrivalImpl}.
 * </p>
 *
 * @author chaojie
 * @see BudgetArrivalImpl
 * @see com.startarget.portlet.model.BudgetArrival
 * @see com.startarget.portlet.model.BudgetArrivalModel
 * @generated
 */
@JSON(strict = true)
public class BudgetArrivalModelImpl extends BaseModelImpl<BudgetArrival>
	implements BudgetArrivalModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a budget arrival model instance should use the {@link com.startarget.portlet.model.BudgetArrival} interface instead.
	 */
	public static final String TABLE_NAME = "lims_BudgetArrival";
	public static final Object[][] TABLE_COLUMNS = {
			{ "budgetArrivalId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "operatorId", Types.BIGINT },
			{ "operatorName", Types.VARCHAR },
			{ "arrivalTotal", Types.DOUBLE },
			{ "projectName", Types.VARCHAR },
			{ "budgetName", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table lims_BudgetArrival (budgetArrivalId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,operatorId LONG,operatorName VARCHAR(75) null,arrivalTotal DOUBLE,projectName VARCHAR(75) null,budgetName VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table lims_BudgetArrival";
	public static final String ORDER_BY_JPQL = " ORDER BY budgetArrival.budgetArrivalId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY lims_BudgetArrival.budgetArrivalId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.startarget.portlet.model.BudgetArrival"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.startarget.portlet.model.BudgetArrival"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static BudgetArrival toModel(BudgetArrivalSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		BudgetArrival model = new BudgetArrivalImpl();

		model.setBudgetArrivalId(soapModel.getBudgetArrivalId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setOperatorId(soapModel.getOperatorId());
		model.setOperatorName(soapModel.getOperatorName());
		model.setArrivalTotal(soapModel.getArrivalTotal());
		model.setProjectName(soapModel.getProjectName());
		model.setBudgetName(soapModel.getBudgetName());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<BudgetArrival> toModels(BudgetArrivalSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<BudgetArrival> models = new ArrayList<BudgetArrival>(soapModels.length);

		for (BudgetArrivalSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.startarget.portlet.model.BudgetArrival"));

	public BudgetArrivalModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _budgetArrivalId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBudgetArrivalId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _budgetArrivalId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return BudgetArrival.class;
	}

	@Override
	public String getModelClassName() {
		return BudgetArrival.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("budgetArrivalId", getBudgetArrivalId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("operatorId", getOperatorId());
		attributes.put("operatorName", getOperatorName());
		attributes.put("arrivalTotal", getArrivalTotal());
		attributes.put("projectName", getProjectName());
		attributes.put("budgetName", getBudgetName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long budgetArrivalId = (Long)attributes.get("budgetArrivalId");

		if (budgetArrivalId != null) {
			setBudgetArrivalId(budgetArrivalId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long operatorId = (Long)attributes.get("operatorId");

		if (operatorId != null) {
			setOperatorId(operatorId);
		}

		String operatorName = (String)attributes.get("operatorName");

		if (operatorName != null) {
			setOperatorName(operatorName);
		}

		Double arrivalTotal = (Double)attributes.get("arrivalTotal");

		if (arrivalTotal != null) {
			setArrivalTotal(arrivalTotal);
		}

		String projectName = (String)attributes.get("projectName");

		if (projectName != null) {
			setProjectName(projectName);
		}

		String budgetName = (String)attributes.get("budgetName");

		if (budgetName != null) {
			setBudgetName(budgetName);
		}
	}

	@JSON
	@Override
	public long getBudgetArrivalId() {
		return _budgetArrivalId;
	}

	@Override
	public void setBudgetArrivalId(long budgetArrivalId) {
		_budgetArrivalId = budgetArrivalId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getOperatorId() {
		return _operatorId;
	}

	@Override
	public void setOperatorId(long operatorId) {
		_operatorId = operatorId;
	}

	@JSON
	@Override
	public String getOperatorName() {
		if (_operatorName == null) {
			return StringPool.BLANK;
		}
		else {
			return _operatorName;
		}
	}

	@Override
	public void setOperatorName(String operatorName) {
		_operatorName = operatorName;
	}

	@JSON
	@Override
	public double getArrivalTotal() {
		return _arrivalTotal;
	}

	@Override
	public void setArrivalTotal(double arrivalTotal) {
		_arrivalTotal = arrivalTotal;
	}

	@JSON
	@Override
	public String getProjectName() {
		if (_projectName == null) {
			return StringPool.BLANK;
		}
		else {
			return _projectName;
		}
	}

	@Override
	public void setProjectName(String projectName) {
		_projectName = projectName;
	}

	@JSON
	@Override
	public String getBudgetName() {
		if (_budgetName == null) {
			return StringPool.BLANK;
		}
		else {
			return _budgetName;
		}
	}

	@Override
	public void setBudgetName(String budgetName) {
		_budgetName = budgetName;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			BudgetArrival.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public BudgetArrival toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (BudgetArrival)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		BudgetArrivalImpl budgetArrivalImpl = new BudgetArrivalImpl();

		budgetArrivalImpl.setBudgetArrivalId(getBudgetArrivalId());
		budgetArrivalImpl.setGroupId(getGroupId());
		budgetArrivalImpl.setCompanyId(getCompanyId());
		budgetArrivalImpl.setUserId(getUserId());
		budgetArrivalImpl.setUserName(getUserName());
		budgetArrivalImpl.setCreateDate(getCreateDate());
		budgetArrivalImpl.setModifiedDate(getModifiedDate());
		budgetArrivalImpl.setOperatorId(getOperatorId());
		budgetArrivalImpl.setOperatorName(getOperatorName());
		budgetArrivalImpl.setArrivalTotal(getArrivalTotal());
		budgetArrivalImpl.setProjectName(getProjectName());
		budgetArrivalImpl.setBudgetName(getBudgetName());

		budgetArrivalImpl.resetOriginalValues();

		return budgetArrivalImpl;
	}

	@Override
	public int compareTo(BudgetArrival budgetArrival) {
		long primaryKey = budgetArrival.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BudgetArrival)) {
			return false;
		}

		BudgetArrival budgetArrival = (BudgetArrival)obj;

		long primaryKey = budgetArrival.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<BudgetArrival> toCacheModel() {
		BudgetArrivalCacheModel budgetArrivalCacheModel = new BudgetArrivalCacheModel();

		budgetArrivalCacheModel.budgetArrivalId = getBudgetArrivalId();

		budgetArrivalCacheModel.groupId = getGroupId();

		budgetArrivalCacheModel.companyId = getCompanyId();

		budgetArrivalCacheModel.userId = getUserId();

		budgetArrivalCacheModel.userName = getUserName();

		String userName = budgetArrivalCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			budgetArrivalCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			budgetArrivalCacheModel.createDate = createDate.getTime();
		}
		else {
			budgetArrivalCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			budgetArrivalCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			budgetArrivalCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		budgetArrivalCacheModel.operatorId = getOperatorId();

		budgetArrivalCacheModel.operatorName = getOperatorName();

		String operatorName = budgetArrivalCacheModel.operatorName;

		if ((operatorName != null) && (operatorName.length() == 0)) {
			budgetArrivalCacheModel.operatorName = null;
		}

		budgetArrivalCacheModel.arrivalTotal = getArrivalTotal();

		budgetArrivalCacheModel.projectName = getProjectName();

		String projectName = budgetArrivalCacheModel.projectName;

		if ((projectName != null) && (projectName.length() == 0)) {
			budgetArrivalCacheModel.projectName = null;
		}

		budgetArrivalCacheModel.budgetName = getBudgetName();

		String budgetName = budgetArrivalCacheModel.budgetName;

		if ((budgetName != null) && (budgetName.length() == 0)) {
			budgetArrivalCacheModel.budgetName = null;
		}

		return budgetArrivalCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{budgetArrivalId=");
		sb.append(getBudgetArrivalId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", operatorId=");
		sb.append(getOperatorId());
		sb.append(", operatorName=");
		sb.append(getOperatorName());
		sb.append(", arrivalTotal=");
		sb.append(getArrivalTotal());
		sb.append(", projectName=");
		sb.append(getProjectName());
		sb.append(", budgetName=");
		sb.append(getBudgetName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.startarget.portlet.model.BudgetArrival");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>budgetArrivalId</column-name><column-value><![CDATA[");
		sb.append(getBudgetArrivalId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>operatorId</column-name><column-value><![CDATA[");
		sb.append(getOperatorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>operatorName</column-name><column-value><![CDATA[");
		sb.append(getOperatorName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>arrivalTotal</column-name><column-value><![CDATA[");
		sb.append(getArrivalTotal());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>projectName</column-name><column-value><![CDATA[");
		sb.append(getProjectName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>budgetName</column-name><column-value><![CDATA[");
		sb.append(getBudgetName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = BudgetArrival.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			BudgetArrival.class
		};
	private long _budgetArrivalId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _operatorId;
	private String _operatorName;
	private double _arrivalTotal;
	private String _projectName;
	private String _budgetName;
	private BudgetArrival _escapedModel;
}