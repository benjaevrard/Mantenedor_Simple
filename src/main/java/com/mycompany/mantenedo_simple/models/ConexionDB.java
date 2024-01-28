package com.mycompany.mantenedo_simple.models;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Benjamin Evrard
 */
public class ConexionDB {
    static final Properties props = new Properties();
    
    static {
        try (InputStream input = new FileInputStream("config.properties")) {
            props.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // Método para establecer la conexión
    public static Connection Conectar() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(props.getProperty("url"), props.getProperty("usuario"), props.getProperty("contrasena"));
            System.out.println("Conexión exitosa.");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return conexion;
    }

    // Método para cerrar la conexión
    public static void Desconectar(Connection conexion) {
        try {
            if (conexion != null) {
                conexion.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Connection conexion = Conectar();
        // Realizar operaciones con la base de datos...
        Desconectar(conexion);
    }
}
