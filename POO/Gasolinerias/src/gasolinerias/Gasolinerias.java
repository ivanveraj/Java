/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasolinerias;
import java.util.Scanner;

/**
 *
 * @author PC-JIVJ
 */
public class Gasolinerias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Menu,Codigo=1,Gasolina,ACPM,CodigoE;
        Scanner sn=new Scanner(System.in);
        Control C=new Control();
        do{
            System.out.println("[1]Crear una Estación de Servicio\n[2]Venta de Gasolina\n[3]"
                    + "Venta de ACPM\n[4]Recargar Estación\n[5]"
                    + "Resumen\n[6]Salir");
            Menu=sn.nextInt();
            switch(Menu){
                case 0:{
                    System.out.println(C.CrearEstacion(1,12,12));
                    System.out.println(C.CrearEstacion(2,10,10));
                    System.out.println(C.CrearEstacion(3,10,10));
                    System.out.println(C.CrearEstacion(4,10,10));
                    System.out.println(C.CrearEstacion(5,10,10));
                }break;
                case 1:{
                    System.out.println("Codigo de Estacion: "+Codigo);
                    System.out.println("Digite Cantidad de Galones Gasolina");
                    Gasolina=sn.nextInt();
                    System.out.println("Digite Cantidad de Galones ACPM");
                    ACPM=sn.nextInt();
                    System.out.println(C.CrearEstacion(Codigo,Gasolina,ACPM));
                    Codigo++;
                }break;
                case 2:{
                    System.out.println("Digite codigo de la estacion");
                    CodigoE=sn.nextInt();
                    System.out.println("Digite cantidad de gasolina Vendida");
                    Gasolina=sn.nextInt();
                    System.out.println(C.VentaGasolina(CodigoE,Gasolina));
                }break;
                case 3:{
                    System.out.println("Digite codigo de la estacion");
                    CodigoE=sn.nextInt();
                    System.out.println("Digite cantidad de ACPM Vendida");
                    ACPM=sn.nextInt();
                    System.out.println(C.VentaACPM(CodigoE,ACPM));
                }break;
                case 4:{
                    System.out.println("Digite codigo de la estacion");
                    CodigoE=sn.nextInt();
                    System.out.println("Digite la cantidad de Gasolina");
                    Gasolina=sn.nextInt();
                    System.out.println("Digite la cantidad de ACPM");
                    ACPM=sn.nextInt();
                    System.out.println(C.RecargarEstacion(CodigoE,ACPM,Gasolina));
                }break;
                case 5:{
                    System.out.println("Realizando resumen");
                    C.Resumen();
                }break;
                case 6:{
                    System.out.println("Muchas gracias...");
                }break;
            }
        }while(Menu!=6);
    }
    
}
