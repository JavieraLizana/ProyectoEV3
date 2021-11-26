/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author maximiliano y Javiera
 */
public class Dueño {
    
    private int rut,direccionNro, telefono;
    private String nombre, apellido, direccionCalle;

    public Dueño() {
    }

    public Dueño(int rut, int direccionNro, int telefono, String nombre, String apellido, String direccionCalle) {
        this.rut = rut;
        this.direccionNro = direccionNro;
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccionCalle = direccionCalle;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getDireccionNro() {
        return direccionNro;
    }

    public void setDireccionNro(int direccionNro) {
        this.direccionNro = direccionNro;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccionCalle() {
        return direccionCalle;
    }

    public void setDireccionCalle(String direccionCalle) {
        this.direccionCalle = direccionCalle;
    }
    
    
    
    
}
