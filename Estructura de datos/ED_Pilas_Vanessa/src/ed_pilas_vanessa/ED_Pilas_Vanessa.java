package ed_pilas_vanessa;

import java.util.Scanner;

public class ED_Pilas_Vanessa {

    public static void main(String[] args) {
         int Menu;
        Scanner sn=new Scanner(System.in);
        System.out.println("Digite el total de notas a registrar");
        int T=sn.nextInt();
        Pila P=new Pila(T);
        do{
            System.out.println("[1]Ingresar nota\n[2]Media (Promedio)\n[3]"
                    + "Moda\n[4]Imprimir\n[5]Salir");
            Menu=sn.nextInt();
            switch(Menu){
                case 0:{
                    P.Push(40);
                    P.Push(39);
                    P.Push(40);
                    P.Push(40);
                    P.Push(23);
                }break;
                case 1:{
                    System.out.println("Ingrese nota: ");
                    int Nota=sn.nextInt();
                    P.Push(Nota);
                }break;
                case 2:{
                    System.out.println("Imprimiendo media");
                    P.Media();
                }break;
                case 3:{
                    System.out.println("Imprimiendo moda");
                    P.Moda();
                }break;
                case 4:{
                    System.out.println("Imprimiendo notas: ");
                    P.Print();
                }break;
                case 5:{
                    System.out.println("Muchas gracias...");
                }break;
            }
        }while(Menu!=5);
    }
    
}
