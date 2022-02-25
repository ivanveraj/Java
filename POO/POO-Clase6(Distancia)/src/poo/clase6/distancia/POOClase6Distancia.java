/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase6.distancia;
import java.util.*;
/**
 *
 * @author iser
 */
public class POOClase6Distancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn=new Scanner (System.in);
        double Px,Py;
        System.out.println("Digite X1");
        Px=sn.nextDouble();
        System.out.println("Digite Y1");
        Py=sn.nextDouble();
        Punto P1=new Punto(Px,Py);
        System.out.println("Digite X2");
        Px=sn.nextDouble();
        System.out.println("Digite Y2");
        Py=sn.nextDouble();
        Punto P2=new Punto(Px,Py);
        System.out.println("Digite X3");
        Px=sn.nextDouble();
        System.out.println("Digite Y3");
        Py=sn.nextDouble();
        Punto P3=new Punto(Px,Py);
        System.out.println("Digite X4");
        Px=sn.nextDouble();
        System.out.println("Digite Y4");
        Py=sn.nextDouble();
        Punto P4=new Punto(Px,Py);
        P1.CalD(P2);
        
        System.out.println("La distancia es del P1 al P2 es "+P1.getD());
        
        P1.CalD(P3);
        
        System.out.println("La distancia es del P1 al P3 es "+P1.getD());
        
        P1.CalD(P4);
        
        System.out.println("La distancia es del P1 al P4 es "+P1.getD());
        
        P2.CalD(P3);
        
        System.out.println("La distancia es del P2 al P3 es "+P2.getD());
        
        P2.CalD(P4);
        
        System.out.println("La distancia es del P2 al P4 es "+P2.getD());
        
        P3.CalD(P4);
        
        System.out.println("La distancia es del P3 al P4 es "+P3.getD());
    
    }
    
}
