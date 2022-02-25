package mallelyejercicio8;

import java.util.Scanner;

public class MallelyEjercicio8 {
    public static void Llenar(int M[][]){
        Scanner sn=new Scanner(System.in);
        for(int i=0;i<M.length;i++){
                System.out.println("Digite la edad ");
                int Edad=sn.nextInt();
                System.out.println("Tipo [1]Alto\n[2]Bajo\n[3]Medio");
                int Tipo=sn.nextInt();
                System.out.println("Nacionalidad [1]Latino\n[2]Germano\n[3]Hindu");
                int Nacionalidad=sn.nextInt();
                M[i][0]=Edad;
                M[i][1]=Tipo;
                M[i][2]=Nacionalidad;
        }
    }
    public static void HinduesAltos(int M[][]){
        int Cont=0;
       for(int i=0;i<M.length;i++){
            if(M[i][1]==1 && M[i][2]==3){
                Cont+=1;
            }
        }
        System.out.println("Cantidad de hindues altos: "+Cont);
    }
    public static void TotalLatinos(int M[][]){
        int Cont=0;
       for(int i=0;i<M.length;i++){
            if(M[i][2]==1){
                Cont+=1;
            }
        }
        System.out.println("Total de latinos: "+Cont);
    }
    public static void GermanosMenores(int M[][]){
        int Cont=0;
       for(int i=0;i<M.length;i++){
            if(M[i][2]==2 &&M[i][0]<30){
                Cont+=1;
            }
        }
        System.out.println("Total de germanos menores de 30 años: "+Cont);
    }
    public static void HinduesMedianos(int M[][]){
        int Cont=0;
       for(int i=0;i<M.length;i++){
            if(M[i][1]==3 && M[i][2]==3){
                Cont+=1;
            }
        }
        System.out.println("Cantidad de hindues medianos: "+Cont);
    }
    public static void TotalGermanos(int M[][]){
        int Cont=0;
       for(int i=0;i<M.length;i++){
            if(M[i][2]==2){
                Cont+=1;
            }
        }
        System.out.println("Total de germanos: "+Cont);
    }
    public static void LatinosBajosMenores(int M[][]){
        int Cont=0;
       for(int i=0;i<M.length;i++){
            if(M[i][2]==1 && M[i][1]==2 && M[i][0]<40){
                Cont+=1;
            }
        }
        System.out.println("Total latinos bajos menores a 40 años: "+Cont);
    }
    

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Digite la cantidad de personas registradas");
        int N=sn.nextInt();
        int M[][]=new int[N][3];
        Llenar(M);
        HinduesAltos(M);
        TotalLatinos(M);
        GermanosMenores(M);
        HinduesMedianos(M);
        TotalGermanos(M);
        LatinosBajosMenores(M);
    }
    
}
