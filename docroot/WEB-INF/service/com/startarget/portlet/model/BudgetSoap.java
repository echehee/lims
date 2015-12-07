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
 * This class is used by SOAP remote services, specifically {@link com.startarget.portlet.service.http.BudgetServiceSoap}.
 *
 * @author chaojie
 * @see com.startarget.portlet.service.http.BudgetServiceSoap
 * @generated
 */
public class BudgetSoap implements Serializable {
	public static BudgetSoap toSoapModel(Budget model) {
		BudgetSoap soapModel = new BudgetSoap();

		soapModel.setBudgetId(model.getBudgetId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setProjectName(model.getProjectName());
		soapModel.setBudgetName(model.getBudgetName());
		soapModel.setBudgetStartYear(model.getBudgetStartYear());
		soapModel.setBudgetEndYear(model.getBudgetEndYear());
		soapModel.setBudgetTotal(model.getBudgetTotal());
		soapModel.setBudgetArrival(model.getBudgetArrival());

		return soapModel;
	}

	public static BudgetSoap[] toSoapModels(Budget[] models) {
		BudgetSoap[] soapModels = new BudgetSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BudgetSoap[][] toSoapModels(Budget[][] models) {
		BudgetSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BudgetSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BudgetSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BudgetSoap[] toSoapModels(List<Budget> models) {
		List<BudgetSoap> soapModels = new ArrayList<BudgetSoap>(models.size());

		for (Budget model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BudgetSoap[soapModels.size()]);
	}

	public BudgetSoap() {
	}

	public long getPrimaryKey() {
		return _budgetId;
	}

	public void setPrimaryKey(long pk) {
		setBudgetId(pk);
	}

	public long getBudgetId() {
		return _budgetId;
	}

	public void setBudgetId(long budgetId) {
		_budgetId = budgetId;
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

	public int getBudgetStartYear() {
		return _budgetStartYear;
	}

	public void setBudgetStartYear(int budgetStartYear) {
		_budgetStartYear = budgetStartYear;
	}

	public int getBudgetEndYear() {
		return _budgetEndYear;
	}

	public void setBudgetEndYear(int budgetEndYear) {
		_budgetEndYear = budgetEndYear;
	}

	public double getBudgetTotal() {
		return _budgetTotal;
	}

	public void setBudgetTotal(double budgetTotal) {
		_budgetTotal = budgetTotal;
	}

	public double getBudgetArrival() {
		return _budgetArrival;
	}

	public void setBudgetArrival(double budgetArrival) {
		_budgetArrival = budgetArrival;
	}

	private long _budgetId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _projectName;
	private String _budgetName;
	private int _budgetStartYear;
	private int _budgetEndYear;
	private double _budgetTotal;
	private double _budgetArrival;
}