<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>

	<s:form action="loginPage" method="post">

		<!-- way3 Replacing modelObj.fieldName(user.userID and user.password) 
		with only member variable(userID and password) as previous by implementing 
		ModelDriven interface	 -->
		<!-- way2 by appeding ojbect name(user.) with the name(userID) in key attribute-->
		<s:textfield label="Enter UserName" key="user.userID" />
		<s:password label="Password" key="user.password" />
		<s:submit />
	</s:form>


</body>
</html>