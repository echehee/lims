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

import com.liferay.portal.kernel.exception.SystemException;

import com.startarget.portlet.model.AccountItem;
import com.startarget.portlet.service.AccountItemLocalServiceUtil;

/**
 * The extended model base implementation for the AccountItem service. Represents a row in the &quot;lims_AccountItem&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AccountItemImpl}.
 * </p>
 *
 * @author chaojie
 * @see AccountItemImpl
 * @see com.startarget.portlet.model.AccountItem
 * @generated
 */
public abstract class AccountItemBaseImpl extends AccountItemModelImpl
	implements AccountItem {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a account item model instance should use the {@link AccountItem} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AccountItemLocalServiceUtil.addAccountItem(this);
		}
		else {
			AccountItemLocalServiceUtil.updateAccountItem(this);
		}
	}
}