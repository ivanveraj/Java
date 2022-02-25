/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.arraylist.archivo;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class BibliotecaArrayListArchivo {

    public static int Seleccion() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Seleccione el tipo de material a escoger:\n"
                + "[1]Libro\n[2]Revista\n[3]Video\n");
        int Op = sn.nextInt();
        return Op;
    }

    public static void main(String[] args) throws IOException {
        int Menu;
        
        Scanner sn = new Scanner(System.in);
        Control C = new Control();
        do {
            System.out.println("[1]Agregar Material (Permite agregar un tipo de material: Libro, Revista, y Video)\n"
                    + "[2]Modificar Material (Permite modificar por una búsqueda un tipo de material: Libro, Revista, y Video)\n"
                    + "[3]Listado de Materiales (Muestra el listado por cada tipo de material: Libro, Revista, y Video)\n"
                    + "[4]Salir\n");
            Menu = sn.nextInt();
            switch (Menu) {
                case 1: {
                    int S = Seleccion();
                    if (S == 1) {
                        C.AgregarLibro();
                    } else if (S == 2) {
                        C.AgregarRevista();
                    } else if (S == 3) {
                        C.AgregarVideo();
                    } else {
                        System.out.println("Error codigo incorrecto");
                    }
                }
                break;
                case 2: {
                    int S = Seleccion();
                    System.out.println("Digite el ISBN");
                    int ISBN = sn.nextInt();
                    if (S == 1) {
                        C.ModificarLibro(ISBN);
                    } else if (S == 2) {
                        C.ModificarRevista(ISBN);
                    } else if (S == 3) {
                        C.ModificarVideo(ISBN);
                    } else {
                        System.out.println("Error codigo incorrecto");
                    }
                }
                break;
                case 3: {
                    int S = Seleccion();
                    if (S == 1) {
                        C.ListadoLibro();
                    } else if (S == 2) {
                         C.ListadoRevista();
                    } else if (S == 3) {
                        C.ListadoVideo();
                    } else {
                        System.out.println("Error codigo incorrecto");
                    }
                }
                break;
                case 4: {
                    System.out.println("Fin del codigo muchas gracias");
                }
                break;
            }
        } while (Menu != 4);
    }
}
