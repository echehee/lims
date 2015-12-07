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
 * This class is used by SOAP remote services, specifically {@link com.startarget.portlet.service.http.BudgetItemServiceSoap}.
 *
 * @author chaojie
 * @see com.startarget.portlet.service.http.BudgetItemServiceSoap
 * @generated
 */
public class BudgetItemSoap implements Serializable {
	public static BudgetItemSoap toSoapModel(BudgetItem model) {
		BudgetItemSoap soapModel = new BudgetItemSoap();

		soapModel.setBudgetItemId(model.getBudgetItemId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setBudgetId(model.getBudgetId());
		soapModel.setAccountItemId(model.getAccountItemId());
		soapModel.setAccountItemName(model.getAccountItemName());
		soapModel.setItemCode(model.getItemCode());
		soapModel.setBudgetTotal(model.getBudgetTotal());
		soapModel.setBudgetUsed(model.getBudgetUsed());

		return soapModel;
	}

	public static BudgetItemSoap[] toSoapModels(BudgetItem[] models) {
		BudgetItemSoap[] soapModels = new BudgetItemSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BudgetItemSoap[][] toSoapModels(BudgetItem[][] models) {
		BudgetItemSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BudgetItemSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BudgetItemSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BudgetItemSoap[] toSoapModels(List<BudgetItem> models) {
		List<BudgetItemSoap> soapModels = new ArrayList<BudgetItemSoap>(models.size());

		for (BudgetItem model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BudgetItemSoap[soapModels.size()]);
	}

	public BudgetItemSoap() {
	}

	public long getPrimaryKey() {
		return _budgetItemId;
	}

	public void setPrimaryKey(long pk) {
		setBudgetItemId(pk);
	}

	public long getBudgetItemId() {
		return _budgetItemId;
	}

	public void setBudgetItemId(long budgetItemId) {
		_budgetItemId = budgetItemId;
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

	public long getBudgetId() {
		return _budgetId;
	}

	public void setBudgetId(long budgetId) {
		_budgetId = budgetId;
	}

	public long getAccountItemId() {
		return _accountItemId;
	}

	public void setAccountItemId(long accountItemId) {
		_accountItemId = accountItemId;
	}

	public String getAccountItemName() {
		return _accountItemName;
	}

	public void setAccountItemName(String accountItemName) {
		_accountItemName = accountItemName;
	}

	public long getItemCode() {
		return _itemCode;
	}

	public void setItemCode(long itemCode) {
		_itemCode = itemCode;
	}

	public double getBudgetTotal() {
		return _budgetTotal;
	}

	public void setBudgetTotal(double budgetTotal) {
		_budgetTotal = budgetTotal;
	}

	public double getBudgetUsed() {
		return _budgetUsed;
	}

	public void setBudgetUsed(double budgetUsed) {
		_budgetUsed = budgetUsed;
	}

	private long _budgetItemId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _budgetId;
	private long _accountItemId;
	private String _accountItemName;
	private long _itemCode;
	private double _budgetTotal;
	private double _budgetUsed;
}