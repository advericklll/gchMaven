<%-- 
    Document   : oldlogin.jsp
    Created on : 01-mar-2014, 0:52:26
    Author     : Lucas
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <div>
            <span>
                <div id="login" >	
                    <form action="loginUser" method="POST">
                        <table align="center">
                            <tbody><tr><td><b>Nombre de usuario</b></td></tr>
                                <tr>/
                                    <td>
                                        <span>
                                            <input type="text" name="user" id="user" style="width:210px">
                                        </span>
                                    </td>
                                </tr>
                                <tr><td><b>Contraseña</b></td></tr>
                                <tr>
                                    <td>
                                        <span>
                                            <input type="password" name="pass" id="pass" style="width:210px">
                                        </span>						
                                    </td>
                                </tr>
                                <tr>
                                    <td style="padding-top: 18px">
                                        <button name="Login"><span>Login</span></button>
                                        <button name="Limpiar"><span>Limpiar</span></button>	
                                    </td>
                                </tr>
                            </tbody></table>
                    </form>			
                </div>

            </span>
        </div>
    </body>
</html>

