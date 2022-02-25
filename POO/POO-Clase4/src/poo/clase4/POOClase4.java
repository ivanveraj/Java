/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase4;
import java.util.*;
/**
 *
 * @author iser
 */
public class POOClase4 {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String Sexo="";

        Estudiante E=new Estudiante();
        System.out.println("Digite el Codigo del estudiante");
        int Cod=sn.nextInt();
        E.setCod(Cod);
        System.out.println("Digite el Nombre del estudiante");
        sn.nextLine();
        String Nombre=sn.nextLine();
        E.setNomb(Nombre);
        System.out.println("Digite la Edad del estudiante");
        int Edad=sn.nextInt();
        E.setEdad(Edad);
        System.out.println("Digite el Sexo del estudiante  0=Masculino  1=Femenino");
        int Sex=sn.nextInt();
        E.setSex(Sex);
        if(E.getSex()==0){
            Sexo="Masculino";
            if(E.getEdad()>18){
            System.out.println("El estudiante de Codigo "+E.getCod()+" con nombre "+E.getNomb()+" tiene "+E.getEdad()+" es de sexo "+Sexo+" es mayor de edad");
            }else if(E.getEdad()<18){
            System.out.println("El estudiante de Codigo "+E.getCod()+" con nombre "+E.getNomb()+" tiene "+E.getEdad()+" es de sexo "+Sexo+" es menor de edad");
            }}else if(E.getSex()==1){
            Sexo="Femenino";
            if(E.getEdad()>18){
            System.out.println("El estudiante de Codigo "+E.getCod()+" con nombre "+E.getNomb()+" tiene "+E.getEdad()+" es de sexo "+Sexo+" es mayor de edad");
            }else if(E.getEdad()<18){
            System.out.println("El estudiante de Codigo "+E.getCod()+" con nombre "+E.getNomb()+" tiene "+E.getEdad()+" es de sexo "+Sexo+" es menor de edad");
            }
        }
        
            
        
        
        
        
        
        
        
        
        
       
    }
    
}
