<%-- 
    Document   : inicio
    Created on : 20/02/2017, 11:08:36 PM
    Author     : jonathan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
    </head>
    <body>
        <h1>Inica sesion</h1>
        <hr>
        <form method="POST" action="/Clase1/persona2">
            
            <input id="nombre01" name="correo" type="text" placeholder="Correo">
            <input id="nombre02" name="contra" type="password" placeholder="Contraseña">
            
            <button>Aceptar</button>
        </form>
        <br><hr>
        
        <form method="GET" action="/Clase1/persona3">
            
            <button>Registrate</button>
        </form>
    </body>
</html>