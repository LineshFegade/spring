<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Train Information</title>
<style type="text/css">
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 5px solid #dddddd;
  text-align: left;
  padding: 8px;
  color: blue;
}

tr:nth-child(odd) {
  background-color: #dddddd;
  color: Red;
}
</style>
</head>
<body>
<form action="">
<center>
<fieldset>
<legend><b><i>TRAIN DETAILS</i></b></legend>
<table>
	<tr>
	<th>Train Number</th>
	<td>${traininfo.trainNo}</td>
	</tr>
	
	<tr>
	<th>Train Name</th>
	<td>${traininfo.trainName}</td>
	</tr>
	
	
	<tr>
	<th>source</th>
	<td>${traininfo.source}</td>
	</tr>
	
	<tr>
	<th>Destination</th>
	<td>${traininfo.destination}</td>
	</tr>
	
	<tr>
	<th>Time</th>
	<td>${traininfo.time}</td>
	</tr>
	</table>
</center>
</form>
</body>
</html>