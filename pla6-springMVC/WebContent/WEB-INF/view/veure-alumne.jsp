<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fitxa de l'alumne registrat:</title>
<style>
.highlight {
	background-color:#FFFF00;
	color:#333333;
}
</style>
</head>
<body>
	<h3 class="highlight">Alumne registrat:</h3>
	<p>Nom: ${alumne.nom}</p>
	<p>DNI: ${alumne.dni}</p>
	<p>Correu electrònic: ${alumne.email}</p>
	<p>Becat: ${alumne.beca}</p>
	Assignatures: 

	<ul>
		<c:forEach var="assignatura" items="${alumne.assignatures}">

			<li>${assignatura}</li>

		</c:forEach>
	</ul>
</body>
</html>