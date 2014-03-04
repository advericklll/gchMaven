/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.gch.servlets;

import java.io.IOException;
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
 * Servlet para reenviar al registro de profesor
 */
@WebServlet(name = "ReenvioRegistroProfesor", urlPatterns = {"/irRegistroProfesor","/irActualizarProfesor","/irEliminarProfesor","/irDetalleProfesor","/eliminarProfesor"})
public class ReenvioRegistroProfesor extends HttpServlet {
    ProfesorService profesorService = ProfesorFactory.create(ServiceTypes.SERVERBD);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userPath = req.getServletPath();
        RequestDispatcher requestDispatcher;
        
        if (userPath.equals("/irRegistroProfesor")){
            requestDispatcher= req.getRequestDispatcher("/view/profesor/registro.jsp");
            requestDispatcher.forward(req, resp);
        }      
       
        String codigo= req.getQueryString();
        Profesor profesor = profesorService.obtenerSegun(codigo);            
        req.setAttribute("profesor", profesor);
        
        
        if (userPath.equals("/irActualizarProfesor")){                       
            requestDispatcher = req.getRequestDispatcher("/view/profesor/update.jsp");
            requestDispatcher.forward(req, resp);
        }
       
        if (userPath.equals("/irDetalleProfesor")){                  
            requestDispatcher = req.getRequestDispatcher("/view/profesor/details.jsp");
            requestDispatcher.forward(req, resp);
        }        
    } 
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userPath = req.getServletPath();
        String codigo = req.getParameter("codigo").toString();
        if (userPath.equals("/eliminarProfesor")){           
            profesorService.eliminarSegun(codigo);            
        } 
    }
}
