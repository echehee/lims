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

import com.startarget.portlet.model.AccountItem;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccountItem in entity cache.
 *
 * @author chaojie
 * @see AccountItem
 * @generated
 */
public class AccountItemCacheModel implements CacheModel<AccountItem>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{accountItemId=");
		sb.append(accountItemId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", parentName=");
		sb.append(parentName);
		sb.append(", itemCode=");
		sb.append(itemCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccountItem toEntityModel() {
		AccountItemImpl accountItemImpl = new AccountItemImpl();

		accountItemImpl.setAccountItemId(accountItemId);
		accountItemImpl.setGroupId(groupId);
		accountItemImpl.setCompanyId(companyId);
		accountItemImpl.setUserId(userId);

		if (userName == null) {
			accountItemImpl.setUserName(StringPool.BLANK);
		}
		else {
			accountItemImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accountItemImpl.setCreateDate(null);
		}
		else {
			accountItemImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accountItemImpl.setModifiedDate(null);
		}
		else {
			accountItemImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			accountItemImpl.setName(StringPool.BLANK);
		}
		else {
			accountItemImpl.setName(name);
		}

		if (parentName == null) {
			accountItemImpl.setParentName(StringPool.BLANK);
		}
		else {
			accountItemImpl.setParentName(parentName);
		}

		accountItemImpl.setItemCode(itemCode);

		accountItemImpl.resetOriginalValues();

		return accountItemImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		accountItemId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		parentName = objectInput.readUTF();
		itemCode = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(accountItemId);
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

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (parentName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(parentName);
		}

		objectOutput.writeLong(itemCode);
	}

	public long accountItemId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String parentName;
	public long itemCode;
}