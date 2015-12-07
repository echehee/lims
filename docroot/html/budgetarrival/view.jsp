<%@include file="/html/budgetarrival/init.jsp"%>

<portlet:renderURL var="addBudgetArrival">
  <portlet:param name="mvcPath" value="/html/budgetarrival/addBudgetArrival.jsp" />
</portlet:renderURL>

<aui:button onClick="<%=addBudgetArrival.toString()%>" value="Add budget arrival" />

<table class='table table-bordered table-hover table-striped' style='width: 100%;'>
  <thead class="table-columns">
    <tr>
      <th class="table-first-header">Budget Arrival Date</th>
      <th>Operator Id</th>
      <th>Operator Name</th>
      <th>Budget Arrival Total</th>
      <th>Project Name</th>
      <th class="table-last-header">Budget Name</th>
    </tr>
  </thead>

  <tbody class="table-data">

    <c:forEach var="item" items="${budgetArrivals}">
      <tr>
        <td class="table-cell first">${item.createDate}</td>
        <td class="table-cell table-sortable-column">${item.operatorId}</td>
        <td class="table-cell table-sortable-column">${item.operatorName}</td>
        <td class="table-cell table-sortable-column">${item.arrivalTotal}</td>
        <td class="table-cell table-sortable-column">${item.projectName}</td>
        <td class="table-cell last">${item.budgetName}</td>
      </tr>
    </c:forEach>
  </tbody>
</table>


