/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.gch.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author JavaADV
 */
public class RegistroProfesorServletTest {
    
    private RegistroProfesorServlet registroProfesorServlet;
    private HttpServletRequest req;
    private HttpServletResponse resp;

    @Before
    public void setUp() {
        registroProfesorServlet = new RegistroProfesorServlet();
        req = mock(HttpServletRequest.class);
        resp = mock(HttpServletResponse.class);
        RequestDispatcher requestDispatcherMock = mock(RequestDispatcher.class);
        when(req.getRequestDispatcher(anyString())).thenReturn(requestDispatcherMock);
    }

    @Test
    public void cuandoInvocamosDoPostConNombreVacio()
            throws Exception {
        llenarDatosProfesor(req);
        when(req.getParameter("nombres")).thenReturn(null);
        registroProfesorServlet.doPost(req, resp);
        verify(req).setAttribute("mensaje", "Hay errores en los datos enviados");
    }

    private void llenarDatosProfesor(HttpServletRequest req) {        
        when(req.getParameter("nombres")).thenReturn("Juan");
        when(req.getParameter("apellidoPaterno")).thenReturn("Perez");
        when(req.getParameter("apellidoMaterno")).thenReturn("Perez");
        when(req.getParameter("direccion")).thenReturn("Av. Los Helechos 818 San Isidro");
        when(req.getParameter("referencia")).thenReturn("Javier Prado cuadra 9");
        when(req.getParameter("telefono1")).thenReturn("2344");
        when(req.getParameter("email1")).thenReturn("juanperez@cuenta.com");
        when(req.getParameter("fechaNacimiento")).thenReturn("01/01/1980");
        when(req.getParameter("sexo")).thenReturn("m");
        when(req.getParameter("estadoCivil")).thenReturn("1");
    }
    
}
