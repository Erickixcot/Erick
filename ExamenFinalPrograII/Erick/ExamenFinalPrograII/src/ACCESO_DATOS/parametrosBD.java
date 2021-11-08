
package ACCESO_DATOS;

//~--- JDK imports ------------------------------------------------------------
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class parametrosBD {

    Connection conexion;
    Statement instruccion;
    ResultSet tabla;
    static String url, usuario, password, host, port, database;

    parametrosBD() {
              host= "localhost";
        port= "3306";
        database= "examenfinalprogra2b-2";
        url = "jdbc:mysql://"+host+":"+port+"/"+database;
        usuario = "root";
        password = "";
    }
   
    public Connection conectar() {
        //<editor-fold defaultstate="collapsed" desc="conectar()">
        try {
            
            // Se carga el driver
            Class.forName("org.postgresql.Driver");
            
        } catch (Exception e) {
            System.out.println("No se pudo cargar el driver.");
        }
        
        try {
            
            // Crear el objeto de conexion a la base de datos
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexion Abierta");
            
            return conexion;
            
            // Crear objeto Statement para realizar queries a la base de datos
        } catch (Exception e) {
            System.out.println("No se pudo abrir la bd.");
            
            return null;
        }
        //</editor-fold>
    }
    
    public void cerrarConexion(Connection c) {
        //<editor-fold defaultstate="collapsed" desc="cerrarConexion">
        try {
            c.close();
        } catch (Exception e) {
            System.out.println("No se pudo cerrar.");
        }
        //</editor-fold>
    }

    public static void setDatabase(String database) {
        parametrosBD.database = database;
    }

    public static void setHost(String host) {
        parametrosBD.host = host;
    }

    public static void setPassword(String password) {
        parametrosBD.password = password;
    }

    public static void setPort(String port) {
        parametrosBD.port = port;
    }

    public static void setUsuario(String usuario) {
        parametrosBD.usuario = usuario;
    }

    public static void updateUrl() {
        parametrosBD.url = "jdbc:mysql://"+host+":"+port+"/"+database;;
    }
   
}
