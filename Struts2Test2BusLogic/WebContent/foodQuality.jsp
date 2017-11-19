<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Quality of Food</title>
</head>
<body>

	Please choose what to eat,
	<br /> 1. Veg
	<br /> 2. Non-Veg
	<br />

	<!-- Replaced this with Struts tags -->
	<!-- <form action="StrBusService/getBusService" method="post">
	<input id="quality1" name = "quality" />
	<input type="submit" value="Okay!!">
</form> -->


	<s:form action="StrBusService/getBusService" method="post">
		<s:textfield key="quality" label="Enter your choise " />
		<s:submit />
	</s:form>

</body>
</html>