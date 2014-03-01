<%-- 
    Document   : Login
    Created on : 22/02/2014, 12:02:29 PM
    Author     : JavaADV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/style.css" media="screen" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="barBody">
            <span class="caja" style="width:280px">

                <div id="login" >	
                    <form action="access/login" method="POST" id="fo">
                        <table align="center">
                            <tbody><tr><td><b class="titulo">Nombre de usuario</b></td></tr>
                                <tr>/
                                    <td>
                                        <span>
                                            <input type="text" name="fusr" id="fusr" style="width:210px">
                                        </span>
                                    </td>
                                </tr>
                                <tr><td><b class="titulo">Contraseña</b></td></tr>
                                <tr>
                                    <td>
                                        <span>
                                            <input type="password" name="fpwd" id="fpwd" style="width:210px">
                                        </span>						
                                    </td>
                                </tr>
                                <tr>
                                    <td style="padding-top: 18px">
                                        <a href="javascript:void(0)" class="btn" title="acceder" id="acceder">Acceder</a>
                                        <a href="javascript:void(0)" class="btn" title="limpiar" id="limpiar">Limpiar</a>	
                                    </td>
                                </tr>
                            </tbody></table>
                    </form>			
                </div>

            </span>
        </div>
    </body>
</html>
