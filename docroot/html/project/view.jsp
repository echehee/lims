<%@include file="/html/init.jsp"%>

<portlet:renderURL var="addProject">
  <portlet:param name="mvcPath" value="/html/project/addProject.jsp" />
</portlet:renderURL> 

<aui:button onClick="<%=addProject.toString()%>" value="add-project" />

<table class='table table-bordered table-hover table-striped' style='width: 100%;'>
  <thead class="table-columns">
    <tr>
      <th class="table-first-header"><liferay-ui:message key="project-name" /></th>
      <th><liferay-ui:message key="project-leader" /></th>
      <th><liferay-ui:message key="project-status" /></th>
      <th class="table-last-header"><liferay-ui:message key="operations" /></th>
    </tr>
  </thead> 
 
  <tbody class="table-data">

    <c:forEach var="project" items="${projects}">

      <portlet:renderURL var="editProjectURL">
        <portlet:param name="mvcPath" value="/html/project/editProject.jsp" />
        <portlet:param name="projectId" value="${project.projectId}" />
        <portlet:param name="projectName" value="${project.projectName}" />
        <portlet:param name="projectStatus" value="${project.projectStatus}" />
        <portlet:param name="projectLeader" value="${project.projectLeader}" />
      </portlet:renderURL>
  
      <portlet:actionURL name="deleteProject" var="deleteProjectURL">
        <portlet:param name="projectId" value="${project.projectId}" />
      </portlet:actionURL>

      <tr>
        <td class="table-cell first">${project.projectName}</td>
        <td class="table-cell table-sortable-column">${project.projectLeader}</td>
        <td class="table-cell table-sortable-column"><liferay-ui:message key="${project.projectStatus}" /></td>
        <td class="table-cell last">
          <aui:button onClick="<%=editProjectURL.toString()%>" value="edit-project" /> 
          <aui:button onClick="<%=deleteProjectURL.toString()%>" value="delete-project" />
        </td>
      </tr>
    </c:forEach>
  </tbody>
</table>


 