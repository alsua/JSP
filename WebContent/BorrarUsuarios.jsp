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
<a href="index.jsp"><button>Volver</button></a>
<form method="post" action="BorrarServlet"><%-- ACTION ES LA DIRECCION A LA QUE ENVIA EL FORMULARIO --%>
	<button type="Submit">BORRAR </button>
	<table>
		<tr>
			<th>Nombre</th>

		</tr>

		<c:forEach var="usuario" items="${lista}">
			<tr>
				<td>${usuario.nombre}</td>
<td><input name=Usuarios type="checkbox" id="cbox2" value="${usuario.nombre}"  > <label for="cbox2"></td> <%-- value muestra datos --%>
			</tr>


 
		</c:forEach>

	</table>
</form>
</body>
</html>