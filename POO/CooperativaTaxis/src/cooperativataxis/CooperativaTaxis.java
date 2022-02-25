/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cooperativataxis;
import java.util.*;
/**
 *
 * @author MILE-IVA
 */
public class CooperativaTaxis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
        long Numero;
        double Valor;
        Taxis E=new Taxis();
        Scanner sn=new Scanner (System.in);
        
        do{
            System.out.println("Digite una de las siguientes opciones \n[1]Registro de un Movil\n[2]Registro de un servicio"
                + "\n[3]Informacion de movil\n[4]Resumen\n[5]Salir\n");
            menu=sn.nextInt();
            switch(menu){
                case 0:{
                    E.RegistroDelMovil(123);
                    E.RegistroDelMovil(124);
                    E.RegistroDelMovil(125);
                }break;
                case 1:{
                    System.out.println("Ingrese el numero del Movil");
                    Numero=sn.nextLong();
                    System.out.println(E.RegistroDelMovil(Numero));
                }break;
                case 2:{
                    System.out.println("Ingrese el numero del Movil");
                    Numero=sn.nextLong();
                    System.out.println("Ingrese el cobro realizado");
                    Valor=sn.nextDouble();
                    System.out.println(E.RegistroDeServicio(Numero,Valor));
                }break;
                case 3:{
                    System.out.println("Ingrese el numero del Movil");
                    Numero=sn.nextLong();
                    System.out.println(E.InformacionDelMovil(Numero));
                }break;
                case 4:{
                    
                }break;
                case 5:{
                    System.out.println("Hasta luego");
                }break;
            }
        }while(menu!=5);
    }
    
}
