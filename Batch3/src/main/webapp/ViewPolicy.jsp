<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Policy Page</title>
</head>
<body  style="background-color:snow;">
<div style="float:down">
<label style="color:#9C27B0;"><b>Insurance Quote Generation</b></label>
</div>
<div style="float:right">
<button type="button" style="border-radius: 5em; background-color:#9C27B0; color:white;" name="back" onclick="history.go(-2)">Go back</button>
</div>
<table align="center">
<caption><h1 style="color:#9C27B0;"><i>Policy Details</i></h1></caption>
<br>
<tr>
<td><center><h3><b>Username:</b> ${username}</h3></center></td>
</tr>
<tr>
<td><center><h3><b>Policy Number:</b> ${policyNumber}</h3></center></td>
</tr>
<tr>
<td><center><h3><b>Proposed Premium:</b> ${totalPremium}</h3></center></td>
</tr>
</table>
</body>
</html>