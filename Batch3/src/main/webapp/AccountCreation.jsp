<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Creation</title>
</head>
<body style="background-color:beige;">
<form action="CreateAccount" method="post">
<table align="center" cellpadding="5">
<caption><h2>CREATE ACCOUNT</h2></caption>
<tr>
<td>Insured Name</td>
<td><input type="text" name="insuredName" required></td>
</tr>
<tr>
<td>Insured Street</td>
<td><input type="text" name="insuredStreet" required></td>
</tr>
<tr>
<td>Insured City</td>
<td><input type="text" name="insuredCity" required></td>
</tr>
<tr>
<td>Insured State</td>
<td><input type="text" name="insuredState" required></td>
</tr>
<tr>
<td>Insured Zip</td>
<td><input type="number" name="insuredZip" min="100000" max="999999" required></td>
</tr>
<tr>
<td>Business-Segment</td>
<td><select name="businessSegment" required>
  <option> </option>
  <option value="BS1">Business Auto</option>
  <option value="BS2">Restaurant</option>
  <option value="BS3">Apartment</option>
  <option value="BS4">General Merchant</option>
</select>
</td>
</tr>
<tr>
<td>Username</td>
<td><input type="text" name="username" required></td>
</tr>
</table>
<br>
<center><input type="submit" value="Create Account"></center>
</form>
</body>
</html>