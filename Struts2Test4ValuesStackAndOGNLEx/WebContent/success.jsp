<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<b> Here instead of $ # can also be used.</b>

Class Instance
<pre>
${name}
${email}
${address}
</pre>


Request Scope
<pre>
${reqname}
${reqemail}
${reqaddress}
</pre>


Session Scope
<pre>
${ssnname}
${ssnemail}
${ssnaddress}
</pre>


Context Scope
<pre>
${scname}
${scemail}
${scaddress}
</pre>

ValueStack Scope
<pre>
${vsname}
${vsemail}
${vsaddress}
</pre>







</body>
</html>