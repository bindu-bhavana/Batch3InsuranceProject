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
<label><b>Insurance Quote Generation</b></label>
</div>
<div style="float:right">
<button type="button" name="back" onclick="history.back()">Go back</button>
</div>
<table align="center">
<caption style="color:red;"><h1>Policy Details</h1></caption>
<br>
<tr>
<td><center><h3>Your Policy Number: ${policyNumber}</h3></center></td>
</tr>
<tr>
<td><center><h3>Proposed Premium: ${totalPremium}</h3></center></td>
</tr>
</table>
</body>
</html>