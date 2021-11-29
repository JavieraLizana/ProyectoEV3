package controlador;

import bd.Conexion;
import modelo.Pago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author maximiliano y Javiera
 */
public class RegistroPago {

    public boolean agregar(Pago pago) {

        try {
            Conexion con = new Conexion();
            Connection cnt = con.obtenerConexion();
            String query = "INSERT INTO pago(rut,tipoPago, valor) VALUES (?,?,?)";
            PreparedStatement stmt = cnt.prepareStatement(query);

            stmt.setInt(1, pago.getRut());
            stmt.setString(2, pago.getTipoPago());
            stmt.setInt(3, pago.getValor());

            stmt.executeUpdate();
            stmt.close();
            cnt.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al agregar pago");
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar pago");
            return false;
        }

    }

    public boolean actualizar(Pago pago) {

        try {
            Conexion con = new Conexion();
            Connection cnt = con.obtenerConexion();

            String query = "UPDATE pago SET rut=?, tipoPago=?, valor=? WHERE idPago=?";
            PreparedStatement stmt = cnt.prepareStatement(query);

            stmt.setInt(1, pago.getRut());
            stmt.setString(2, pago.getTipoPago());
            stmt.setInt(3, pago.getValor());

            stmt.executeUpdate();
            stmt.close();
            cnt.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al actualizar pago");
            return false;
        } catch (Exception e) {
            System.out.println("Error al actualizar pago");
            return false;
        }

    }

    public boolean eliminar(int idPago) {

        try {
            Conexion con = new Conexion();
            Connection cnt = con.obtenerConexion();

            String query = "DELETE FROM pago WHERE idPago=?";
            PreparedStatement stmt = cnt.prepareStatement(query);
            stmt.setInt(1, idPago);

            stmt.executeUpdate();
            stmt.close();
            cnt.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al eliminar pago");
            return false;
        } catch (Exception e) {
            System.out.println("Error al eliminar pago");
            return false;
        }

    }

    public Pago buscarPago(int rut) {

        Pago pago = new Pago();

        try {

            Conexion conx = new Conexion();
            Connection cnx = conx.obtenerConexion();

            String query = "SELECT * FROM pago WHERE rut=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, rut);

            ResultSet result = stmt.executeQuery();

            if (result.next()) {

                pago.setIdPago(result.getInt("idPago"));
                pago.setRut(result.getInt("rut"));
                pago.setTipoPago(result.getString("tipoPago"));
                pago.setValor(result.getInt("valor"));
            }

            result.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar pago" + e.getMessage());

        }

        return pago;
    }

    public ArrayList<Pago> buscarTodo() {

        ArrayList<Pago> lista = new ArrayList<>();

        try {

            Conexion conx = new Conexion();
            Connection cnx = conx.obtenerConexion();

            String query = "SELECT * FROM pago ORDER BY idPago";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet result = stmt.executeQuery();

            while (result.next()) {

                Pago pago = new Pago();

                pago.setIdPago(result.getInt("idPago"));
                pago.setRut(result.getInt("rut"));
                pago.setTipoPago(result.getString("tipoPago"));
                pago.setValor(result.getInt("valor"));

                lista.add(pago);

            }

            result.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar todos los pagos" + e.getMessage());

        }

        return lista;
    }
}
