package edarbolesvanessa;

import java.util.Scanner;

public class EDArbolesVanessa {

    public static void main(String[] args) {
        /*Programa que permite la insercion de elementos a un arbol binario de busqueda, ademas, permite
        recorrer mediante la utlizacion de los tres tipos (InOrden, PostOrden, PreOrden), y ´por ultimo permite hallar
        la suma de los elementos que se encuentran incluidos en el arbol*/
        Scanner sn=new Scanner(System.in);
        Arbol A=new Arbol();
        int N, Accion;
        do{
            System.out.println("Digite numero a ingresar");
            N=sn.nextInt();
            A.InsertTo(N);
            System.out.println("[1]Continuar \n[0]Salir");
            Accion=sn.nextInt();
        }while(Accion!=0);
        System.out.println(A.PostOrden());
        System.out.println(A.InOrden());
        System.out.println(A.PreOrden());
        System.out.println("La suma de los elementos insertados en el arbol es: "+A.Suma());
    }
    
}
