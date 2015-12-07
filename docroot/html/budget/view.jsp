<%@include file="/html/budget/init.jsp"%>

<portlet:renderURL var="addBudgetURL">
  <portlet:param name="mvcPath" value="/html/budget/addBudget.jsp" />
</portlet:renderURL>

<aui:button onClick="<%=addBudgetURL.toString()%>" value="add budget" />

<table class='table table-bordered table-hover table-striped' style='width: 100%;'>
  <thead class="table-columns">
    <tr>
      <th class="table-first-header">Project Name</th>
      <th>Budget Name</th>
      <th>Budget Start Year</th>
      <th>Budget End Year</th>
      <th>Budget Total</th>
      <th class="table-last-header">Operations</th>
    </tr>
  </thead>

  <tbody class="table-data">

    <c:forEach var="budget" items="${budgets}">
      <portlet:renderURL var="budgetDetailURL">
        <portlet:param name="mvcPath" value="/html/budget/budgetDetail.jsp" />
        <portlet:param name="budgetId" value="${budget.budgetId}" />
      </portlet:renderURL>

      <portlet:renderURL var="editBudgetURL">
        <portlet:param name="mvcPath" value="/html/budget/editBudget.jsp" />
        <portlet:param name="budgetId" value="${budget.budgetId}" />
        <portlet:param name="projectName" value="${budget.projectName}" />
        <portlet:param name="budgetName" value="${budget.budgetName}" />
        <portlet:param name="budgetStartYear" value="${budget.budgetStartYear}" />
        <portlet:param name="budgetEndYear" value="${budget.budgetEndYear}" />
      </portlet:renderURL>

      <portlet:actionURL name="deleteBudget" var="deleteBudgetlURL">
        <portlet:param name="budgetId" value="${budget.budgetId}" />
      </portlet:actionURL>

      <tr>
        <td class="table-cell first">${budget.projectName}</td>
        <td class="table-cell table-sortable-column">${budget.budgetName}</td>
        <td class="table-cell table-sortable-column">${budget.budgetStartYear}</td>
        <td class="table-cell table-sortable-column">${budget.budgetEndYear}</td>
        <td class="table-cell table-sortable-column">${budget.budgetTotal}</td>

        <td class="table-cell last"><aui:button onClick="<%=budgetDetailURL.toString()%>"
            value="view details" /> <aui:button onClick="<%=editBudgetURL.toString()%>"
            value="edit budget" /> <aui:button onClick="<%=deleteBudgetlURL.toString()%>"
            value="delete budget" /></td>
      </tr>
    </c:forEach>
  </tbody>
</table>

