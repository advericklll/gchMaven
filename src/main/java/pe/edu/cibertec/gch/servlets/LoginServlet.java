/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
import javax.servlet.http.HttpSession;
import pe.edu.cibertec.gch.annotations.Autor;
import pe.edu.cibertec.gch.annotations.ComplejidadExposicion;
import pe.edu.cibertec.gch.modelo.User;

/**
 *
 * @author Lucas
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/loginUser", "/logout"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session;
        RequestDispatcher requestDispatcher;
        String userPath = request.getServletPath();

        if (userPath.equals("/loginUser")) {

            User userLogged
                    = new User(request.getParameter("user").toString(), request.getParameter("pass").toString());

            if (userLogged.getUser().equals("admin") && userLogged.getPass().equals("admin")) {
                userLogged.setLogged(true);
                session=request.getSession(true);
                session.setAttribute("userLogged", userLogged.isLogged());
                response.sendRedirect("listarProfesores");
            } else {
                userLogged.setLogged(false);
                request.getSession().setAttribute("userLogged", userLogged.isLogged());
                requestDispatcher = request.getRequestDispatcher("login.jsp");
                requestDispatcher.forward(request, response);
            }
            
            Autor autor = userLogged.getClass().getAnnotation(Autor.class);
            ComplejidadExposicion complejidad= userLogged.getClass().getAnnotation(ComplejidadExposicion.class);
            System.out.println("Autor: "+ autor.codigo());       
            System.out.println(""+ autor.nombre());
            System.out.println("Complejidad del modulo: "+ complejidad.complejidad());
            
        }
        
        

    }
    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher requestDispatcher;
        String userPath = request.getServletPath();
        
        if (userPath.equals("/logout")) {
            request.getSession().setAttribute("userLogged", false);
            requestDispatcher = request.getRequestDispatcher("login.jsp");
            requestDispatcher.forward(request, response);
        } 
    }
    

}
