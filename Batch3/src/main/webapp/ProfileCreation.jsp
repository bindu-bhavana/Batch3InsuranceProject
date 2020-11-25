<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Creation Page</title>
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
<button type="button" name="back" style="border-radius: 5em; background-color:#9C27B0; color:white;" onclick="history.go(-2)">Go back</button>
</div>
<form action="CreateUser" method="post">
<table align="center" cellpadding="5">
<caption><h2><i>NEW PROFILE</i></h2></caption>
<tr>
<td>Username</td>
<td><input type="text" name="username" style="border-radius: 5em;" required></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password" style="border-radius: 5em;" required></td>
</tr>
<tr>
<td>Confirm Password</td>
<td><input type="password" name="cpassword" style="border-radius: 5em;" required></td>
</tr>
<tr>
<td>Role-Code</td>
<td><select name="rolecode" style="border-radius: 5em;" required>
  <option> </option>
  <option value="111">Admin</option>
  <option value="222">Agent</option>
  <option value="333">Customer</option>
</select>
</td>
</table>
<br>
<input type="submit" class="submit" align="center" value="Sign Up">
</form>
<center><h2 style="color:#9C27B0;">${message}</h2></center>
</body>
</html>