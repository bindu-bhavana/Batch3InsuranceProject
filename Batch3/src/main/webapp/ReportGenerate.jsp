<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<form action="ReportGeneration" method="post">
<table align="center">
<br>
<tr>
<h2> Policies Available</h2>
<ol>
<li>Business-Auto(BS1)
<li>Restaurant(BS2)
<li>Apartment(BS3)
<li>Merchant(BS4)
</ol>
</tr>
<caption><h2><i>Enter Account Number</i></h2></caption>
<tr>
<td>Account Number</td>
<td><input type="text" name="accountNumber" style="border-radius: 5em;" required></td>
</tr>
</table>
<br>
<input type="submit" class="submit" align="center" value="Submit">
<center><h2 style="color:#9C27B0;">${message}</h2></center>
</form>
</body>
</html>