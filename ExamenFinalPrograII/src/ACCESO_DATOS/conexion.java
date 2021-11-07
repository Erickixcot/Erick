
package ACCESO_DATOS;

 import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {

Connection enlazar=null;
    
    public Connection conectar(){
        try 
        {
        
            Class.forName("com.mysql.jdbc.Driver");
            enlazar = DriverManager.getConnection("jdbc:mysql://localhost:3306/examenfinalprogra2b-2","root","");
            
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }        
    
    
    return enlazar;

    }

    public com.mysql.jdbc.Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    }