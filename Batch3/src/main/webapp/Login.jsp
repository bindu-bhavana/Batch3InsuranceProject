<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insurance Login Page</title>
</head>
<body style="background-color:powderblue;">
<form action="GetUserByName" method="post">
<table align="center" cellpadding="5">
<caption><h2>LOGIN</h2></caption>
<tr>
<td>Username</td>
<td><input type="text" name="username"></td>
</tr>
<tr>
<td>Password</td>
<td>
<input type="password" name="password">
</td>
</tr>
</table>
<br>
<center><input type="submit" value="Sign In"></center>
<br>
<center><h4 style="color:red">${message}</h4></center>
</form>
</body>
</html>