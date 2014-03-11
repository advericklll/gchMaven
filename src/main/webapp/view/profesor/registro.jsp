<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="gch" uri="/WEB-INF/tlds/gch" %>


<gch:base titulo="Registro de Profesor">   
    <!--<link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.2.2/css/bootstrap-combined.min.css" rel="stylesheet">-->
    <link rel="stylesheet" href="css/jquery-ui-1.10.4.css">
    <script src="js/jquery-ui-1.10.4.js"></script>
    <script src="js/registroScript.js"></script>
    <div class="informacion">
        <span>${mensaje}</span>
    </div>
    <div style="width: 40%">
        <form action="registrarProfesor" method="post" class="form-horizontal" role="form">        
            <fieldset>
                <legend>Datos Personales</legend>
                <div class="form-group" >
                    <label for="nombres" class="col-sm-4 control-label">Nombres</label>
                    <div class="col-sm-8">
                        <input type="text" id="nombres"  class="form-control" name="nombres" required maxlength="50" />
                    </div>                    
                </div>
                <div class="form-group">
                    <label for="apellidoPaterno" class="col-sm-4 control-label">Apellido Paterno</label>
                    <div class="col-sm-8">
                        <input type="text" id="apellidoPaterno" class="form-control" name="apellidoPaterno" required maxlength="50" />
                    </div>                    
                </div>
                <div class="form-group">
                    <label for="apellidoMaterno" class="col-sm-4 control-label">Apellido Materno</label>
                    <div class="col-sm-8">
                        <input type="text" id="apellidoMaterno" class="form-control" name="apellidoMaterno" maxlength="50" />
                    </div>                    
                </div>
            </fieldset>
            <fieldset>
                <legend>Direcci&oacute;n</legend>
                <div class="form-group">
                    <label for="direccion" class="col-sm-4 control-label">Direcci&oacute;n Completa</label>
                    <div class="col-sm-8">
                        <input type="text" id="direccion" class="form-control" name="direccion" required maxlength="400" />
                    </div>                    
                </div>
                <div class="form-group">
                    <label for="referencia" class="col-sm-4 control-label">Referencia</label>
                    <div class="col-sm-8">
                        <input type="text" id="referencia"  class="form-control" name="referencia" maxlength="400" />
                    </div>                    
                </div>
            </fieldset>
            <fieldset>
                <legend>Tel&eacute;fonos</legend>
                <div class="form-group">
                    <label for="telefono1"  class="col-sm-4 control-label">Tel&eacute;fono 1</label>
                    <div class="col-sm-8">
                        <input type="text" id="telefono1" class="form-control" name="telefono1" maxlength="12" />
                    </div>                    
                </div>
                <div class="form-group">
                    <label for="telefono2" class="col-sm-4 control-label">Tel&eacute;fono 2</label>
                    <div class="col-sm-8">
                        <input type="text" id="telefono2" class="form-control" name="telefono2" maxlength="12" />
                    </div>                    
                </div>                
            </fieldset>
            <fieldset>
                <legend>Correos Electr&oacute;nicos</legend>
                <div class="form-group">
                    <label for="email1" class="col-sm-4 control-label">Correo Electr&oacute;nico 1</label>
                    <div class="col-sm-8">
                        <input type="email" id="email1" class="form-control" name="email1" required maxlength="100" />
                    </div>                    
                </div>
                <div class="form-group">
                    <label for="email2" class="col-sm-4 control-label">Correo Electr&oacute;nico 2</label>
                    <div class="col-sm-8">
                        <input type="email" id="email2" class="form-control" name="email2" maxlength="100" />
                    </div>                    
                </div>                
            </fieldset>
            <fieldset>
                <legend>Detalle</legend>

                <div class="form-group">
                    <label for="fechaNacimiento" class="col-sm-4 control-label">
                        Fecha de Nacimiento
                    </label>
                    <div class="col-sm-8">                   
                        <input id="fechaNacimiento" name="fechaNacimiento" data-format="dd/MM/yyyy hh:mm:ss" type="text" readonly="true" required=""></input>
                    </div> 
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">Sexo</label>
                    <div class="col-sm-8">
                        <div class="radio-inline">                        
                            <input type="radio" name="sexo" id="masculino" value="m" />
                            Masculino
                        </div>
                        <div class="radio-inline">                        
                            <input type="radio" name="sexo" id="femenino" value="f" /> 
                            Femenino
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label" for="estadoCivil">
                        Estado Civil
                    </label>
                    <div class="col-sm-8">
                        <select name="estadoCivil" id="estadoCivil" class="form-control">
                            <option value="">-- Seleccione --</option>
                            <option value="1">Solter@</option>
                            <option value="2">Casad@</option>
                            <option value="3">Viud@</option>
                            <option value="4">Divorciad@</option>
                            <option value="5">Conviviente</option>
                        </select>
                    </div>                   
                </div>
            </fieldset>
            <button class="btn btn-primary btn-lg">Registrar</button>
        </form>
    </div>
</gch:base>