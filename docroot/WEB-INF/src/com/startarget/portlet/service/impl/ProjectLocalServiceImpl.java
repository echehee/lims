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

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.startarget.portlet.model.Project;
import com.startarget.portlet.service.base.ProjectLocalServiceBaseImpl;

/**
 * The implementation of the project local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun
 * ServiceBuilder to copy their definitions into the
 * {@link com.startarget.portlet.service.ProjectLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the
 * propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author chaojie
 * @see com.startarget.portlet.service.base.ProjectLocalServiceBaseImpl
 * @see com.startarget.portlet.service.ProjectLocalServiceUtil
 */
public class ProjectLocalServiceImpl extends ProjectLocalServiceBaseImpl {
  /*
   * NOTE FOR DEVELOPERS:
   * 
   * Never reference this interface directly. Always use {@link
   * com.startarget.portlet.service.ProjectLocalServiceUtil} to access the project local service.
   */

  @Override
  public List<Project> getProjects() throws SystemException {
    return projectPersistence.findAll();
  }

  @Override
  public List<String> getProjectNames() throws SystemException {
    List<Project> projects = getProjects();
    List<String> names = new ArrayList<String>();
    for (Project p : projects) {
      names.add(p.getProjectName());
    }
    return names;

  }

  @Override
  @SuppressWarnings("unchecked")
  public List<Project> getProjectsByName(String projectName) throws SystemException {
    DynamicQuery query = DynamicQueryFactoryUtil.forClass(Project.class);
    query.add(PropertyFactoryUtil.forName("projectName").eq(projectName));
    return projectPersistence.findWithDynamicQuery(query);
  }


  @Override
  @SuppressWarnings("unchecked")
  public Project addProject(String projectName, String projectLeader, String projectStatus) throws SystemException {

    DynamicQuery query = DynamicQueryFactoryUtil.forClass(Project.class);
    query.add(PropertyFactoryUtil.forName("projectName").eq(projectName));
    List<Project> projects = projectPersistence.findWithDynamicQuery(query);

    if (projects.size() == 0) {

      long projectId = counterLocalService.increment();

      Project project = projectPersistence.create(projectId);

      project.setProjectLeader(projectLeader);
      project.setProjectName(projectName);
      project.setProjectStatus(projectStatus);

      projectPersistence.update(project);
      return project;
    }
    return null;
  }

}
