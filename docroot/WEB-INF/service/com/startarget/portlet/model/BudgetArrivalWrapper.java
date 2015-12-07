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
 * This class is a wrapper for {@link BudgetArrival}.
 * </p>
 *
 * @author chaojie
 * @see BudgetArrival
 * @generated
 */
public class BudgetArrivalWrapper implements BudgetArrival,
	ModelWrapper<BudgetArrival> {
	public BudgetArrivalWrapper(BudgetArrival budgetArrival) {
		_budgetArrival = budgetArrival;
	}

	@Override
	public Class<?> getModelClass() {
		return BudgetArrival.class;
	}

	@Override
	public String getModelClassName() {
		return BudgetArrival.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("budgetArrivalId", getBudgetArrivalId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("operatorId", getOperatorId());
		attributes.put("operatorName", getOperatorName());
		attributes.put("arrivalTotal", getArrivalTotal());
		attributes.put("projectName", getProjectName());
		attributes.put("budgetName", getBudgetName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long budgetArrivalId = (Long)attributes.get("budgetArrivalId");

		if (budgetArrivalId != null) {
			setBudgetArrivalId(budgetArrivalId);
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

		Long operatorId = (Long)attributes.get("operatorId");

		if (operatorId != null) {
			setOperatorId(operatorId);
		}

		String operatorName = (String)attributes.get("operatorName");

		if (operatorName != null) {
			setOperatorName(operatorName);
		}

		Double arrivalTotal = (Double)attributes.get("arrivalTotal");

		if (arrivalTotal != null) {
			setArrivalTotal(arrivalTotal);
		}

		String projectName = (String)attributes.get("projectName");

		if (projectName != null) {
			setProjectName(projectName);
		}

		String budgetName = (String)attributes.get("budgetName");

		if (budgetName != null) {
			setBudgetName(budgetName);
		}
	}

	/**
	* Returns the primary key of this budget arrival.
	*
	* @return the primary key of this budget arrival
	*/
	@Override
	public long getPrimaryKey() {
		return _budgetArrival.getPrimaryKey();
	}

	/**
	* Sets the primary key of this budget arrival.
	*
	* @param primaryKey the primary key of this budget arrival
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_budgetArrival.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the budget arrival ID of this budget arrival.
	*
	* @return the budget arrival ID of this budget arrival
	*/
	@Override
	public long getBudgetArrivalId() {
		return _budgetArrival.getBudgetArrivalId();
	}

	/**
	* Sets the budget arrival ID of this budget arrival.
	*
	* @param budgetArrivalId the budget arrival ID of this budget arrival
	*/
	@Override
	public void setBudgetArrivalId(long budgetArrivalId) {
		_budgetArrival.setBudgetArrivalId(budgetArrivalId);
	}

	/**
	* Returns the group ID of this budget arrival.
	*
	* @return the group ID of this budget arrival
	*/
	@Override
	public long getGroupId() {
		return _budgetArrival.getGroupId();
	}

	/**
	* Sets the group ID of this budget arrival.
	*
	* @param groupId the group ID of this budget arrival
	*/
	@Override
	public void setGroupId(long groupId) {
		_budgetArrival.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this budget arrival.
	*
	* @return the company ID of this budget arrival
	*/
	@Override
	public long getCompanyId() {
		return _budgetArrival.getCompanyId();
	}

	/**
	* Sets the company ID of this budget arrival.
	*
	* @param companyId the company ID of this budget arrival
	*/
	@Override
	public void setCompanyId(long companyId) {
		_budgetArrival.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this budget arrival.
	*
	* @return the user ID of this budget arrival
	*/
	@Override
	public long getUserId() {
		return _budgetArrival.getUserId();
	}

	/**
	* Sets the user ID of this budget arrival.
	*
	* @param userId the user ID of this budget arrival
	*/
	@Override
	public void setUserId(long userId) {
		_budgetArrival.setUserId(userId);
	}

	/**
	* Returns the user uuid of this budget arrival.
	*
	* @return the user uuid of this budget arrival
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetArrival.getUserUuid();
	}

	/**
	* Sets the user uuid of this budget arrival.
	*
	* @param userUuid the user uuid of this budget arrival
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_budgetArrival.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this budget arrival.
	*
	* @return the user name of this budget arrival
	*/
	@Override
	public java.lang.String getUserName() {
		return _budgetArrival.getUserName();
	}

	/**
	* Sets the user name of this budget arrival.
	*
	* @param userName the user name of this budget arrival
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_budgetArrival.setUserName(userName);
	}

	/**
	* Returns the create date of this budget arrival.
	*
	* @return the create date of this budget arrival
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _budgetArrival.getCreateDate();
	}

	/**
	* Sets the create date of this budget arrival.
	*
	* @param createDate the create date of this budget arrival
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_budgetArrival.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this budget arrival.
	*
	* @return the modified date of this budget arrival
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _budgetArrival.getModifiedDate();
	}

	/**
	* Sets the modified date of this budget arrival.
	*
	* @param modifiedDate the modified date of this budget arrival
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_budgetArrival.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the operator ID of this budget arrival.
	*
	* @return the operator ID of this budget arrival
	*/
	@Override
	public long getOperatorId() {
		return _budgetArrival.getOperatorId();
	}

	/**
	* Sets the operator ID of this budget arrival.
	*
	* @param operatorId the operator ID of this budget arrival
	*/
	@Override
	public void setOperatorId(long operatorId) {
		_budgetArrival.setOperatorId(operatorId);
	}

	/**
	* Returns the operator name of this budget arrival.
	*
	* @return the operator name of this budget arrival
	*/
	@Override
	public java.lang.String getOperatorName() {
		return _budgetArrival.getOperatorName();
	}

	/**
	* Sets the operator name of this budget arrival.
	*
	* @param operatorName the operator name of this budget arrival
	*/
	@Override
	public void setOperatorName(java.lang.String operatorName) {
		_budgetArrival.setOperatorName(operatorName);
	}

	/**
	* Returns the arrival total of this budget arrival.
	*
	* @return the arrival total of this budget arrival
	*/
	@Override
	public double getArrivalTotal() {
		return _budgetArrival.getArrivalTotal();
	}

	/**
	* Sets the arrival total of this budget arrival.
	*
	* @param arrivalTotal the arrival total of this budget arrival
	*/
	@Override
	public void setArrivalTotal(double arrivalTotal) {
		_budgetArrival.setArrivalTotal(arrivalTotal);
	}

	/**
	* Returns the project name of this budget arrival.
	*
	* @return the project name of this budget arrival
	*/
	@Override
	public java.lang.String getProjectName() {
		return _budgetArrival.getProjectName();
	}

	/**
	* Sets the project name of this budget arrival.
	*
	* @param projectName the project name of this budget arrival
	*/
	@Override
	public void setProjectName(java.lang.String projectName) {
		_budgetArrival.setProjectName(projectName);
	}

	/**
	* Returns the budget name of this budget arrival.
	*
	* @return the budget name of this budget arrival
	*/
	@Override
	public java.lang.String getBudgetName() {
		return _budgetArrival.getBudgetName();
	}

	/**
	* Sets the budget name of this budget arrival.
	*
	* @param budgetName the budget name of this budget arrival
	*/
	@Override
	public void setBudgetName(java.lang.String budgetName) {
		_budgetArrival.setBudgetName(budgetName);
	}

	@Override
	public boolean isNew() {
		return _budgetArrival.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_budgetArrival.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _budgetArrival.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_budgetArrival.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _budgetArrival.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _budgetArrival.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_budgetArrival.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _budgetArrival.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_budgetArrival.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_budgetArrival.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_budgetArrival.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BudgetArrivalWrapper((BudgetArrival)_budgetArrival.clone());
	}

	@Override
	public int compareTo(
		com.startarget.portlet.model.BudgetArrival budgetArrival) {
		return _budgetArrival.compareTo(budgetArrival);
	}

	@Override
	public int hashCode() {
		return _budgetArrival.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.startarget.portlet.model.BudgetArrival> toCacheModel() {
		return _budgetArrival.toCacheModel();
	}

	@Override
	public com.startarget.portlet.model.BudgetArrival toEscapedModel() {
		return new BudgetArrivalWrapper(_budgetArrival.toEscapedModel());
	}

	@Override
	public com.startarget.portlet.model.BudgetArrival toUnescapedModel() {
		return new BudgetArrivalWrapper(_budgetArrival.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _budgetArrival.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _budgetArrival.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_budgetArrival.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BudgetArrivalWrapper)) {
			return false;
		}

		BudgetArrivalWrapper budgetArrivalWrapper = (BudgetArrivalWrapper)obj;

		if (Validator.equals(_budgetArrival, budgetArrivalWrapper._budgetArrival)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public BudgetArrival getWrappedBudgetArrival() {
		return _budgetArrival;
	}

	@Override
	public BudgetArrival getWrappedModel() {
		return _budgetArrival;
	}

	@Override
	public void resetOriginalValues() {
		_budgetArrival.resetOriginalValues();
	}

	private BudgetArrival _budgetArrival;
}