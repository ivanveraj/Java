package mallelyejerciciocinco;
import java.util.Scanner;
public class MallelyEjercicioCinco {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String Nombre;
        int Cantidad,CantidadA;
        double Precio;
        System.out.println("Digite la cantidad de articulos a vender");
        CantidadA=sn.nextInt();
        Vendedor V=new Vendedor("Ivan",1005,CantidadA);
        V.Venta("Carne",1500,2);
        V.Venta("Papa",900,1);
        V.Informacion();
        for(int i=0;i<3;i++){
            System.out.println("Digite el nombre del producto: ");
            sn.nextLine();
            Nombre=sn.nextLine();
            System.out.println("Digite el precio del producto: ");
            Precio=sn.nextDouble();
            System.out.println("Digite cantidad de productos vendidos");
            Cantidad=sn.nextInt();
            V.Venta(Nombre,Precio,Cantidad);
        }
        V.Informacion();
        System.out.println("Pruebas");
        V.Venta("Carne",1500,2);
        V.Venta("Papa",900,1);
        V.Informacion();
    }
}
