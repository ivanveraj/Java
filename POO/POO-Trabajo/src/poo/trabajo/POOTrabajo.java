/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.trabajo;
import java.util.*;
/**
 *
 * @author MILE-IVA
 */
public class POOTrabajo {
    public static void llenar(int v[],int n,Scanner sn){
        for(int i=0;i<v.length;i++){
            System.out.println("Digite el valor del vector en la Posicion "+i);
            v[i]=sn.nextInt();
        }
    }
    public static void invertir(int v1[],int v2[],int v3[]){
        int pos=0,visor=0;
        
        while(pos<v3.length){
            if(visor<v1.length){
                v3[pos]=v1[visor];
                pos++;
            }
            if(visor<v2.length){
                v3[pos]=v2[visor];
                pos++;
            }
            visor++;
        }
       }
    public static void imprimir(int v[], int h){
        
       for(int i=0;i<v.length;i++){
           System.out.println("El vector "+h+" esta formado por "+v[i]);
       }
    }
    

    
    public static void main(String[] args) {
        
        Scanner sn=new Scanner (System.in);
        System.out.println("Digite el tamaño del vector 1");
        int N1=sn.nextInt();
        int V1[]=new int [N1];
        System.out.println("Digite el tamaño del vector 2");
        int N2=sn.nextInt();
        int V2[]=new int [N2];
        int V3[]=new int [N1+N2];
        llenar(V1,N1,sn);
        llenar(V2,N2,sn);
        invertir(V1,V2,V3);
        imprimir(V1,1);
        imprimir(V2,2);
        imprimir(V3,3);
        
        
        
        
    }
    
}
