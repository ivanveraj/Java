package ed_colas_vanessa;
import java.util.Scanner;
public class ED_Colas_Vanessa {
    public static void main(String[] args) {
       int Menu;
        Scanner sn=new Scanner(System.in);
        Cola C=new Cola();
        do{
            System.out.println("[1]Ingresar nota\n[2]Media (Promedio)\n[3]"
                    + "Moda\n[4]Imprimir\n[5]Salir");
            Menu=sn.nextInt();
            switch(Menu){
                case 0:{
                    C.Enqueue(40);
                    C.Enqueue(39);
                    C.Enqueue(40);
                    C.Enqueue(40);
                    C.Enqueue(23);
                }break;
                case 1:{
                    System.out.println("Ingrese nota: ");
                    int Nota=sn.nextInt();
                    C.Enqueue(Nota);
                }break;
                case 2:{
                    System.out.println("Imprimiendo media");
                    C.Media();
                }break;
                case 3:{
                    System.out.println("Imprimiendo moda");
                    C.Moda();
                }break;
                case 4:{
                    System.out.println("Imprimiendo notas: ");
                    C.Imprimir();
                }break;
                case 5:{
                    System.out.println("Muchas gracias...");
                }break;
            }
        }while(Menu!=5);
    }
    
}
