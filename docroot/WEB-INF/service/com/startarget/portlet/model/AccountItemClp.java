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

import com.startarget.portlet.service.AccountItemLocalServiceUtil;
import com.startarget.portlet.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chaojie
 */
public class AccountItemClp extends BaseModelImpl<AccountItem>
	implements AccountItem {
	public AccountItemClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return AccountItem.class;
	}

	@Override
	public String getModelClassName() {
		return AccountItem.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _accountItemId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAccountItemId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _accountItemId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("accountItemId", getAccountItemId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("parentName", getParentName());
		attributes.put("itemCode", getItemCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long accountItemId = (Long)attributes.get("accountItemId");

		if (accountItemId != null) {
			setAccountItemId(accountItemId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String parentName = (String)attributes.get("parentName");

		if (parentName != null) {
			setParentName(parentName);
		}

		Long itemCode = (Long)attributes.get("itemCode");

		if (itemCode != null) {
			setItemCode(itemCode);
		}
	}

	@Override
	public long getAccountItemId() {
		return _accountItemId;
	}

	@Override
	public void setAccountItemId(long accountItemId) {
		_accountItemId = accountItemId;

		if (_accountItemRemoteModel != null) {
			try {
				Class<?> clazz = _accountItemRemoteModel.getClass();

				Method method = clazz.getMethod("setAccountItemId", long.class);

				method.invoke(_accountItemRemoteModel, accountItemId);
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

		if (_accountItemRemoteModel != null) {
			try {
				Class<?> clazz = _accountItemRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_accountItemRemoteModel, groupId);
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

		if (_accountItemRemoteModel != null) {
			try {
				Class<?> clazz = _accountItemRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_accountItemRemoteModel, companyId);
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

		if (_accountItemRemoteModel != null) {
			try {
				Class<?> clazz = _accountItemRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_accountItemRemoteModel, userId);
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

		if (_accountItemRemoteModel != null) {
			try {
				Class<?> clazz = _accountItemRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_accountItemRemoteModel, userName);
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

		if (_accountItemRemoteModel != null) {
			try {
				Class<?> clazz = _accountItemRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_accountItemRemoteModel, createDate);
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

		if (_accountItemRemoteModel != null) {
			try {
				Class<?> clazz = _accountItemRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_accountItemRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_accountItemRemoteModel != null) {
			try {
				Class<?> clazz = _accountItemRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_accountItemRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getParentName() {
		return _parentName;
	}

	@Override
	public void setParentName(String parentName) {
		_parentName = parentName;

		if (_accountItemRemoteModel != null) {
			try {
				Class<?> clazz = _accountItemRemoteModel.getClass();

				Method method = clazz.getMethod("setParentName", String.class);

				method.invoke(_accountItemRemoteModel, parentName);
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

		if (_accountItemRemoteModel != null) {
			try {
				Class<?> clazz = _accountItemRemoteModel.getClass();

				Method method = clazz.getMethod("setItemCode", long.class);

				method.invoke(_accountItemRemoteModel, itemCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAccountItemRemoteModel() {
		return _accountItemRemoteModel;
	}

	public void setAccountItemRemoteModel(BaseModel<?> accountItemRemoteModel) {
		_accountItemRemoteModel = accountItemRemoteModel;
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

		Class<?> remoteModelClass = _accountItemRemoteModel.getClass();

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

		Object returnValue = method.invoke(_accountItemRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AccountItemLocalServiceUtil.addAccountItem(this);
		}
		else {
			AccountItemLocalServiceUtil.updateAccountItem(this);
		}
	}

	@Override
	public AccountItem toEscapedModel() {
		return (AccountItem)ProxyUtil.newProxyInstance(AccountItem.class.getClassLoader(),
			new Class[] { AccountItem.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AccountItemClp clone = new AccountItemClp();

		clone.setAccountItemId(getAccountItemId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setName(getName());
		clone.setParentName(getParentName());
		clone.setItemCode(getItemCode());

		return clone;
	}

	@Override
	public int compareTo(AccountItem accountItem) {
		long primaryKey = accountItem.getPrimaryKey();

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

		if (!(obj instanceof AccountItemClp)) {
			return false;
		}

		AccountItemClp accountItem = (AccountItemClp)obj;

		long primaryKey = accountItem.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{accountItemId=");
		sb.append(getAccountItemId());
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
		sb.append(", name=");
		sb.append(getName());
		sb.append(", parentName=");
		sb.append(getParentName());
		sb.append(", itemCode=");
		sb.append(getItemCode());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.startarget.portlet.model.AccountItem");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>accountItemId</column-name><column-value><![CDATA[");
		sb.append(getAccountItemId());
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
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentName</column-name><column-value><![CDATA[");
		sb.append(getParentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>itemCode</column-name><column-value><![CDATA[");
		sb.append(getItemCode());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _accountItemId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _parentName;
	private long _itemCode;
	private BaseModel<?> _accountItemRemoteModel;
	private Class<?> _clpSerializerClass = com.startarget.portlet.service.ClpSerializer.class;
}