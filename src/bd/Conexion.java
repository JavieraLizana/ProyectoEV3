

package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author javiera Lizana
 * @version 25-11-2021
 */
public class Conexion {
    
    public Connection obtenerConexion(){
        
        Connection connection = null;
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/veterinaria","root","");
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexión (En la clase Conexión)" + e.getMessage());
        }
        return connection;
    }
}


