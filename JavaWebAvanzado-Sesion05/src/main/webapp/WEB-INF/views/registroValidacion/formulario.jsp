<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
	<style>
	
		.error {
			color: #ff0000;
		}
		
		.errorblock {
			color: #000;
			background-color: #ffEEEE;
			border: 3px solid #ff0000;
			padding: 8px;
			margin: 16px;
		}
		
	</style>
<body>

	<h2>Registro de Usuario</h2>
	<form:form method="POST" servletRelativeAction="/registroValidacion/crear"    modelAttribute="usuario">
	<form:errors path = "*" cssClass = "errorblock" element = "div" />
		<table>
			<tr>
				<td><form:label path="cuenta">Cuenta</form:label></td>
				<td><form:input path="cuenta" /></td>
				<td><form:errors path = "cuenta" cssClass = "error" /></td>
			</tr>
			<tr>
				<td><form:label path="clave">Clave</form:label></td>
				<td><form:password path="clave" /></td>
				<td><form:errors path = "clave" cssClass = "error" /></td>
			</tr>
			<tr>
				<td><form:label path="clave">Edad</form:label></td>
				<td><form:input path="edad" /></td>
				<td><form:errors path = "edad" cssClass = "error" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Enviar" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
