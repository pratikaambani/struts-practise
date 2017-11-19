<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<s:head />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SUCCESSFUL</title>

<body>

	<h3>Success</h3>
	Simple Iterator
	<ol>
		<s:iterator value="listInAction">
			<li><s:property /></li>
		</s:iterator>
	</ol>


	Now if/else
	<br />

	<s:set name="uName" value="userName" />

	<s:if test="%{#uName=='Pratik'}">
		This will be printed from if block
	</s:if>
	<s:elseif test="false">
		That
	</s:elseif>
	<s:else>
		Those
	</s:else>


	Subset Example
	<s:subset source="listInAction" start="2" count="4">
		Values are - <s:property />
	</s:subset>



	Iterator with Iterator Status
	<table>
		<s:iterator value="name" status="userName">
			<tr>
				<s:if test="#userName.even == true">
					<s:property />
				</s:if>

				<s:elseif test="#userName.first == true">
					<s:property /> This is first value
				</s:elseif>

				<s:else>
					<td><s:property /></td>
				</s:else>
			</tr>
		</s:iterator>
	</table>

	<table align="center" border="4">
		<h1>Data Tags</h1>


		<tr>
			<td><b>a and url Tag</b></td>
			<s:url value="http://google.com" var="GoogleURL" />
			<td><s:a href="%{GoogleURL}"> Goooogle </s:a></td>
		</tr>

		<tr>
			<td><b>date Tag</b></td>
			<td><s:date name="customDate" nice="nice" /></td>
			<td><s:date name="customDate" format="DD/MM/YYYY" /></td>
		</tr>

		<tr>
			<td>debug Tag</td>
			<td><s:debug /></td>
		</tr>

		<tr>
			<td>Include Tag</td>
			<td><s:include value="includedpage.jsp" /></td>
		</tr>

		<tr>
			<td>I18N Tag</td>
			<td><s:text name="i18n.msg" /></td>
			<s:i18n name="resources\TestAction" />
			<td><s:text name="i18n.msg" /></td>
		</tr>

		<tr>
			<td>Property Tag</td>
			<td><s:property value="propertyEx" /></td>

			<s:bean name="org.java.strutsTest.TestAction" var="gettingValue" />
			<td><s:property value="#gettingValue.propertyEx" /></td>
		</tr>

		<tr>
			<td>Push Tag</td>
			<s:push value="#gettingValue" />
			<td><s:property value="propertyEx" /></td>
		</tr>

		<tr>
			<td>Set Tag</td>
			<s:set var="thisMsg" value="sampleString" />
			<td><s:property value="thisMsg" /></td>
			<s:set var="hardCodedVal" value="%{'Heellllllllooooooowwww'}"></s:set>
			<td><s:property value="hardCodedVal" /></td>
		</tr>

	</table>

	<table align="center" border="4">
		<h1>Form Tags</h1>

		<s:div>Sample Form</s:div>
		<s:text name="FirstName"></s:text>
		<b> More in index.jsp </b>
	</table>




</body>
</html>