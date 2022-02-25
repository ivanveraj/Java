package listacircularvanessa;
import java.util.Scanner;
public class ListaCircularVanessa {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int Kilometros;
        ListaC L=new ListaC();
        System.out.println("Ingreso de datos competencia de atletismo");
        /*
        Pruebas
        L.Agregar(34);
        L.Agregar(35);
        L.Agregar(36);
        L.Agregar(37);
        L.Agregar(42);*/
        for(int i=0;i<5;i++){
            System.out.println("Digite el total de kilometros recorridos por el competidor ["+i+"]");
            Kilometros=sn.nextInt();
            L.Agregar(Kilometros);
        }
        System.out.println("Imprimiendo listado de competidores");
        L.Imprimir();
        System.out.println("El competidor con mas kilometros recorridos fue: "+L.Mayor());
        System.out.println("Imprimiendo total kilometros del competidor N° 4: "+L.ObtenerInfo(4));
    }
}
