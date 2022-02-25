package supermercado.d1;

import java.util.Scanner;

public class SupermercadoD1 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int Menu;
        int CantidadProductosBodega=30;
        Control C=new Control(CantidadProductosBodega);
        C.InicioSistema();
        do{
            System.out.println("[1]Venta productos\n[2]Añadir existencia x producto\n[3]Salir");
            Menu=sn.nextInt();
            switch(Menu){
                case 1:{
                    
                }break;
            }
        }while(Menu!=3);
    }
    
}
