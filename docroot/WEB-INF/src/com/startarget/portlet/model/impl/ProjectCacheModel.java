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

import com.startarget.portlet.model.Project;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Project in entity cache.
 *
 * @author chaojie
 * @see Project
 * @generated
 */
public class ProjectCacheModel implements CacheModel<Project>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{projectId=");
		sb.append(projectId);
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
		sb.append(", projectLeader=");
		sb.append(projectLeader);
		sb.append(", projectStatus=");
		sb.append(projectStatus);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Project toEntityModel() {
		ProjectImpl projectImpl = new ProjectImpl();

		projectImpl.setProjectId(projectId);
		projectImpl.setGroupId(groupId);
		projectImpl.setCompanyId(companyId);
		projectImpl.setUserId(userId);

		if (userName == null) {
			projectImpl.setUserName(StringPool.BLANK);
		}
		else {
			projectImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			projectImpl.setCreateDate(null);
		}
		else {
			projectImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			projectImpl.setModifiedDate(null);
		}
		else {
			projectImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (projectName == null) {
			projectImpl.setProjectName(StringPool.BLANK);
		}
		else {
			projectImpl.setProjectName(projectName);
		}

		if (projectLeader == null) {
			projectImpl.setProjectLeader(StringPool.BLANK);
		}
		else {
			projectImpl.setProjectLeader(projectLeader);
		}

		if (projectStatus == null) {
			projectImpl.setProjectStatus(StringPool.BLANK);
		}
		else {
			projectImpl.setProjectStatus(projectStatus);
		}

		projectImpl.resetOriginalValues();

		return projectImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		projectId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		projectName = objectInput.readUTF();
		projectLeader = objectInput.readUTF();
		projectStatus = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(projectId);
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

		if (projectLeader == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(projectLeader);
		}

		if (projectStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(projectStatus);
		}
	}

	public long projectId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String projectName;
	public String projectLeader;
	public String projectStatus;
}