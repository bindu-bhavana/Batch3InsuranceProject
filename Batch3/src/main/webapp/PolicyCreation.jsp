<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Policy Creation Page</title>
<style>
    .submit {
      cursor: pointer;
        border-radius: 5em;
        color: #fff;
        background: linear-gradient(to right, #9C27B0, #E040FB);
        border: 0;
        padding-left: 40px;
        padding-right: 40px;
        padding-bottom: 10px;
        padding-top: 10px;
        font-family: 'Ubuntu', sans-serif;
        margin-left: 35%;
        font-size: 13px;
        box-shadow: 0 0 20px 1px rgba(0, 0, 0, 0.04);
    }
</style>
</head>
<body style="background-color:snow;">
<div style="float:down">
<label style="color:#9C27B0;"><b>Insurance Quote Generation</b></label>
</div>
<div style="float:right">
<button type="button" style="border-radius: 5em; background-color:#9C27B0; color:white;" name="back" onclick="history.back()">Go back</button>
</div>
<table align="center" cellpadding="5">
<caption><h2><i>Policy Creation</i></h2></caption>
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
<input type="submit" class="submit" align="center" value="Calculate Premium">
</form>
<br>
<center><h2>Proposed Premium: ${Total}</h2></center>
<center><a href="AddPolicyAndDetails.jsp">Click here to finish</a></center>
</body>
</html>