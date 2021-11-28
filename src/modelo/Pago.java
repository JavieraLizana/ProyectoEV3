
package modelo;

/**
 *
 * @author Maximiliano y Javiera
 */
public class Pago {
    
    private int idPago, rut;
    private String tipoPago;
    private int valor;

    public Pago() {
    }

    public Pago(int idPago, int rut, String tipoPago, int valor) {
        this.idPago = idPago;
        this.rut = rut;
        this.tipoPago = tipoPago;
        this.valor = valor;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
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
