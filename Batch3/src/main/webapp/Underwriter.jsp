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
<label style="color:#9C27B0;"><b>Insurance Quote Generation</b></label>
</div>
<br>
<div style="float:right">
<form align="right" action="Login.jsp" method="post">
<label>
  <input name="submit2" type="submit" style="border-radius: 5em; background: linear-gradient(to right, #9C27B0, #E040FB); background-color:#9C27B0; color:white;" value="log out">
  </label>
</form>
</div>
<center><caption><h2><i>Welcome Admin</i></h2></caption></center>
<div style="float:center">
<table align="center" cellpadding="5">
<tr>
<form action="ProfileCreation.jsp" method="post">
<td><input type="submit" value="Create Profile" style="background-color:#9C27B0; background: linear-gradient(to right, #9C27B0, #E040FB); border-radius: 5em; color:white; height: 75px; width: 150px; left: 250; top: 250;"></td>
</form>
<form action="AccountCreation.jsp" method="post">
<td><input type="submit" value="Create Account" style="background-color:#9C27B0; background: linear-gradient(to right, #9C27B0, #E040FB); border-radius: 5em; color:white; height: 75px; width: 150px; left: 250; top: 250;"></td>
</form>
<form action="BusinessSegmentSelection.jsp" method="post">
<td><input type="submit" value="Create Policy" style="background-color:#9C27B0; background: linear-gradient(to right, #9C27B0, #E040FB); border-radius: 5em; color:white; height: 75px; width: 150px; left: 250; top: 250;"></td>
</form>
<form action="ViewPolicyThroughAccount.jsp" method="post">
<td><input type="submit" value="View Policy" style="background-color:#9C27B0; background: linear-gradient(to right, #9C27B0, #E040FB); border-radius: 5em; color:white; height: 75px; width: 150px; left: 250; top: 250;"></td>
</form>
<form action="ReportGenerate.jsp" method="post">
<td><input type="submit" value="Generate Report" style="background-color:#9C27B0; background: linear-gradient(to right, #9C27B0, #E040FB); border-radius: 5em; color:white; height: 75px; width: 150px; left: 250; top: 250;"></td>
</form>
</tr>
</table>
</div>
</body>
</html>