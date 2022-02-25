/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital2;
import java.util.*;
/**
 *
 * @author MILE-IVA
 */
public class Hospital2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn=new Scanner (System.in);
        int menu,T;
        long I,D;
        Pacientes E=new Pacientes();
        
        do{
            System.out.println("Digite una de las siguientes opciones \n[1]Crear prueba\n[2]Asignar resultado de la prueba"
                + "\n[3]Diagnostico de prueba\n[4]Busqueda por paciente\n[5]Resumen\n[6]Salir");
            menu=sn.nextInt();
            switch(menu){
                case 0:{
                    E.Crear(123,100,1);
                    E.Crear(124,100,1);
                    E.Crear(125,102,1);
                    E.Crear(126,103,1);
                    E.Crear(127,104,1);
                    E.Crear(128,105,1);
                    E.Crear(129,106,1);
                    E.AsignarEstado(123);
                    E.AsignarEstado(124);
                    E.AsignarEstado(125);
                    E.AsignarEstado(126);
                    E.AsignarEstado(127);
                }break;
                case 1:{
                    System.out.println("Digite el Identificador de la prueba");
                    I=sn.nextLong();
                    System.out.println("Digite el documento del paciente");
                    D=sn.nextLong();
                    System.out.println("Digite el tipo de prueba");
                    T=sn.nextInt();
                    System.out.println(E.Crear(I,D,T));
                }break;
                case 2:{
                    System.out.println("Digite el Identificador de la prueba");
                    I=sn.nextLong();
                    System.out.println(E.AsignarEstado(I));
                }break;
                case 3:{
                    System.out.println("Digite el Identificador de la prueba");
                    I=sn.nextLong();
                    System.out.println(E.DiagnosticoDePrueba(I));
                }break;
                case 4:{
                    System.out.println("Digite el Documento del Paciente");
                    D=sn.nextLong();
                    System.out.println(E.BusquedaPorPaciente(D));
                }break;
                case 5:{
                    System.out.println(E.Resumen());
                }break;
                case 6:{
                    System.out.println("Hasta luego");
                }break;
            }
        }while(menu!=6);
    }
    }
    

