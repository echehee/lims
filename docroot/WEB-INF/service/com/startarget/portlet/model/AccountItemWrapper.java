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
 * This class is a wrapper for {@link AccountItem}.
 * </p>
 *
 * @author chaojie
 * @see AccountItem
 * @generated
 */
public class AccountItemWrapper implements AccountItem,
	ModelWrapper<AccountItem> {
	public AccountItemWrapper(AccountItem accountItem) {
		_accountItem = accountItem;
	}

	@Override
	public Class<?> getModelClass() {
		return AccountItem.class;
	}

	@Override
	public String getModelClassName() {
		return AccountItem.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("accountItemId", getAccountItemId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("parentName", getParentName());
		attributes.put("itemCode", getItemCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long accountItemId = (Long)attributes.get("accountItemId");

		if (accountItemId != null) {
			setAccountItemId(accountItemId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String parentName = (String)attributes.get("parentName");

		if (parentName != null) {
			setParentName(parentName);
		}

		Long itemCode = (Long)attributes.get("itemCode");

		if (itemCode != null) {
			setItemCode(itemCode);
		}
	}

	/**
	* Returns the primary key of this account item.
	*
	* @return the primary key of this account item
	*/
	@Override
	public long getPrimaryKey() {
		return _accountItem.getPrimaryKey();
	}

	/**
	* Sets the primary key of this account item.
	*
	* @param primaryKey the primary key of this account item
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_accountItem.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the account item ID of this account item.
	*
	* @return the account item ID of this account item
	*/
	@Override
	public long getAccountItemId() {
		return _accountItem.getAccountItemId();
	}

	/**
	* Sets the account item ID of this account item.
	*
	* @param accountItemId the account item ID of this account item
	*/
	@Override
	public void setAccountItemId(long accountItemId) {
		_accountItem.setAccountItemId(accountItemId);
	}

	/**
	* Returns the group ID of this account item.
	*
	* @return the group ID of this account item
	*/
	@Override
	public long getGroupId() {
		return _accountItem.getGroupId();
	}

	/**
	* Sets the group ID of this account item.
	*
	* @param groupId the group ID of this account item
	*/
	@Override
	public void setGroupId(long groupId) {
		_accountItem.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this account item.
	*
	* @return the company ID of this account item
	*/
	@Override
	public long getCompanyId() {
		return _accountItem.getCompanyId();
	}

	/**
	* Sets the company ID of this account item.
	*
	* @param companyId the company ID of this account item
	*/
	@Override
	public void setCompanyId(long companyId) {
		_accountItem.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this account item.
	*
	* @return the user ID of this account item
	*/
	@Override
	public long getUserId() {
		return _accountItem.getUserId();
	}

	/**
	* Sets the user ID of this account item.
	*
	* @param userId the user ID of this account item
	*/
	@Override
	public void setUserId(long userId) {
		_accountItem.setUserId(userId);
	}

	/**
	* Returns the user uuid of this account item.
	*
	* @return the user uuid of this account item
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _accountItem.getUserUuid();
	}

	/**
	* Sets the user uuid of this account item.
	*
	* @param userUuid the user uuid of this account item
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_accountItem.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this account item.
	*
	* @return the user name of this account item
	*/
	@Override
	public java.lang.String getUserName() {
		return _accountItem.getUserName();
	}

	/**
	* Sets the user name of this account item.
	*
	* @param userName the user name of this account item
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_accountItem.setUserName(userName);
	}

	/**
	* Returns the create date of this account item.
	*
	* @return the create date of this account item
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _accountItem.getCreateDate();
	}

	/**
	* Sets the create date of this account item.
	*
	* @param createDate the create date of this account item
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_accountItem.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this account item.
	*
	* @return the modified date of this account item
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _accountItem.getModifiedDate();
	}

	/**
	* Sets the modified date of this account item.
	*
	* @param modifiedDate the modified date of this account item
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_accountItem.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the name of this account item.
	*
	* @return the name of this account item
	*/
	@Override
	public java.lang.String getName() {
		return _accountItem.getName();
	}

	/**
	* Sets the name of this account item.
	*
	* @param name the name of this account item
	*/
	@Override
	public void setName(java.lang.String name) {
		_accountItem.setName(name);
	}

	/**
	* Returns the parent name of this account item.
	*
	* @return the parent name of this account item
	*/
	@Override
	public java.lang.String getParentName() {
		return _accountItem.getParentName();
	}

	/**
	* Sets the parent name of this account item.
	*
	* @param parentName the parent name of this account item
	*/
	@Override
	public void setParentName(java.lang.String parentName) {
		_accountItem.setParentName(parentName);
	}

	/**
	* Returns the item code of this account item.
	*
	* @return the item code of this account item
	*/
	@Override
	public long getItemCode() {
		return _accountItem.getItemCode();
	}

	/**
	* Sets the item code of this account item.
	*
	* @param itemCode the item code of this account item
	*/
	@Override
	public void setItemCode(long itemCode) {
		_accountItem.setItemCode(itemCode);
	}

	@Override
	public boolean isNew() {
		return _accountItem.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_accountItem.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _accountItem.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_accountItem.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _accountItem.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _accountItem.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_accountItem.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _accountItem.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_accountItem.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_accountItem.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_accountItem.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AccountItemWrapper((AccountItem)_accountItem.clone());
	}

	@Override
	public int compareTo(com.startarget.portlet.model.AccountItem accountItem) {
		return _accountItem.compareTo(accountItem);
	}

	@Override
	public int hashCode() {
		return _accountItem.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.startarget.portlet.model.AccountItem> toCacheModel() {
		return _accountItem.toCacheModel();
	}

	@Override
	public com.startarget.portlet.model.AccountItem toEscapedModel() {
		return new AccountItemWrapper(_accountItem.toEscapedModel());
	}

	@Override
	public com.startarget.portlet.model.AccountItem toUnescapedModel() {
		return new AccountItemWrapper(_accountItem.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _accountItem.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _accountItem.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_accountItem.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AccountItemWrapper)) {
			return false;
		}

		AccountItemWrapper accountItemWrapper = (AccountItemWrapper)obj;

		if (Validator.equals(_accountItem, accountItemWrapper._accountItem)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AccountItem getWrappedAccountItem() {
		return _accountItem;
	}

	@Override
	public AccountItem getWrappedModel() {
		return _accountItem;
	}

	@Override
	public void resetOriginalValues() {
		_accountItem.resetOriginalValues();
	}

	private AccountItem _accountItem;
}