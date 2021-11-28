
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
     
     
     
}
