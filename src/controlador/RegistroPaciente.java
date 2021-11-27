package controlador;

import bd.Conexion;
import java.util.Date;
import modelo.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

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

            String query = "INSERT INTO paciente (fechaConsulta, nombreMascota, especie, raza, sexo, peso, edad, procedimiento) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setDate(1, new java.sql.Date(date.getTime()));
            stmt.setString(2, paciente.getNombreMascota());
            stmt.setString(3, paciente.getEspecie());
            stmt.setString(4, paciente.getRaza());
            stmt.setString(5, paciente.getSexo());
            stmt.setDouble(6, paciente.getPeso());
            stmt.setInt(7, paciente.getEdad());
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

            String query = "UPDATE paciente SET fechaConsulta=?, nombreMascota=?, especie=?, raza=?, sexo=?, peso=?, edad=?, procedimiento=? WHERE idConsulta=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setDate(1, new java.sql.Date(date.getTime()));
            stmt.setString(2, paciente.getNombreMascota());
            stmt.setString(3, paciente.getEspecie());
            stmt.setString(4, paciente.getRaza());
            stmt.setString(5, paciente.getSexo());
            stmt.setDouble(6, paciente.getPeso());
            stmt.setInt(7, paciente.getEdad());
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

    public Paciente buscarPaciente(int idConsulta) {

        Paciente paciente = new Paciente();

        try {

            Conexion conx = new Conexion();
            Connection cnx = conx.obtenerConexion();

            String query = "SELECT * FROM paciente WHERE idConsulta=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idConsulta);

            ResultSet result = stmt.executeQuery();

            if (result.next()) {

                paciente.setIdConsulta(result.getInt("idConsulta"));
                paciente.setFechaConsulta(result.getDate("fechaConsulta"));
                paciente.setNombreMascota(result.getString("nombreMascota"));
                paciente.setEspecie(result.getString("especie"));
                paciente.setRaza(result.getString("raza"));
                paciente.setSexo(result.getString("sexo"));
                paciente.setPeso(result.getDouble("peso"));
                paciente.setEdad(result.getInt("edad"));
                paciente.setProcedimiento(result.getString("procedimiento"));

            }

            result.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar al paciente por id" + e.getMessage());

        }

        return paciente;
    }

    public ArrayList<Paciente> buscarTodo() {

        ArrayList<Paciente> lista = new ArrayList<>();

        try {

            Conexion conx = new Conexion();
            Connection cnx = conx.obtenerConexion();

            String query = "SELECT * FROM paciente ORDER BY idConsulta";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet result = stmt.executeQuery();

            while (result.next()) {

                Paciente paciente = new Paciente();

                paciente.setIdConsulta(result.getInt("idConsulta"));
                paciente.setFechaConsulta(result.getDate("fechaConsulta"));
                paciente.setNombreMascota(result.getString("nombreMascota"));
                paciente.setEspecie(result.getString("especie"));
                paciente.setRaza(result.getString("raza"));
                paciente.setSexo(result.getString("sexo"));
                paciente.setPeso(result.getDouble("peso"));
                paciente.setEdad(result.getInt("edad"));
                paciente.setProcedimiento(result.getString("procedimiento"));

                lista.add(paciente);

            }

            result.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar todos los paciente" + e.getMessage());

        }

        return lista;
    }
}
