<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="RegistrarServlet"><%-- ACTION ES LA DIRECCION A LA QUE ENVIA EL FORMULARIO --%>

 
  <h1 class="h3 mb-3 font-weight-normal">Introduzca nombre de usuario y contraseña</h1>
  <label for="inputEmail" class="sr-only">Nombre de usuario</label>
  <input name="nombre" id="inputEmail" class="form-control" placeholder="Correo Electrónico" required="" autofocus="">
  <label for="inputPassword" class="sr-only">Contraseña</label>
  <input name="password" id="inputPassword" class="form-control" placeholder="Contraseña" required="">
    <input name="password2" id="inputPassword" class="form-control" placeholder="Contraseña" required="">
  <div class="checkbox mb-3">
    <label>
      <input type="checkbox" value="remember-me"> Recuerdame
    </label>
  </div>
  <button class="btn btn-lg btn-primary btn-block" type="submit">Continuar</button>
  <p class="mt-5 mb-3 text-muted">© A.S.S. Industries.</p>
</form>
</body>
</html>