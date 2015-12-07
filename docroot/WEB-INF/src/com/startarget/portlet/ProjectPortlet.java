package com.startarget.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.startarget.portlet.model.Project;
import com.startarget.portlet.service.ProjectLocalServiceUtil;

/**
 * Portlet implementation class ProjectPortlet
 */
public class ProjectPortlet extends MVCPortlet {

  private static Logger logger = LoggerFactory.getLogger(BudgetPortlet.class);

  @Override
  public void render(RenderRequest request, RenderResponse response) throws PortletException, IOException {
    try {
      loadAllProjects(request);
      loadCurrentProject(request);
    } catch (SystemException e) {
      logger.warn("Fail to load projects");
    }
    super.render(request, response);
  }

  private void loadAllProjects(RenderRequest request) throws SystemException {
    logger.info("load all projects");
    request.setAttribute("projects", ProjectLocalServiceUtil.getProjects());
  }

  private void loadCurrentProject(RenderRequest request) {
    long projectId = ParamUtil.getLong(request, "projectId");
    logger.info("load project id=" + projectId);
    request.setAttribute("projectId", projectId);
  }

  public void addProject(ActionRequest request, ActionResponse response) throws SystemException {

    String name = ParamUtil.getString(request, "projectName");
    String leader = ParamUtil.getString(request, "projectLeader");
    String status = ParamUtil.getString(request, "projectStatus");

    logger.info("add project [name=" + name + ",leader=" + leader + ",status=" + status + "]");

    ProjectLocalServiceUtil.addProject(name, leader, status);
    SessionMessages.add(request, "add new project");
  }

  public void editProject(ActionRequest request, ActionResponse response) {

    Long projectId = ParamUtil.getLong(request, "projectId");

    try {
      logger.info("edit project id=" + projectId);

      String leader = ParamUtil.getString(request, "projectLeader");
      String status = ParamUtil.getString(request, "projectStatus");

      Project project = ProjectLocalServiceUtil.getProject(projectId);
      project.setProjectLeader(leader);
      project.setProjectStatus(status);
      ProjectLocalServiceUtil.updateProject(project);
    } catch (PortalException e) {
      logger.warn("Fail to update project id=" + projectId);
    } catch (SystemException e) {
      logger.warn("Fail to update project id=" + projectId);
    }

  }

  public void deleteProject(ActionRequest request, ActionResponse response) {

    long projectId = ParamUtil.getLong(request, "projectId");

    try {
      logger.info("delete project id=" + projectId);
      ProjectLocalServiceUtil.deleteProject(projectId);
    } catch (PortalException e) {
      logger.warn("Fail to delete project id=" + projectId);
    } catch (SystemException e) {
      logger.warn("Fail to delete project id=" + projectId);
    }
  }



}
