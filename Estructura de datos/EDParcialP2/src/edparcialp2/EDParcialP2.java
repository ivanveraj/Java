/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edparcialp2;

/**
 *
 * @author Usuario
 */
public class EDParcialP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila P=new Pila();
        System.out.println("Esta vacio: "+P.isEmpty());
        System.out.println("Cuantos elementos: "+P.Size());
        System.out.println(P.Push(23)); 
        System.out.println(P.Push(26));
        System.out.println(P.Push(29)); 
        System.out.println(P.Push(32)); 
        System.out.println(P.Push(30)); 
        System.out.println(P.Push(31)); 
        System.out.println("Cuantos elementos: "+P.Size());
        System.out.println(P.Atencion(2343));
    }
    
}
