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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the BudgetArrival service. Represents a row in the &quot;lims_BudgetArrival&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.startarget.portlet.model.impl.BudgetArrivalModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.startarget.portlet.model.impl.BudgetArrivalImpl}.
 * </p>
 *
 * @author chaojie
 * @see BudgetArrival
 * @see com.startarget.portlet.model.impl.BudgetArrivalImpl
 * @see com.startarget.portlet.model.impl.BudgetArrivalModelImpl
 * @generated
 */
public interface BudgetArrivalModel extends BaseModel<BudgetArrival>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a budget arrival model instance should use the {@link BudgetArrival} interface instead.
	 */

	/**
	 * Returns the primary key of this budget arrival.
	 *
	 * @return the primary key of this budget arrival
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this budget arrival.
	 *
	 * @param primaryKey the primary key of this budget arrival
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the budget arrival ID of this budget arrival.
	 *
	 * @return the budget arrival ID of this budget arrival
	 */
	public long getBudgetArrivalId();

	/**
	 * Sets the budget arrival ID of this budget arrival.
	 *
	 * @param budgetArrivalId the budget arrival ID of this budget arrival
	 */
	public void setBudgetArrivalId(long budgetArrivalId);

	/**
	 * Returns the group ID of this budget arrival.
	 *
	 * @return the group ID of this budget arrival
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this budget arrival.
	 *
	 * @param groupId the group ID of this budget arrival
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this budget arrival.
	 *
	 * @return the company ID of this budget arrival
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this budget arrival.
	 *
	 * @param companyId the company ID of this budget arrival
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this budget arrival.
	 *
	 * @return the user ID of this budget arrival
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this budget arrival.
	 *
	 * @param userId the user ID of this budget arrival
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this budget arrival.
	 *
	 * @return the user uuid of this budget arrival
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this budget arrival.
	 *
	 * @param userUuid the user uuid of this budget arrival
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this budget arrival.
	 *
	 * @return the user name of this budget arrival
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this budget arrival.
	 *
	 * @param userName the user name of this budget arrival
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this budget arrival.
	 *
	 * @return the create date of this budget arrival
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this budget arrival.
	 *
	 * @param createDate the create date of this budget arrival
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this budget arrival.
	 *
	 * @return the modified date of this budget arrival
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this budget arrival.
	 *
	 * @param modifiedDate the modified date of this budget arrival
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the operator ID of this budget arrival.
	 *
	 * @return the operator ID of this budget arrival
	 */
	public long getOperatorId();

	/**
	 * Sets the operator ID of this budget arrival.
	 *
	 * @param operatorId the operator ID of this budget arrival
	 */
	public void setOperatorId(long operatorId);

	/**
	 * Returns the operator name of this budget arrival.
	 *
	 * @return the operator name of this budget arrival
	 */
	@AutoEscape
	public String getOperatorName();

	/**
	 * Sets the operator name of this budget arrival.
	 *
	 * @param operatorName the operator name of this budget arrival
	 */
	public void setOperatorName(String operatorName);

	/**
	 * Returns the arrival total of this budget arrival.
	 *
	 * @return the arrival total of this budget arrival
	 */
	public double getArrivalTotal();

	/**
	 * Sets the arrival total of this budget arrival.
	 *
	 * @param arrivalTotal the arrival total of this budget arrival
	 */
	public void setArrivalTotal(double arrivalTotal);

	/**
	 * Returns the project name of this budget arrival.
	 *
	 * @return the project name of this budget arrival
	 */
	@AutoEscape
	public String getProjectName();

	/**
	 * Sets the project name of this budget arrival.
	 *
	 * @param projectName the project name of this budget arrival
	 */
	public void setProjectName(String projectName);

	/**
	 * Returns the budget name of this budget arrival.
	 *
	 * @return the budget name of this budget arrival
	 */
	@AutoEscape
	public String getBudgetName();

	/**
	 * Sets the budget name of this budget arrival.
	 *
	 * @param budgetName the budget name of this budget arrival
	 */
	public void setBudgetName(String budgetName);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.startarget.portlet.model.BudgetArrival budgetArrival);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.startarget.portlet.model.BudgetArrival> toCacheModel();

	@Override
	public com.startarget.portlet.model.BudgetArrival toEscapedModel();

	@Override
	public com.startarget.portlet.model.BudgetArrival toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}