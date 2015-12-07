<%@include file="/html/budgetapplication/init.jsp"%>

<portlet:renderURL var="addBudgetApplicationURL">
  <portlet:param name="mvcPath" value="/html/budgetapplication/addBudgetApplication.jsp" />
</portlet:renderURL>

<aui:button onClick="<%=addBudgetApplicationURL.toString()%>" value="Add budget application" />

<table class='table table-bordered table-hover table-striped' style='width: 100%;'>
  <thead class="table-columns">
    <tr>
      <th class="table-first-header">Applicant</th>
      <th>Auditor</th>
      <th>Approver</th>
      <th>Finisher</th>
      <th>Description</th>
      <th>Total</th>
      <th>Project Name</th>
      <th>Budget Name</th>
      <th>Account Item</th>
      <th class="table-last-header">Operations</th>
    </tr>
  </thead>

  <tbody class="table-data">

    <c:forEach var="application" items="${applications}">
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
        <td class="table-cell first">${application.applicantName}</td>
        <td class="table-cell table-sortable-column">${application.auditorName}</td>
        <td class="table-cell table-sortable-column">${application.approverName}</td>
        <td class="table-cell table-sortable-column">${application.finisherName}</td>
        
        <td class="table-cell table-sortable-column">${application.applicationDescription}</td>
        <td class="table-cell table-sortable-column">${application.applicationTotal}</td>
        <td class="table-cell table-sortable-column">${application.projectName}</td>
        <td class="table-cell table-sortable-column">${application.d}</td>
        <td class="table-cell table-sortable-column">${application.finisherName}</td>
        <td class="table-cell table-sortable-column">${application.finisherName}</td>
        <td class="table-cell table-sortable-column">${application.budgetTotal}</td>

        <td class="table-cell last"><aui:button onClick="<%=budgetDetailURL.toString()%>"
            value="view details" /> <aui:button onClick="<%=editBudgetURL.toString()%>"
            value="edit budget" /> <aui:button onClick="<%=deleteBudgetlURL.toString()%>"
            value="delete budget" /></td>
      </tr>
    </c:forEach>
  </tbody>
</table>

