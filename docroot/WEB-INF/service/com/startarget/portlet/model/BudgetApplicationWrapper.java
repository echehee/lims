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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BudgetApplication}.
 * </p>
 *
 * @author chaojie
 * @see BudgetApplication
 * @generated
 */
public class BudgetApplicationWrapper implements BudgetApplication,
	ModelWrapper<BudgetApplication> {
	public BudgetApplicationWrapper(BudgetApplication budgetApplication) {
		_budgetApplication = budgetApplication;
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

	/**
	* Returns the primary key of this budget application.
	*
	* @return the primary key of this budget application
	*/
	@Override
	public long getPrimaryKey() {
		return _budgetApplication.getPrimaryKey();
	}

	/**
	* Sets the primary key of this budget application.
	*
	* @param primaryKey the primary key of this budget application
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_budgetApplication.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the budget application ID of this budget application.
	*
	* @return the budget application ID of this budget application
	*/
	@Override
	public long getBudgetApplicationId() {
		return _budgetApplication.getBudgetApplicationId();
	}

	/**
	* Sets the budget application ID of this budget application.
	*
	* @param budgetApplicationId the budget application ID of this budget application
	*/
	@Override
	public void setBudgetApplicationId(long budgetApplicationId) {
		_budgetApplication.setBudgetApplicationId(budgetApplicationId);
	}

	/**
	* Returns the group ID of this budget application.
	*
	* @return the group ID of this budget application
	*/
	@Override
	public long getGroupId() {
		return _budgetApplication.getGroupId();
	}

	/**
	* Sets the group ID of this budget application.
	*
	* @param groupId the group ID of this budget application
	*/
	@Override
	public void setGroupId(long groupId) {
		_budgetApplication.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this budget application.
	*
	* @return the company ID of this budget application
	*/
	@Override
	public long getCompanyId() {
		return _budgetApplication.getCompanyId();
	}

	/**
	* Sets the company ID of this budget application.
	*
	* @param companyId the company ID of this budget application
	*/
	@Override
	public void setCompanyId(long companyId) {
		_budgetApplication.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this budget application.
	*
	* @return the user ID of this budget application
	*/
	@Override
	public long getUserId() {
		return _budgetApplication.getUserId();
	}

	/**
	* Sets the user ID of this budget application.
	*
	* @param userId the user ID of this budget application
	*/
	@Override
	public void setUserId(long userId) {
		_budgetApplication.setUserId(userId);
	}

	/**
	* Returns the user uuid of this budget application.
	*
	* @return the user uuid of this budget application
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetApplication.getUserUuid();
	}

	/**
	* Sets the user uuid of this budget application.
	*
	* @param userUuid the user uuid of this budget application
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_budgetApplication.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this budget application.
	*
	* @return the user name of this budget application
	*/
	@Override
	public java.lang.String getUserName() {
		return _budgetApplication.getUserName();
	}

	/**
	* Sets the user name of this budget application.
	*
	* @param userName the user name of this budget application
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_budgetApplication.setUserName(userName);
	}

	/**
	* Returns the create date of this budget application.
	*
	* @return the create date of this budget application
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _budgetApplication.getCreateDate();
	}

	/**
	* Sets the create date of this budget application.
	*
	* @param createDate the create date of this budget application
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_budgetApplication.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this budget application.
	*
	* @return the modified date of this budget application
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _budgetApplication.getModifiedDate();
	}

	/**
	* Sets the modified date of this budget application.
	*
	* @param modifiedDate the modified date of this budget application
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_budgetApplication.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the applicant ID of this budget application.
	*
	* @return the applicant ID of this budget application
	*/
	@Override
	public long getApplicantId() {
		return _budgetApplication.getApplicantId();
	}

	/**
	* Sets the applicant ID of this budget application.
	*
	* @param applicantId the applicant ID of this budget application
	*/
	@Override
	public void setApplicantId(long applicantId) {
		_budgetApplication.setApplicantId(applicantId);
	}

	/**
	* Returns the applicant name of this budget application.
	*
	* @return the applicant name of this budget application
	*/
	@Override
	public java.lang.String getApplicantName() {
		return _budgetApplication.getApplicantName();
	}

	/**
	* Sets the applicant name of this budget application.
	*
	* @param applicantName the applicant name of this budget application
	*/
	@Override
	public void setApplicantName(java.lang.String applicantName) {
		_budgetApplication.setApplicantName(applicantName);
	}

	/**
	* Returns the auditor ID of this budget application.
	*
	* @return the auditor ID of this budget application
	*/
	@Override
	public long getAuditorId() {
		return _budgetApplication.getAuditorId();
	}

	/**
	* Sets the auditor ID of this budget application.
	*
	* @param auditorId the auditor ID of this budget application
	*/
	@Override
	public void setAuditorId(long auditorId) {
		_budgetApplication.setAuditorId(auditorId);
	}

	/**
	* Returns the auditor name of this budget application.
	*
	* @return the auditor name of this budget application
	*/
	@Override
	public java.lang.String getAuditorName() {
		return _budgetApplication.getAuditorName();
	}

	/**
	* Sets the auditor name of this budget application.
	*
	* @param auditorName the auditor name of this budget application
	*/
	@Override
	public void setAuditorName(java.lang.String auditorName) {
		_budgetApplication.setAuditorName(auditorName);
	}

	/**
	* Returns the audit date of this budget application.
	*
	* @return the audit date of this budget application
	*/
	@Override
	public java.util.Date getAuditDate() {
		return _budgetApplication.getAuditDate();
	}

	/**
	* Sets the audit date of this budget application.
	*
	* @param auditDate the audit date of this budget application
	*/
	@Override
	public void setAuditDate(java.util.Date auditDate) {
		_budgetApplication.setAuditDate(auditDate);
	}

	/**
	* Returns the approver ID of this budget application.
	*
	* @return the approver ID of this budget application
	*/
	@Override
	public long getApproverId() {
		return _budgetApplication.getApproverId();
	}

	/**
	* Sets the approver ID of this budget application.
	*
	* @param approverId the approver ID of this budget application
	*/
	@Override
	public void setApproverId(long approverId) {
		_budgetApplication.setApproverId(approverId);
	}

	/**
	* Returns the approver name of this budget application.
	*
	* @return the approver name of this budget application
	*/
	@Override
	public java.lang.String getApproverName() {
		return _budgetApplication.getApproverName();
	}

	/**
	* Sets the approver name of this budget application.
	*
	* @param approverName the approver name of this budget application
	*/
	@Override
	public void setApproverName(java.lang.String approverName) {
		_budgetApplication.setApproverName(approverName);
	}

	/**
	* Returns the approve date of this budget application.
	*
	* @return the approve date of this budget application
	*/
	@Override
	public java.util.Date getApproveDate() {
		return _budgetApplication.getApproveDate();
	}

	/**
	* Sets the approve date of this budget application.
	*
	* @param approveDate the approve date of this budget application
	*/
	@Override
	public void setApproveDate(java.util.Date approveDate) {
		_budgetApplication.setApproveDate(approveDate);
	}

	/**
	* Returns the finisher ID of this budget application.
	*
	* @return the finisher ID of this budget application
	*/
	@Override
	public long getFinisherId() {
		return _budgetApplication.getFinisherId();
	}

	/**
	* Sets the finisher ID of this budget application.
	*
	* @param finisherId the finisher ID of this budget application
	*/
	@Override
	public void setFinisherId(long finisherId) {
		_budgetApplication.setFinisherId(finisherId);
	}

	/**
	* Returns the finisher name of this budget application.
	*
	* @return the finisher name of this budget application
	*/
	@Override
	public java.lang.String getFinisherName() {
		return _budgetApplication.getFinisherName();
	}

	/**
	* Sets the finisher name of this budget application.
	*
	* @param finisherName the finisher name of this budget application
	*/
	@Override
	public void setFinisherName(java.lang.String finisherName) {
		_budgetApplication.setFinisherName(finisherName);
	}

	/**
	* Returns the finisher date of this budget application.
	*
	* @return the finisher date of this budget application
	*/
	@Override
	public java.util.Date getFinisherDate() {
		return _budgetApplication.getFinisherDate();
	}

	/**
	* Sets the finisher date of this budget application.
	*
	* @param finisherDate the finisher date of this budget application
	*/
	@Override
	public void setFinisherDate(java.util.Date finisherDate) {
		_budgetApplication.setFinisherDate(finisherDate);
	}

	/**
	* Returns the reject reason of this budget application.
	*
	* @return the reject reason of this budget application
	*/
	@Override
	public java.lang.String getRejectReason() {
		return _budgetApplication.getRejectReason();
	}

	/**
	* Sets the reject reason of this budget application.
	*
	* @param rejectReason the reject reason of this budget application
	*/
	@Override
	public void setRejectReason(java.lang.String rejectReason) {
		_budgetApplication.setRejectReason(rejectReason);
	}

	/**
	* Returns the application status of this budget application.
	*
	* @return the application status of this budget application
	*/
	@Override
	public java.lang.String getApplicationStatus() {
		return _budgetApplication.getApplicationStatus();
	}

	/**
	* Sets the application status of this budget application.
	*
	* @param applicationStatus the application status of this budget application
	*/
	@Override
	public void setApplicationStatus(java.lang.String applicationStatus) {
		_budgetApplication.setApplicationStatus(applicationStatus);
	}

	/**
	* Returns the application description of this budget application.
	*
	* @return the application description of this budget application
	*/
	@Override
	public java.lang.String getApplicationDescription() {
		return _budgetApplication.getApplicationDescription();
	}

	/**
	* Sets the application description of this budget application.
	*
	* @param applicationDescription the application description of this budget application
	*/
	@Override
	public void setApplicationDescription(
		java.lang.String applicationDescription) {
		_budgetApplication.setApplicationDescription(applicationDescription);
	}

	/**
	* Returns the application total of this budget application.
	*
	* @return the application total of this budget application
	*/
	@Override
	public double getApplicationTotal() {
		return _budgetApplication.getApplicationTotal();
	}

	/**
	* Sets the application total of this budget application.
	*
	* @param applicationTotal the application total of this budget application
	*/
	@Override
	public void setApplicationTotal(double applicationTotal) {
		_budgetApplication.setApplicationTotal(applicationTotal);
	}

	/**
	* Returns the project name of this budget application.
	*
	* @return the project name of this budget application
	*/
	@Override
	public java.lang.String getProjectName() {
		return _budgetApplication.getProjectName();
	}

	/**
	* Sets the project name of this budget application.
	*
	* @param projectName the project name of this budget application
	*/
	@Override
	public void setProjectName(java.lang.String projectName) {
		_budgetApplication.setProjectName(projectName);
	}

	/**
	* Returns the budget name of this budget application.
	*
	* @return the budget name of this budget application
	*/
	@Override
	public java.lang.String getBudgetName() {
		return _budgetApplication.getBudgetName();
	}

	/**
	* Sets the budget name of this budget application.
	*
	* @param budgetName the budget name of this budget application
	*/
	@Override
	public void setBudgetName(java.lang.String budgetName) {
		_budgetApplication.setBudgetName(budgetName);
	}

	/**
	* Returns the budget item ID of this budget application.
	*
	* @return the budget item ID of this budget application
	*/
	@Override
	public long getBudgetItemId() {
		return _budgetApplication.getBudgetItemId();
	}

	/**
	* Sets the budget item ID of this budget application.
	*
	* @param budgetItemId the budget item ID of this budget application
	*/
	@Override
	public void setBudgetItemId(long budgetItemId) {
		_budgetApplication.setBudgetItemId(budgetItemId);
	}

	@Override
	public boolean isNew() {
		return _budgetApplication.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_budgetApplication.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _budgetApplication.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_budgetApplication.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _budgetApplication.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _budgetApplication.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_budgetApplication.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _budgetApplication.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_budgetApplication.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_budgetApplication.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_budgetApplication.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BudgetApplicationWrapper((BudgetApplication)_budgetApplication.clone());
	}

	@Override
	public int compareTo(
		com.startarget.portlet.model.BudgetApplication budgetApplication) {
		return _budgetApplication.compareTo(budgetApplication);
	}

	@Override
	public int hashCode() {
		return _budgetApplication.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.startarget.portlet.model.BudgetApplication> toCacheModel() {
		return _budgetApplication.toCacheModel();
	}

	@Override
	public com.startarget.portlet.model.BudgetApplication toEscapedModel() {
		return new BudgetApplicationWrapper(_budgetApplication.toEscapedModel());
	}

	@Override
	public com.startarget.portlet.model.BudgetApplication toUnescapedModel() {
		return new BudgetApplicationWrapper(_budgetApplication.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _budgetApplication.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _budgetApplication.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_budgetApplication.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BudgetApplicationWrapper)) {
			return false;
		}

		BudgetApplicationWrapper budgetApplicationWrapper = (BudgetApplicationWrapper)obj;

		if (Validator.equals(_budgetApplication,
					budgetApplicationWrapper._budgetApplication)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public BudgetApplication getWrappedBudgetApplication() {
		return _budgetApplication;
	}

	@Override
	public BudgetApplication getWrappedModel() {
		return _budgetApplication;
	}

	@Override
	public void resetOriginalValues() {
		_budgetApplication.resetOriginalValues();
	}

	private BudgetApplication _budgetApplication;
}