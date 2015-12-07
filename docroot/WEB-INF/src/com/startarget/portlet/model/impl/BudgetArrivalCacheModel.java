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

import com.startarget.portlet.model.BudgetArrival;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BudgetArrival in entity cache.
 *
 * @author chaojie
 * @see BudgetArrival
 * @generated
 */
public class BudgetArrivalCacheModel implements CacheModel<BudgetArrival>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{budgetArrivalId=");
		sb.append(budgetArrivalId);
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
		sb.append(", operatorId=");
		sb.append(operatorId);
		sb.append(", operatorName=");
		sb.append(operatorName);
		sb.append(", arrivalTotal=");
		sb.append(arrivalTotal);
		sb.append(", projectName=");
		sb.append(projectName);
		sb.append(", budgetName=");
		sb.append(budgetName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BudgetArrival toEntityModel() {
		BudgetArrivalImpl budgetArrivalImpl = new BudgetArrivalImpl();

		budgetArrivalImpl.setBudgetArrivalId(budgetArrivalId);
		budgetArrivalImpl.setGroupId(groupId);
		budgetArrivalImpl.setCompanyId(companyId);
		budgetArrivalImpl.setUserId(userId);

		if (userName == null) {
			budgetArrivalImpl.setUserName(StringPool.BLANK);
		}
		else {
			budgetArrivalImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			budgetArrivalImpl.setCreateDate(null);
		}
		else {
			budgetArrivalImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			budgetArrivalImpl.setModifiedDate(null);
		}
		else {
			budgetArrivalImpl.setModifiedDate(new Date(modifiedDate));
		}

		budgetArrivalImpl.setOperatorId(operatorId);

		if (operatorName == null) {
			budgetArrivalImpl.setOperatorName(StringPool.BLANK);
		}
		else {
			budgetArrivalImpl.setOperatorName(operatorName);
		}

		budgetArrivalImpl.setArrivalTotal(arrivalTotal);

		if (projectName == null) {
			budgetArrivalImpl.setProjectName(StringPool.BLANK);
		}
		else {
			budgetArrivalImpl.setProjectName(projectName);
		}

		if (budgetName == null) {
			budgetArrivalImpl.setBudgetName(StringPool.BLANK);
		}
		else {
			budgetArrivalImpl.setBudgetName(budgetName);
		}

		budgetArrivalImpl.resetOriginalValues();

		return budgetArrivalImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		budgetArrivalId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		operatorId = objectInput.readLong();
		operatorName = objectInput.readUTF();
		arrivalTotal = objectInput.readDouble();
		projectName = objectInput.readUTF();
		budgetName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(budgetArrivalId);
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
		objectOutput.writeLong(operatorId);

		if (operatorName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(operatorName);
		}

		objectOutput.writeDouble(arrivalTotal);

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
	}

	public long budgetArrivalId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long operatorId;
	public String operatorName;
	public double arrivalTotal;
	public String projectName;
	public String budgetName;
}