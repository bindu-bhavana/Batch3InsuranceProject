<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Business Segment Selection</title>
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
<br>
<div style="float:left">
<button type="button" name="back" style="border-radius: 5em; background: linear-gradient(to right, #9C27B0, #E040FB); background-color:#9C27B0; color:white;" onclick="history.go(-2)">Home page</button>
</div>
<div style="float:right">
<button type="button" name="back" style="border-radius: 5em; background: linear-gradient(to right, #9C27B0, #E040FB); background-color:#9C27B0; color:white;" onclick="history.back()">Go back</button>
</div>
<form action="PolicyCreation" method="post">
<table align="center">
<caption><h2><i>Select Business Segment</i></h2></caption>
<tr>
<td>Username</td>
<td><input type="text" style="border-radius: 5em;" name="username"></td>
</tr>
<tr>
<td>Business-Segment</td>
<td><select name="businessSegment" style="border-radius: 5em;" required>
  <option> </option>
  <option value="BS1">Business Auto</option>
  <option value="BS2">Restaurant</option>
  <option value="BS3">Apartment</option>
  <option value="BS4">General Merchant</option>
</select>
</td>
</tr>
</table>
<br>
<input type="submit" class="submit" align="center" value="Submit">
</form>
</body>
</html>