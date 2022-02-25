/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.empresa.x;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class POOEmpresaX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Menu;
        Scanner sn = new Scanner(System.in);
        Control C = new Control();
        do {
            System.out.println("[0]Pruebas\n[1]Crear empleado\n[2]Modificar empleados\n[3]"
                    + "Eliminar empleado\n[4]Listado empleados\n[5]"
                    + "Listado EmpleadosXCargo\n[6]Listado de NóminaXEmpleados\n[7]Salir");
            Menu = sn.nextInt();
            switch (Menu) {
                case 0: {
                    //C.CrearEmpleado(1);
                    //C.CrearEmpleado(2);
                    C.CrearEmpleado(2);
                    C.ListarEmpleados();
                    C.ListarEmpleadosXCargo();
                    C.ListadoNominas();
                    C.EliminarEmpleado(22);
                    C.ListarEmpleados();
                    C.ModificarEmpleado(2);
                    C.ListarEmpleados();
                }
                break;
                case 1: {
                    System.out.println("Digite la opcion para crear Empleado\n"
                            + "[1]Informacion basica\n[2]Informacion completa");
                    int Opcion = sn.nextInt();
                    C.CrearEmpleado(Opcion);
                }
                break;
                case 2: {
                    System.out.println("Digite la opcion para modificar Empleado\n"
                            + "[1]Informacion basica\n[2]Informacion completa");
                    int Opcion = sn.nextInt();
                    C.ModificarEmpleado(Opcion);
                }
                break;
                case 3: {
                    System.out.println("Digite el Documento de empleado a Eliminar");
                    int Doc = sn.nextInt();
                    C.EliminarEmpleado(Doc);
                }
                break;
                case 4: {
                    System.out.println("Realizando listado empleados");
                    C.ListarEmpleados();
                }
                break;
                case 5: {
                    System.out.println("Realizando listado empleados por cargo");
                    C.ListarEmpleadosXCargo();
                }
                break;
                case 6: {
                    System.out.println("Realizando listado nominas");
                    C.ListadoNominas();
                }
                break;
                case 7: {
                    System.out.println("Muchas gracias...");
                }
                break;
            }
        } while (Menu != 7);
    }
}
