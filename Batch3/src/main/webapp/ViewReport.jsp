<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:snow;">
<div style="float:down">
<label><b>Insurance Quote Generation</b></label>
</div>
<form action="ReportGeneration">
<div style="float:right">
<button type="button" name="back" onclick="history.back()">Go back</button>
</div>
<table align="center">
<caption><h2>REPORT</h2></caption>
</table>
<table align="center">
<caption><h3>Insured Details</h3></caption>
<%!int count=0; %>
<c:forEach var="rg" items="${Report}" >
<%if(count==0){%>
<tr>
<td><b>Insured Name</b></td>
<td>${rg.insuredName}</td>
</tr>
<tr>
<td><b>Insured Street</b></td>
<td>${rg.insuredStreet}</td>
</tr>
<tr>
<td><b>Insured City</b></td>
<td>${rg.insuredCity}</td>
</tr>
<tr>
<td><b>Insured State</b></td>
<td>${rg.insuredState}</td>
</tr>
<tr>
<td><b>Insured Zip</b></td>
<td>${rg.insuredZip}</td>
</tr>
<tr>
<td><b>Business Segment</b></td>
<td>${rg.businessSegment}</td>
<tr>
<td><b>Total Premium</b></td>
<td>${rg.totalPremium}</td>
</tr>
<%count++; %>
<%} %>
</c:forEach>
</table>
<table align="center">
<caption><h3>Selected Options</h3></caption>
<th>Questions Description</th>
<th>Answer</th>
<c:forEach var="rg1" items="${Report}"> 
<tr>
<td>${rg1.questionDescription}</td>
<td>${rg1.answer}</td>
</tr>
</c:forEach>
</table>
</form>
</body>
</html>