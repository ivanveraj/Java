package ejerciciosuniversidad;

import java.util.Scanner;

public class EjerciciosUniversidad {

    public static void main(String[] args) {
        int Menu;
        Scanner sn=new Scanner(System.in);
        Control C=new Control();
        String Nombre, Profesion;
        int Cedula;
        do{
            System.out.println("[1]Crear Titular\n[2]Crear Ocasional\n[3]"
                    + "Calcular sueldo \n[4]Mayor sueldo\n[5]"
                    + "Imprimir\n[6]Salir");
            Menu=sn.nextInt();
            switch(Menu){
                case 0:{
                    C.CrearTitular("Vanessa","Ing. Industrial",1005);
                    C.CrearTitular("Ivan","Tec",1006);
                    C.CrearTitular("Jaider","Lic",1007);
                    C.CrearOcasional("Didier","Formacion",1008);
                    C.CrearOcasional("Andres","Sistemas",1009);
                    C.CrearOcasional("Eric","Redes",1010);
                }break;
                case 1:{
                    System.out.println("Digite el nombre del Titular: ");
                    sn.nextLine();
                    Nombre=sn.nextLine();
                    System.out.println("Digite la profesion del Titular: ");
                    sn.nextLine();
                    Profesion=sn.nextLine();
                    System.out.println("Digite la cedula del Titular: ");
                    Cedula=sn.nextInt();
                    C.CrearTitular(Nombre, Profesion, Cedula);
                }break;
                case 2:{
                    System.out.println("Digite el nombre del Profesor: ");
                    sn.nextLine();
                    Nombre=sn.nextLine();
                    System.out.println("Digite la profesion del Profesor: ");
                    sn.nextLine();
                    Profesion=sn.nextLine();
                    System.out.println("Digite la cedula del Profesor: ");
                    Cedula=sn.nextInt();
                    C.CrearTitular(Nombre, Profesion, Cedula);
                }break;
                case 3:{
                    int Horas;
                    System.out.println("Digite la cedula del Ocasional: ");
                    Cedula=sn.nextInt();
                    System.out.println("Digite la cantidad de horas Ocasional: ");
                    Horas=sn.nextInt();
                    C.CalcularSueldo(Cedula, Horas);
                }break;
                case 4:{
                    System.out.println("Calculando mayor sueldo");
                    C.MayorSueldo();
                }break;
                case 5:{
                    System.out.println("Realizando resumen");
                    C.Informacion();
                }break;
                case 6:{
                     System.out.println("Muchas gracias...");
                }break;
            }
        }while(Menu!=6);
    }
    
}
