/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2corteed;

/**
 *
 * @author Usuario
 */
public class Parcial2CorteED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaD L=new ListaD();
        L.InsertLast(3);
        L.InsertLast(8);
        L.InsertLast(2);
        L.InsertLast(5);
        L.InsertLast(1);
        System.out.println(L.PrintList());
        System.out.println("ORDEN");
        L.miOrden();
        System.out.println(L.PrintList());
    }
    
}
