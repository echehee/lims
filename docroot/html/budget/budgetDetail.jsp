<%@ include file="/html/budget/init.jsp"%>

<aui:form name="<portlet:namespace />lims">

  <aui:fieldset>
    <p>
      Project Name: <span><u>${currentBudget.projectName}</u> </span>
    </p>
    <p>
      Budget Name: <span><u>${currentBudget.budgetName}</u> </span>
    </p>
    <p>
      Budget Start Year: <span><u>${currentBudget.budgetStartYear}</u> </span>
    </p>
    <p>
      Budget End Year: <span><u>${currentBudget.budgetEndYear}</u> </span>
    </p>
    <p>
      Budget Total: <span><u>${currentBudget.budgetTotal}</u> </span>
    </p>
  </aui:fieldset>
</aui:form>


<table class='table table-bordered table-hover table-striped' style='width: 100%;'>
  <thead class="table-columns">
    <tr>
      <th class="table-first-header">Account Item Code</th>
      <th>Account Item Name</th>
      <th class="table-last-header">Budget</th>
    </tr>
  </thead>

  <tbody class="table-data">
    <c:forEach var="budgetItem" items="${budgetItems}">
      <tr>
        <td class="table-cell table-sortable-column first">${budgetItem.itemCode}</td>
        <td class="table-cell">${budgetItem.accountItemName}</td>
        <td class="table-cell">${budgetItem.budgetTotal}</td>
      </tr>
    </c:forEach>
  </tbody>
</table>


<portlet:renderURL var="viewURL">
  <portlet:param name="mvcPath" value="/html/budget/view.jsp" />
</portlet:renderURL>

<portlet:renderURL var="editBudgetURL">
  <portlet:param name="mvcPath" value="/html/budget/editBudget.jsp" />
  <portlet:param name="budgetId" value="${currentBudget.budgetId}" />
  <portlet:param name="projectName" value="${currentBudget.projectName}" />
  <portlet:param name="budgetName" value="${currentBudget.budgetName}" />
  <portlet:param name="budgetStartYear" value="${currentBudget.budgetStartYear}" />
  <portlet:param name="budgetEndYear" value="${currentBudget.budgetEndYear}" />
  <portlet:param name="budgetTotal" value="${currentBudget.budgetTotal}" />
</portlet:renderURL>

<portlet:actionURL name="deleteBudget" var="deleteBudgetURL">
  <portlet:param name="budgetId" value="${currentBudget.budgetId}" />
</portlet:actionURL>

<aui:button-row>
  <aui:button value="edit" onClick="<%= editBudgetURL.toString() %>" />
  <aui:button value="delete" onClick="<%= deleteBudgetURL.toString() %>" />
  <aui:button value="cancel" onClick="<%= viewURL.toString() %>" />
</aui:button-row>