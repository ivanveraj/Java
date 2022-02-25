
package Trabajo_3;


import java.io.IOException;
import javax.swing.JOptionPane;


public class Principal {
   
    public static void main(String  args[]) throws IOException{
        System.out.println("Practica final");
        int TamanioP = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de posiciones para el vector plantas"));
        int TamanioM = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de posiciones para el vector materas"));
        int TamanioA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de posiciones para el vector abonos"));
         Metodox M= new Metodox(TamanioP,TamanioM,TamanioA);
         M.IngresoInformacion();
         M.IncluirInfoArchivo();
    }
}
