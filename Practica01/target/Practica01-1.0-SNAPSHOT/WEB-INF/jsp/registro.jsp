<%-- 
    Document   : registro
    Created on : 25/02/2017, 06:14:22 PM
    Author     : Julio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <h1>Regístrate</h1>
        <hr>
        <form method="GET" action="/Clase1/registrar">
            <h2>Ingresa un correo</h2>
            <input id="nombre" name="nombre" type="text" placeholder="Nombre">
            <input id="carrera" name="carrera" type="text" placeholder="Nombre">
            <h3>Fecha de Nacimiento</h3>
            <input id="fecha" name="fecha" type="date" placeholder="Nombre">
            <input id="correo" name="correo" type="text" placeholder="Nombre">
            <input id="password" name="password" type="text" placeholder="Nombre">
            <br>
            <button>Aceptar</button>
        </form>
    </body>
</html>
