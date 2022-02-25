
package Pila;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Funciones fun = new Funciones();
        fun.ingresarNumeros();
        JOptionPane.showMessageDialog(null,fun.mostrarNumeros());
        JOptionPane.showMessageDialog(null,fun.mostarEspecifico(JOptionPane.showConfirmDialog(null,"¿Desea buscar un numero especifico en la pila?") == JOptionPane.YES_NO_OPTION));
    
    }
    
}

