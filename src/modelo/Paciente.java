package modelo;

import java.util.Date;

/**
 *
 * @author javiera y Maximiliano
 * @version 25-11-2021
 */
public class Paciente {

    private int idConsulta, edad, peso;
    private String nombreMascota, especie, raza, procedimiento;
    private Date fechaConsulta;
    private boolean sexo;

    public Paciente() {
    }

    public Paciente(int idConsulta, int edad, int peso, String nombreMascota, String especie, String raza, String procedimiento, Date fechaConsulta, boolean sexo) {
        this.idConsulta = idConsulta;
        this.edad = edad;
        this.peso = peso;
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.raza = raza;
        this.procedimiento = procedimiento;
        this.fechaConsulta = fechaConsulta;
        this.sexo = sexo;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
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

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public Date getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(Date fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    
    
}
