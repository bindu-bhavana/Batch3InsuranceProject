<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
<div style="float:right">
<button type="button" name="back" onclick="history.back()">Go back</button>
</div>
<form action="ReportGeneration" method="post">
<table align="center">
<tr>
<h2> Policies Available</h2>
<ol>
<li>Business-Auto(BS1)
<li>Restaurant(BS2)
<li>Apartment(BS3)
<li>Merchant(BS4)
</ol>
</tr>
<caption><h2>Enter Account Number</h2></caption>
<tr>
<td>Account Number</td>
<td><input type="text" name="accountNumber" required></td>
</tr>
</table>
<br>
<center><input type="submit" name="submit" value="Generate Report"></center>
<center><h2>${message}</h2></center>
</body>
</html>