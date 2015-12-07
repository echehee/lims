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
 * This class is used by SOAP remote services, specifically {@link com.startarget.portlet.service.http.BudgetApplicationServiceSoap}.
 *
 * @author chaojie
 * @see com.startarget.portlet.service.http.BudgetApplicationServiceSoap
 * @generated
 */
public class BudgetApplicationSoap implements Serializable {
	public static BudgetApplicationSoap toSoapModel(BudgetApplication model) {
		BudgetApplicationSoap soapModel = new BudgetApplicationSoap();

		soapModel.setBudgetApplicationId(model.getBudgetApplicationId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setApplicantId(model.getApplicantId());
		soapModel.setApplicantName(model.getApplicantName());
		soapModel.setAuditorId(model.getAuditorId());
		soapModel.setAuditorName(model.getAuditorName());
		soapModel.setAuditDate(model.getAuditDate());
		soapModel.setApproverId(model.getApproverId());
		soapModel.setApproverName(model.getApproverName());
		soapModel.setApproveDate(model.getApproveDate());
		soapModel.setFinisherId(model.getFinisherId());
		soapModel.setFinisherName(model.getFinisherName());
		soapModel.setFinisherDate(model.getFinisherDate());
		soapModel.setRejectReason(model.getRejectReason());
		soapModel.setApplicationStatus(model.getApplicationStatus());
		soapModel.setApplicationDescription(model.getApplicationDescription());
		soapModel.setApplicationTotal(model.getApplicationTotal());
		soapModel.setProjectName(model.getProjectName());
		soapModel.setBudgetName(model.getBudgetName());
		soapModel.setBudgetItemId(model.getBudgetItemId());

		return soapModel;
	}

	public static BudgetApplicationSoap[] toSoapModels(
		BudgetApplication[] models) {
		BudgetApplicationSoap[] soapModels = new BudgetApplicationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BudgetApplicationSoap[][] toSoapModels(
		BudgetApplication[][] models) {
		BudgetApplicationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BudgetApplicationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BudgetApplicationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BudgetApplicationSoap[] toSoapModels(
		List<BudgetApplication> models) {
		List<BudgetApplicationSoap> soapModels = new ArrayList<BudgetApplicationSoap>(models.size());

		for (BudgetApplication model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BudgetApplicationSoap[soapModels.size()]);
	}

	public BudgetApplicationSoap() {
	}

	public long getPrimaryKey() {
		return _budgetApplicationId;
	}

	public void setPrimaryKey(long pk) {
		setBudgetApplicationId(pk);
	}

	public long getBudgetApplicationId() {
		return _budgetApplicationId;
	}

	public void setBudgetApplicationId(long budgetApplicationId) {
		_budgetApplicationId = budgetApplicationId;
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

	public long getApplicantId() {
		return _applicantId;
	}

	public void setApplicantId(long applicantId) {
		_applicantId = applicantId;
	}

	public String getApplicantName() {
		return _applicantName;
	}

	public void setApplicantName(String applicantName) {
		_applicantName = applicantName;
	}

	public long getAuditorId() {
		return _auditorId;
	}

	public void setAuditorId(long auditorId) {
		_auditorId = auditorId;
	}

	public String getAuditorName() {
		return _auditorName;
	}

	public void setAuditorName(String auditorName) {
		_auditorName = auditorName;
	}

	public Date getAuditDate() {
		return _auditDate;
	}

	public void setAuditDate(Date auditDate) {
		_auditDate = auditDate;
	}

	public long getApproverId() {
		return _approverId;
	}

	public void setApproverId(long approverId) {
		_approverId = approverId;
	}

	public String getApproverName() {
		return _approverName;
	}

	public void setApproverName(String approverName) {
		_approverName = approverName;
	}

	public Date getApproveDate() {
		return _approveDate;
	}

	public void setApproveDate(Date approveDate) {
		_approveDate = approveDate;
	}

	public long getFinisherId() {
		return _finisherId;
	}

	public void setFinisherId(long finisherId) {
		_finisherId = finisherId;
	}

	public String getFinisherName() {
		return _finisherName;
	}

	public void setFinisherName(String finisherName) {
		_finisherName = finisherName;
	}

	public Date getFinisherDate() {
		return _finisherDate;
	}

	public void setFinisherDate(Date finisherDate) {
		_finisherDate = finisherDate;
	}

	public String getRejectReason() {
		return _rejectReason;
	}

	public void setRejectReason(String rejectReason) {
		_rejectReason = rejectReason;
	}

	public String getApplicationStatus() {
		return _applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		_applicationStatus = applicationStatus;
	}

	public String getApplicationDescription() {
		return _applicationDescription;
	}

	public void setApplicationDescription(String applicationDescription) {
		_applicationDescription = applicationDescription;
	}

	public double getApplicationTotal() {
		return _applicationTotal;
	}

	public void setApplicationTotal(double applicationTotal) {
		_applicationTotal = applicationTotal;
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

	public long getBudgetItemId() {
		return _budgetItemId;
	}

	public void setBudgetItemId(long budgetItemId) {
		_budgetItemId = budgetItemId;
	}

	private long _budgetApplicationId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _applicantId;
	private String _applicantName;
	private long _auditorId;
	private String _auditorName;
	private Date _auditDate;
	private long _approverId;
	private String _approverName;
	private Date _approveDate;
	private long _finisherId;
	private String _finisherName;
	private Date _finisherDate;
	private String _rejectReason;
	private String _applicationStatus;
	private String _applicationDescription;
	private double _applicationTotal;
	private String _projectName;
	private String _budgetName;
	private long _budgetItemId;
}