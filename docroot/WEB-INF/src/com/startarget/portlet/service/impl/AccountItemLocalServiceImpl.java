/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free Software Foundation; either version
 * 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

package com.startarget.portlet.service.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.startarget.portlet.model.AccountItem;
import com.startarget.portlet.service.base.AccountItemLocalServiceBaseImpl;

/**
 * The implementation of the account item local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun
 * ServiceBuilder to copy their definitions into the
 * {@link com.startarget.portlet.service.AccountItemLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the
 * propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author chaojie
 * @see com.startarget.portlet.service.base.AccountItemLocalServiceBaseImpl
 * @see com.startarget.portlet.service.AccountItemLocalServiceUtil
 */
public class AccountItemLocalServiceImpl extends AccountItemLocalServiceBaseImpl {
  /*
   * NOTE FOR DEVELOPERS:
   * 
   * Never reference this interface directly. Always use {@link
   * com.startarget.portlet.service.AccountItemLocalServiceUtil} to access the account item local
   * service.
   */

  @Override
  public List<AccountItem> getAccountItems() throws SystemException {
    return accountItemPersistence.findAll();
  }

  @Override
  public List<AccountItem> getAccountItemByItemCode(long itemCode) throws SystemException {
    DynamicQuery query = DynamicQueryFactoryUtil.forClass(AccountItem.class);
    query.add(PropertyFactoryUtil.forName("itemCode").eq(itemCode));
    return accountItemPersistence.findWithDynamicQuery(query);
  }

  @Override
  public AccountItem addAccountItem(long itemCode, String name, String parentName) throws SystemException {
    long accountItemId = counterLocalService.increment();
    AccountItem accountItem = accountItemPersistence.create(accountItemId);
    accountItem.setItemCode(itemCode);
    accountItem.setName(name);
    accountItem.setParentName(parentName);
    accountItemPersistence.update(accountItem);
    return accountItem;
  }
}
