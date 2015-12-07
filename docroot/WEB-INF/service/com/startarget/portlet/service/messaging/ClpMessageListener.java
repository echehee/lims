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

package com.startarget.portlet.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.startarget.portlet.service.AccountItemLocalServiceUtil;
import com.startarget.portlet.service.AccountItemServiceUtil;
import com.startarget.portlet.service.BudgetApplicationLocalServiceUtil;
import com.startarget.portlet.service.BudgetApplicationServiceUtil;
import com.startarget.portlet.service.BudgetArrivalLocalServiceUtil;
import com.startarget.portlet.service.BudgetArrivalServiceUtil;
import com.startarget.portlet.service.BudgetItemLocalServiceUtil;
import com.startarget.portlet.service.BudgetItemServiceUtil;
import com.startarget.portlet.service.BudgetLocalServiceUtil;
import com.startarget.portlet.service.BudgetServiceUtil;
import com.startarget.portlet.service.ClpSerializer;
import com.startarget.portlet.service.ProjectLocalServiceUtil;
import com.startarget.portlet.service.ProjectServiceUtil;

/**
 * @author chaojie
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			AccountItemLocalServiceUtil.clearService();

			AccountItemServiceUtil.clearService();
			BudgetLocalServiceUtil.clearService();

			BudgetServiceUtil.clearService();
			BudgetApplicationLocalServiceUtil.clearService();

			BudgetApplicationServiceUtil.clearService();
			BudgetArrivalLocalServiceUtil.clearService();

			BudgetArrivalServiceUtil.clearService();
			BudgetItemLocalServiceUtil.clearService();

			BudgetItemServiceUtil.clearService();
			ProjectLocalServiceUtil.clearService();

			ProjectServiceUtil.clearService();
		}
	}
}