<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Policy Creation Page</title>
</head>
<body style="background-color:snow;">
<table align="center" cellpadding="5">
<caption><h2>Please answer the below Questions!!!</h2></caption>
<form action="GetPolicyQuestions" method="post">
<%!int count=1; %>
<c:forEach var="pq" items="${PolicyQuestionsList}"> 
<tr>
<td><b><%=count %>. ${pq.policyQuestionDescription}</b></td>
</tr>
<tr>
<td><input type="radio" name="Q<%=count%>" value="${pq.policyQuestionWeightage1}" required><label>${pq.policyQuestionAnswer1}</label></td>
<td><input type="radio" name="Q<%=count%>" value="${pq.policyQuestionWeightage2}"><label>${pq.policyQuestionAnswer2}</label></td>
<td><input type="radio" name="Q<%=count%>" value="${pq.policyQuestionWeightage3}"><label>${pq.policyQuestionAnswer3}</label></td>
</tr>
<%count++; %>
</c:forEach>
<%count=1; %>
</table>
<br>
<br>
<center><input type="submit" value="Calculate Premium" style="background-color:mistyrose"></center>
</form>
<br>
<center><label><h2>Proposed Premium: ${premiumValue}</h2></label></center>
</body>
</html>