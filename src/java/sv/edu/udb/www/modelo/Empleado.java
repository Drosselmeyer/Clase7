/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.www.modelo;

/**
 *
 * @author Drosselmeyer
 */
public class Empleado {
       
    //Propiedades
    private int id;
    private String nombres;
    private String apellidos;
    private String usuario;
    private String pass;
    private String direccion;
    private String contacto;
    
    //Constructor
    public Empleado(){
        this.id = 0;
        this.nombres="";
        this.apellidos="";
        this.usuario="";
        this.pass="";
        this.direccion="";
        this.contacto ="";
    }

    public Empleado(String nombres, String apellidos, String usuario, String pass, String direccion, String contacto) {
        this.id = 0;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.pass = pass;
        this.direccion = direccion;
        this.contacto = contacto;
    }
    
    
    
    //Setter y Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return pass;
    }

    public void setPassword(String password) {
        this.pass = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
            
}
