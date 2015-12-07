<%@include file="/html/init.jsp"%>

<table class='table table-bordered table-hover table-striped' style='width: 100%;'>
  <thead class="table-columns">
    <tr>
      <th class="table-first-header">Project Name</th>
      <th>Project Leader</th>
      <th>Budget Name</th>
      <th>Budget Start Year</th>
      <th>Budget End Year</th>
      <th>Budget Total</th>
      <th>Budget Arrival</th>
      <th>Budget Used</th>
      <th>Budget Left</th>
      <th class="table-last-header">Operations</th>
    </tr>
  </thead>

  <tbody class="table-data">

    <c:forEach var="report" items="${reports}">

      <portlet:renderURL var="viewBudgetSummaryURL">
        <portlet:param name="mvcPath" value="/html/querybudget/viewSummary.jsp" />
        <portlet:param name="budgetId" value="${report.budgetId}" />
      </portlet:renderURL>
 
      <portlet:renderURL var="viewBudgetDetailURL">
        <portlet:param name="mvcPath" value="/html/querybudget/viewDetail.jsp" />
        <portlet:param name="budgetId" value="${report.budgetId}" />
      </portlet:renderURL>

      <tr>
        <td class="table-cell first">${report.projectName}</td>
        <td class="table-cell table-sortable-column">${report.projectLeader}</td>
        <td class="table-cell table-sortable-column">${report.budgetName}</td>
        <td class="table-cell table-sortable-column">${report.budgetStartYear}</td>
        <td class="table-cell table-sortable-column">${report.budgetEndYear}</td>
        <td class="table-cell table-sortable-column">${report.budgetTotal}</td>
        <td class="table-cell table-sortable-column">${report.budgetArrival}</td>
        <td class="table-cell table-sortable-column">${report.budgetUsed}</td>
        <td class="table-cell table-sortable-column">${report.budgetLeft}</td>
        <td class="table-cell last">
          <aui:button onClick="<%=viewBudgetSummaryURL.toString()%>" value="view summary" /> 
          <aui:button onClick="<%=viewBudgetDetailURL.toString()%>" value="view details" />
        </td>
      </tr>
    </c:forEach>
  </tbody>
</table>


