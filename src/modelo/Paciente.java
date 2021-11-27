package modelo;

import java.util.Date;

/**
 *
 * @author javiera y Maximiliano
 * @version 25-11-2021
 */
public class Paciente {

    private int idConsulta;
    private Date fechaConsulta;
    private String nombreMascota, especie, raza;
    private String sexo;
    private double peso;
    private int edad;
    private String procedimiento;

    public Paciente() {
    }

    public Paciente(int idConsulta, Date fechaConsulta, String nombreMascota, String especie, String raza, String sexo, double peso, int edad, String procedimiento) {
        this.idConsulta = idConsulta;
        this.fechaConsulta = fechaConsulta;
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.raza = raza;
        this.sexo = sexo;
        this.peso = peso;
        this.edad = edad;
        this.procedimiento = procedimiento;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Date getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(Date fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

}
