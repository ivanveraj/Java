/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;
import java.util.Scanner;

public class Farmacia {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int Menu,Cantidad;
        long Codigo;
        Control E=new Control ();
        do{
        System.out.println("1. Inventario Producto.\n"+"2. Venta de Producto.\n"+"3. Información de Medicamento\n"+"4. Informe de Pedido.\n"
                +"5. Resumen de Ventas\n"+"6. Salir");
        Menu=sn.nextInt();
        switch(Menu){
            case 0:{
                E.InventarioProducto(123);
                E.InventarioProducto(124);
                E.InventarioProducto(123);
            }break;
            case 1:{
                System.out.println("Digite el Codigo del medicamento");
                Codigo=sn.nextLong();
                System.out.println(E.InventarioProducto(Codigo));
            }break;
            case 2:{
                System.out.println("Digite el Codigo del medicamento");
                Codigo=sn.nextLong();
                System.out.println("Digite la cantidad del medicamento");
                Cantidad=sn.nextInt();
                System.out.println(E.VentaMedicamento(Codigo,Cantidad));
            }break;
            case 3:{
                System.out.println("Digite el Codigo del medicamento");
                Codigo=sn.nextLong();
                System.out.println();
                E.InformacionMedicamento(Codigo);
            }break;
            case 4:{
                E.InformePedido();
            }break;
            case 5:{
                System.out.println(E.ResumenVentas());
            }break;
            case 6:{
                System.out.println("Muchas gracias, hasta luego");
            }break;
        }
        }while(Menu!=6);
    }
}
