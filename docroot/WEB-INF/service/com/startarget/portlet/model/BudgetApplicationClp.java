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

import com.startarget.portlet.service.BudgetApplicationLocalServiceUtil;
import com.startarget.portlet.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chaojie
 */
public class BudgetApplicationClp extends BaseModelImpl<BudgetApplication>
	implements BudgetApplication {
	public BudgetApplicationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return BudgetApplication.class;
	}

	@Override
	public String getModelClassName() {
		return BudgetApplication.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _budgetApplicationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBudgetApplicationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _budgetApplicationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("budgetApplicationId", getBudgetApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicantId", getApplicantId());
		attributes.put("applicantName", getApplicantName());
		attributes.put("auditorId", getAuditorId());
		attributes.put("auditorName", getAuditorName());
		attributes.put("auditDate", getAuditDate());
		attributes.put("approverId", getApproverId());
		attributes.put("approverName", getApproverName());
		attributes.put("approveDate", getApproveDate());
		attributes.put("finisherId", getFinisherId());
		attributes.put("finisherName", getFinisherName());
		attributes.put("finisherDate", getFinisherDate());
		attributes.put("rejectReason", getRejectReason());
		attributes.put("applicationStatus", getApplicationStatus());
		attributes.put("applicationDescription", getApplicationDescription());
		attributes.put("applicationTotal", getApplicationTotal());
		attributes.put("projectName", getProjectName());
		attributes.put("budgetName", getBudgetName());
		attributes.put("budgetItemId", getBudgetItemId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long budgetApplicationId = (Long)attributes.get("budgetApplicationId");

		if (budgetApplicationId != null) {
			setBudgetApplicationId(budgetApplicationId);
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

		Long applicantId = (Long)attributes.get("applicantId");

		if (applicantId != null) {
			setApplicantId(applicantId);
		}

		String applicantName = (String)attributes.get("applicantName");

		if (applicantName != null) {
			setApplicantName(applicantName);
		}

		Long auditorId = (Long)attributes.get("auditorId");

		if (auditorId != null) {
			setAuditorId(auditorId);
		}

		String auditorName = (String)attributes.get("auditorName");

		if (auditorName != null) {
			setAuditorName(auditorName);
		}

		Date auditDate = (Date)attributes.get("auditDate");

		if (auditDate != null) {
			setAuditDate(auditDate);
		}

		Long approverId = (Long)attributes.get("approverId");

		if (approverId != null) {
			setApproverId(approverId);
		}

		String approverName = (String)attributes.get("approverName");

		if (approverName != null) {
			setApproverName(approverName);
		}

		Date approveDate = (Date)attributes.get("approveDate");

		if (approveDate != null) {
			setApproveDate(approveDate);
		}

		Long finisherId = (Long)attributes.get("finisherId");

		if (finisherId != null) {
			setFinisherId(finisherId);
		}

		String finisherName = (String)attributes.get("finisherName");

		if (finisherName != null) {
			setFinisherName(finisherName);
		}

		Date finisherDate = (Date)attributes.get("finisherDate");

		if (finisherDate != null) {
			setFinisherDate(finisherDate);
		}

		String rejectReason = (String)attributes.get("rejectReason");

		if (rejectReason != null) {
			setRejectReason(rejectReason);
		}

		String applicationStatus = (String)attributes.get("applicationStatus");

		if (applicationStatus != null) {
			setApplicationStatus(applicationStatus);
		}

		String applicationDescription = (String)attributes.get(
				"applicationDescription");

		if (applicationDescription != null) {
			setApplicationDescription(applicationDescription);
		}

		Double applicationTotal = (Double)attributes.get("applicationTotal");

		if (applicationTotal != null) {
			setApplicationTotal(applicationTotal);
		}

		String projectName = (String)attributes.get("projectName");

		if (projectName != null) {
			setProjectName(projectName);
		}

		String budgetName = (String)attributes.get("budgetName");

		if (budgetName != null) {
			setBudgetName(budgetName);
		}

		Long budgetItemId = (Long)attributes.get("budgetItemId");

		if (budgetItemId != null) {
			setBudgetItemId(budgetItemId);
		}
	}

	@Override
	public long getBudgetApplicationId() {
		return _budgetApplicationId;
	}

	@Override
	public void setBudgetApplicationId(long budgetApplicationId) {
		_budgetApplicationId = budgetApplicationId;

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setBudgetApplicationId",
						long.class);

				method.invoke(_budgetApplicationRemoteModel, budgetApplicationId);
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

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_budgetApplicationRemoteModel, groupId);
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

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_budgetApplicationRemoteModel, companyId);
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

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_budgetApplicationRemoteModel, userId);
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

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_budgetApplicationRemoteModel, userName);
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

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_budgetApplicationRemoteModel, createDate);
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

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_budgetApplicationRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getApplicantId() {
		return _applicantId;
	}

	@Override
	public void setApplicantId(long applicantId) {
		_applicantId = applicantId;

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicantId", long.class);

				method.invoke(_budgetApplicationRemoteModel, applicantId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApplicantName() {
		return _applicantName;
	}

	@Override
	public void setApplicantName(String applicantName) {
		_applicantName = applicantName;

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicantName", String.class);

				method.invoke(_budgetApplicationRemoteModel, applicantName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAuditorId() {
		return _auditorId;
	}

	@Override
	public void setAuditorId(long auditorId) {
		_auditorId = auditorId;

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setAuditorId", long.class);

				method.invoke(_budgetApplicationRemoteModel, auditorId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAuditorName() {
		return _auditorName;
	}

	@Override
	public void setAuditorName(String auditorName) {
		_auditorName = auditorName;

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setAuditorName", String.class);

				method.invoke(_budgetApplicationRemoteModel, auditorName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getAuditDate() {
		return _auditDate;
	}

	@Override
	public void setAuditDate(Date auditDate) {
		_auditDate = auditDate;

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setAuditDate", Date.class);

				method.invoke(_budgetApplicationRemoteModel, auditDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getApproverId() {
		return _approverId;
	}

	@Override
	public void setApproverId(long approverId) {
		_approverId = approverId;

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setApproverId", long.class);

				method.invoke(_budgetApplicationRemoteModel, approverId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApproverName() {
		return _approverName;
	}

	@Override
	public void setApproverName(String approverName) {
		_approverName = approverName;

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setApproverName", String.class);

				method.invoke(_budgetApplicationRemoteModel, approverName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getApproveDate() {
		return _approveDate;
	}

	@Override
	public void setApproveDate(Date approveDate) {
		_approveDate = approveDate;

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setApproveDate", Date.class);

				method.invoke(_budgetApplicationRemoteModel, approveDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFinisherId() {
		return _finisherId;
	}

	@Override
	public void setFinisherId(long finisherId) {
		_finisherId = finisherId;

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setFinisherId", long.class);

				method.invoke(_budgetApplicationRemoteModel, finisherId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFinisherName() {
		return _finisherName;
	}

	@Override
	public void setFinisherName(String finisherName) {
		_finisherName = finisherName;

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setFinisherName", String.class);

				method.invoke(_budgetApplicationRemoteModel, finisherName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFinisherDate() {
		return _finisherDate;
	}

	@Override
	public void setFinisherDate(Date finisherDate) {
		_finisherDate = finisherDate;

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setFinisherDate", Date.class);

				method.invoke(_budgetApplicationRemoteModel, finisherDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRejectReason() {
		return _rejectReason;
	}

	@Override
	public void setRejectReason(String rejectReason) {
		_rejectReason = rejectReason;

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setRejectReason", String.class);

				method.invoke(_budgetApplicationRemoteModel, rejectReason);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApplicationStatus() {
		return _applicationStatus;
	}

	@Override
	public void setApplicationStatus(String applicationStatus) {
		_applicationStatus = applicationStatus;

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicationStatus",
						String.class);

				method.invoke(_budgetApplicationRemoteModel, applicationStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApplicationDescription() {
		return _applicationDescription;
	}

	@Override
	public void setApplicationDescription(String applicationDescription) {
		_applicationDescription = applicationDescription;

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicationDescription",
						String.class);

				method.invoke(_budgetApplicationRemoteModel,
					applicationDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getApplicationTotal() {
		return _applicationTotal;
	}

	@Override
	public void setApplicationTotal(double applicationTotal) {
		_applicationTotal = applicationTotal;

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicationTotal",
						double.class);

				method.invoke(_budgetApplicationRemoteModel, applicationTotal);
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

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setProjectName", String.class);

				method.invoke(_budgetApplicationRemoteModel, projectName);
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

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setBudgetName", String.class);

				method.invoke(_budgetApplicationRemoteModel, budgetName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getBudgetItemId() {
		return _budgetItemId;
	}

	@Override
	public void setBudgetItemId(long budgetItemId) {
		_budgetItemId = budgetItemId;

		if (_budgetApplicationRemoteModel != null) {
			try {
				Class<?> clazz = _budgetApplicationRemoteModel.getClass();

				Method method = clazz.getMethod("setBudgetItemId", long.class);

				method.invoke(_budgetApplicationRemoteModel, budgetItemId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getBudgetApplicationRemoteModel() {
		return _budgetApplicationRemoteModel;
	}

	public void setBudgetApplicationRemoteModel(
		BaseModel<?> budgetApplicationRemoteModel) {
		_budgetApplicationRemoteModel = budgetApplicationRemoteModel;
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

		Class<?> remoteModelClass = _budgetApplicationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_budgetApplicationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			BudgetApplicationLocalServiceUtil.addBudgetApplication(this);
		}
		else {
			BudgetApplicationLocalServiceUtil.updateBudgetApplication(this);
		}
	}

	@Override
	public BudgetApplication toEscapedModel() {
		return (BudgetApplication)ProxyUtil.newProxyInstance(BudgetApplication.class.getClassLoader(),
			new Class[] { BudgetApplication.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BudgetApplicationClp clone = new BudgetApplicationClp();

		clone.setBudgetApplicationId(getBudgetApplicationId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setApplicantId(getApplicantId());
		clone.setApplicantName(getApplicantName());
		clone.setAuditorId(getAuditorId());
		clone.setAuditorName(getAuditorName());
		clone.setAuditDate(getAuditDate());
		clone.setApproverId(getApproverId());
		clone.setApproverName(getApproverName());
		clone.setApproveDate(getApproveDate());
		clone.setFinisherId(getFinisherId());
		clone.setFinisherName(getFinisherName());
		clone.setFinisherDate(getFinisherDate());
		clone.setRejectReason(getRejectReason());
		clone.setApplicationStatus(getApplicationStatus());
		clone.setApplicationDescription(getApplicationDescription());
		clone.setApplicationTotal(getApplicationTotal());
		clone.setProjectName(getProjectName());
		clone.setBudgetName(getBudgetName());
		clone.setBudgetItemId(getBudgetItemId());

		return clone;
	}

	@Override
	public int compareTo(BudgetApplication budgetApplication) {
		long primaryKey = budgetApplication.getPrimaryKey();

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

		if (!(obj instanceof BudgetApplicationClp)) {
			return false;
		}

		BudgetApplicationClp budgetApplication = (BudgetApplicationClp)obj;

		long primaryKey = budgetApplication.getPrimaryKey();

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
		StringBundler sb = new StringBundler(51);

		sb.append("{budgetApplicationId=");
		sb.append(getBudgetApplicationId());
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
		sb.append(", applicantId=");
		sb.append(getApplicantId());
		sb.append(", applicantName=");
		sb.append(getApplicantName());
		sb.append(", auditorId=");
		sb.append(getAuditorId());
		sb.append(", auditorName=");
		sb.append(getAuditorName());
		sb.append(", auditDate=");
		sb.append(getAuditDate());
		sb.append(", approverId=");
		sb.append(getApproverId());
		sb.append(", approverName=");
		sb.append(getApproverName());
		sb.append(", approveDate=");
		sb.append(getApproveDate());
		sb.append(", finisherId=");
		sb.append(getFinisherId());
		sb.append(", finisherName=");
		sb.append(getFinisherName());
		sb.append(", finisherDate=");
		sb.append(getFinisherDate());
		sb.append(", rejectReason=");
		sb.append(getRejectReason());
		sb.append(", applicationStatus=");
		sb.append(getApplicationStatus());
		sb.append(", applicationDescription=");
		sb.append(getApplicationDescription());
		sb.append(", applicationTotal=");
		sb.append(getApplicationTotal());
		sb.append(", projectName=");
		sb.append(getProjectName());
		sb.append(", budgetName=");
		sb.append(getBudgetName());
		sb.append(", budgetItemId=");
		sb.append(getBudgetItemId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(79);

		sb.append("<model><model-name>");
		sb.append("com.startarget.portlet.model.BudgetApplication");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>budgetApplicationId</column-name><column-value><![CDATA[");
		sb.append(getBudgetApplicationId());
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
			"<column><column-name>applicantId</column-name><column-value><![CDATA[");
		sb.append(getApplicantId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicantName</column-name><column-value><![CDATA[");
		sb.append(getApplicantName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>auditorId</column-name><column-value><![CDATA[");
		sb.append(getAuditorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>auditorName</column-name><column-value><![CDATA[");
		sb.append(getAuditorName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>auditDate</column-name><column-value><![CDATA[");
		sb.append(getAuditDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approverId</column-name><column-value><![CDATA[");
		sb.append(getApproverId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approverName</column-name><column-value><![CDATA[");
		sb.append(getApproverName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approveDate</column-name><column-value><![CDATA[");
		sb.append(getApproveDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>finisherId</column-name><column-value><![CDATA[");
		sb.append(getFinisherId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>finisherName</column-name><column-value><![CDATA[");
		sb.append(getFinisherName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>finisherDate</column-name><column-value><![CDATA[");
		sb.append(getFinisherDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rejectReason</column-name><column-value><![CDATA[");
		sb.append(getRejectReason());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicationStatus</column-name><column-value><![CDATA[");
		sb.append(getApplicationStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicationDescription</column-name><column-value><![CDATA[");
		sb.append(getApplicationDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicationTotal</column-name><column-value><![CDATA[");
		sb.append(getApplicationTotal());
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
			"<column><column-name>budgetItemId</column-name><column-value><![CDATA[");
		sb.append(getBudgetItemId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _budgetApplicationId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
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
	private BaseModel<?> _budgetApplicationRemoteModel;
	private Class<?> _clpSerializerClass = com.startarget.portlet.service.ClpSerializer.class;
}