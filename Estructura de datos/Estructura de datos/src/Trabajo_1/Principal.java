
package Trabajo_1;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int TamanioP = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de posiciones para el vector plantas"));
        int TamanioM = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de posiciones para el vector materas"));
        int TamanioA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de posiciones para el vector abonos"));
        Metodo M= new Metodo(TamanioP,TamanioM,TamanioA);
        M.IngresarInfo();
        M.InformacionRequerida();
    }
}
