package ejerciciosunidad6;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjerciciosUnidad6 {
    public static boolean esPrimo(int N, int Div){
        if(Div>N/2){
            return(true);
        }else{
            if(N%Div==0){
                return(false);
            }else{
                return(esPrimo(N, Div+1));
            }
        }
    }
    public static void Multiplicar(int N){
        int X=1;
        for(int i=2;i<=N;i++){
            if(esPrimo(i,2)==true){
                X=X*i;
            }
        }
        System.out.println("La multiplicacion de los numeros primos hasta "+N+" es: "+X);
    }
    public static void OrdenamientoRec(int V[], int Tam){
        if (Tam==1){
        }else{
            for (int i=0; i<Tam-1;i++){
                if (V[i]>V[i+1]){
                    int Aux=V[i];
                    V[i]=V[i+1];
                    V[i+1]=Aux;
                }
            }
            OrdenamientoRec(V,Tam-1);
        }
    }
    public static void Imprimir(int V[]){
        int Tam=V.length;
        for(int i=0;i<Tam;i++){
            System.out.println("V["+i+"]= "+V[i]);
        }
        System.out.println("");
    }
    public static void Llenar(int V[]){
        Scanner sn=new Scanner(System.in);
        int Tam=V.length,X;
        for(int i=0;i<Tam;i++){
            System.out.print("V["+i+"]= ");
            X=sn.nextInt();
            V[i]=X;
        }
    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Programa que multiplica los números primos hasta N (ingresado por el cliente) de forma recursiva.");
        System.out.println("Digite N");
        int N=sn.nextInt();
        Multiplicar(N);
        
        //Recorrer y ordenar de menor a mayor un array de forma recursiva (ingresado previamente por el usuario).
        System.out.println("Programa que eecorrer y ordenar de menor a mayor un array de forma recursiva (ingresado previamente por el usuario).");
        System.out.println("Digite el tamaño del vector");
        int Tam=sn.nextInt();
        int V[]=new int[Tam];
        Llenar(V);
        System.out.println("Vector desordenado");
        Imprimir(V);
        System.out.println("Vector ordenado con recursividad");
        OrdenamientoRec(V,Tam);
        Imprimir(V);
    }
    
}
