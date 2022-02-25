
package calificaexamen_tres;

import java.util.Scanner;

public class CalificaExamen_Tres {
    public static void PresentarExamen(int V[]){
        Scanner sn=new Scanner(System.in);
        for(int i=0;i<V.length;i++){
            System.out.println("Pregunta N°"+(i+1));
            System.out.println("Digite \n[A]\n[B]\n[C]\n[D]\n[E]");
            String R=sn.nextLine();
            int Rc=Convertir(R.toUpperCase());
            V[i]=Rc;
        }
    }
    public static void RespuestasExamen(int V[]){
        System.out.println("Respuestas examen");
        Scanner sn=new Scanner(System.in);
        for(int i=0;i<V.length;i++){
            System.out.println("Pregunta N°"+(i+1));
            System.out.println("Digite \n[A]\n[B]\n[C]\n[D]\n[E]");
            String R=sn.nextLine();
            int Rc=Convertir(R.toUpperCase());
            V[i]=Rc;
        }
    }
    public static void CalificarExamen(int E[], int R[]){
        System.out.println("Calificando examen");
        int Nota=0;
        for(int i=0;i<E.length;i++){
            if(E[i]==R[i]){
                Nota++;
            }
        }
        System.out.println("La calificacion del examen fue: "+Nota);
    }

   public static int Convertir(String R){
       if(R.equals("A")){
           return(1);
       }else if(R.equals("B")){
           return(2);
       }else if(R.equals("C")){
           return(3);
       }else if(R.equals("D")){
           return(4);
       }else if(R.equals("E")){
           return(5);
       }
       return(-1);
   }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Digite la cantidad de preguntas del examen");
        int Preguntas=sn.nextInt();
        int RespuestasE[]=new int[Preguntas];
        int RespuestasC[]=new int[Preguntas];
        PresentarExamen(RespuestasE);
        RespuestasExamen(RespuestasC);
        CalificarExamen(RespuestasE, RespuestasC);
    }
}
