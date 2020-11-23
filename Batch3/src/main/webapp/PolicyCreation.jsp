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
<div style="float:down">
<label><b>Insurance Quote Generation</b></label>
</div>
<div style="float:right">
<button type="button" name="back" onclick="history.back()">Go back</button>
</div>
<table align="center" cellpadding="5">
<caption><h2>Policy Creation</h2></caption>
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
<center><input type="submit" value="Create Policy" style="background-color:mistyrose"></center>
</form>
<br>
<center><h2>Proposed Premium: ${Total}</h2></center>
</body>
</html>