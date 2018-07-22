<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>

	<h2> Registro de Usuario</h2>
	<form:form method="POST"  action="registro/crear" modelAttribute="usuario">
		<table>
			<tr>
				<td><form:label path="cuenta">Cuenta</form:label></td>
				<td><form:input path="cuenta" /></td>
			</tr>
			<tr>
				<td><form:label path="clave">Clave</form:label></td>
				<td><form:password path="clave" /></td>
			</tr>
			<tr>
				<td><form:label path="direccion">Direcci&oacute;n</form:label></td>
				<td><form:textarea path="direccion" rows="5" cols="30" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Enviar" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
