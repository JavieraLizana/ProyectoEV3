package controlador;

import bd.Conexion;
import java.util.Date;
import modelo.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author javiera y Maximiliano
 */
public class RegistroPaciente {

    public boolean agregar(Paciente paciente) {

        Date date;

        try {

            Conexion conx = new Conexion();
            Connection cnx = conx.obtenerConexion();

            date = paciente.getFechaConsulta();

            String query = "INSERT INTO paciente (fechaConsulta, nombreMascota, especie, raza, edad, peso, sexo, procedimiento) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setDate(1, (java.sql.Date) paciente.getFechaConsulta());
            stmt.setString(2, paciente.getNombreMascota());
            stmt.setString(3, paciente.getEspecie());
            stmt.setString(4, paciente.getRaza());
            stmt.setInt(5, paciente.getEdad());
            stmt.setInt(6, paciente.getPeso());
            stmt.setString(7, String.valueOf(paciente.getSexo()));
            stmt.setString(8, paciente.getProcedimiento());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al agregar paciente");
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar paciente");
            return false;
        }

    }

    public boolean actualizar(Paciente paciente) {

        Date date;

        try {

            Conexion conx = new Conexion();
            Connection cnx = conx.obtenerConexion();

            date = paciente.getFechaConsulta();

            String query = "UPDATE paciente SET fechaConsulta=?, nombreMascota=?, especie=?, raza=?, edad, peso=?, sexo=?, procedimiento=? WHERE idConsulta=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setDate(1, (java.sql.Date) paciente.getFechaConsulta());
            stmt.setString(2, paciente.getNombreMascota());
            stmt.setString(3, paciente.getEspecie());
            stmt.setString(4, paciente.getRaza());
            stmt.setInt(5, paciente.getEdad());
            stmt.setInt(6, paciente.getPeso());
            stmt.setString(7, String.valueOf(paciente.getSexo()));
            stmt.setString(8, paciente.getProcedimiento());
            stmt.setInt(9, paciente.getIdConsulta());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al actualizar paciente");
            return false;
        } catch (Exception e) {
            System.out.println("Error al actualizar paciente");
            return false;

        }

    }

    public boolean eliminar(int idConsulta) {

        try {

            Conexion conx = new Conexion();
            Connection cnx = conx.obtenerConexion();

            String query = "DELETE FROM paciente WHERE idConsulta=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idConsulta);

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al eliminar paciente");
            return false;
        } catch (Exception e) {
            System.out.println("Error al eliminar paciente");
            return false;

        }

    }
    
}
