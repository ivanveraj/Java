/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_java_postgresql;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Usuario
 */
public class Conexion {
    Connection C;
    public Conexion(){
        try{
            String Url="jdbc:postgresql://localhost:5432/TallerUno";
            String User="postgres";
            String Password="Jivjmmm08@";
            Class.forName("org.postgresql.Driver");
            C=DriverManager.getConnection(Url,User,Password);
        }catch(Exception E){
            System.out.println("Error DB: "+E);
        }
    }
}
