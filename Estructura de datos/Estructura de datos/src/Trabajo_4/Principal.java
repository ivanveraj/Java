/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo_4;

import java.io.IOException;
import javax.swing.JOptionPane;


public class Principal {
   
    public static void main(String  args[]) throws IOException{
        System.out.println("Cuarta practica");
        /*int TamVP= Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del vector planta: "));
        int TamVM= Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del vector matera: "));
        int TamVA= Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del vector abono: "));
        int TamPP= Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño de la pila planta: "));
        int TamPM= Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño de la pila matera: "));
        int TamPA= Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño de la pila abono: "));
        int TamCP= Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño de la cola planta solares: "));
        int TamCM= Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño de la cola materas ceramica: "));
        int TamCA= Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño de la cola abono caracteres: "));
        Metodos M=new Metodos(TamVP, TamVM, TamVA, TamPP, TamPM, TamPA, TamCP, TamCM, TamCA);*/
        Metodos M=new Metodos(1,1,1,1,1,1,1,1,1);
        M.ListaDoblePlanta();
        System.out.println("Salio planta");
        M.ListaDobleMatera();
        System.out.println("Salio matera");
        M.ListaDobleAbono();
        System.out.println("Salio");
        M.ImprimirVectores();
        M.ImprimirPilas();
    }
}
