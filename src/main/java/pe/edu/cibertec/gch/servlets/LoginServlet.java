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
import pe.edu.cibertec.gch.modelo.User;

/**
 *
 * @author Lucas
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/loginUser"})
public class LoginServlet extends HttpServlet {
   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
                User userLogged=
                        new User(request.getParameter("user").toString()
                        ,request.getParameter("pass").toString());
                
                RequestDispatcher requestDispatcher;
                
                if (userLogged.getUser().equals("admin") && userLogged.getPass().equals("admin")){
                    userLogged.setLogged(true);
                    request.getSession().setAttribute("userLogged", userLogged.isLogged());
                    response.sendRedirect("listarProfesores");
                }
                else
                {
                    request.getSession().setAttribute("userLogged", userLogged.isLogged());
                    requestDispatcher = request.getRequestDispatcher("login.jsp");
                    requestDispatcher.forward(request, response);
                }                
                
    }

    

}
