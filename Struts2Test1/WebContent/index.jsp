<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<s:head />
<script type="text/javascript">
	
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<body>
	<h3>Home Page</h3>


	<s:form action="/StrTest/getTut1" method="post"
		enctype="multipart/form-data">


		<h1>Form Tags - Simple</h1>

		<s:div>Sample Form</s:div>

		<s:text name="This is basic Struts2 Application." />

		<s:hidden name="hiddenValue" value="dontshareopenly" />

		<s:textfield name="from" key="From" requiredLabel="required"
			tooltip="Please enter from" />

		<s:password name="password" key="password" />

		<s:textfield name="To" key="emailTo" />

		<s:textfield name="To" key="emailTo" />

		<s:textarea name="body" key="emailBody" />

		<!-- <h1>Group/Select Tags - Group - Start</h1> -->

		<s:radio label="Gender" name="gender" list="{'M', 'F', 'Other'}" />

		<s:checkbox label="Devices" name="devices" />

		<s:checkboxlist label='Deviecs' name="label"
			list="{'TV', 'FRIDGE', 'LAPTOP'}" />

		<s:select label="Country" name="country"
			list="{'India', 'USA', 'UK', 'CANADA'}" />

		<s:select name="username" label="Username"
			list="{'Mike','John','Smith'}" />



		<s:select label="Office" name="mySelection" value="%{'TamilNadu'}"
			list="%{#{'TamilNadu':'TamilNadu'}}">

			<s:optgroup label="Gujarat"
				list="%{#{'Rajkjot':'Rajkjot','Abd':'Abd'}}" />

			<s:optgroup label="Maharastra"
				list="%{#{'Mumbai':'Mumbai','NM':'NM','Nagpur':'Nagpur'}}" />
		</s:select>

		<s:combobox label="day" name="day"
			list="#{'sunday':'sunday', 'monday':'monday', 'tuesday':'tuesday'}"
			headerKey="1" headerValue="--select--" value="tuesday" />

		<s:doubleselect label="Skills" name="skills1"
			list="{'Cpp', 'java'}" doubleName="skills2"
			doubleList="top == 'Cpp' ?   
         {'M1', 'M2'} : {'Safe', 'Secure'}" />

		<!-- <h1>Group/Select Tags - Group - End</h1> -->

		<s:label name="attachment" key="attachment" />

		<s:file name="file" accept="text/html, text/plain" />

		<s:token />

		<s:submit value="Okay, Click here " />

	</s:form>

</body>
</html>