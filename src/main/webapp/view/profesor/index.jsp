<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="gch" uri="/WEB-INF/tlds/gch" %>

<gch:base titulo="Listado de Profesores">
    <script src="js/indexScript.js"></script>
    <div class="informacion">
        <span>${mensaje}</span>
    </div>
    <form action="listarProfesores">
        <fieldset>
            <legend>Datos de B&uacute;squeda</legend>
            <div>
                <label for="nombres">
                    Nombres
                </label>
                <input type="search" name="nombres" id="nombres" maxlength="50" />
            </div>
            <div>
                <label for="apellidoPaterno">
                    Apellido Paterno
                </label>
                <input type="search" name="apellidoPaterno" id="apellidoPaterno" maxlength="50" />
            </div>
            <div>
                <label for="apellidoMaterno">
                    Apellido Materno
                </label>
                <input type="search" name="apellidoMaterno" id="apellidoMaterno" maxlength="50" />
            </div>
        </fieldset>
        <button name="Buscar"><span>Buscar</span></button>

        <div>
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
    <div>
        <table id="resultadoConsulta"> 
            <thead>
            <th>Codigo</th>
            <th>Nombres y Apellidos</th>
            <th>Email</th>
            <th>Sexo</th>
            <th colspan="3">Accion</th>            
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