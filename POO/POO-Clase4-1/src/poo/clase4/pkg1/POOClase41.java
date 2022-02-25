/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase4.pkg1;
import java.util.*;
/**
 *
 * @author iser
 */
public class POOClase41 {
    

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        Conversion O=new Conversion();
        double D,P;
        System.out.println(" Pesos a dolares=0 \n Dolares a pesos=1");
        int opc=sn.nextInt();
        if (opc==0){
            System.out.println("Digite el monto a convertir");
            O.setMonto(sn.nextDouble());
            System.out.println("Digite la tasa de cambio");
            O.setTasa(sn.nextDouble());
            D=O.getMonto()/O.getTasa();
            System.out.println("El total de dolares es "+D);
            
            
        }else if(opc==1){
            System.out.println("Digite el monto a convertir");
            O.setMonto(sn.nextDouble());
            System.out.println("Digite la tasa de cambio");
            O.setTasa(sn.nextDouble());
            P=O.getMonto()*O.getTasa();
            System.out.println("El total de pesos es "+P);
            
        }
        
       
       
       
       
    }
    
}
