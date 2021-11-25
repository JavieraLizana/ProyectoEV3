/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import bd.Conexion;
import java.util.Date;
import modelo.Dueño;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
            System.out.println("Error SQL al agregar Datos del Dueño");
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar datos del Dueño");
            return false;
        }

    }

}
