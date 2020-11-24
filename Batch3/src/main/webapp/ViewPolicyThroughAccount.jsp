<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<form action="GetAnswersByPolicyNumber" method="post">
<table align="center">
<caption><h2>Please confirm your account number</h2></caption>
<tr>
<td>Account Number</td>
<td><input type="text" name="accountNumber" required></td>
</tr>
</table>
<br>
<center><input type="submit" name="submit" value="Submit"></center>
</body>
</html>