package parcialmallely3;

import java.util.Scanner;
public class ParcialMallely3 {
    public static boolean Primo(int X) {
        int C= 0;
        for (int i=1; i<=X;i++){
            if ((X%i)==0) {
                C++;
            }
        }
        if (C<=2) {
            return(true);
        } else {
            return(false);
        }
    }
    public static void main(String[] args) {
        double ContP=0;
        double Porcentaje;
        String NumerosP="";
        Scanner sn=new Scanner(System.in);
        System.out.println("Digite la cantidad de numeros a ingresar: ");
        int N=sn.nextInt();
        for(int i=0;i<N;i++){
            System.out.println("Digite un numero ["+i+"]: ");
            int X=sn.nextInt();
            if(Primo(X)==true){
                ContP+=1;
                NumerosP+=X+", ";
            }
        }
        /*Primo(2)
        Primo(13)
        Primo(1)
        */
        Porcentaje=(ContP/N)*100;
        System.out.println("Numeros primos: "+NumerosP);
        System.out.println("Cantidad de numeros primos: "+ContP);
        System.out.println("Porcentaje: "+Porcentaje);
    }
    
}
