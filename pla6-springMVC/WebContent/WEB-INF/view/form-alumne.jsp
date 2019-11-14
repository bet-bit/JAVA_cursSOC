<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta alumnes</title>
<style>
.error {
	color: red;
}
.highlight {
	background-color:#FFFF00;
}
</style>
</head>
<body>
	<form:form action="processar" modelAttribute="alumne">
		Nom(*):<form:input path="nom" />
		<form:errors path="nom" cssClass="error" />
		
		<br />
		DNI:<form:input path="dni" />
		<form:errors path="dni" cssClass="error" />
		
		<br />
		Correu electrònic:<form:input type="email" path="email" />
		<form:errors path="email" cssClass="error" />
		<br />
		
		Becat: <form:radiobuttons path="beca"
			items="${alumne.llistaBeques}" />
		<br />
		
		Assignatures: <form:checkboxes path="assignatures" items="${alumne.llistaAssignatures}" />
		
		<br />
		<br />
		<input type="submit">
	</form:form>
</body>
</html>