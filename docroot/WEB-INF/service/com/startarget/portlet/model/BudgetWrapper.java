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
 * This class is a wrapper for {@link Budget}.
 * </p>
 *
 * @author chaojie
 * @see Budget
 * @generated
 */
public class BudgetWrapper implements Budget, ModelWrapper<Budget> {
	public BudgetWrapper(Budget budget) {
		_budget = budget;
	}

	@Override
	public Class<?> getModelClass() {
		return Budget.class;
	}

	@Override
	public String getModelClassName() {
		return Budget.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("budgetId", getBudgetId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("projectName", getProjectName());
		attributes.put("budgetName", getBudgetName());
		attributes.put("budgetStartYear", getBudgetStartYear());
		attributes.put("budgetEndYear", getBudgetEndYear());
		attributes.put("budgetTotal", getBudgetTotal());
		attributes.put("budgetArrival", getBudgetArrival());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long budgetId = (Long)attributes.get("budgetId");

		if (budgetId != null) {
			setBudgetId(budgetId);
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

		String projectName = (String)attributes.get("projectName");

		if (projectName != null) {
			setProjectName(projectName);
		}

		String budgetName = (String)attributes.get("budgetName");

		if (budgetName != null) {
			setBudgetName(budgetName);
		}

		Integer budgetStartYear = (Integer)attributes.get("budgetStartYear");

		if (budgetStartYear != null) {
			setBudgetStartYear(budgetStartYear);
		}

		Integer budgetEndYear = (Integer)attributes.get("budgetEndYear");

		if (budgetEndYear != null) {
			setBudgetEndYear(budgetEndYear);
		}

		Double budgetTotal = (Double)attributes.get("budgetTotal");

		if (budgetTotal != null) {
			setBudgetTotal(budgetTotal);
		}

		Double budgetArrival = (Double)attributes.get("budgetArrival");

		if (budgetArrival != null) {
			setBudgetArrival(budgetArrival);
		}
	}

	/**
	* Returns the primary key of this budget.
	*
	* @return the primary key of this budget
	*/
	@Override
	public long getPrimaryKey() {
		return _budget.getPrimaryKey();
	}

	/**
	* Sets the primary key of this budget.
	*
	* @param primaryKey the primary key of this budget
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_budget.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the budget ID of this budget.
	*
	* @return the budget ID of this budget
	*/
	@Override
	public long getBudgetId() {
		return _budget.getBudgetId();
	}

	/**
	* Sets the budget ID of this budget.
	*
	* @param budgetId the budget ID of this budget
	*/
	@Override
	public void setBudgetId(long budgetId) {
		_budget.setBudgetId(budgetId);
	}

	/**
	* Returns the group ID of this budget.
	*
	* @return the group ID of this budget
	*/
	@Override
	public long getGroupId() {
		return _budget.getGroupId();
	}

	/**
	* Sets the group ID of this budget.
	*
	* @param groupId the group ID of this budget
	*/
	@Override
	public void setGroupId(long groupId) {
		_budget.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this budget.
	*
	* @return the company ID of this budget
	*/
	@Override
	public long getCompanyId() {
		return _budget.getCompanyId();
	}

	/**
	* Sets the company ID of this budget.
	*
	* @param companyId the company ID of this budget
	*/
	@Override
	public void setCompanyId(long companyId) {
		_budget.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this budget.
	*
	* @return the user ID of this budget
	*/
	@Override
	public long getUserId() {
		return _budget.getUserId();
	}

	/**
	* Sets the user ID of this budget.
	*
	* @param userId the user ID of this budget
	*/
	@Override
	public void setUserId(long userId) {
		_budget.setUserId(userId);
	}

	/**
	* Returns the user uuid of this budget.
	*
	* @return the user uuid of this budget
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budget.getUserUuid();
	}

	/**
	* Sets the user uuid of this budget.
	*
	* @param userUuid the user uuid of this budget
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_budget.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this budget.
	*
	* @return the user name of this budget
	*/
	@Override
	public java.lang.String getUserName() {
		return _budget.getUserName();
	}

	/**
	* Sets the user name of this budget.
	*
	* @param userName the user name of this budget
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_budget.setUserName(userName);
	}

	/**
	* Returns the create date of this budget.
	*
	* @return the create date of this budget
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _budget.getCreateDate();
	}

	/**
	* Sets the create date of this budget.
	*
	* @param createDate the create date of this budget
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_budget.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this budget.
	*
	* @return the modified date of this budget
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _budget.getModifiedDate();
	}

	/**
	* Sets the modified date of this budget.
	*
	* @param modifiedDate the modified date of this budget
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_budget.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the project name of this budget.
	*
	* @return the project name of this budget
	*/
	@Override
	public java.lang.String getProjectName() {
		return _budget.getProjectName();
	}

	/**
	* Sets the project name of this budget.
	*
	* @param projectName the project name of this budget
	*/
	@Override
	public void setProjectName(java.lang.String projectName) {
		_budget.setProjectName(projectName);
	}

	/**
	* Returns the budget name of this budget.
	*
	* @return the budget name of this budget
	*/
	@Override
	public java.lang.String getBudgetName() {
		return _budget.getBudgetName();
	}

	/**
	* Sets the budget name of this budget.
	*
	* @param budgetName the budget name of this budget
	*/
	@Override
	public void setBudgetName(java.lang.String budgetName) {
		_budget.setBudgetName(budgetName);
	}

	/**
	* Returns the budget start year of this budget.
	*
	* @return the budget start year of this budget
	*/
	@Override
	public int getBudgetStartYear() {
		return _budget.getBudgetStartYear();
	}

	/**
	* Sets the budget start year of this budget.
	*
	* @param budgetStartYear the budget start year of this budget
	*/
	@Override
	public void setBudgetStartYear(int budgetStartYear) {
		_budget.setBudgetStartYear(budgetStartYear);
	}

	/**
	* Returns the budget end year of this budget.
	*
	* @return the budget end year of this budget
	*/
	@Override
	public int getBudgetEndYear() {
		return _budget.getBudgetEndYear();
	}

	/**
	* Sets the budget end year of this budget.
	*
	* @param budgetEndYear the budget end year of this budget
	*/
	@Override
	public void setBudgetEndYear(int budgetEndYear) {
		_budget.setBudgetEndYear(budgetEndYear);
	}

	/**
	* Returns the budget total of this budget.
	*
	* @return the budget total of this budget
	*/
	@Override
	public double getBudgetTotal() {
		return _budget.getBudgetTotal();
	}

	/**
	* Sets the budget total of this budget.
	*
	* @param budgetTotal the budget total of this budget
	*/
	@Override
	public void setBudgetTotal(double budgetTotal) {
		_budget.setBudgetTotal(budgetTotal);
	}

	/**
	* Returns the budget arrival of this budget.
	*
	* @return the budget arrival of this budget
	*/
	@Override
	public double getBudgetArrival() {
		return _budget.getBudgetArrival();
	}

	/**
	* Sets the budget arrival of this budget.
	*
	* @param budgetArrival the budget arrival of this budget
	*/
	@Override
	public void setBudgetArrival(double budgetArrival) {
		_budget.setBudgetArrival(budgetArrival);
	}

	@Override
	public boolean isNew() {
		return _budget.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_budget.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _budget.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_budget.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _budget.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _budget.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_budget.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _budget.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_budget.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_budget.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_budget.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BudgetWrapper((Budget)_budget.clone());
	}

	@Override
	public int compareTo(com.startarget.portlet.model.Budget budget) {
		return _budget.compareTo(budget);
	}

	@Override
	public int hashCode() {
		return _budget.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.startarget.portlet.model.Budget> toCacheModel() {
		return _budget.toCacheModel();
	}

	@Override
	public com.startarget.portlet.model.Budget toEscapedModel() {
		return new BudgetWrapper(_budget.toEscapedModel());
	}

	@Override
	public com.startarget.portlet.model.Budget toUnescapedModel() {
		return new BudgetWrapper(_budget.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _budget.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _budget.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_budget.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BudgetWrapper)) {
			return false;
		}

		BudgetWrapper budgetWrapper = (BudgetWrapper)obj;

		if (Validator.equals(_budget, budgetWrapper._budget)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Budget getWrappedBudget() {
		return _budget;
	}

	@Override
	public Budget getWrappedModel() {
		return _budget;
	}

	@Override
	public void resetOriginalValues() {
		_budget.resetOriginalValues();
	}

	private Budget _budget;
}