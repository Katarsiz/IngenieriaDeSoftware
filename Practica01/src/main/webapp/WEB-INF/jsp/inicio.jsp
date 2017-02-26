

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
        <form method="POST" action="/Clase1/sesion">
            <h2>Ingresa un correo</h2>
            <input id="correo" name="correo" type="text" placeholder="Nombre">
            <h2>Ingresa una contraseña </h2>
            <input id="contra" name="contra" type="text" placeholder="Password">
            <br>
            <button>Aceptar</button>
            <br>
            <button>Registrarse</button>
        </form>
        <h1>Regístrate</h1>
        <hr>
        <form method="GET" action="/Clase1/registrar">
            <input id="nombre" name="nombre" type="text" placeholder="Nombre">
            <br>
            <input id="carrera" name="carrera" type="text" placeholder="Carrera">
            <h3>Fecha de Nacimiento</h3>
            <input id="fecha" name="fecha" type="date" placeholder="Nombre">
            <br>
            <input id="correo" name="correo" type="text" placeholder="Correo">
            <br>
            <input id="password" name="password" type="text" placeholder="">
            <br>
            <button>Aceptar</button>
        </form>
    </body>
</html>
