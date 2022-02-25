package poo.parcialuno.andersoncardozo;

import java.util.Scanner;

public class POOParcialUnoAndersonCardozo {

    public static void main(String[] args) {
        int Menu,Cantidad;
        Scanner sn=new Scanner(System.in);
        Ciclista C=new Ciclista();
        do{
            System.out.println("[1Ingresar Información Básica\n[2]Ingresar Tiempo de Clasificación\n[3]"
                    + "Determinar Mejor tiempo de Clasificación\n[4]Determinar Promedio de velocidad\n[5]Imprimir Información\n[6]Salir");
            Menu=sn.nextInt();
            switch(Menu){
                case 0:{
                    System.out.println(C.InformacionBasica(1005,100));
                    C.TiempoClasificacion(70,50,5);
                    System.out.println(C.VueltaMasRapida());
                    C.PromedioVuelta();
                    C.Informacion();
                    C.TiempoClasificacion(50,34,95);
                    C.Informacion();
                }break;
                case 1:{
                    System.out.println("Digite el codigo del ciclista: ");
                    int Codigo=sn.nextInt();
                    System.out.println("Digite el tamaño de la pista: ");
                    double Pista=sn.nextInt();
                    System.out.println(C.InformacionBasica(Codigo,Pista));
                }break;
                case 2:{
                    System.out.println("Digite el tiempo 1 del ciclista: ");
                    double T1=sn.nextDouble();
                    System.out.println("Digite el tiempo 2 del ciclista: ");
                    double T2=sn.nextDouble();
                    System.out.println("Digite el tiempo 3 del ciclista: ");
                    double T3=sn.nextDouble();
                    C.TiempoClasificacion(T1,T2,T3);
                }break;
                case 3:{
                    System.out.println(C.VueltaMasRapida());
                }break;
                case 4:{
                    C.PromedioVuelta();
                }break;
                case 5:{
                    C.Informacion();
                }break;
                case 6:{
                    System.out.println("Muchas gracias...");
                }break;
            }
        }while(Menu!=6);
    }
    
}
