/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.gch.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.cibertec.gch.enums.ServiceTypes;
import pe.edu.cibertec.gch.factory.ProfesorFactory;
import pe.edu.cibertec.gch.modelo.Profesor;
import pe.edu.cibertec.gch.service.ProfesorService;

/**
 *
 * @author Lucas
 */
@WebServlet(name = "ActualizacionProfesorServlet", urlPatterns = {"/actualizarProfesor"})
public class ActualizacionProfesorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String codigo = req.getParameter("codigo"),
                nombres = req.getParameter("nombres"),
                apellidoPaterno = req.getParameter("apellidoPaterno"),
                apellidoMaterno = req.getParameter("apellidoMaterno"),
                direccion = req.getParameter("direccion"),
                referencia = req.getParameter("referencia"),
                telefono1 = req.getParameter("telefono1"),
                telefono2 = req.getParameter("telefono2"),                
                email1 = req.getParameter("email1"),
                email2 = req.getParameter("email2"),                
                fechaNacimiento = req.getParameter("fechaNacimiento"),
                sexo = req.getParameter("sexo"),
                estadoCivil = req.getParameter("estadoCivil");

        ProfesorService serviceProfesorBD = ProfesorFactory.create(ServiceTypes.SERVERBD);
        // se validan los parametros recibidos
        if (serviceProfesorBD.sonDatosValidos(nombres, apellidoPaterno, apellidoMaterno, direccion, referencia, telefono1, telefono2, email1, email2, fechaNacimiento, sexo, estadoCivil)) {
            // si es conforme, se registra en la fuente de datos
            serviceProfesorBD.actualizar(new Profesor(codigo, nombres, apellidoPaterno, apellidoMaterno, direccion, referencia, telefono1, telefono2, email1, email2, fechaNacimiento, sexo, estadoCivil));
            resp.sendRedirect("listarProfesores");
        } else {
            // si hay algunos campos invalidos, se retorna            
            req.setAttribute("mensaje", "Hay errores en los datos enviados");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/profesor/update.jsp");
            requestDispatcher.forward(req, resp);
        }
        
    }
}
