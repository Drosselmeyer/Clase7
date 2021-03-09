<%-- 
    Document   : registroEmpleado
    Created on : Mar 2, 2021, 10:34:14 AM
    Author     : Drosselmeyer
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Empleados</title>
    </head>
    <body>
        <h1>Registro de empleados</h1>
        <form action="<%= request.getContextPath() %>/empleado" method="post">
            <p>Nombres</p>
            <input type="text" name="name" />
            <p>Apellidos</p>
            <input type="text" name="lastName"/>
            <p>Usuario</p>
            <input type="text" name="user" />
            <p>Contraseña</p>
            <input type="text" name="password"/>
            <p>Direccion</p>
            <input type="text" name="address" />
            <p>Contacto</p>
            <input type="text" name="contact"/>
            
            <input type="submit" value="Registrar"/>
            
        </form>
    </body>
</html>
