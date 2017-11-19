<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<%-- <%@ taglib prefix="sx" uri="/struts-dojo-tags" %> --%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Struts2 Ajax Test with Ajax Tags</title>
</head>
<body>
<h3>Struts2 Ajax Test with Ajax Tags</h3>

<s:form>
	<sx:autocompleter label="Ratings" list="{'1', '2', '3', '4', '5', '6', '7', '8', '9', '10'}" />
	<br />
	<sx:datetimepicker name="chosenDate" label="Pick the date" displayFormat="dd/MM/yyyy" />
	<br />
	<s:url id="url1" value="/test.action" />
	
	<sx:div href="%{#url}" delay="2000" label="Initial Content" />
	<br />
	
	<sx:tabbedpanel id="tabContainer" >
		<sx:div label="tab1" />
		<sx:div label="tab2" />
	</sx:tabbedpanel>
</s:form>

</body>
</html>