<%@ include file="/html/init.jsp"%>

<portlet:renderURL var="viewURL">
  <portlet:param name="mvcPath" value="/html/accountitem/view.jsp" />
</portlet:renderURL>

<portlet:actionURL name="editAccountItem" var="editAccountItemURL">
  <portlet:param name="accountItemId" value="${currentAccountItem.accountItemId}" />
</portlet:actionURL>

<aui:form action="<%=editAccountItemURL%>" name="<portlet:namespace />lims">

  <aui:fieldset>
    <aui:input label="Item Code" name="itemCode" />
    <aui:input label="Name" name="name" />
    <aui:input label="Parent name" name="parentName" />
  </aui:fieldset>

  <aui:button-row>
    <aui:button type="submit" />
    <aui:button type="cancel" onClick="<%= viewURL.toString() %>" />
  </aui:button-row>

</aui:form>