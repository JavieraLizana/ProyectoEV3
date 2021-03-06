package controlador;

import bd.Conexion;
import java.util.Date;
import modelo.Dueño;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Maximiliano y Javiera
 */
public class RegistroDueño {

    public boolean agregar(Dueño dueño) {

        try {
            Conexion con = new Conexion();
            Connection cnt = con.obtenerConexion();

            String query = "INSERT INTO dueño(rut, nombre, apellido, direccionCalle, direccionNro, telefono) VALUES (?,?,?,?,?,?)";
            PreparedStatement stmt = cnt.prepareStatement(query);

            stmt.setInt(1, dueño.getRut());
            stmt.setString(2, dueño.getNombre());
            stmt.setString(3, dueño.getApellido());
            stmt.setString(4, dueño.getDireccionCalle());
            stmt.setInt(5, dueño.getDireccionNro());
            stmt.setInt(6, dueño.getTelefono());

            stmt.executeUpdate();
            stmt.close();
            cnt.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al agregar datos del dueño");
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar datos del dueño");
            return false;
        }

    }

    public boolean actualizar(Dueño dueño) {

        try {
            Conexion con = new Conexion();
            Connection cnt = con.obtenerConexion();

            String query = "UPDATE dueño SET nombre=?, apellido=?, direccionCalle=?, direccionNro=?, telefono=? WHERE rut=?";
            PreparedStatement stmt = cnt.prepareStatement(query);

            stmt.setString(1, dueño.getNombre());
            stmt.setString(2, dueño.getApellido());
            stmt.setString(3, dueño.getDireccionCalle());
            stmt.setInt(4, dueño.getDireccionNro());
            stmt.setInt(5, dueño.getTelefono());
             stmt.setInt(6, dueño.getRut());

            stmt.executeUpdate();
            stmt.close();
            cnt.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al actualizar datos del dueño");
            return false;
        } catch (Exception e) {
            System.out.println("Error al actualizar datos del dueño");
            return false;
        }

    }

    public boolean eliminar(int rut) {

        try {
            Conexion con = new Conexion();
            Connection cnt = con.obtenerConexion();

            String query = "DELETE FROM dueño WHERE rut=?";
            PreparedStatement stmt = cnt.prepareStatement(query);
            stmt.setInt(1, rut);

            stmt.executeUpdate();
            stmt.close();
            cnt.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al eliminar datos del dueño");
            return false;
        } catch (Exception e) {
            System.out.println("Error al eliminar datos del dueño");
            return false;
        }

    }

    public Dueño buscarDueño(int rut) {

        Dueño dueño = new Dueño();

        try {

            Conexion conx = new Conexion();
            Connection cnt = conx.obtenerConexion();

            String query = "SELECT * FROM dueño WHERE rut=?";
            PreparedStatement stmt = cnt.prepareStatement(query);
            stmt.setInt(1, rut);

            ResultSet rsl = stmt.executeQuery();

            if (rsl.next()) {

                dueño.setRut(rsl.getInt("rut"));
                dueño.setNombre(rsl.getString("nombre"));
                dueño.setApellido(rsl.getString("apellido"));
                dueño.setDireccionCalle(rsl.getString("direccionCalle"));
                dueño.setDireccionNro(rsl.getInt("direccionNro"));
                dueño.setTelefono(rsl.getInt("telefono"));

            }

            rsl.close();
            stmt.close();
            cnt.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar dueño" + e.getMessage());

        }

        return dueño;
    }

    public ArrayList<Dueño> buscartodo() {
        ArrayList<Dueño> lista = new ArrayList();

        try {

            Conexion conx = new Conexion();
            Connection cnt = conx.obtenerConexion();

            String query = "SELECT * FROM dueño ORDER BY apellido";
            PreparedStatement stmt = cnt.prepareStatement(query);

            ResultSet rsl = stmt.executeQuery();

            while (rsl.next()) {

                Dueño dueño = new Dueño();

                dueño.setRut(rsl.getInt("rut"));
                dueño.setNombre(rsl.getString("nombre"));
                dueño.setApellido(rsl.getString("apellido"));
                dueño.setDireccionCalle(rsl.getString("direccionCalle"));
                dueño.setDireccionNro(rsl.getInt("direccionNro"));
                dueño.setTelefono(rsl.getInt("telefono"));

                lista.add(dueño);

            }
            rsl.close();
            stmt.close();
            cnt.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar todos los dueños." + e.getMessage());
        }
        return lista;
    }

}
