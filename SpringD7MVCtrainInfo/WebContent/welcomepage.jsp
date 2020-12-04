<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

form{
 border: 10px solid Black;
 padding: 10px;
  border-bottom-left-radius: 25px;
  background: aqua;
}
h1{
text-align: center;
text-shadow: gray;
}
</style>
</head>
<body>
<form action="getTrainInfo">
<center>
<h1><b><i>Select Train Number</i></b></h1>
	<select name="trainNo">
		<option>----select----</option>
		<option>12105</option>
		<option>13216</option>		
		<option>22108</option>
		<option>12005</option>
		<option>11109</option>
		<option>22505</option>
		<option>52073</option>
	</select><br/><br/>
	<input type="submit" value="Search">	


</center>
</body>
</html>