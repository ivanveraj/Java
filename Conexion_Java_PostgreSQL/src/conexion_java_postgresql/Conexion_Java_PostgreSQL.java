/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_java_postgresql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author Usuario
 */
public class Conexion_Java_PostgreSQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Conexion C=new Conexion();
       Statement St;
       ResultSet Rs;
       try{
           St=C.C.createStatement();
           Rs=St.executeQuery("select * from taller1.persona");
           while(Rs.next()){
               System.out.println(Rs.getString("pers_id"));
               System.out.println(Rs.getString("pers_nombre"));
           }
       }catch(Exception E){
           System.out.println("Error: "+E);
       }
    }
    
}
