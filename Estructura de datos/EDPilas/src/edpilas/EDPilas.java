package edpilas;

import java.util.Scanner;

public class EDPilas {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int Menu1, Menu2, T;
        System.out.println("Digite una de las siguientes opciones \n[1]Colas\n[2]Pilas\n");
        Menu1 = sn.nextInt();
        if (Menu1 == 1) {
            System.out.println("Digite el tamaño de la Cola");
            T = sn.nextInt();
            Cola C = new Cola(T);
            do {
                System.out.println("Digite una de las siguientes opciones \n[1]Insertar\n[2]Eliminar"
                        + "\n[3]Peek\n[4]Salir\n");
                Menu2 = sn.nextInt();
                switch (Menu2) {
                    case 0: {
                        System.out.println(C.isEmpty());
                        System.out.println(C.Peek());
                        System.out.println(C.Size());
                        System.out.println(C.isFull());
                        System.out.println(C.maxSize());
                        C.Enqueue(23);
                        C.Enqueue(45);
                        System.out.println(C.Peek());
                        System.out.println(C.Size());
                        C.Enqueue(344);
                        System.out.println(C.Peek());
                        C.Dequeue();
                        System.out.println(C.Peek());
                        System.out.println(C.Size());
                    }
                    break;
                    case 1: {
                        System.out.println("Digite valor a encolar");
                        int X = sn.nextInt();
                        C.Enqueue(X);
                    }
                    break;
                    case 2: {
                        System.out.println("Eliminando");
                        C.Dequeue();
                    }
                    break;
                    case 3: {
                        System.out.println(C.Peek());
                    }
                    break;
                    case 4: {
                        System.out.println("Hasta luego");
                    }
                    break;
                }
            } while (Menu2 != 4);

        } else if (Menu1 == 2) {
            System.out.println("Digite el tamaño de la Pila");
            T = sn.nextInt();
            Pila P = new Pila(T);
            do {
                System.out.println("Digite una de las siguientes opciones \n[1]Insertar\n[2]Eliminar"
                        + "\n[3]Peek\n[4]Salir\n");
                Menu2 = sn.nextInt();
                switch (Menu2) {
                    case 0: {
                        System.out.println(P.isEmpty());
                        System.out.println(P.isFull());
                        System.out.println(P.maxSize());
                        P.Push(23);
                        P.Push(45);
                        System.out.println(P.Peek());
                        P.Push(344);
                        System.out.println(P.Peek());
                        P.Pop();
                        System.out.println(P.Peek());
                    }
                    break;
                    case 1: {
                        System.out.println("Digite valor a apilar");
                        int X = sn.nextInt();
                        P.Push(X);
                    }
                    break;
                    case 2: {
                        System.out.println("Eliminando elemento de la pila");
                        P.Pop();
                    }
                    break;
                    case 3: {
                        System.out.println(P.Peek());
                    }
                    break;
                    case 4: {
                        System.out.println("Hasta luego");
                    }
                    break;
                }
            } while (Menu2 != 4);

        }
    }
}