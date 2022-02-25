package listaenlazadas;
import java.util.Scanner;

public class ListaEnlazadas {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int Menu,Nota;
        Lista L=new Lista();
        do{
            System.out.println("Iniciando programa");
            System.out.println("[1]Ingresar notas\n[2]Imprimir notas\n"
                + "[3]Promedio notas\n[4]Salir");
            Menu=sn.nextInt();
            switch(Menu){
                case 0:{
                    L.Insert(40);
                    L.Insert(50);
                    L.Insert(50);
                    L.Insert(38);
                    L.Insert(39);
                }break;
                case 1:{
                    System.out.println("Digite la nota a ingresar: ");
                    Nota=sn.nextInt();
                    L.Insert(Nota);
                }break;
                case 2:{
                    System.out.println("Imprimiendo notas");
                    L.Imprimir();
                }break;
                case 3:{
                    System.out.println("El promedio de las notas es:"+L.Promedio());
                }break;
                case 4:{
                    System.out.println("Muchas gracias...");
                }break;
            }
        }while(Menu!=4);
    }
}
