/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase7.banco;
import java.util.*;
/**
 *
 * @author iser
 */
public class POOClase7Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long Num,Ced;
        double Saldo;
        int opc;
        ControlC C=new ControlC();
        Scanner sn=new Scanner(System.in);
        
        do{
        System.out.println("[1]Crear Cuenta\n[2]Consultar Informacion\n[3]Consignar\n[4]Retirar\n[5]Salir\nSeleccione una");
        opc=sn.nextInt();
        switch(opc){
            case 1:{
                System.out.println("Digite el numero de Cuenta");
                Num=sn.nextLong();
                System.out.println("Digite su ced");
                Ced=sn.nextLong();
                System.out.println("Digite su saldo inicial");
                Saldo=sn.nextDouble();
                System.out.println(C.Crear(Num,Ced,Saldo));
                
                
            }break;
            case 2:{
                System.out.println("Digite el numero de Cuenta");
                Num=sn.nextLong();
                System.out.println(C.Consulta(Num));
            }break;
            case 3:{
                System.out.println("Digite el numero de Cuenta");
                Num=sn.nextLong();
                System.out.println("Digite el monto a Consignar");
                Saldo=sn.nextDouble();
                System.out.println(C.Consignacion(Num,Saldo));
            }break;
            case 4:{
                System.out.println("Digite el numero de Cuenta");
                Num=sn.nextLong();
                System.out.println("Digite el monto a retirar");
                Saldo=sn.nextInt();
                System.out.println(C.Retiro(Num,Saldo));
            }break;
            case 5:{
                System.out.println("Hasta luego");
            }break;
        }
        }while(opc!=5);
        
        
        
        
    }
    
}
