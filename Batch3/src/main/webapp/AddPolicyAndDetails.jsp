<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Policy adding page</title>
</head>
<body style="background-color:snow;">
<div style="float:down">
<label style="color:#9C27B0;"><b>Insurance Quote Generation</b></label>
</div>
<div style="float:right">
<button type="button" style="border-radius: 5em; background-color:#9C27B0; color:white;" name="back" onclick="history.go(-6)">Go back</button>
</div>
<table align="center">
<center><caption><h2><i>Add Policy Details</i></h2></caption></center>
<form action="AddPolicy" method="post">
<td><center><input type="Submit" value="Add Policy" style="border-radius: 5em; background-color:#9C27B0; color:white; height: 75px; width: 150px; left: 250; top: 250;"></center></td>
<td><center><h2>${message}</h2></center></td>
</form>
</tr>
<br>
<br>
<form action="AddPolicyDetails" method="post">
<td><center><input type="Submit" value="Add Policy Details" style="border-radius: 5em; background-color:#9C27B0; color:white; height: 75px; width: 150px; left: 250; top: 250;"></center></td>
<td><center><h2>${message1}</h2></center></td>
</tr>
</form>
</table>
</body>
</html>