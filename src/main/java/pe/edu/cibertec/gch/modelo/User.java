/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.gch.modelo;

import pe.edu.cibertec.gch.annotations.Autor;
import pe.edu.cibertec.gch.annotations.ComplejidadExposicion;

/**
 *
 * @author jvasquezc
 */
@ComplejidadExposicion(complejidad = "Alta")
@Autor(codigo= 1, nombre="alumno")

public class User {

    private String user;
    private String pass;
    private boolean logged = false;   

    public User(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }    
}
