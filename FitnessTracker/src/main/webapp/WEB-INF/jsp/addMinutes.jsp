<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript" src="jquery-3.4.1.js"></script>

<script type="text/javascript">
	$(document).ready(
		function() {
			$.getJSON('<spring:url value="activities"/>',{
				ajax : 'true'
			},function(data){
				var html = '<option value="">--Please select one--</option>';
				var len = data.length;
				for(var i=0;i<len;i++){
					html += '<option value="'+data[i].desc+'">'
							+data[i].desc + '</option>'
				}
				html += '</option>';
				$('#activities').html(html);
			});
		});
</script>
</head>
<body>
<h1>In Add Minutes</h1>

Language : <a href="?language=en">English</a> | <a href="?language=tel">Telugu</a>

<form:form modelAttribute="exercise">
	<table>
		<tr>
			<td><spring:message code="goal.text"/></td>
			<td><form:input path="minutes"/>
			<td><form:select id="activities" path="activity"></form:select></td>
		</tr>
		<tr>
			<td colspan="3">
				<input type="submit" value="Enter Exercise">
			</td>
		</tr>
	</table>
</form:form>

<h1>Our Updated Goal : ${goal.minutes}</h1>
</body>
</html>