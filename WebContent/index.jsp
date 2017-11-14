<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Matrimony</title>
</head>
<body>
<h1>Life is Short, Have an Affair</h1><br><br>

<b>Find People by Gender</b><br>
<%@ include file="header.jsp"%><br><br>
<b>Not a Member? Register below:</b><br><br>
<form action="addProfileServlet">
Enter name:
<input type="text" name="name"><br>
Select Gender:
  <input type="radio" name="gender" value="male" checked> Male<br>
  <input type="radio" name="gender" value="female"> Female<br>
  Mobile No:
  <input type="text" name="mobile"><br>
   Salary:
    <input type="text" name="salary"><br>
    Age:
    <input type="text" name="age"><br>
   <select name="motherTounge">
    <option>---select language---</option>
  <option value="hindi">Hindi</option>
  <option value="english">English</option>
  <option value="telugu">Telugu</option>
  <option value="tamil">Tamil</option>
</select>
  <input type="submit" value="submit">
</form>
</body>
</html>