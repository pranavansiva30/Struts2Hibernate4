<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="/struts-tags" prefix="s" %>
<title>Insert title here</title>
</head>
<body>
<table border="0" cellspacing="0" cellpadding="1">
<thead>
<tr>
  <th>Full Name</th>
  <th>City</th>
  <th>Gender</th>
  <th>Telephone No</th>
  <th>Department</th>
</tr>
 </thead>
 <tbody>
<s:iterator value="list" status="rowstatus">
  <tr>
 
      <td><s:property value="fullname"/></td>
      <td><s:property value="city"/></td>
      <td><s:property value="gender"/></td>
      <td><s:property value="telnum"/></td>
      <td><s:property value="dep"/></td>
       </tr>
</s:iterator>
</tbody>
</table>
</body>
</html>