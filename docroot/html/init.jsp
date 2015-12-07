<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="java.util.List" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>

<%@ page import="com.startarget.portlet.model.AccountItem" %>
<%@ page import="com.startarget.portlet.service.AccountItemLocalServiceUtil" %>

<%@ page import="com.startarget.portlet.model.Budget" %>
<%@ page import="com.startarget.portlet.service.BudgetLocalServiceUtil" %>

<%@ page import="com.startarget.portlet.model.Project" %>
<%@ page import="com.startarget.portlet.service.ProjectLocalServiceUtil" %>

<%@ page import="com.startarget.portlet.service.ProjectLocalServiceUtil" %>

<%@ page import="com.startarget.portlet.businesslogic.ProjectStatus" %>

<portlet:defineObjects />
<theme:defineObjects />