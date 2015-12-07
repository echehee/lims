<%@ include file="/html/budget/init.jsp"%>

<portlet:renderURL var="viewURL">
  <portlet:param name="mvcPath" value="/html/budget/view.jsp" />
</portlet:renderURL>

<portlet:actionURL name="addBudget" var="addBudgetURL" />

<aui:form action="<%=addBudgetURL%>" name="<portlet:namespace />lims">

  <aui:fieldset>

    <aui:select label="Project" name="projectName">
    <%
      List<String> names = ProjectLocalServiceUtil.getProjectNames();
      for(String name : names){
        boolean selected = false;
    %>
        <aui:option label="<%=name%>" value="<%=name%>" selected="<%=selected%>" />
    <%
      }
    %>
    </aui:select>

    <aui:input label="Budget Name" name="budgetName" />
    <aui:input label="Budget Start Year" name="budgetStartYear" />
    <aui:input label="Budget End Year" name="budgetEndYear" />
    <aui:input label="Budget Total" name="budgetTotal" />
  </aui:fieldset>

  <table class='table table-bordered table-hover table-striped' style='width: 100%;'>
    <thead class="table-columns">
      <tr>
        <th class="table-first-header">Account Item Code</th>
        <th>Account Item Name</th>
        <th align="right" class="table-last-header">Budget</th>
      </tr>
    </thead>

    <tbody class="table-data">
      <c:forEach var="accountItem" items="${accountItems}">
        <tr>
          <td class="table-cell first">${accountItem.itemCode}</td>
          <td class="table-cell table-sortable-column">${accountItem.name}</td>
          <td class="table-cell last"><aui:input type="text" label=""
              name="${accountItem.name}" /></td>
        </tr>
      </c:forEach>
    </tbody>
  </table>




  <aui:button-row>
    <aui:button type="submit" />
    <aui:button type="cancel" onClick="<%= viewURL.toString() %>" />
  </aui:button-row>

</aui:form>