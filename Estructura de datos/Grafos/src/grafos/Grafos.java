package grafos;

import java.util.Scanner;

public class Grafos {
    public static void CrearGrafo(Grafo G, int Tam){
        for (int i=0;i<Tam; i++) {
            G.InsertarVertice();
        }
    }

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        boolean Tipo;
        int Tam, Menu;
        /*
        Ejercicio cree  una clase grafo (dirigido o no dirigido) Dicha clase debe recibir como parametros el tipo False (No dirigido) o
        True (dirigido), tambien debe recibir el tamaño de vertices maximo que posee el grafo.
        Este programa debe poder insertar tantas aristas como el usuario desee y el grafo lo permita.
        Para esto cree un menu que permita la insercion, eliminacion y validacion de las aristas en la matriz de adyacencia
        Tambien, si el usuario lo desee debe permitir ver la incidencia de una arista
        Otra opcion que debe poseer es la verificacion del tamaño de los vertices */
        System.out.println("Creando grafo");
        System.out.println("Digite \n[true] Grafo dirigido\n[false] Grafo no dirigido");
        Tipo=sn.nextBoolean();
        System.out.println("Digite la cantidad de vertices del grafo");
        System.out.println("Si desea hacer las pruebas digite 12");
        Tam=sn.nextInt();
        Grafo G=new Grafo(Tam,Tipo);
        CrearGrafo(G,Tam);
        do{
            System.out.println("[0]Pruebas\n[1]Crear arista\n[2]Eliminar arista\n[3]Validar arista\n[4]Conocer incidencia de una arista"
                    + "\n[5]Tamaño de aristas\n[6]Mostrar matriz de adyacencia\n[7]Salir");
            Menu = sn.nextInt();
            switch (Menu) {
                case 0: {
                    G.InsertarArista(0, 1);
                    G.InsertarArista(0, 6);
                    G.InsertarArista(4, 2);
                    G.InsertarArista(0, 7);
                    G.InsertarArista(1, 3);
                    G.InsertarArista(3, 3);
                    G.InsertarArista(5, 6);
                    G.InsertarArista(11, 1);
                    G.InsertarArista(6, 10);
                    G.InsertarArista(5, 8);
                    G.InsertarArista(8, 11);
                    G.InsertarArista(2, 3);
                    G.Mostrar();
                    System.out.println(G.GradoC(5));
                    System.out.println(G.GradoF(3));
                    G.Incidencia(9);
                    System.out.println(G.ExisteArista(2,3));
                    G.EliminarArista(2,3);
                    G.Mostrar();
                    System.out.println(G.Tamanio());
                }
                break;
                case 1: {
                    System.out.println("Digite el valor del vertice");
                    int V=sn.nextInt();
                    System.out.println("Digite el valor de la arista");
                    int E=sn.nextInt();
                    G.InsertarArista(V, E);
                }
                break;
                case 2: {
                    System.out.println("Digite el valor del vertice a eliminar");
                    int V=sn.nextInt();
                    System.out.println("Digite el valor de la arista a eliminar");
                    int E=sn.nextInt();
                    G.EliminarArista(V, E);
                }
                break;
                case 3: {
                    System.out.println("Digite el valor del vertice a validar");
                    int V=sn.nextInt();
                    System.out.println("Digite el valor de la arista a validar");
                    int E=sn.nextInt();
                    System.out.println("Existe la arista en la matriz de adyacencia: "+G.ExisteArista(V, E));
                }
                break;
                case 4: {
                    System.out.println("Digite el valor de la arista a calcular su incidencia");
                    int E=sn.nextInt();
                    G.Incidencia(E);
                }break;
                case 5:{
                    System.out.println("El tamano de aristas en la matriz de adyacencia es: "+G.Tamanio()+"X"+G.Tamanio());
                }break;
                case 6:{
                    System.out.println("Imprimiendo matriz de adyacencia");
                    G.Mostrar();
                }break;
                case 7:{
                    System.out.println("Muchas gracias...");
                }break;
            }
        }while(Menu!=7);
        
    }
    
}
