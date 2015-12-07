<%@include file="/html/init.jsp"%>

<portlet:renderURL var="addAccountItem">
  <portlet:param name="mvcPath" value="/html/accountitem/addAccountItem.jsp" />
</portlet:renderURL>

<aui:button onClick="<%=addAccountItem.toString()%>" value="Add account item" />

<table class='table table-bordered table-hover table-striped' style='width: 100%;'>
  <thead class="table-columns">
    <tr>
      <th class="table-first-header">Account Item Code</th>
      <th>Account Item Name</th>
      <th>Account Item Parent</th>
      <th class="table-last-header">Operations</th>
    </tr>
  </thead>

  <tbody class="table-data">

    <c:forEach var="item" items="${items}">

      <portlet:renderURL var="editAccountItemURL">
        <portlet:param name="mvcPath" value="/html/accountitem/editAccountItem.jsp" />
        <portlet:param name="accountItemId" value="${item.accountItemId}" />
        <portlet:param name="itemCode" value="${item.itemCode}" />
        <portlet:param name="name" value="${item.name}" />
        <portlet:param name="parentName" value="${item.parentName}" />
      </portlet:renderURL>
 
      <portlet:actionURL name="deleteAccountItem" var="deleteAccountItemURL">
        <portlet:param name="accountItemId" value="${item.accountItemId}" />
      </portlet:actionURL>

      <tr>
        <td class="table-cell first">${item.itemCode}</td>
        <td class="table-cell table-sortable-column">${item.name}</td>
        <td class="table-cell table-sortable-column">${item.parentName}</td>
        <td class="table-cell last"><aui:button onClick="<%=editAccountItemURL.toString()%>"
            value="edit item" /> <aui:button onClick="<%=deleteAccountItemURL.toString()%>"
            value="delete item" /></td>
      </tr>
    </c:forEach>
  </tbody>
</table>


