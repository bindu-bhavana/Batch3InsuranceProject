<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Creation Page</title>
</head>
<body style="background-color:snow;">
<div style="float:down">
<label><b>Insurance Quote Generation</b></label>
</div>
<div style="float:right">
<button type="button" name="back" onclick="history.back()">Go back</button>
</div>
<form action="CreateUser" method="post">
<table align="center" cellpadding="5">
<caption><h2>NEW PROFILE</h2></caption>
<tr>
<td>Username</td>
<td><input type="text" name="username" required></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password" required></td>
</tr>
<tr>
<td>Confirm Password</td>
<td><input type="password" name="cpassword" required></td>
</tr>
<tr>
<td>Role-Code</td>
<td><select name="rolecode" required>
  <option> </option>
  <option value="111">Admin</option>
  <option value="222">Agent</option>
  <option value="333">Customer</option>
</select>
</td>
</table>
<br>
<center><input type="submit" value="Sign Up"></center>
</form>
<center><h2>${message}</h2></center>
</body>
</html>