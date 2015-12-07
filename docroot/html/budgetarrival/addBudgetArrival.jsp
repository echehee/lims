<%@ include file="/html/budgetarrival/init.jsp"%>

<portlet:renderURL var="viewURL">
  <portlet:param name="mvcPath" value="/html/budgetarrival/view.jsp" />
</portlet:renderURL>

<portlet:actionURL name="addBudgetArrival" var="addBudgetArrivalURL" />

<aui:form action="<%=addBudgetArrivalURL%>" name="<portlet:namespace />lims">

  <aui:fieldset>
    <aui:input label="Operator Id" name="operatorId" />
    <aui:input label="Operator Name" name="operatorName" />
    <aui:input label="Arrival Total" name="arrivalTotal" />


    <aui:select label="Project" name="projectName">
      <%
        List<String> projectNames = ProjectLocalServiceUtil.getProjectNames();
          for (String name : projectNames) {
              boolean selected = false;
      %>
      <aui:option label="<%=name%>" value="<%=name%>" selected="<%=selected%>" />
      <%
        }
      %>
    </aui:select>

    <aui:select label="Budget" name="budgetName">
      <%
        List<String> budgetNames = BudgetLocalServiceUtil.getDistinctBudgetNames();
                for (String name : budgetNames) {
                  boolean selected = false;
      %>
      <aui:option label="<%=name%>" value="<%=name%>" selected="<%=selected%>" />
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