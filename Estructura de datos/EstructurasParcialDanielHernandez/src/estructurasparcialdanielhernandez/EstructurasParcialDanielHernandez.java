/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasparcialdanielhernandez;

import java.util.Scanner;

public class EstructurasParcialDanielHernandez {

    public static void main(String[] args) {
        int Menu;
        Scanner sn=new Scanner(System.in);
        Vector V=new Vector(4);
        do{
            System.out.println("[1]Insertar\n[2]Eliminar primer\n[3]"
                    + "Eliminar ultimo\n[4]Invertir\n[5]Imprimir\n[6]Salir");
            Menu=sn.nextInt();
            switch(Menu){
                case 1:{
                    System.out.println("Digite un numero");
                    int N=sn.nextInt();
                    V.Insertar(N);
                }break;
                case 2:{
                    V.FunBorrarPrimero();
                }break;
                case 3:{
                    V.FunBorrarUltimo();
                }break;
                case 4:{
                   V.FunInvertir();
                }break;
                case 5:{
                    V.Impresion();
                }break;
                case 6:{
                    System.out.println("Saliendo");
                }break;
            }
        }while(Menu!=6);
    }
    
}
