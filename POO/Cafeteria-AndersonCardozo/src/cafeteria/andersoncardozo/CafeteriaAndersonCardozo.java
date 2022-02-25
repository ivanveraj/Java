package cafeteria.andersoncardozo;

import java.util.Scanner;

public class CafeteriaAndersonCardozo {

    public static void main(String[] args) {
        int Menu,Cantidad;
        Scanner sn=new Scanner(System.in);
        System.out.println("Digite la cantidad de azucar añadir al inventario");
        int Azucar=sn.nextInt();
        Cafeteria C=new Cafeteria(Azucar);
        do{
            System.out.println("[1Venta jugo natural\n[2]Venta jugo con azucar\n[3]"
                    + "Inventario \n[4]Resumen\n[5]Salir");
            Menu=sn.nextInt();
            switch(Menu){
                case 0:{
                    C.VentaNatural(2);
                    C.VentaNatural(1);
                    C.VentaNatural(5);
                    C.VentaAzucar(7);
                    C.VentaAzucar(2);
                    C.VentaAzucar(1);
                }break;
                case 1:{
                    System.out.println("Digite la cantidad de vasos a vender: ");
                    Cantidad=sn.nextInt();
                    C.VentaNatural(Cantidad);
                }break;
                case 2:{
                    System.out.println("Digite la cedula del Titular: ");
                    Cantidad=sn.nextInt();
                    C.VentaAzucar(Cantidad);
                }break;
                case 3:{
                    C.Inventario();
                }break;
                case 4:{
                    C.InfoRecaudado();
                }break;
                case 5:{
                    System.out.println("Muchas gracias...");
                }break;
            }
        }while(Menu!=5);
    }
    
}
