<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<body>
<form method="post" action="UserServlet">
<input name="nombre" id="inputEmail" class="form-control" placeholder="Correo Electrónico" required="" autofocus="">


<button class="btn btn-lg btn-primary btn-block" type="submit">Continuar</button>

</form>

	<table>
		<tr>
			<th>Nombre</th>

		</tr>

		<c:forEach var="usuario" items="${lista}">
			<tr>
				<td>${usuario.nombre}</td>

			</tr>



		</c:forEach>

	</table>
</body>
</html>