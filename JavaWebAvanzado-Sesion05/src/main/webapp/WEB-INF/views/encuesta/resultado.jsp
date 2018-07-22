<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Enviando Informaci&oacute;n de Usuario</h2>
   <table>
      <tr>
         <td>Id</td>
         <td>${id}</td>
      </tr>      
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
      <tr>
         <td>Suscripci&oacute;n a Revista</td>
         <td>${suscripcionRevista}</td>
      </tr>    
      <tr>
         <td>Favorito Web Frameworks</td>
         <td> <% String[] favoritoFrameworks = (String[])request.getAttribute("favoritoFrameworks");
            for(String framework: favoritoFrameworks) {
               out.println(framework);
            }
         %></td>
      </tr>     	 
      <tr>
         <td>G&eacute;nero</td>
         <td>${(genero=="M"? "Masculino" : "Femenino")}</td>
      </tr>
      <tr>
         <td>Favorito N&uacute;mero</td>
         <td>${favoritoNumero}</td>
      </tr>   
      <tr>
         <td>Pa&iacute;s</td>
         <td>${pais}</td>
      </tr>
      <tr>
      <td>Habilidades</td>
      <td> <% String[] habilidades = (String[])request.getAttribute("habilidades");
         for(String skill: habilidades) {
            out.println(skill);
         }
      %></td>
      </tr>   	  
   </table>  
</body>
</html>