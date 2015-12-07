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

import com.startarget.portlet.service.BudgetArrivalLocalServiceUtil;
import com.startarget.portlet.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chaojie
 */
public class BudgetArrivalClp extends BaseModelImpl<BudgetArrival>
	implements BudgetArrival {
	public BudgetArrivalClp() {
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

	@Override
	public long getBudgetArrivalId() {
		return _budgetArrivalId;
	}

	@Override
	public void setBudgetArrivalId(long budgetArrivalId) {
		_budgetArrivalId = budgetArrivalId;

		if (_budgetArrivalRemoteModel != null) {
			try {
				Class<?> clazz = _budgetArrivalRemoteModel.getClass();

				Method method = clazz.getMethod("setBudgetArrivalId", long.class);

				method.invoke(_budgetArrivalRemoteModel, budgetArrivalId);
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

		if (_budgetArrivalRemoteModel != null) {
			try {
				Class<?> clazz = _budgetArrivalRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_budgetArrivalRemoteModel, groupId);
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

		if (_budgetArrivalRemoteModel != null) {
			try {
				Class<?> clazz = _budgetArrivalRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_budgetArrivalRemoteModel, companyId);
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

		if (_budgetArrivalRemoteModel != null) {
			try {
				Class<?> clazz = _budgetArrivalRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_budgetArrivalRemoteModel, userId);
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

		if (_budgetArrivalRemoteModel != null) {
			try {
				Class<?> clazz = _budgetArrivalRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_budgetArrivalRemoteModel, userName);
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

		if (_budgetArrivalRemoteModel != null) {
			try {
				Class<?> clazz = _budgetArrivalRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_budgetArrivalRemoteModel, createDate);
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

		if (_budgetArrivalRemoteModel != null) {
			try {
				Class<?> clazz = _budgetArrivalRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_budgetArrivalRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getOperatorId() {
		return _operatorId;
	}

	@Override
	public void setOperatorId(long operatorId) {
		_operatorId = operatorId;

		if (_budgetArrivalRemoteModel != null) {
			try {
				Class<?> clazz = _budgetArrivalRemoteModel.getClass();

				Method method = clazz.getMethod("setOperatorId", long.class);

				method.invoke(_budgetArrivalRemoteModel, operatorId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOperatorName() {
		return _operatorName;
	}

	@Override
	public void setOperatorName(String operatorName) {
		_operatorName = operatorName;

		if (_budgetArrivalRemoteModel != null) {
			try {
				Class<?> clazz = _budgetArrivalRemoteModel.getClass();

				Method method = clazz.getMethod("setOperatorName", String.class);

				method.invoke(_budgetArrivalRemoteModel, operatorName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getArrivalTotal() {
		return _arrivalTotal;
	}

	@Override
	public void setArrivalTotal(double arrivalTotal) {
		_arrivalTotal = arrivalTotal;

		if (_budgetArrivalRemoteModel != null) {
			try {
				Class<?> clazz = _budgetArrivalRemoteModel.getClass();

				Method method = clazz.getMethod("setArrivalTotal", double.class);

				method.invoke(_budgetArrivalRemoteModel, arrivalTotal);
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

		if (_budgetArrivalRemoteModel != null) {
			try {
				Class<?> clazz = _budgetArrivalRemoteModel.getClass();

				Method method = clazz.getMethod("setProjectName", String.class);

				method.invoke(_budgetArrivalRemoteModel, projectName);
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

		if (_budgetArrivalRemoteModel != null) {
			try {
				Class<?> clazz = _budgetArrivalRemoteModel.getClass();

				Method method = clazz.getMethod("setBudgetName", String.class);

				method.invoke(_budgetArrivalRemoteModel, budgetName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getBudgetArrivalRemoteModel() {
		return _budgetArrivalRemoteModel;
	}

	public void setBudgetArrivalRemoteModel(
		BaseModel<?> budgetArrivalRemoteModel) {
		_budgetArrivalRemoteModel = budgetArrivalRemoteModel;
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

		Class<?> remoteModelClass = _budgetArrivalRemoteModel.getClass();

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

		Object returnValue = method.invoke(_budgetArrivalRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			BudgetArrivalLocalServiceUtil.addBudgetArrival(this);
		}
		else {
			BudgetArrivalLocalServiceUtil.updateBudgetArrival(this);
		}
	}

	@Override
	public BudgetArrival toEscapedModel() {
		return (BudgetArrival)ProxyUtil.newProxyInstance(BudgetArrival.class.getClassLoader(),
			new Class[] { BudgetArrival.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BudgetArrivalClp clone = new BudgetArrivalClp();

		clone.setBudgetArrivalId(getBudgetArrivalId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setOperatorId(getOperatorId());
		clone.setOperatorName(getOperatorName());
		clone.setArrivalTotal(getArrivalTotal());
		clone.setProjectName(getProjectName());
		clone.setBudgetName(getBudgetName());

		return clone;
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

		if (!(obj instanceof BudgetArrivalClp)) {
			return false;
		}

		BudgetArrivalClp budgetArrival = (BudgetArrivalClp)obj;

		long primaryKey = budgetArrival.getPrimaryKey();

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
	private BaseModel<?> _budgetArrivalRemoteModel;
	private Class<?> _clpSerializerClass = com.startarget.portlet.service.ClpSerializer.class;
}