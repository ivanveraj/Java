/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_parcial1_yeimysantos;

/**
 *
 * @author Usuario
 */
public class ED_Parcial1_YeimySantos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector V=new Vector(5);
        V.Insertar(3);
        V.Insertar(6);
        V.Insertar(6);
        V.Insertar(9);
        V.Insertar(12);
        V.Imprimir();
        V.Invertir();
        V.Imprimir();
        V.BorrarPrimero();
        V.Imprimir();
        V.BorrarUltimo();
        V.Imprimir();
    }
    
}
