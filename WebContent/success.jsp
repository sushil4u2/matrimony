<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@page import="com.matrimony.bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="people" items="${myPeople}">
Name: ${people.name} Gender: ${people.gender} Age:${people.age} Salary: ${people.salary} 
Mobile No: ${people.mobileNo} MotherTounge: ${people.motherTounge}<br>
</c:forEach>

<form action="index.jsp">
<input type="submit" value="Go to Home Page">
</form>
</body>
</html>