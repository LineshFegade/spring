<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
fieldset {
	margin-left: 200px;	
	color: red;
		
}
table {
	margin-left: 50px;
	color: red;
}
</style>

</head>
<body>
<form action="">
<center>
<fieldset>
<legend><b>${cinfo.cityname}</b></legend>
<table border="1">
	<tr>
	<th>City Name</th>
	<td>${cinfo.cityname}</td>
	</tr>
	
	<tr>
	<th>State</th>
	<td>${cinfo.state}</td>
	</tr>
	
	
	<tr>
	<th>Information</th>
	<td>${cinfo.information}</td>
	</tr>
	
</table>
	</fieldset>


</center>
</form>
</body>
</html>