/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivero;
import java.util.Scanner;

public class Vivero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Digite el tamaño del vector Plantas");
        int TPlantas=sn.nextInt();
        System.out.println("Digite el tamaño del vector Macetas");
        int TMacetas=sn.nextInt();
        System.out.println("Digite el tamaño del vector Abono");
        int TAbono=sn.nextInt();
        Control C=new Control(TPlantas, TMacetas, TAbono);
        C.LlenarVectores();
        C.CantidadPlantasSombra();
        C.TotalPrecioMateras();
        C.ListarPlantasSolares();
        C.ListarAbonosPrecio();
        C.PrecioMasBajo();
    }
    
}
