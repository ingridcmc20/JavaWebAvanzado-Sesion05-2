<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Informaci&oacute;n de Registro de Usuario</h2>
   <table>     
      <tr>
         <td>Cuenta</td>
         <td>${cuenta}</td>
      </tr>
      <tr>
         <td>Clave</td>
         <td>${clave}</td>
      </tr>    
      <tr>
         <td>Direcci&oacute;n</td>
         <td>${direccion}</td>
      </tr>    
   </table>  
</body>
</html>
