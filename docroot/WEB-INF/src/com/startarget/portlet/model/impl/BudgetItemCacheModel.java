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

import com.startarget.portlet.model.BudgetItem;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BudgetItem in entity cache.
 *
 * @author chaojie
 * @see BudgetItem
 * @generated
 */
public class BudgetItemCacheModel implements CacheModel<BudgetItem>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{budgetItemId=");
		sb.append(budgetItemId);
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
		sb.append(", budgetId=");
		sb.append(budgetId);
		sb.append(", accountItemId=");
		sb.append(accountItemId);
		sb.append(", accountItemName=");
		sb.append(accountItemName);
		sb.append(", itemCode=");
		sb.append(itemCode);
		sb.append(", budgetTotal=");
		sb.append(budgetTotal);
		sb.append(", budgetUsed=");
		sb.append(budgetUsed);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BudgetItem toEntityModel() {
		BudgetItemImpl budgetItemImpl = new BudgetItemImpl();

		budgetItemImpl.setBudgetItemId(budgetItemId);
		budgetItemImpl.setGroupId(groupId);
		budgetItemImpl.setCompanyId(companyId);
		budgetItemImpl.setUserId(userId);

		if (userName == null) {
			budgetItemImpl.setUserName(StringPool.BLANK);
		}
		else {
			budgetItemImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			budgetItemImpl.setCreateDate(null);
		}
		else {
			budgetItemImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			budgetItemImpl.setModifiedDate(null);
		}
		else {
			budgetItemImpl.setModifiedDate(new Date(modifiedDate));
		}

		budgetItemImpl.setBudgetId(budgetId);
		budgetItemImpl.setAccountItemId(accountItemId);

		if (accountItemName == null) {
			budgetItemImpl.setAccountItemName(StringPool.BLANK);
		}
		else {
			budgetItemImpl.setAccountItemName(accountItemName);
		}

		budgetItemImpl.setItemCode(itemCode);
		budgetItemImpl.setBudgetTotal(budgetTotal);
		budgetItemImpl.setBudgetUsed(budgetUsed);

		budgetItemImpl.resetOriginalValues();

		return budgetItemImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		budgetItemId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		budgetId = objectInput.readLong();
		accountItemId = objectInput.readLong();
		accountItemName = objectInput.readUTF();
		itemCode = objectInput.readLong();
		budgetTotal = objectInput.readDouble();
		budgetUsed = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(budgetItemId);
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
		objectOutput.writeLong(budgetId);
		objectOutput.writeLong(accountItemId);

		if (accountItemName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(accountItemName);
		}

		objectOutput.writeLong(itemCode);
		objectOutput.writeDouble(budgetTotal);
		objectOutput.writeDouble(budgetUsed);
	}

	public long budgetItemId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long budgetId;
	public long accountItemId;
	public String accountItemName;
	public long itemCode;
	public double budgetTotal;
	public double budgetUsed;
}