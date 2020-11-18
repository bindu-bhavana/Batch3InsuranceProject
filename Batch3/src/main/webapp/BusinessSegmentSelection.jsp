<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Business Segment Selection</title>
</head>
<body style="background-color:snow;">
<form action="PolicyCreation" method="post">
<table align="center">
<caption><h2>Select Business Segment</h2></caption>
<tr>
<td>Business-Segment</td>
<td><select name="businessSegment" onchange='this.form.submit()' required>
  <option> </option>
  <option value="BS1">Business Auto</option>
  <option value="BS2">Restaurant</option>
  <option value="BS3">Apartment</option>
  <option value="BS4">General Merchant</option>
</select>
</td>
</tr>
</table>
<br>
</form>
</body>
</html>