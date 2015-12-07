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

import com.startarget.portlet.model.Budget;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Budget in entity cache.
 *
 * @author chaojie
 * @see Budget
 * @generated
 */
public class BudgetCacheModel implements CacheModel<Budget>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{budgetId=");
		sb.append(budgetId);
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
		sb.append(", projectName=");
		sb.append(projectName);
		sb.append(", budgetName=");
		sb.append(budgetName);
		sb.append(", budgetStartYear=");
		sb.append(budgetStartYear);
		sb.append(", budgetEndYear=");
		sb.append(budgetEndYear);
		sb.append(", budgetTotal=");
		sb.append(budgetTotal);
		sb.append(", budgetArrival=");
		sb.append(budgetArrival);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Budget toEntityModel() {
		BudgetImpl budgetImpl = new BudgetImpl();

		budgetImpl.setBudgetId(budgetId);
		budgetImpl.setGroupId(groupId);
		budgetImpl.setCompanyId(companyId);
		budgetImpl.setUserId(userId);

		if (userName == null) {
			budgetImpl.setUserName(StringPool.BLANK);
		}
		else {
			budgetImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			budgetImpl.setCreateDate(null);
		}
		else {
			budgetImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			budgetImpl.setModifiedDate(null);
		}
		else {
			budgetImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (projectName == null) {
			budgetImpl.setProjectName(StringPool.BLANK);
		}
		else {
			budgetImpl.setProjectName(projectName);
		}

		if (budgetName == null) {
			budgetImpl.setBudgetName(StringPool.BLANK);
		}
		else {
			budgetImpl.setBudgetName(budgetName);
		}

		budgetImpl.setBudgetStartYear(budgetStartYear);
		budgetImpl.setBudgetEndYear(budgetEndYear);
		budgetImpl.setBudgetTotal(budgetTotal);
		budgetImpl.setBudgetArrival(budgetArrival);

		budgetImpl.resetOriginalValues();

		return budgetImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		budgetId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		projectName = objectInput.readUTF();
		budgetName = objectInput.readUTF();
		budgetStartYear = objectInput.readInt();
		budgetEndYear = objectInput.readInt();
		budgetTotal = objectInput.readDouble();
		budgetArrival = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(budgetId);
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

		objectOutput.writeInt(budgetStartYear);
		objectOutput.writeInt(budgetEndYear);
		objectOutput.writeDouble(budgetTotal);
		objectOutput.writeDouble(budgetArrival);
	}

	public long budgetId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String projectName;
	public String budgetName;
	public int budgetStartYear;
	public int budgetEndYear;
	public double budgetTotal;
	public double budgetArrival;
}