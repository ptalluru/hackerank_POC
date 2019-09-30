<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Attendee Page</title>
<style type="text/css">
	.error{
		color:#ff0000;
	}
	.errorblock{
		color:#000;
		background-color: #ffEEEE;
		border: 3px solid #ff0000;
		padding: 8px;
		margin: 16px;		
	}
</style>
</head>
<body>
	<a href="?lang=en">English</a>
	<a href="?lang=de">German</a>
	<a href="?lang=es">Spanish</a>
	<a href="?lang=tel">Telugu</a>
	<form:form modelAttribute="attendee">
		<form:errors path="*" cssClass="errorblock" element="div"/>
		<spring:message code="attendee.name" />
		<form:input path="name" cssErrorClass="error"/>
		<form:errors path="name" cssClass="error"/>
		<br>
		<spring:message code="attendee.email.address" />
		<form:input path="emailAddress" cssErrorClass="error"/>
		<form:errors path="emailAddress" cssClass="error"/>
		<br>
		<input type="submit" class="btn" value="Enter Attendee"/>
	</form:form>
	
	Current Locale : ${pageContext.response.locale}
	
</body>
</html>