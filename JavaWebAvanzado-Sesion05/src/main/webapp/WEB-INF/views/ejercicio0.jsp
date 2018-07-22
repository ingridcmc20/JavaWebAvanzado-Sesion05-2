<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sistema de Shopping</title>
</head>
<body>

	<h6>Lima, ${fecha}</h6>

	<form action="index.html" method="post">
		Usuario: <input type="text" name="idUsuario" value="" /> <br />
		Clave: <input type="password" name="clave" value="" /><br /> <input
			type="submit" value="Iniciar sesión" />
	</form>

	<h6>${mensaje}</h6>

</body>
</html>