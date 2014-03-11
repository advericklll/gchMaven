/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.gch.service;

import java.util.List;
import pe.edu.cibertec.gch.modelo.Profesor;

/**
 *
 * @author JavaADV
 */
public abstract class ProfesorService {
    
    public ProfesorService() {
        super();
        construct();
    }

    public abstract void construct();
    public abstract void identify();
    
    public abstract void registrar(Profesor profesor);
    public abstract void actualizar(Profesor profesor);
    public abstract void eliminarSegun(String codigo);
    public abstract List<Profesor> listarTodo();
    public abstract List<Profesor> listarSegun(String nombre, String apellidoPaterno, String apellidoMaterno);
    public abstract Profesor obtenerSegun(String codigo);
    
    public boolean sonDatosValidos(String nombres, String apellidoPaterno, String apellidoMaterno, String direccion, String referencia, String telefono1, String telefono2, String email1, String email2, String fechaNacimiento, String sexo, String estadoCivil) {
        boolean esValido = true;
        // TODO solo se valida que no sean vacios, sin embargo la logica de 
        // validacion deberia incluir otros aspectos
        if (nombres == null || nombres.isEmpty()) {
            esValido = false;
        } else if (apellidoPaterno == null || apellidoPaterno.isEmpty()) {
            esValido = false;
        } else if (direccion == null || direccion.isEmpty()) {
            esValido = false;
        } else if (email1 == null || email1.isEmpty()) {
            esValido = false;
        }
        return esValido;
    }

}
