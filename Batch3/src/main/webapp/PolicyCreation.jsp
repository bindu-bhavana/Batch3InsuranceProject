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
<c:forEach var="pq" items="${PolicyQuestionsList}"> 
<tr>
<td>${pq.policyQuestionDescription}</td>
</tr>
<tr>
<td><input type="radio" value=${pq.policyQuestionId}></td><td>${pq.policyQuestionAnswer1}</td>
<td>${pq.policyQuestionAnswer2}</td>
<td>${pq.policyQuestionAnswer3}</td>
</tr>
<td><a href="UpdateEmployee?empcode=${emp.empcode}">Update</a></td>
<td><a href="DeleteEmployee?empcode=${emp.empcode}">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>