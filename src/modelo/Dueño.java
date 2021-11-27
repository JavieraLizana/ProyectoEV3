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
    
    private int rut;
    private int idConsulta;
    private String nombre, apellido, direccionCalle;
    private int direccionNro, telefono;
    private String tipoPago;
    private int valor;

    public Dueño() {
    }

    public Dueño(int rut, int idConsulta, String nombre, String apellido, String direccionCalle, int direccionNro, int telefono, String tipoPago, int valor) {
        this.rut = rut;
        this.idConsulta = idConsulta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccionCalle = direccionCalle;
        this.direccionNro = direccionNro;
        this.telefono = telefono;
        this.tipoPago = tipoPago;
        this.valor = valor;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
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

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}

