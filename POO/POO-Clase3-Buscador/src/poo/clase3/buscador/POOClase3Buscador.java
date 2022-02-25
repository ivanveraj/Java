/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase3.buscador;
import java.util.*;
/**
 *
 * @author MILE-IVA
 */
public class POOClase3Buscador {
    public static void Buscador(int v[],int A){
        int pos=0;
        boolean noexiste=true,existe=false;
        for(int i=0;i<v.length;i++){
            if(v[i]==A){
                pos=i;
                existe=true;
            }else{
                noexiste=false;
            }
        }
        if(noexiste==false&&existe==false){
            System.out.println("El numero "+A+" no existe");
        }
        if(existe==true){
            System.out.println("El numero "+A+" si existe y se encuentra en la posicion "+pos);
        }
        
    }
     public static void llenar(int v[],Scanner sn){
        for(int i=0;i<v.length;i++){
            System.out.println("Digite el valor del vector en la Posicion "+i);
            v[i]=sn.nextInt();
        }
    }
    
    

    public static void main(String[] args) {
        int N,A;
        Scanner sn=new Scanner (System.in);
        System.out.println("Digite el tamaño del vector");
        N=sn.nextInt();
        int V[]=new int[N];
        System.out.println("Digite el numero entero que desea buscar");
        A=sn.nextInt();
        llenar(V,sn);
        Buscador(V,A);
        
        
        
    }
    
}
