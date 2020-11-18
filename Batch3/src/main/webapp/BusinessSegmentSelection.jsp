<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td>Business-Segment</td>
<td><select name="businessSegment" required>
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
<center><input type="submit" value="Submit"></center>
</body>
</html>