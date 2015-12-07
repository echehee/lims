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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.startarget.portlet.service.http.AccountItemServiceSoap}.
 *
 * @author chaojie
 * @see com.startarget.portlet.service.http.AccountItemServiceSoap
 * @generated
 */
public class AccountItemSoap implements Serializable {
	public static AccountItemSoap toSoapModel(AccountItem model) {
		AccountItemSoap soapModel = new AccountItemSoap();

		soapModel.setAccountItemId(model.getAccountItemId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setParentName(model.getParentName());
		soapModel.setItemCode(model.getItemCode());

		return soapModel;
	}

	public static AccountItemSoap[] toSoapModels(AccountItem[] models) {
		AccountItemSoap[] soapModels = new AccountItemSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AccountItemSoap[][] toSoapModels(AccountItem[][] models) {
		AccountItemSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AccountItemSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AccountItemSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AccountItemSoap[] toSoapModels(List<AccountItem> models) {
		List<AccountItemSoap> soapModels = new ArrayList<AccountItemSoap>(models.size());

		for (AccountItem model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AccountItemSoap[soapModels.size()]);
	}

	public AccountItemSoap() {
	}

	public long getPrimaryKey() {
		return _accountItemId;
	}

	public void setPrimaryKey(long pk) {
		setAccountItemId(pk);
	}

	public long getAccountItemId() {
		return _accountItemId;
	}

	public void setAccountItemId(long accountItemId) {
		_accountItemId = accountItemId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getParentName() {
		return _parentName;
	}

	public void setParentName(String parentName) {
		_parentName = parentName;
	}

	public long getItemCode() {
		return _itemCode;
	}

	public void setItemCode(long itemCode) {
		_itemCode = itemCode;
	}

	private long _accountItemId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _parentName;
	private long _itemCode;
}