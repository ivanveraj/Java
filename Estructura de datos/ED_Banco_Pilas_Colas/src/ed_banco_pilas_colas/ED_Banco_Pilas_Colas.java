package ed_banco_pilas_colas;

import java.util.Scanner;

public class ED_Banco_Pilas_Colas {

    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
        int Menu;
        Control C=new Control();
            do {
                System.out.println("Digite una de las siguientes opciones \n[0]Mostrar informacion pila y colas\n"
                        + "[1]Ingresar cliente\n[2]Atender cliente\n[3]Terminar el dia\n");
                Menu = sn.nextInt();
                switch (Menu) {
                    case 0: {
                        System.out.println("Informacion almacena en la cola");
                        C.MostrarColas();
                        System.out.println("Informacion almacenada en la pila");
                        C.MostrarPila();
                    }
                    break;
                    case 1: {
                        C.SeleccionVentanilla();
                    }
                    break;
                    case 2: {
                        System.out.println("Seleccione la ventanilla a utilizar\n[1]Ventanilla N°1\n[2]Ventanilla N°2\n[3]Ventanilla N°3");
                        int V=sn.nextInt();
                        C.AtenderCliente(V);
                    }
                    break;
                    case 3: {
                        C.FinDelDia();
                    }
                    break;
                }
            } while (Menu != 3);

       
    }
}