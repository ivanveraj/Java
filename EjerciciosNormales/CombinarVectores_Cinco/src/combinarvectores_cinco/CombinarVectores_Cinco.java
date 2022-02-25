package combinarvectores_cinco;

import java.util.Scanner;

public class CombinarVectores_Cinco {
    public static void Llenar(int V[]){
        Scanner sn=new Scanner(System.in);
        for(int i=0;i<V.length;i++){
            System.out.println("V["+i+"]= ");
            int X=sn.nextInt();
            V[i]=X;
        }
    }
    public static void ImprimirV(int V[]){
        for(int i=0;i<V.length;i++){
            System.out.println("V["+i+"]= "+V[i]);
        }
    }
    public static void Burbuja(int V[]){
        int Aux=0;
        for(int i=0;i<V.length-1;i++){
             for(int j=0;j<V.length-i-1;j++){
                 if (V[j+1]<V[j]) {
                    Aux= V[j + 1];
                    V[j + 1]=V[j];
                    V[j] =Aux;
                }
             }
        }
    }
    public static void Almacenamiento(int V1[],int V2[], int V3[]){
        int f=0;
        for(int i=0;i<V1.length;i++){
            V3[f]=V1[i];
            f++;
        }
        for(int i=0;i<V2.length;i++){
            V3[f]=V2[i];
            f++;
        }
        Burbuja(V3);
        System.out.println("Imprimiendo vector V3");
        ImprimirV(V3);
    }


    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Digite tamaño vector 1");
        int T1=sn.nextInt();
        System.out.println("Digite tamaño vector 2");
        int T2=sn.nextInt();
        int V1[]=new int[T1];
        int V2[]=new int[T2];
        int V3[]=new int[T1+T2];
        Llenar(V1);
        Llenar(V2);
        System.out.println("\nVector V1");
        ImprimirV(V1);
        System.out.println("\nVector V2");
        ImprimirV(V2);
        Almacenamiento(V1,V2,V3);
    }
}
