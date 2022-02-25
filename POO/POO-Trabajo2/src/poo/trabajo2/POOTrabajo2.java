/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.trabajo2;
import java.util.*;
/**
 *
 * @author MILE-IVA
 */
public class POOTrabajo2 {
    public static void llenar(int v[],Scanner sn){
        for(int i=0;i<v.length;i++){
            System.out.println("Digite el valor del vector en la Posicion "+i);
            v[i]=sn.nextInt();
        }
    }
    public static int repetidos(int v[],int n){
        int aux,contador=0;
        for(int i=0;i<n;i++){
            for(int k=1;k<n;k++){
                if(v[i]==v[k]){
                    aux=v[n-1];
                    v[k]=v[n-1];
                }
            }
            if(v[i]==v[i+1]&&v[i]!=v[n-1]){
                aux=v[i+1];
                v[i+1]=v[n-(i+1)];
                v[n-(i+1)]=aux;
                contador++;
            }else{
                aux=v[i+1];
                v[i+1]=v[n-(i+2)];
                v[n-(i+2)]=aux;
                contador=contador+2;
            }
            
        }
        return(n-contador);
    }
    public static void menoramayor(int v[],int tam){
        int aux;
        for(int i=0;i<tam;i++){
            if(v[i]>v[i+1]){
                aux=v[i];
                v[i]=v[i+1];
                v[i+1]=aux;
            }
            if(v[i+1]>v[i+2]){
                aux=v[i+1];
                v[i+1]=v[i+2];
                v[i+2]=aux;
            }
            
        }
    }

    public static void main(String[] args) {
        int N;
        Scanner sn=new Scanner(System.in);
        System.out.println("Digite el tamño del vector");
        N=sn.nextInt();
        int V[]=new int [N];
        llenar(V,sn);
        int tam=repetidos(V,N);
        menoramayor(V,tam);
        
        
        
        
    }
    
}
