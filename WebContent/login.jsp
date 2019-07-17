<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="text-center">

<form method="post" action="NameServlet"><%-- ACTION ES LA DIRECCION A LA QUE ENVIA EL FORMULARIO --%>
  <img class="mb-4" src="https://image.freepik.com/vector-gratis/serpiente-envuelta-calavera-boca-abierta_6431-830.jpg" alt="" width="72" height="72">
  
  <%  if( request.getAttribute("fallo") != null){ %>

	<p class="">USUARIO NO REGISTRADO</p>
<%} %>

  
  
  <h1 class="h3 mb-3 font-weight-normal">Introduzca nombre de usuario y contraseña</h1>
  <label for="inputEmail" class="sr-only">Nombre de usuario</label>
  <input name="nombre" id="inputEmail" class="form-control" placeholder="Correo Electrónico" required="" autofocus="">
  <label for="inputPassword" class="sr-only">Contraseña</label>
  <input name="password" id="inputPassword" class="form-control" placeholder="Contraseña" required="">
  <div class="checkbox mb-3">
    <label>
      <input type="checkbox" value="remember-me"> Recuerdame
    </label>
  </div>
  <button class="btn btn-lg btn-primary btn-block" type="submit">Continuar</button>
  <p class="mt-5 mb-3 text-muted">© A.R Industries.</p>
</form>


</body>
</body>
</html>