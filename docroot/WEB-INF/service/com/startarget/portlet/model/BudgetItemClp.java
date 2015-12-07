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

import com.startarget.portlet.service.BudgetItemLocalServiceUtil;
import com.startarget.portlet.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chaojie
 */
public class BudgetItemClp extends BaseModelImpl<BudgetItem>
	implements BudgetItem {
	public BudgetItemClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return BudgetItem.class;
	}

	@Override
	public String getModelClassName() {
		return BudgetItem.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _budgetItemId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBudgetItemId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _budgetItemId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("budgetItemId", getBudgetItemId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("budgetId", getBudgetId());
		attributes.put("accountItemId", getAccountItemId());
		attributes.put("accountItemName", getAccountItemName());
		attributes.put("itemCode", getItemCode());
		attributes.put("budgetTotal", getBudgetTotal());
		attributes.put("budgetUsed", getBudgetUsed());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long budgetItemId = (Long)attributes.get("budgetItemId");

		if (budgetItemId != null) {
			setBudgetItemId(budgetItemId);
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

		Long budgetId = (Long)attributes.get("budgetId");

		if (budgetId != null) {
			setBudgetId(budgetId);
		}

		Long accountItemId = (Long)attributes.get("accountItemId");

		if (accountItemId != null) {
			setAccountItemId(accountItemId);
		}

		String accountItemName = (String)attributes.get("accountItemName");

		if (accountItemName != null) {
			setAccountItemName(accountItemName);
		}

		Long itemCode = (Long)attributes.get("itemCode");

		if (itemCode != null) {
			setItemCode(itemCode);
		}

		Double budgetTotal = (Double)attributes.get("budgetTotal");

		if (budgetTotal != null) {
			setBudgetTotal(budgetTotal);
		}

		Double budgetUsed = (Double)attributes.get("budgetUsed");

		if (budgetUsed != null) {
			setBudgetUsed(budgetUsed);
		}
	}

	@Override
	public long getBudgetItemId() {
		return _budgetItemId;
	}

	@Override
	public void setBudgetItemId(long budgetItemId) {
		_budgetItemId = budgetItemId;

		if (_budgetItemRemoteModel != null) {
			try {
				Class<?> clazz = _budgetItemRemoteModel.getClass();

				Method method = clazz.getMethod("setBudgetItemId", long.class);

				method.invoke(_budgetItemRemoteModel, budgetItemId);
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

		if (_budgetItemRemoteModel != null) {
			try {
				Class<?> clazz = _budgetItemRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_budgetItemRemoteModel, groupId);
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

		if (_budgetItemRemoteModel != null) {
			try {
				Class<?> clazz = _budgetItemRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_budgetItemRemoteModel, companyId);
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

		if (_budgetItemRemoteModel != null) {
			try {
				Class<?> clazz = _budgetItemRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_budgetItemRemoteModel, userId);
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

		if (_budgetItemRemoteModel != null) {
			try {
				Class<?> clazz = _budgetItemRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_budgetItemRemoteModel, userName);
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

		if (_budgetItemRemoteModel != null) {
			try {
				Class<?> clazz = _budgetItemRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_budgetItemRemoteModel, createDate);
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

		if (_budgetItemRemoteModel != null) {
			try {
				Class<?> clazz = _budgetItemRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_budgetItemRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getBudgetId() {
		return _budgetId;
	}

	@Override
	public void setBudgetId(long budgetId) {
		_budgetId = budgetId;

		if (_budgetItemRemoteModel != null) {
			try {
				Class<?> clazz = _budgetItemRemoteModel.getClass();

				Method method = clazz.getMethod("setBudgetId", long.class);

				method.invoke(_budgetItemRemoteModel, budgetId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAccountItemId() {
		return _accountItemId;
	}

	@Override
	public void setAccountItemId(long accountItemId) {
		_accountItemId = accountItemId;

		if (_budgetItemRemoteModel != null) {
			try {
				Class<?> clazz = _budgetItemRemoteModel.getClass();

				Method method = clazz.getMethod("setAccountItemId", long.class);

				method.invoke(_budgetItemRemoteModel, accountItemId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAccountItemName() {
		return _accountItemName;
	}

	@Override
	public void setAccountItemName(String accountItemName) {
		_accountItemName = accountItemName;

		if (_budgetItemRemoteModel != null) {
			try {
				Class<?> clazz = _budgetItemRemoteModel.getClass();

				Method method = clazz.getMethod("setAccountItemName",
						String.class);

				method.invoke(_budgetItemRemoteModel, accountItemName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getItemCode() {
		return _itemCode;
	}

	@Override
	public void setItemCode(long itemCode) {
		_itemCode = itemCode;

		if (_budgetItemRemoteModel != null) {
			try {
				Class<?> clazz = _budgetItemRemoteModel.getClass();

				Method method = clazz.getMethod("setItemCode", long.class);

				method.invoke(_budgetItemRemoteModel, itemCode);
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

		if (_budgetItemRemoteModel != null) {
			try {
				Class<?> clazz = _budgetItemRemoteModel.getClass();

				Method method = clazz.getMethod("setBudgetTotal", double.class);

				method.invoke(_budgetItemRemoteModel, budgetTotal);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getBudgetUsed() {
		return _budgetUsed;
	}

	@Override
	public void setBudgetUsed(double budgetUsed) {
		_budgetUsed = budgetUsed;

		if (_budgetItemRemoteModel != null) {
			try {
				Class<?> clazz = _budgetItemRemoteModel.getClass();

				Method method = clazz.getMethod("setBudgetUsed", double.class);

				method.invoke(_budgetItemRemoteModel, budgetUsed);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getBudgetItemRemoteModel() {
		return _budgetItemRemoteModel;
	}

	public void setBudgetItemRemoteModel(BaseModel<?> budgetItemRemoteModel) {
		_budgetItemRemoteModel = budgetItemRemoteModel;
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

		Class<?> remoteModelClass = _budgetItemRemoteModel.getClass();

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

		Object returnValue = method.invoke(_budgetItemRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			BudgetItemLocalServiceUtil.addBudgetItem(this);
		}
		else {
			BudgetItemLocalServiceUtil.updateBudgetItem(this);
		}
	}

	@Override
	public BudgetItem toEscapedModel() {
		return (BudgetItem)ProxyUtil.newProxyInstance(BudgetItem.class.getClassLoader(),
			new Class[] { BudgetItem.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BudgetItemClp clone = new BudgetItemClp();

		clone.setBudgetItemId(getBudgetItemId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setBudgetId(getBudgetId());
		clone.setAccountItemId(getAccountItemId());
		clone.setAccountItemName(getAccountItemName());
		clone.setItemCode(getItemCode());
		clone.setBudgetTotal(getBudgetTotal());
		clone.setBudgetUsed(getBudgetUsed());

		return clone;
	}

	@Override
	public int compareTo(BudgetItem budgetItem) {
		long primaryKey = budgetItem.getPrimaryKey();

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

		if (!(obj instanceof BudgetItemClp)) {
			return false;
		}

		BudgetItemClp budgetItem = (BudgetItemClp)obj;

		long primaryKey = budgetItem.getPrimaryKey();

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

		sb.append("{budgetItemId=");
		sb.append(getBudgetItemId());
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
		sb.append(", budgetId=");
		sb.append(getBudgetId());
		sb.append(", accountItemId=");
		sb.append(getAccountItemId());
		sb.append(", accountItemName=");
		sb.append(getAccountItemName());
		sb.append(", itemCode=");
		sb.append(getItemCode());
		sb.append(", budgetTotal=");
		sb.append(getBudgetTotal());
		sb.append(", budgetUsed=");
		sb.append(getBudgetUsed());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.startarget.portlet.model.BudgetItem");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>budgetItemId</column-name><column-value><![CDATA[");
		sb.append(getBudgetItemId());
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
			"<column><column-name>budgetId</column-name><column-value><![CDATA[");
		sb.append(getBudgetId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accountItemId</column-name><column-value><![CDATA[");
		sb.append(getAccountItemId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accountItemName</column-name><column-value><![CDATA[");
		sb.append(getAccountItemName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>itemCode</column-name><column-value><![CDATA[");
		sb.append(getItemCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>budgetTotal</column-name><column-value><![CDATA[");
		sb.append(getBudgetTotal());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>budgetUsed</column-name><column-value><![CDATA[");
		sb.append(getBudgetUsed());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _budgetItemId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _budgetId;
	private long _accountItemId;
	private String _accountItemName;
	private long _itemCode;
	private double _budgetTotal;
	private double _budgetUsed;
	private BaseModel<?> _budgetItemRemoteModel;
	private Class<?> _clpSerializerClass = com.startarget.portlet.service.ClpSerializer.class;
}