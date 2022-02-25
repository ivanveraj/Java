/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2corteed2;

/**
 *
 * @author Usuario
 */
public class Parcial2CorteED2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista L=new Lista();
        L.InsertFirst(2);
        L.InsertFirst(9);
        L.InsertFirst(4);
        L.InsertFirst(1);
        L.InsertFirst(5);
        L.InsertFirst(8);
        System.out.println(L.PrintList());
        L.Intercambio(5,9);
        System.out.println(L.PrintList());
    }
    
}
