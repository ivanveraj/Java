/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

import java.util.Scanner;

/**
 *
 * @author MILE-IVA
 */
public class Parqueadero {

    public static void main(String[] args) {
        Scanner sn=new Scanner (System.in);
        int menu,T,Dia,M,A,H,Mi,S;
        long P,D;
        Control E=new Control();
        do{
            System.out.println("Digite una de las siguientes opciones \n[1]Ingresar Vehiculo al Parqueadero\n[2]Retirar Vehiculo del Parqueadero"
                + "\n[3]Salir\n");
            menu=sn.nextInt();
            switch(menu){
                case 0:{
                }break;
                case 1:{
                    System.out.println("Digite el numero del Documento");
                    D=sn.nextLong();
                    System.out.println("Digite el numero de la Placa");
                    P=sn.nextLong();
                    System.out.println(E.IngresarVehiculo(D,P)+"\n");
                }break;
                case 2:{
                    System.out.println("Digite el numero del Tiquete");
                    T=sn.nextInt();
                    System.out.println("Digite el Dia");
                    Dia=sn.nextInt();
                    System.out.println("Digite el Mes");
                    M=sn.nextInt();
                    System.out.println("Digite el Año");
                    A=sn.nextInt();
                    System.out.println("Digite el Hora");
                    H=sn.nextInt();
                    System.out.println("Digite el Minuto");
                    Mi=sn.nextInt();
                    System.out.println("Digite el Segundo");
                    S=sn.nextInt();
                    System.out.println(E.RetirarVehiculo(Dia,M,A,H,Mi,S,T)+"\n");
                }break;
                case 3:
                    System.out.println("Hasta luego");
                }break;
        }while(menu!=3);
    }
    }
