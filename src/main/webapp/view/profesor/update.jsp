<%-- 
    Document   : update
    Created on : 23-feb-2014, 18:59:31
    Author     : Lucas
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="gch" uri="/WEB-INF/tlds/gch" %>
<gch:base titulo="Actualizar Profesor">
    <div class="informacion">
        <span>${mensaje}</span>
    </div>
    <form action="actualizarProfesor" method="post">        
        <fieldset>
            <legend>Datos Personales</legend>
            <div>
                <input type="hidden" id="codigo" name="codigo" value="<jsp:getProperty name="profesor" property="codigo"/>" >
                <label for="nombres">Nombres</label>
                <input type="text" id="nombres" name="nombres" required maxlength="50" value="<jsp:getProperty name="profesor" property="nombres"/>" >
            </div>
            <div>
                <label for="apellidoPaterno">Apellido Paterno</label>
                <input type="text" id="apellidoPaterno" name="apellidoPaterno" required maxlength="50" value="<jsp:getProperty name="profesor" property="apellidoPaterno"/>">
            </div>
            <div>
                <label for="apellidoMaterno">Apellido Materno</label>
                <input type="text" id="apellidoMaterno" name="apellidoMaterno" maxlength="50" value="<jsp:getProperty name="profesor" property="apellidoMaterno"/>">
            </div>
        </fieldset>
        <fieldset>
            <legend>Direcci&oacute;n</legend>
            <div>
                <label for="direccion">Direcci&oacute;n Completa</label>
                <input type="text" id="direccion" name="direccion" required maxlength="400" value="<jsp:getProperty name="profesor" property="direccion"/>">
            </div>
            <div>
                <label for="referencia">Referencia</label>
                <input type="text" id="referencia" name="referencia" maxlength="400" value="<jsp:getProperty name="profesor" property="referencia"/>">
            </div>
        </fieldset>
        <fieldset>
            <legend>Tel&eacute;fonos</legend>
            <div>
                <label for="telefono1">Tel&eacute;fono 1</label>
                <input type="text" id="telefono1" name="telefono1" maxlength="12" value="<jsp:getProperty name="profesor" property="telefono1"/>"></div>
            <div>
                <label for="telefono2">Tel&eacute;fono 2</label>
                <input type="text" id="telefono2" name="telefono2" maxlength="12" value="<jsp:getProperty name="profesor" property="telefono2"/>">
            </div>
            <div>
                <label for="telefono3">Tel&eacute;fono 3</label>
                <input type="text" id="telefono3" name="telefono3" maxlength="12" value="<jsp:getProperty name="profesor" property="telefono3"/>">
            </div>
        </fieldset>
        <fieldset>
            <legend>Correos Electr&oacute;nicos</legend>
            <div>
                <label for="email1">Correo Electr&oacute;nico 1</label>
                <input type="email" id="email1" name="email1" required maxlength="100" value="<jsp:getProperty name="profesor" property="email1"/>">
            </div>
            <div>
                <label for="email2">Correo Electr&oacute;nico 2</label>
                <input type="email" id="email2" name="email2" maxlength="100" value="<jsp:getProperty name="profesor" property="email2"/>">
            </div>
            <div>
                <label for="email3">Correo Electr&oacute;nico 3</label>
                <input type="email" id="email3" name="email3" maxlength="100" value="<jsp:getProperty name="profesor" property="email3"/>">
            </div>
        </fieldset>
        <fieldset>
            <legend>Detalle</legend>
            <div>
                <label for="fechaNacimiento">
                    Fecha de Nacimiento
                </label>
                <input type="date" name="fechaNacimiento" id="fechaNacimiento" required value="<jsp:getProperty name="profesor" property="fechaNacimiento"/>">
            </div>
            <div>
                <span>Sexo</span>
                <label for="masculino">Masculino</label>
                <input type="radio" name="sexo" id="masculino" value="m" />
                <label for="femenino">Femenino</label>
                <input type="radio" name="sexo" id="femenino" value="f"/>
            </div>
            <div>
                <label for="estadoCivil">
                    Estado Civil
                </label>
                <select name="estadoCivil" id="estadoCivil" />
                    <option value="">-- Seleccione --</option>
                    <option value="1">Solter@</option>
                    <option value="2">Casad@</option>
                    <option value="3">Viud@</option>
                    <option value="4">Divorciad@</option>
                    <option value="5">Conviviente</option>
                </select>                
            </div>
        </fieldset>
        <button>Guardar</button>
    </form>
</gch:base>
