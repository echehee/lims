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

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.startarget.portlet.model.BudgetApplication;
import com.startarget.portlet.service.BudgetApplicationLocalServiceUtil;

/**
 * @author chaojie
 * @generated
 */
public abstract class BudgetApplicationActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public BudgetApplicationActionableDynamicQuery() throws SystemException {
		setBaseLocalService(BudgetApplicationLocalServiceUtil.getService());
		setClass(BudgetApplication.class);

		setClassLoader(com.startarget.portlet.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("budgetApplicationId");
	}
}