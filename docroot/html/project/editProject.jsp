<%@ include file="/html/init.jsp"%>

<portlet:renderURL var="viewURL">
  <portlet:param name="mvcPath" value="/html/project/view.jsp" />
</portlet:renderURL>

<portlet:actionURL name="editProject" var="editProjectURL" >
  <portlet:param name="projectId" value="${projectId}" />
</portlet:actionURL>

<aui:form action="<%=editProjectURL%>" name="<portlet:namespace />lims">

  <aui:fieldset>
    <aui:input label="project-name" name="projectName" readonly="true" />
    <aui:input label="project-leader" name="projectLeader">
      <aui:validator name="required" />
    </aui:input>
    <aui:select label="project-status" name="projectStatus">
      <%
        String[] states = ProjectStatus.status;
        for (String s : states) {
          boolean selected = false;
      %>
        <aui:option label="<%=s%>" value="<%=s%>" selected="<%=selected%>" />
      <%
        }
      %>
    </aui:select>
  </aui:fieldset>

  <aui:button-row>
    <aui:button type="submit" />
    <aui:button type="cancel" onClick="<%= viewURL.toString() %>" />
  </aui:button-row>

</aui:form>