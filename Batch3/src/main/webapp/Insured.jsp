<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insured Page</title>
</head>
<body style="background-color:snow;">
<div style="float:right">
<form align="right" action="Login.jsp" method="post">
<label>
  <input name="submit2" type="submit" value="log out">
  </label>
</form>
</div>
<center><caption><h2>Welcome ${message}</h2></caption></center>
<table align="center" cellpadding="5">
<tr>
<form action="AccountCreation.jsp" method="post">
<td><input type="submit" value="Create Account" style="background-color:mistyrose; height: 75px; width: 150px; left: 250; top: 250;"></td>
</form>
<td><input type="button" value="View Policy" style="background-color:mistyrose; height: 75px; width: 150px; left: 250; top: 250;"></td>
</tr>
</table>
</body>
</html>