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

package com.startarget.portlet.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.startarget.portlet.model.BudgetApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BudgetApplication in entity cache.
 *
 * @author chaojie
 * @see BudgetApplication
 * @generated
 */
public class BudgetApplicationCacheModel implements CacheModel<BudgetApplication>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{budgetApplicationId=");
		sb.append(budgetApplicationId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", applicantId=");
		sb.append(applicantId);
		sb.append(", applicantName=");
		sb.append(applicantName);
		sb.append(", auditorId=");
		sb.append(auditorId);
		sb.append(", auditorName=");
		sb.append(auditorName);
		sb.append(", auditDate=");
		sb.append(auditDate);
		sb.append(", approverId=");
		sb.append(approverId);
		sb.append(", approverName=");
		sb.append(approverName);
		sb.append(", approveDate=");
		sb.append(approveDate);
		sb.append(", finisherId=");
		sb.append(finisherId);
		sb.append(", finisherName=");
		sb.append(finisherName);
		sb.append(", finisherDate=");
		sb.append(finisherDate);
		sb.append(", rejectReason=");
		sb.append(rejectReason);
		sb.append(", applicationStatus=");
		sb.append(applicationStatus);
		sb.append(", applicationDescription=");
		sb.append(applicationDescription);
		sb.append(", applicationTotal=");
		sb.append(applicationTotal);
		sb.append(", projectName=");
		sb.append(projectName);
		sb.append(", budgetName=");
		sb.append(budgetName);
		sb.append(", budgetItemId=");
		sb.append(budgetItemId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BudgetApplication toEntityModel() {
		BudgetApplicationImpl budgetApplicationImpl = new BudgetApplicationImpl();

		budgetApplicationImpl.setBudgetApplicationId(budgetApplicationId);
		budgetApplicationImpl.setGroupId(groupId);
		budgetApplicationImpl.setCompanyId(companyId);
		budgetApplicationImpl.setUserId(userId);

		if (userName == null) {
			budgetApplicationImpl.setUserName(StringPool.BLANK);
		}
		else {
			budgetApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			budgetApplicationImpl.setCreateDate(null);
		}
		else {
			budgetApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			budgetApplicationImpl.setModifiedDate(null);
		}
		else {
			budgetApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		budgetApplicationImpl.setApplicantId(applicantId);

		if (applicantName == null) {
			budgetApplicationImpl.setApplicantName(StringPool.BLANK);
		}
		else {
			budgetApplicationImpl.setApplicantName(applicantName);
		}

		budgetApplicationImpl.setAuditorId(auditorId);

		if (auditorName == null) {
			budgetApplicationImpl.setAuditorName(StringPool.BLANK);
		}
		else {
			budgetApplicationImpl.setAuditorName(auditorName);
		}

		if (auditDate == Long.MIN_VALUE) {
			budgetApplicationImpl.setAuditDate(null);
		}
		else {
			budgetApplicationImpl.setAuditDate(new Date(auditDate));
		}

		budgetApplicationImpl.setApproverId(approverId);

		if (approverName == null) {
			budgetApplicationImpl.setApproverName(StringPool.BLANK);
		}
		else {
			budgetApplicationImpl.setApproverName(approverName);
		}

		if (approveDate == Long.MIN_VALUE) {
			budgetApplicationImpl.setApproveDate(null);
		}
		else {
			budgetApplicationImpl.setApproveDate(new Date(approveDate));
		}

		budgetApplicationImpl.setFinisherId(finisherId);

		if (finisherName == null) {
			budgetApplicationImpl.setFinisherName(StringPool.BLANK);
		}
		else {
			budgetApplicationImpl.setFinisherName(finisherName);
		}

		if (finisherDate == Long.MIN_VALUE) {
			budgetApplicationImpl.setFinisherDate(null);
		}
		else {
			budgetApplicationImpl.setFinisherDate(new Date(finisherDate));
		}

		if (rejectReason == null) {
			budgetApplicationImpl.setRejectReason(StringPool.BLANK);
		}
		else {
			budgetApplicationImpl.setRejectReason(rejectReason);
		}

		if (applicationStatus == null) {
			budgetApplicationImpl.setApplicationStatus(StringPool.BLANK);
		}
		else {
			budgetApplicationImpl.setApplicationStatus(applicationStatus);
		}

		if (applicationDescription == null) {
			budgetApplicationImpl.setApplicationDescription(StringPool.BLANK);
		}
		else {
			budgetApplicationImpl.setApplicationDescription(applicationDescription);
		}

		budgetApplicationImpl.setApplicationTotal(applicationTotal);

		if (projectName == null) {
			budgetApplicationImpl.setProjectName(StringPool.BLANK);
		}
		else {
			budgetApplicationImpl.setProjectName(projectName);
		}

		if (budgetName == null) {
			budgetApplicationImpl.setBudgetName(StringPool.BLANK);
		}
		else {
			budgetApplicationImpl.setBudgetName(budgetName);
		}

		budgetApplicationImpl.setBudgetItemId(budgetItemId);

		budgetApplicationImpl.resetOriginalValues();

		return budgetApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		budgetApplicationId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicantId = objectInput.readLong();
		applicantName = objectInput.readUTF();
		auditorId = objectInput.readLong();
		auditorName = objectInput.readUTF();
		auditDate = objectInput.readLong();
		approverId = objectInput.readLong();
		approverName = objectInput.readUTF();
		approveDate = objectInput.readLong();
		finisherId = objectInput.readLong();
		finisherName = objectInput.readUTF();
		finisherDate = objectInput.readLong();
		rejectReason = objectInput.readUTF();
		applicationStatus = objectInput.readUTF();
		applicationDescription = objectInput.readUTF();
		applicationTotal = objectInput.readDouble();
		projectName = objectInput.readUTF();
		budgetName = objectInput.readUTF();
		budgetItemId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(budgetApplicationId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(applicantId);

		if (applicantName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantName);
		}

		objectOutput.writeLong(auditorId);

		if (auditorName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(auditorName);
		}

		objectOutput.writeLong(auditDate);
		objectOutput.writeLong(approverId);

		if (approverName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(approverName);
		}

		objectOutput.writeLong(approveDate);
		objectOutput.writeLong(finisherId);

		if (finisherName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(finisherName);
		}

		objectOutput.writeLong(finisherDate);

		if (rejectReason == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(rejectReason);
		}

		if (applicationStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicationStatus);
		}

		if (applicationDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicationDescription);
		}

		objectOutput.writeDouble(applicationTotal);

		if (projectName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(projectName);
		}

		if (budgetName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(budgetName);
		}

		objectOutput.writeLong(budgetItemId);
	}

	public long budgetApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long applicantId;
	public String applicantName;
	public long auditorId;
	public String auditorName;
	public long auditDate;
	public long approverId;
	public String approverName;
	public long approveDate;
	public long finisherId;
	public String finisherName;
	public long finisherDate;
	public String rejectReason;
	public String applicationStatus;
	public String applicationDescription;
	public double applicationTotal;
	public String projectName;
	public String budgetName;
	public long budgetItemId;
}