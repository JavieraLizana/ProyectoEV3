

package modelo;

/**
 *
 * @author maximiliano y Javiera
 */
public class Dueño {
    
    private int rut;
    private String nombre, apellido, direccionCalle;
    private int direccionNro, telefono;

    public Dueño() {
    }

    public Dueño(int rut, String nombre, String apellido, String direccionCalle, int direccionNro, int telefono) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccionCalle = direccionCalle;
        this.direccionNro = direccionNro;
        this.telefono = telefono;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
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
    
}

