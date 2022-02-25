package elimina.numero;
import java.util.*;

public class EliminaNumero {
    public static int Invertir(int X){
        int D=0;
        int Invertido=0;
        while (X> 0) {
            D = X% 10;
            Invertido=Invertido*10+D;
            X=X/10;
        }
        return (Invertido);
    }
    public static void Llenar(int V[]){
        Scanner sn = new Scanner(System.in);
        for(int i=0;i<V.length;i++){
            System.out.println("Digite un numero entero");
            int X = sn.nextInt();
            V[i]=X;
        }
    }
      public static void Eliminador(int V[]){
        for(int i=0;i<V.length-1;i++){
            V[i]=V[i+1];
        }
        V[V.length-1]=0;
    }
      public static void Imprimir(int V[]){
        for(int i=0;i<V.length;i++){
            System.out.println("V["+i+"]="+V[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Primer punto");
        int i=0;
        
        System.out.println("Digite un numero entero de cualquier tamaño");
        int X = sn.nextInt();
        System.out.println("Digite numero entero de un solo digito");
        int Z = sn.nextInt();
        double Aux =0;
        int D = 0;
        while (X> 0) {
            D = X% 10;
            X= X/ 10;
            if(D!=Z){
                Aux=D*Math.pow(10,i)+Aux;
                i++;
            }
        }
        int Numero=(int) Aux;
        System.out.println("Numero resultante: "+Numero);
        System.out.println("Numero invertido: "+Invertir(Numero));
        
        System.out.println("Segundo punto");
        
        System.out.println("Digite tamaño del vector");
        int T= sn.nextInt();
        int V[]=new int[T];
        Llenar(V);
        Imprimir(V);
        Eliminador(V);
        Imprimir(V);
    }
}