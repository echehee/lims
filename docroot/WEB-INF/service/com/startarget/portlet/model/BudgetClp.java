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

package com.startarget.portlet.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.startarget.portlet.service.BudgetLocalServiceUtil;
import com.startarget.portlet.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chaojie
 */
public class BudgetClp extends BaseModelImpl<Budget> implements Budget {
	public BudgetClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Budget.class;
	}

	@Override
	public String getModelClassName() {
		return Budget.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _budgetId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBudgetId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _budgetId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("budgetId", getBudgetId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("projectName", getProjectName());
		attributes.put("budgetName", getBudgetName());
		attributes.put("budgetStartYear", getBudgetStartYear());
		attributes.put("budgetEndYear", getBudgetEndYear());
		attributes.put("budgetTotal", getBudgetTotal());
		attributes.put("budgetArrival", getBudgetArrival());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long budgetId = (Long)attributes.get("budgetId");

		if (budgetId != null) {
			setBudgetId(budgetId);
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

		String projectName = (String)attributes.get("projectName");

		if (projectName != null) {
			setProjectName(projectName);
		}

		String budgetName = (String)attributes.get("budgetName");

		if (budgetName != null) {
			setBudgetName(budgetName);
		}

		Integer budgetStartYear = (Integer)attributes.get("budgetStartYear");

		if (budgetStartYear != null) {
			setBudgetStartYear(budgetStartYear);
		}

		Integer budgetEndYear = (Integer)attributes.get("budgetEndYear");

		if (budgetEndYear != null) {
			setBudgetEndYear(budgetEndYear);
		}

		Double budgetTotal = (Double)attributes.get("budgetTotal");

		if (budgetTotal != null) {
			setBudgetTotal(budgetTotal);
		}

		Double budgetArrival = (Double)attributes.get("budgetArrival");

		if (budgetArrival != null) {
			setBudgetArrival(budgetArrival);
		}
	}

	@Override
	public long getBudgetId() {
		return _budgetId;
	}

	@Override
	public void setBudgetId(long budgetId) {
		_budgetId = budgetId;

		if (_budgetRemoteModel != null) {
			try {
				Class<?> clazz = _budgetRemoteModel.getClass();

				Method method = clazz.getMethod("setBudgetId", long.class);

				method.invoke(_budgetRemoteModel, budgetId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_budgetRemoteModel != null) {
			try {
				Class<?> clazz = _budgetRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_budgetRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_budgetRemoteModel != null) {
			try {
				Class<?> clazz = _budgetRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_budgetRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_budgetRemoteModel != null) {
			try {
				Class<?> clazz = _budgetRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_budgetRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_budgetRemoteModel != null) {
			try {
				Class<?> clazz = _budgetRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_budgetRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_budgetRemoteModel != null) {
			try {
				Class<?> clazz = _budgetRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_budgetRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_budgetRemoteModel != null) {
			try {
				Class<?> clazz = _budgetRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_budgetRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProjectName() {
		return _projectName;
	}

	@Override
	public void setProjectName(String projectName) {
		_projectName = projectName;

		if (_budgetRemoteModel != null) {
			try {
				Class<?> clazz = _budgetRemoteModel.getClass();

				Method method = clazz.getMethod("setProjectName", String.class);

				method.invoke(_budgetRemoteModel, projectName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBudgetName() {
		return _budgetName;
	}

	@Override
	public void setBudgetName(String budgetName) {
		_budgetName = budgetName;

		if (_budgetRemoteModel != null) {
			try {
				Class<?> clazz = _budgetRemoteModel.getClass();

				Method method = clazz.getMethod("setBudgetName", String.class);

				method.invoke(_budgetRemoteModel, budgetName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getBudgetStartYear() {
		return _budgetStartYear;
	}

	@Override
	public void setBudgetStartYear(int budgetStartYear) {
		_budgetStartYear = budgetStartYear;

		if (_budgetRemoteModel != null) {
			try {
				Class<?> clazz = _budgetRemoteModel.getClass();

				Method method = clazz.getMethod("setBudgetStartYear", int.class);

				method.invoke(_budgetRemoteModel, budgetStartYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getBudgetEndYear() {
		return _budgetEndYear;
	}

	@Override
	public void setBudgetEndYear(int budgetEndYear) {
		_budgetEndYear = budgetEndYear;

		if (_budgetRemoteModel != null) {
			try {
				Class<?> clazz = _budgetRemoteModel.getClass();

				Method method = clazz.getMethod("setBudgetEndYear", int.class);

				method.invoke(_budgetRemoteModel, budgetEndYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getBudgetTotal() {
		return _budgetTotal;
	}

	@Override
	public void setBudgetTotal(double budgetTotal) {
		_budgetTotal = budgetTotal;

		if (_budgetRemoteModel != null) {
			try {
				Class<?> clazz = _budgetRemoteModel.getClass();

				Method method = clazz.getMethod("setBudgetTotal", double.class);

				method.invoke(_budgetRemoteModel, budgetTotal);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getBudgetArrival() {
		return _budgetArrival;
	}

	@Override
	public void setBudgetArrival(double budgetArrival) {
		_budgetArrival = budgetArrival;

		if (_budgetRemoteModel != null) {
			try {
				Class<?> clazz = _budgetRemoteModel.getClass();

				Method method = clazz.getMethod("setBudgetArrival", double.class);

				method.invoke(_budgetRemoteModel, budgetArrival);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getBudgetRemoteModel() {
		return _budgetRemoteModel;
	}

	public void setBudgetRemoteModel(BaseModel<?> budgetRemoteModel) {
		_budgetRemoteModel = budgetRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _budgetRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_budgetRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			BudgetLocalServiceUtil.addBudget(this);
		}
		else {
			BudgetLocalServiceUtil.updateBudget(this);
		}
	}

	@Override
	public Budget toEscapedModel() {
		return (Budget)ProxyUtil.newProxyInstance(Budget.class.getClassLoader(),
			new Class[] { Budget.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BudgetClp clone = new BudgetClp();

		clone.setBudgetId(getBudgetId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setProjectName(getProjectName());
		clone.setBudgetName(getBudgetName());
		clone.setBudgetStartYear(getBudgetStartYear());
		clone.setBudgetEndYear(getBudgetEndYear());
		clone.setBudgetTotal(getBudgetTotal());
		clone.setBudgetArrival(getBudgetArrival());

		return clone;
	}

	@Override
	public int compareTo(Budget budget) {
		long primaryKey = budget.getPrimaryKey();

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

		if (!(obj instanceof BudgetClp)) {
			return false;
		}

		BudgetClp budget = (BudgetClp)obj;

		long primaryKey = budget.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{budgetId=");
		sb.append(getBudgetId());
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
		sb.append(", projectName=");
		sb.append(getProjectName());
		sb.append(", budgetName=");
		sb.append(getBudgetName());
		sb.append(", budgetStartYear=");
		sb.append(getBudgetStartYear());
		sb.append(", budgetEndYear=");
		sb.append(getBudgetEndYear());
		sb.append(", budgetTotal=");
		sb.append(getBudgetTotal());
		sb.append(", budgetArrival=");
		sb.append(getBudgetArrival());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.startarget.portlet.model.Budget");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>budgetId</column-name><column-value><![CDATA[");
		sb.append(getBudgetId());
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
			"<column><column-name>projectName</column-name><column-value><![CDATA[");
		sb.append(getProjectName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>budgetName</column-name><column-value><![CDATA[");
		sb.append(getBudgetName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>budgetStartYear</column-name><column-value><![CDATA[");
		sb.append(getBudgetStartYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>budgetEndYear</column-name><column-value><![CDATA[");
		sb.append(getBudgetEndYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>budgetTotal</column-name><column-value><![CDATA[");
		sb.append(getBudgetTotal());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>budgetArrival</column-name><column-value><![CDATA[");
		sb.append(getBudgetArrival());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _budgetId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _projectName;
	private String _budgetName;
	private int _budgetStartYear;
	private int _budgetEndYear;
	private double _budgetTotal;
	private double _budgetArrival;
	private BaseModel<?> _budgetRemoteModel;
	private Class<?> _clpSerializerClass = com.startarget.portlet.service.ClpSerializer.class;
}