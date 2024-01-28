package com.mycompany.mantenedo_simple.models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Benjamin Evrard
 */
public class ConexionDB {
    // Parámetros de conexión
    static final String URL = "jdbc:mysql://localhost:3306/mantenedor_simple";
    static final String USUARIO = "bevrardc";
    static final String CONTRASENA = "L0ret0310@#@#";

    // Método para establecer la conexión
    public static Connection Conectar() {
        Connection conexion = null;
        try {
            // Registrar el driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establecer la conexión
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
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
