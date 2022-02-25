package buscaindices_seis;
import java.util.Scanner;
public class BuscaIndices_Seis {
    public static void Llenar(int V[]){
        Scanner sn=new Scanner(System.in);
        for(int i=0;i<V.length;i++){
            System.out.println("V["+i+"]= ");
            int X=sn.nextInt();
            V[i]=X;
        }
    }
    public static void Imprimir(int V[]){
        for(int i=0;i<V.length;i++){
            System.out.println("V["+i+"]= "+V[i]);
        }
    }
    public static void Buscar(int X, int V[]){
        String R="Numero a buscar: "+X+"\nPosiciones encontradas: \n";
        for(int i=0;i<V.length;i++){
            if(V[i]==X){
                R+="-"+i;
            }
        }
        System.out.println(R);
    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Digite tamaño del vector");
        int N=sn.nextInt();
        int V[]=new int[N];
        Llenar(V);
        Imprimir(V);
        System.out.println("Digite el numero a buscar: ");
        int X=sn.nextInt();
        Buscar(X,V);
    }
}
