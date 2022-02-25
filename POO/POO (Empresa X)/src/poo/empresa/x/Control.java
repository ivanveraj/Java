/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.empresa.x;

import java.util.ArrayList;
import java.util.Scanner;

public class Control {
    private ArrayList<Persona> P;
    public Control() {
        P = new ArrayList<Persona>();
    }

    public int Buscar(int X) {
        int T = P.size();
        for (int i = 0; i < T; i++) {
            if (P.get(i).getDocumento() == X) {
                return (i);
            }
        }
        return (-1);
    }

    public void CrearEmpleado(int Opcion) {
        Scanner sn = new Scanner(System.in);
        String Nom, Cargo, Estudios, FI;
        int Doc, Edad;
        double S;
        System.out.println("Digite el documento del empleado");
        Doc = sn.nextInt();
        if (Buscar(Doc) == -1) {
            if (Opcion == 1) {
                System.out.println("Digite el nombre del empleado");
                sn.nextLine();
                Nom = sn.nextLine();
                System.out.println("Digite el sueldo del empleado");
                S = sn.nextDouble();
                while(S>5350000){
                    System.out.println("Digite el sueldo del empleado");
                    S = sn.nextDouble();
                }
                P.add(new Persona(Doc, Nom, S));
            } else if (Opcion == 2) {
                System.out.println("Digite el nombre del empleado");
                sn.nextLine();
                Nom = sn.nextLine();
                System.out.println("Digite la edad del empleado");
                Edad = sn.nextInt();
                System.out.println("Digite el cargo del empleado del empleado");
                sn.nextLine();
                Cargo = sn.nextLine();
                System.out.println("Digite los estudios del empleado");
                Estudios = sn.nextLine();
                System.out.println("Digite la fecha de ingreso del empleado Formato (YYYY/MM/DD)");
                FI = sn.nextLine();
                System.out.println("Digite el sueldo del empleado");
                S = sn.nextDouble();
                while(S>5350000){
                    System.out.println("Digite el sueldo del empleado");
                    S = sn.nextDouble();
                }
                P.add(new Persona(Doc, Nom, Edad, FI, Estudios, Cargo, S));
            } else {
                System.out.println("Opcion no valida");
            }
        } else {
            System.out.println("Documento repetido");
        }
    }

    public void ModificarEmpleado(int Opcion) {
        Scanner sn = new Scanner(System.in);
        String Nom, Cargo, Estudios, FI;
        int Doc, Edad;
        double S;
        System.out.println("Digite el documento del empleado");
        Doc = sn.nextInt();
        int B = Buscar(Doc);
        System.out.println("Modificar documento"+B);
        if (B != -1) {
            if (Opcion == 1) {
                P.get(B).setDocumento(Doc);
                System.out.println("Digite el nombre del empleado");
                sn.nextLine();
                Nom = sn.nextLine();
                P.get(B).setNombre(Nom);
                System.out.println("Digite el sueldo del empleado");
                S = sn.nextDouble();
                while(S>5350000){
                    System.out.println("Digite el sueldo del empleado");
                    S = sn.nextDouble();
                }
                P.get(B).setSueldo(S);
            } else if (Opcion == 2) {
                P.get(B).setDocumento(Doc);
                System.out.println("Digite el nombre del empleado");
                sn.nextLine();
                Nom = sn.nextLine();
                P.get(B).setNombre(Nom);
                System.out.println("Digite la edad del empleado");
                Edad = sn.nextInt();
                P.get(B).setEdad(Edad);
                System.out.println("Digite el cargo del empleado del empleado");
                sn.nextLine();
                Cargo = sn.nextLine();
                P.get(B).setCargo(Cargo);
                System.out.println("Digite los estudios del empleado");
                Estudios = sn.nextLine();
                P.get(B).setEstudios(Estudios);
                System.out.println("Digite la fecha de ingreso del empleado Formato (YYYY/MM/DD)");
                FI = sn.nextLine();
                P.get(B).setFechaIngreso(FI);
                System.out.println("Digite el sueldo del empleado");
                S = sn.nextDouble();
                while(S>5350000){
                    System.out.println("Digite el sueldo del empleado");
                    S = sn.nextDouble();
                }
                P.get(B).setSueldo(S);
            } else {
                System.out.println("Opcion no valida");
            }
        } else {
            System.out.println("No existe el empleado");
        }
    }

    public void EliminarEmpleado(int D) {
        int B = Buscar(D);
        if (B != -1) {
            P.remove(B);
            System.out.println("Informacion del empleado eliminada correctamente");
        }
        System.out.println("Error empleado no encontrado");
    }

    public void ListarEmpleados() {
        int T = P.size();
        for (int i = 0; i < T; i++) {
            P.get(i).Informacion();
        }
    }

    public void ListarEmpleadosXCargo() {
        System.out.println("Realizando listado empleados por cargo");
        int T = P.size();
        for (int i = 0; i < T; i++) {
            if (P.get(i).getCargo().equals("Secretaria")) {
                P.get(i).Informacion();
            }
        }
        for (int i = 0; i < T; i++) {
            if (P.get(i).getCargo().equals("Auxiliar")) {
                P.get(i).Informacion();
            }
        }
        for (int i = 0; i < T; i++) {
            if (P.get(i).getCargo().equals("Servicios varios")) {
                P.get(i).Informacion();
            }
        }
        for (int i = 0; i < T; i++) {
            if (P.get(i).getCargo().equals("Profesional")) {
                P.get(i).Informacion();
            }
        }
        for (int i = 0; i < T; i++) {
            if (P.get(i).getCargo().equals("Gerente")) {
                P.get(i).Informacion();
            }
        }
    }
    public void ListadoNominas() {
        int T = P.size();
        for (int i = 0; i < T; i++) {
            P.get(i).ListadoNomina();
        }
    }
}