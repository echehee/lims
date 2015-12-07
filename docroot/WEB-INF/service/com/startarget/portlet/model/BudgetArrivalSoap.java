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
 * This class is used by SOAP remote services, specifically {@link com.startarget.portlet.service.http.BudgetArrivalServiceSoap}.
 *
 * @author chaojie
 * @see com.startarget.portlet.service.http.BudgetArrivalServiceSoap
 * @generated
 */
public class BudgetArrivalSoap implements Serializable {
	public static BudgetArrivalSoap toSoapModel(BudgetArrival model) {
		BudgetArrivalSoap soapModel = new BudgetArrivalSoap();

		soapModel.setBudgetArrivalId(model.getBudgetArrivalId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setOperatorId(model.getOperatorId());
		soapModel.setOperatorName(model.getOperatorName());
		soapModel.setArrivalTotal(model.getArrivalTotal());
		soapModel.setProjectName(model.getProjectName());
		soapModel.setBudgetName(model.getBudgetName());

		return soapModel;
	}

	public static BudgetArrivalSoap[] toSoapModels(BudgetArrival[] models) {
		BudgetArrivalSoap[] soapModels = new BudgetArrivalSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BudgetArrivalSoap[][] toSoapModels(BudgetArrival[][] models) {
		BudgetArrivalSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BudgetArrivalSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BudgetArrivalSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BudgetArrivalSoap[] toSoapModels(List<BudgetArrival> models) {
		List<BudgetArrivalSoap> soapModels = new ArrayList<BudgetArrivalSoap>(models.size());

		for (BudgetArrival model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BudgetArrivalSoap[soapModels.size()]);
	}

	public BudgetArrivalSoap() {
	}

	public long getPrimaryKey() {
		return _budgetArrivalId;
	}

	public void setPrimaryKey(long pk) {
		setBudgetArrivalId(pk);
	}

	public long getBudgetArrivalId() {
		return _budgetArrivalId;
	}

	public void setBudgetArrivalId(long budgetArrivalId) {
		_budgetArrivalId = budgetArrivalId;
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

	public long getOperatorId() {
		return _operatorId;
	}

	public void setOperatorId(long operatorId) {
		_operatorId = operatorId;
	}

	public String getOperatorName() {
		return _operatorName;
	}

	public void setOperatorName(String operatorName) {
		_operatorName = operatorName;
	}

	public double getArrivalTotal() {
		return _arrivalTotal;
	}

	public void setArrivalTotal(double arrivalTotal) {
		_arrivalTotal = arrivalTotal;
	}

	public String getProjectName() {
		return _projectName;
	}

	public void setProjectName(String projectName) {
		_projectName = projectName;
	}

	public String getBudgetName() {
		return _budgetName;
	}

	public void setBudgetName(String budgetName) {
		_budgetName = budgetName;
	}

	private long _budgetArrivalId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _operatorId;
	private String _operatorName;
	private double _arrivalTotal;
	private String _projectName;
	private String _budgetName;
}