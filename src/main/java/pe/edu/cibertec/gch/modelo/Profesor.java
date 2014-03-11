package pe.edu.cibertec.gch.modelo;

import pe.edu.cibertec.gch.annotations.ComplejidadExposicion;

/**
 * Representa a un docente de la institucion.
 */
@ComplejidadExposicion(complejidad = "Alta")
public class Profesor {

    private String codigo;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String direccion;
    private String referencia;
    private String telefono1;
    private String telefono2;//celular   
    private String email1;
    private String email2;   
    private String fechaNacimiento;
    private String sexo;
    private String estadoCivil;
    
    public Profesor(){
        
    }

    public Profesor(String codigo, String nombres, String apellidoPaterno, String apellidoMaterno, String direccion, String referencia, String telefono1, String telefono2, String email1, String email2, String fechaNacimiento, String sexo, String estadoCivil) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.direccion = direccion;
        this.referencia = referencia;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;        
        this.email1 = email1;
        this.email2 = email2;        
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }
    
    public Profesor(String nombres, String apellidoPaterno, String apellidoMaterno, String direccion, String referencia, String telefono1, String telefono2, String email1, String email2, String fechaNacimiento, String sexo, String estadoCivil) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.direccion = direccion;
        this.referencia = referencia;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;        
        this.email1 = email1;
        this.email2 = email2;        
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        String complejidad = this.getClass().getAnnotation(ComplejidadExposicion.class).complejidad();
        if (complejidad.equals("Alta")) {
            return "Profesor{" + "codigo=" + codigo + ", nombres=" + nombres + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + '}';
        } else {
            return "Profesor{" + "codigo=" + codigo +"}";
        }
    }
}
