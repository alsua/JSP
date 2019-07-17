<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="entities.Usuario" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% String nombreUsuario = ((Usuario)request.getSession().getAttribute("user")).getNombre()  ;%>

<h1>bienvenido, <span><%=nombreUsuario %></span></h1>

<nav>

<ul>

<li><a href="login.jsp"> Volver </a></li>

<li><a href="BorrarServlet"> Borrar Usuarios </a></li>

<li><a href="UserServlet"> Users </a></li>

</ul>

</nav>


 

</body>
</html>