<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="gch" uri="/WEB-INF/tlds/gch" %>

<gch:base titulo="Listado de Profesores">
    <script src="js/indexScript.js"></script>
    <div class="informacion">
        <span>${mensaje}</span>
    </div>
    <div style="width: 30%">
        <form action="listarProfesores" role="form">        
            <legend>Datos de B&uacute;squeda</legend>
            <div class="form-group">
                <label for="nombres"> Nombres </label>                
                <input type="search" name="nombres" id="nombres" maxlength="50" class="form-control"  placeholder="Nombres"/>                
            </div>
            <div class="form-group">
                <label for="apellidoPaterno"> Apellido Paterno </label>               
                <input type="search" name="apellidoPaterno" id="apellidoPaterno" maxlength="50" class="form-control"  placeholder="Apellido Paterno"/>           
            </div>
            <div class="form-group">
                <label for="apellidoMaterno"> Apellido Materno </label>                
                <input type="search" name="apellidoMaterno" id="apellidoMaterno" maxlength="50" class="form-control"  placeholder="apellidoMaterno"/>         
            </div>
            <div class="form-group">                     
                <button type="submit" name="Buscar" class="btn btn-primary">Buscar</button>               
            </div>

            <div class="form-group">
                <nav>
                    <ul>
                        <li>
                            <a href="irRegistroProfesor">
                                Registrar nuevo profesor
                            </a>
                        </li>
                    </ul>
                </nav>
            </div>
        </form>
    </div>
    <div style="width: 60%">
        <table id="resultadoConsulta"  class="table table-striped" style="text-align: center;"> 
            <thead>
            <th style="text-align: center;">Codigo</th>
            <th style="text-align: center;">Nombres y Apellidos</th>
            <th style="text-align: center;">Email</th>
            <th style="text-align: center;">Sexo</th>
            <th colspan="3" style="text-align: center;">Accion</th>            
            </thead>
            <tbody>
                <c:forEach var="profesor" items="${requestScope.profesores}" >
                    <tr value="${profesor.codigo}">
                        <td>${profesor.codigo}</td>
                        <td>${profesor.nombres} ${profesor.apellidoPaterno} ${profesor.apellidoMaterno}</td>
                        <td>${profesor.email1}</td>
                        <td>${profesor.sexo}</td>
                        <td><a href="<c:url value='irActualizarProfesor?${profesor.codigo}'/>">Actualizar</a></td>
                        <td ><a herf="#" id="${profesor.codigo}">Eliminar</a></td>
                        <td ><a href="<c:url value='irDetalleProfesor?${profesor.codigo}'/>" >Detalle</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</gch:base>