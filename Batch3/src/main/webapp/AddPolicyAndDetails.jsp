<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Policy adding page</title>
</head>
<body style="background-color:snow;">
<center><caption><h2>ADD POLICY AND DETAILS</h2></caption></center>
<table align="center">
<form action="AddPolicy" method="post">
<tr colspan="2">
<td><center><input type="Submit" value="Add Policy" style="background-color:mistyrose; height: 75px; width: 150px; left: 250; top: 250;"></center></td>
<td><center><h2>${message}</h2></center></td>
</form>
</tr>
<br>
<br>
<form action="AddPolicyDetails" method="post">
<tr colspan="2">
<td><center><input type="Submit" value="Add Policy Details" style="background-color:mistyrose; height: 75px; width: 150px; left: 250; top: 250;"></center></td>
<td><center><h2>${message1}</h2></center></td>
</tr>
</form>
</table>
</body>
</html>