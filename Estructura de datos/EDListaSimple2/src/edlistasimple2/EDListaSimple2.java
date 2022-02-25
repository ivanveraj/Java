/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edlistasimple2;

/**
 *
 * @author Usuario
 */
public class EDListaSimple2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista L=new Lista();
        L.InsertarOrdenado(5);
        L.InsertarOrdenado(1);
        L.InsertarOrdenado(3);
        L.InsertarOrdenado(4);
        L.InsertarOrdenado(5);
        L.InsertarOrdenado(6);
        L.InsertarOrdenado(7);
        L.InsertarOrdenado(7);
        L.InsertarOrdenado(2);
        System.out.println(L.viewList());
    }
    
}
