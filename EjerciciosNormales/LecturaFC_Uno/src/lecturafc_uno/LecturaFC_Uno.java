package lecturafc_uno;

import java.util.Scanner;


public class LecturaFC_Uno {
    public static void Llenar(int M[][]){
        Scanner sn=new Scanner(System.in);
        for(int i=0;i<M.length;i++){
            for(int j=0;j<M[0].length;j++){
                System.out.println("Digite M["+i+"]["+j+"]");
                M[i][j]=sn.nextInt();
            }
        }
    }
    public static void Almacene(int V1[], int V2[],int M[][]){
        int f=0;
        for(int i=0;i<M.length;i++){
            for(int j=0;j<M[0].length;j++){
                V1[f]=M[i][j];
                f++;
            }
        }
        f=0;
        for(int i=0;i<M.length;i++){
            for(int j=0;j<M[0].length;j++){
                V2[f]=M[j][i];
                f++;
            }
        }
    }
    public static void ImprimirV(int V1[]){
        for(int i=0;i<V1.length;i++){
            System.out.println("V["+i+"]= "+V1[i]);
        }
    }
    public static void ImprimirM(int M[][]){
        for(int i=0;i<M.length;i++){
            for(int j=0;j<M[0].length;j++){
                System.out.println("M["+i+"]["+j+"]= "+M[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Digite M: ");
        int m=sn.nextInt();
        System.out.println("Digite N");
        int n=sn.nextInt();
        int M[][]=new int[m][n];
        Llenar(M);
        int V1[]=new int[m*n];
        int V2[]=new int[m*n];
        Almacene(V1,V2,M);
        System.out.println("\nImprimiendo matriz");
        ImprimirM(M);
        System.out.println("\nImprimiendo V1");
        ImprimirV(V1);
        System.out.println("\nImprimiendo V2");
        ImprimirV(V2);
    }
    
}
