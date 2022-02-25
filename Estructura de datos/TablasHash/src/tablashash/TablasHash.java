/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablashash;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TablasHash {
public static boolean EsPrimo(int X) {
        int Contador =0;
        for(int i=1;i<X+1;i++){
            if (X %i==0) {
                Contador++;
            }
        }
        if(Contador==2){
            return(true);
        }else{
            return(false);
        }
    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Digite tamaño del vector");
        int Tam=sn.nextInt();
        if(EsPrimo(Tam-1)){
            Hash H=new Hash(Tam);
            H.Print();
            H.Insert(13);
            H.Insert(24);
            H.Insert(3);
            H.Insert(6);
            H.Insert(9);
            H.Insert(15);
            H.Insert(34);
            H.Insert(789);
            H.Insert(1);
            H.Insert(9867);
            H.Insert(43);
            H.Insert(22);
            H.Insert(44);
            H.Insert(55);
            H.Insert(77);
            H.Print();
            System.out.println(H.Search(13));
            System.out.println(H.Search(11111));
            System.out.println(H.Delete(22));
            System.out.println(H.Delete(9));
            H.Print();
        }else{
            System.out.println("Tamaño digitado no es igual a Numero Primo+1");
        }
        
        
    }
    
}
