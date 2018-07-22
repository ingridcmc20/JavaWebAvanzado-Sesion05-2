<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>

	<h2>Informaci&oacute;n de Usuario</h2>
	<form:form method="POST" action="encuesta/crear">
		<table>
			<tr>
				<td></td>
				<td><form:hidden path="id" value="1" /></td>
			</tr>
			<tr>
				<td><form:label path="cuenta">User Name</form:label></td>
				<td><form:input path="cuenta" /></td>
			</tr>
			<tr>
				<td><form:label path="clave">Password</form:label></td>
				<td><form:password path="clave" /></td>
			</tr>
			<tr>
				<td><form:label path="direccion">Address</form:label></td>
				<td><form:textarea path="direccion" rows="5" cols="30" /></td>
			</tr>
			<tr>
				<td><form:label path="suscripcionRevista">Subscribe Newsletter</form:label></td>
				<td><form:checkbox path="suscripcionRevista" /></td>
			</tr>
			<tr>
				<td><form:label path="favoritoFrameworks">Favorite Web Frameworks</form:label></td>
				<td><form:checkboxes items="${webFrameworkList}"
						path="favoritoFrameworks" /></td>
			</tr>
			<tr>
				<td><form:label path="genero">Gender</form:label></td>
				<td><form:radiobutton path="genero" value="M" label="Male" />
					<form:radiobutton path="genero" value="F" label="Female" /></td>
			</tr>
			<tr>
				<td><form:label path="favoritoNumero">Favorite Number</form:label></td>
				<td><form:radiobuttons path="favoritoNumero"
						items="${numerosList}" /></td>
			</tr>
			<tr>
				<td><form:label path="pais">Country</form:label></td>
				<td><form:select path="pais">
						<form:option value="NONE" label="Select" />
						<form:options items="${paisesList}" htmlEscape="false" />
					</form:select></td>
			</tr>
			<tr>
				<td><form:label path="habilidades">Skills</form:label></td>
				<td><form:select path="habilidades" items="${habilidadesList}"
						multiple="true" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>