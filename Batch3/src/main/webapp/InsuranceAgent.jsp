<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insurance Agent Page</title>
</head>
<body style="background-color:snow;">
<div style="float:down">
<label><b>Insurance Quote Generation</b></label>
</div>
<div style="float:right">
<form align="right" action="Login.jsp" method="post">
<label>
  <input name="submit2" type="submit" value="log out">
  </label>
</form>
</div>
<center><caption style="color:red;"><h2>Welcome Agent</h2></caption></center>
<table align="center" cellpadding="5">
<tr>
<form action="AccountCreation.jsp" method="post">
<td><input type="submit" value="Create Account" style="background-color:mistyrose; height: 75px; width: 150px; left: 250; top: 250;"></td>
</form>
<form action="BusinessSegmentSelection.jsp" method="post">
<td><input type="submit" value="Create Policy" style="background-color:mistyrose; height: 75px; width: 150px; left: 250; top: 250;"></td>
</form>
<form action="ViewPolicyThroughAccount.jsp" method="post">
<td><input type="submit" value="View Policy" style="background-color:mistyrose; height: 75px; width: 150px; left: 250; top: 250;"></td>
</form>
</tr>
</table>
</body>
</html>