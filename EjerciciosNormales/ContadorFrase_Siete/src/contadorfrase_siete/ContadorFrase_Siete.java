/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorfrase_siete;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ContadorFrase_Siete {
    public static int ContadorCaracter(String Frase, char Caracter){
        int Total= 0;
        char Letra;
        String F=Frase.toLowerCase();
        for (int i = 0;i<F.length(); i++) {
            Letra=F.charAt(i);
            if (Letra==Caracter){
                Total++;
            }
        }
        return(Total);
    }
    public static int ContadorPalabras(String Frase){
        int Total=ContadorCaracter(Frase,' ');
        return(Total+1);
    }
    public static int ContadorVocales(String Frase){
        int Total=0;
        Total+=ContadorCaracter(Frase,'a');
        Total+=ContadorCaracter(Frase,'e');
        Total+=ContadorCaracter(Frase,'i');
        Total+=ContadorCaracter(Frase,'o');
        Total+=ContadorCaracter(Frase,'u');
        return(Total);
    }
    public static int ContadorConsonantes(String Frase){
        int TotalV=ContadorVocales(Frase);
        int TotalE=ContadorCaracter(Frase,' ');
        int TotalConsonante=Frase.length()-(TotalV+TotalE);
        return(TotalConsonante);
    }
    /*Hola como esta mi nombre es Mallely soy de Medellin
    TotalC=48-26=22
    Vocales:17 
    Espacios: 9
    Consonantes= TotalC-(Vocales+Espacio)*/
    
    public static void main(String[] args) {
        /*Construya un algoritmo que lea una frase del español de máximo 
        100 caracteres y determine cuántas palabras, vocales y consonantes tiene.*/
        Scanner sn=new Scanner(System.in);
        /*Hola mi nombre es Jaider*/
        System.out.println("Digite una frase en español que tenga maximo 100 caracteres\n");
        //String Frase = sn.nextLine();
        String Frase="Hola como esta mi nombre es Mallely soy de Medellin";
        if(Frase.length()<=100){
            System.out.println("La frase es: \n"+Frase);
            System.out.println("La frase tiene un total de: "+Frase.length()+" caracteres");
            System.out.println("La frase tiene "+ContadorPalabras(Frase)+" palabras en su estructura");
            System.out.println("La frase tiene "+ContadorVocales(Frase)+" vocales en su estructura");
            System.out.println("La frase tiene "+ContadorConsonantes(Frase)+" consonantes en su estructura");
            
        }else{
            System.out.println("Error frase supera el limite de caracteres");
        }
    }
    
}
