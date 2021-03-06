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

package com.startarget.portlet.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author chaojie
 * @generated
 */
public class ProjectPK implements Comparable<ProjectPK>, Serializable {
	public long projectId;
	public String projectName;

	public ProjectPK() {
	}

	public ProjectPK(long projectId, String projectName) {
		this.projectId = projectId;
		this.projectName = projectName;
	}

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public int compareTo(ProjectPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (projectId < pk.projectId) {
			value = -1;
		}
		else if (projectId > pk.projectId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		value = projectName.compareTo(pk.projectName);

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProjectPK)) {
			return false;
		}

		ProjectPK pk = (ProjectPK)obj;

		if ((projectId == pk.projectId) &&
				(projectName.equals(pk.projectName))) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(projectId) + String.valueOf(projectName)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("projectId");
		sb.append(StringPool.EQUAL);
		sb.append(projectId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("projectName");
		sb.append(StringPool.EQUAL);
		sb.append(projectName);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}