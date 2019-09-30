<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello ${event.name}!</h1>
<a href="event">Add Event >></a>
<br>
<a href="attendee">Add Attendee >> >></a>
<h4>Added Attendee ${attendee.name} having Email :- ${attendee.emailAddress} successfully</h4>
</body>
</html>