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

import com.startarget.portlet.model.BudgetArrival;
import com.startarget.portlet.service.BudgetArrivalLocalServiceUtil;

/**
 * @author chaojie
 * @generated
 */
public abstract class BudgetArrivalActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public BudgetArrivalActionableDynamicQuery() throws SystemException {
		setBaseLocalService(BudgetArrivalLocalServiceUtil.getService());
		setClass(BudgetArrival.class);

		setClassLoader(com.startarget.portlet.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("budgetArrivalId");
	}
}