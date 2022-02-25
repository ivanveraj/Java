/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizyeimyvector;

/**
 *
 * @author Usuario
 */
public class QuizYeimyVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector V=new Vector(5);
        V.Insertar(5);
        V.Insertar(7);
        V.Insertar(4);
        V.Insertar(10);
        V.Insertar(3);
        System.out.println(V.Imprimir());
        Vector V2=new Vector(5);
        V2.Insertar(5);
        V2.Insertar(7);
        V2.Insertar(4);
        V2.Insertar(10);
        V2.Insertar(3);
        System.out.println(V2.Imprimir());
        System.out.println(V.Compara(V2));
        
    }
    
}
