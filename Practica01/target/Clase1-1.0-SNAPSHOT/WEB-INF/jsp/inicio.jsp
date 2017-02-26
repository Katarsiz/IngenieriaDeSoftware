

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
    </head>
    <body>
        <h1>Inicia Sesión</h1>
        <hr>
        <form method="GET" action="/Clase1/persona1">
            <h2>Ingresa un correo</h2>
            <input id="nombre2" name="nombre1" type="text" placeholder="Nombre">
            
        </form>
        <br><hr>
        
        <form method="POST" action="/Clase1/persona2">
            <h2>Ingresa una contraseña </h2>
            <input id="nombre2" name="nombre2" type="text" placeholder="Nombre">
            <button>Aceptar</button>
            <button>Registrarse</button>
        </form>
    </body>
</html>
