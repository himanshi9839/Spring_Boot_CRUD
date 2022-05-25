<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot</title>
</head>
<body>
<b>CREATE :- </b>
<form action="/saveData" method = "post">
	<label><b>Input name : </b></label>
   	<input type ="text" name ="name"><br>
   	<label>Input city : </label>
   	<input type ="text" name ="city"><br>
   	<input type= "submit" value = "save">
</form>
<br>
<b>DELETE :-</b>
<form action="/deleteData" method = "post">
	<label><b>Enter ID :</b> </label>
   	<input type ="text" name ="id"><br>
	<input type= "submit" value = "delete">
</form>
<br>
<b>UPDATE :-</b>
<form action="/updateData" method = "post">
	<label><b>Input name : </b></label>
   	<input type ="text" name ="name"><br>
   	<label>Update city : </label>
   	<input type ="text" name ="city"><br>
   	<input type= "submit" value = "update">
</form>
</body>
</html>