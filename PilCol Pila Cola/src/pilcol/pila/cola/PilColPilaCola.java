/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilcol.pila.cola;

/**
 *
 * @author Usuario
 */
public class PilColPilaCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilCol PC=new PilCol();
        PC.IngresoPilCol(2);
        PC.IngresoPilCol(3);
        PC.IngresoPilCol(4);
        PC.IngresoPilCol(5);
        PC.IngresoPilCol(8);
        PC.IngresoPilCol(9);
        PC.IngresoPilCol(1);
        System.out.println(PC.MostrarPilCol());
        PC.Eliminador();
        PC.Eliminador();
        System.out.println(PC.MostrarPilCol());
        PC.ConsultarRetiro();
        PC.IntercambioEspecial();
        System.out.println(PC.MostrarPilCol());
    }
    
}
