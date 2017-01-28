<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
</head>
<body>
    <h1>Welcome to Registration Page</h1><br /><br />
    <h2><s:property value="message" /></h2>
    
    <s:form name="frm1" method="post" action="savedetails">
		<s:textfield label="Enter full name" name="fullname" />
		<s:textfield label="Enter City" name="city" />
		<s:textfield label="Enter your gender" name="geder" />
		<s:textfield label="Enter Tel number" name="telnum" />
		<s:textfield label="Enter your department" name="dep" />
		<s:textfield label="Enter your Username" name="uname" />
		<s:textfield label="Enter your Password" name="password" />
		<s:submit value="Register" />
		<s:reset value="Reset" />
		
    </s:form>
    
</body>
</html>