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
 * This class is a wrapper for {@link BudgetItem}.
 * </p>
 *
 * @author chaojie
 * @see BudgetItem
 * @generated
 */
public class BudgetItemWrapper implements BudgetItem, ModelWrapper<BudgetItem> {
	public BudgetItemWrapper(BudgetItem budgetItem) {
		_budgetItem = budgetItem;
	}

	@Override
	public Class<?> getModelClass() {
		return BudgetItem.class;
	}

	@Override
	public String getModelClassName() {
		return BudgetItem.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("budgetItemId", getBudgetItemId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("budgetId", getBudgetId());
		attributes.put("accountItemId", getAccountItemId());
		attributes.put("accountItemName", getAccountItemName());
		attributes.put("itemCode", getItemCode());
		attributes.put("budgetTotal", getBudgetTotal());
		attributes.put("budgetUsed", getBudgetUsed());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long budgetItemId = (Long)attributes.get("budgetItemId");

		if (budgetItemId != null) {
			setBudgetItemId(budgetItemId);
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

		Long budgetId = (Long)attributes.get("budgetId");

		if (budgetId != null) {
			setBudgetId(budgetId);
		}

		Long accountItemId = (Long)attributes.get("accountItemId");

		if (accountItemId != null) {
			setAccountItemId(accountItemId);
		}

		String accountItemName = (String)attributes.get("accountItemName");

		if (accountItemName != null) {
			setAccountItemName(accountItemName);
		}

		Long itemCode = (Long)attributes.get("itemCode");

		if (itemCode != null) {
			setItemCode(itemCode);
		}

		Double budgetTotal = (Double)attributes.get("budgetTotal");

		if (budgetTotal != null) {
			setBudgetTotal(budgetTotal);
		}

		Double budgetUsed = (Double)attributes.get("budgetUsed");

		if (budgetUsed != null) {
			setBudgetUsed(budgetUsed);
		}
	}

	/**
	* Returns the primary key of this budget item.
	*
	* @return the primary key of this budget item
	*/
	@Override
	public long getPrimaryKey() {
		return _budgetItem.getPrimaryKey();
	}

	/**
	* Sets the primary key of this budget item.
	*
	* @param primaryKey the primary key of this budget item
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_budgetItem.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the budget item ID of this budget item.
	*
	* @return the budget item ID of this budget item
	*/
	@Override
	public long getBudgetItemId() {
		return _budgetItem.getBudgetItemId();
	}

	/**
	* Sets the budget item ID of this budget item.
	*
	* @param budgetItemId the budget item ID of this budget item
	*/
	@Override
	public void setBudgetItemId(long budgetItemId) {
		_budgetItem.setBudgetItemId(budgetItemId);
	}

	/**
	* Returns the group ID of this budget item.
	*
	* @return the group ID of this budget item
	*/
	@Override
	public long getGroupId() {
		return _budgetItem.getGroupId();
	}

	/**
	* Sets the group ID of this budget item.
	*
	* @param groupId the group ID of this budget item
	*/
	@Override
	public void setGroupId(long groupId) {
		_budgetItem.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this budget item.
	*
	* @return the company ID of this budget item
	*/
	@Override
	public long getCompanyId() {
		return _budgetItem.getCompanyId();
	}

	/**
	* Sets the company ID of this budget item.
	*
	* @param companyId the company ID of this budget item
	*/
	@Override
	public void setCompanyId(long companyId) {
		_budgetItem.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this budget item.
	*
	* @return the user ID of this budget item
	*/
	@Override
	public long getUserId() {
		return _budgetItem.getUserId();
	}

	/**
	* Sets the user ID of this budget item.
	*
	* @param userId the user ID of this budget item
	*/
	@Override
	public void setUserId(long userId) {
		_budgetItem.setUserId(userId);
	}

	/**
	* Returns the user uuid of this budget item.
	*
	* @return the user uuid of this budget item
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _budgetItem.getUserUuid();
	}

	/**
	* Sets the user uuid of this budget item.
	*
	* @param userUuid the user uuid of this budget item
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_budgetItem.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this budget item.
	*
	* @return the user name of this budget item
	*/
	@Override
	public java.lang.String getUserName() {
		return _budgetItem.getUserName();
	}

	/**
	* Sets the user name of this budget item.
	*
	* @param userName the user name of this budget item
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_budgetItem.setUserName(userName);
	}

	/**
	* Returns the create date of this budget item.
	*
	* @return the create date of this budget item
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _budgetItem.getCreateDate();
	}

	/**
	* Sets the create date of this budget item.
	*
	* @param createDate the create date of this budget item
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_budgetItem.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this budget item.
	*
	* @return the modified date of this budget item
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _budgetItem.getModifiedDate();
	}

	/**
	* Sets the modified date of this budget item.
	*
	* @param modifiedDate the modified date of this budget item
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_budgetItem.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the budget ID of this budget item.
	*
	* @return the budget ID of this budget item
	*/
	@Override
	public long getBudgetId() {
		return _budgetItem.getBudgetId();
	}

	/**
	* Sets the budget ID of this budget item.
	*
	* @param budgetId the budget ID of this budget item
	*/
	@Override
	public void setBudgetId(long budgetId) {
		_budgetItem.setBudgetId(budgetId);
	}

	/**
	* Returns the account item ID of this budget item.
	*
	* @return the account item ID of this budget item
	*/
	@Override
	public long getAccountItemId() {
		return _budgetItem.getAccountItemId();
	}

	/**
	* Sets the account item ID of this budget item.
	*
	* @param accountItemId the account item ID of this budget item
	*/
	@Override
	public void setAccountItemId(long accountItemId) {
		_budgetItem.setAccountItemId(accountItemId);
	}

	/**
	* Returns the account item name of this budget item.
	*
	* @return the account item name of this budget item
	*/
	@Override
	public java.lang.String getAccountItemName() {
		return _budgetItem.getAccountItemName();
	}

	/**
	* Sets the account item name of this budget item.
	*
	* @param accountItemName the account item name of this budget item
	*/
	@Override
	public void setAccountItemName(java.lang.String accountItemName) {
		_budgetItem.setAccountItemName(accountItemName);
	}

	/**
	* Returns the item code of this budget item.
	*
	* @return the item code of this budget item
	*/
	@Override
	public long getItemCode() {
		return _budgetItem.getItemCode();
	}

	/**
	* Sets the item code of this budget item.
	*
	* @param itemCode the item code of this budget item
	*/
	@Override
	public void setItemCode(long itemCode) {
		_budgetItem.setItemCode(itemCode);
	}

	/**
	* Returns the budget total of this budget item.
	*
	* @return the budget total of this budget item
	*/
	@Override
	public double getBudgetTotal() {
		return _budgetItem.getBudgetTotal();
	}

	/**
	* Sets the budget total of this budget item.
	*
	* @param budgetTotal the budget total of this budget item
	*/
	@Override
	public void setBudgetTotal(double budgetTotal) {
		_budgetItem.setBudgetTotal(budgetTotal);
	}

	/**
	* Returns the budget used of this budget item.
	*
	* @return the budget used of this budget item
	*/
	@Override
	public double getBudgetUsed() {
		return _budgetItem.getBudgetUsed();
	}

	/**
	* Sets the budget used of this budget item.
	*
	* @param budgetUsed the budget used of this budget item
	*/
	@Override
	public void setBudgetUsed(double budgetUsed) {
		_budgetItem.setBudgetUsed(budgetUsed);
	}

	@Override
	public boolean isNew() {
		return _budgetItem.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_budgetItem.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _budgetItem.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_budgetItem.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _budgetItem.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _budgetItem.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_budgetItem.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _budgetItem.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_budgetItem.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_budgetItem.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_budgetItem.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BudgetItemWrapper((BudgetItem)_budgetItem.clone());
	}

	@Override
	public int compareTo(com.startarget.portlet.model.BudgetItem budgetItem) {
		return _budgetItem.compareTo(budgetItem);
	}

	@Override
	public int hashCode() {
		return _budgetItem.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.startarget.portlet.model.BudgetItem> toCacheModel() {
		return _budgetItem.toCacheModel();
	}

	@Override
	public com.startarget.portlet.model.BudgetItem toEscapedModel() {
		return new BudgetItemWrapper(_budgetItem.toEscapedModel());
	}

	@Override
	public com.startarget.portlet.model.BudgetItem toUnescapedModel() {
		return new BudgetItemWrapper(_budgetItem.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _budgetItem.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _budgetItem.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_budgetItem.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BudgetItemWrapper)) {
			return false;
		}

		BudgetItemWrapper budgetItemWrapper = (BudgetItemWrapper)obj;

		if (Validator.equals(_budgetItem, budgetItemWrapper._budgetItem)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public BudgetItem getWrappedBudgetItem() {
		return _budgetItem;
	}

	@Override
	public BudgetItem getWrappedModel() {
		return _budgetItem;
	}

	@Override
	public void resetOriginalValues() {
		_budgetItem.resetOriginalValues();
	}

	private BudgetItem _budgetItem;
}