/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase3;
import java.util.*;
/**
 *
 * @author iser
 */
public class POOClase3 {
    public static void llenar(int v[],Scanner sn){
        for(int i=0;i<v.length;i++){
            System.out.println("Digite el valor del vector en la Posicion "+i);
            v[i]=sn.nextInt();
        }
    }
    public static int buscador(int v[]){
        int mayor=0;
        for(int i=0;i<v.length;i++){
            if(v[mayor]<v[i]){
                mayor=i;
            }
        }
        return(mayor);
    }
    public static void imprimir(int v[],int mayor){
        int pos=mayor+1;
           System.out.println("El numero mayor es "+v[mayor]+" ubicado en la posicion "+pos);
       
    }
    public static void main(String[] args) {
        
        Scanner sn=new Scanner(System.in);
        System.out.println("Digite el tamaño del vector");
        int N=sn.nextInt();
        int v[]=new int[N];
        llenar(v,sn);
        imprimir(v,buscador(v));
    }
    
}
