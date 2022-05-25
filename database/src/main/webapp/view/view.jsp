<%@ page import="java.util.List" %>
<%@ page import="com.java.example.model.userData" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot</title>
</head>
<body>
	<%
	    //To Read/View data
		List<userData> dataList = (List<userData>)request.getAttribute("data");
		
		for(int i = 0; i<dataList.size(); i++)
		{
			out.print("Id: " + dataList.get(i).getId() + "<br>");
			out.print("Name: " + dataList.get(i).getName() + "<br>");
			out.print("City: " + dataList.get(i).getCity()+ "<br>");
			out.print("<br>");
		}
		
	%>
</body>
</html>