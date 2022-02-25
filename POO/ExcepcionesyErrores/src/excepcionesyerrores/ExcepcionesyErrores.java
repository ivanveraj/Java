/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesyerrores;
import java.util.Scanner;
/**
 *
 * @author PC-JIVJ
 */
public class ExcepcionesyErrores {
    /*public static int Leer(String Msj){
        int X=0;
        Scanner sn=new Scanner(System.in);
        System.out.println(Msj);
        try{
            X=sn.nextInt();
        }
        catch(Exception e){
            System.out.println("Error general: "+e);
        }
        return(X);
    }
    public static void Llenar(int V[],int N){
        try{
            for(int i=0;i<N+1;i++){
                V[i]=i+1;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error sobrepaso del tamaño del vector");
        }
    }
    public static void Imprimir(int V[], int N){
        for(int i=0;i<N+1;i++){
            try{
                System.out.println("Vector pos:"+i+" = "+V[i]);
            }
            catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error sobrepaso del tamaño del vector");
        }
        }
    }*/
    public static void Llamada() throws MiException{
        System.out.println("Envio de error");
        throw new MiException("Error envido por mi");
    }
    public static void main(String[] args) {
        /*int X;
        X=Leer("Ingrese un numero");
        System.out.println("Usted digito: "+X);
        System.out.println("Fin normal del programa");
        int N=5;
        int V[]=new int[N];
        Llenar(V,N);
        Imprimir(V,N);
        int A,B,C;
        try{
            A=10;
            B=0;
            C=A/B;
            System.out.println("Division= "+C);
        }catch(Exception e){
            System.out.println("Error division por Cero");
        }*/
        try{
            Llamada();
        }catch(MiException e){
            e.printStackTrace(System.err);
        }
    }
}
