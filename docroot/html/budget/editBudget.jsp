<%@ include file="/html/budget/init.jsp"%>

<portlet:renderURL var="viewURL">
  <portlet:param name="mvcPath" value="/html/budget/view.jsp" />
</portlet:renderURL>

<portlet:actionURL name="editBudget" var="editBudgetURL">
  <portlet:param name="budgetId" value="${currentBudget.budgetId}" />
</portlet:actionURL>

<aui:form action="<%=editBudgetURL%>" name="<portlet:namespace />lims">

  <aui:fieldset>
    <aui:input label="Project Name" name="projectName" value="${currentBudget.projectName}" />
    <aui:input label="Budget Name" name="budgetName" value="${currentBudget.budgetName}" />
    <aui:input label="Budget Start Year" name="budgetStartYear" value="${currentBudget.budgetStartYear}" />
    <aui:input label="Budget End Year" name="budgetEndYear" value="${currentBudget.budgetEndYear}" />
    <aui:input label="Budget Total" name="budgetTotal" value="${currentBudget.budgetTotal}" />
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
      <c:forEach var="budgetItem" items="${budgetItems}">
        <tr>
          <td class="table-cell first">${budgetItem.itemCode}</td>
          <td class="table-cell">${budgetItem.accountItemName}</td>
          <td class="table-cell last">
            <aui:input label="" name="${budgetItem.accountItemName}" value="${budgetItem.budgetTotal}" />
            <!-- 
            <aui:input type="text" label="" name="${budgetItem.budgetTotal}" />
             -->
          </td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
  
  <aui:button-row>
    <aui:button type="submit" />
    <aui:button type="cancel" onClick="<%= viewURL.toString() %>" />
  </aui:button-row>

</aui:form>