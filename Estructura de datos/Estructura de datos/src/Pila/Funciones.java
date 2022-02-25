
package Pila;
import javax.swing.JOptionPane;

public class Funciones {
    private Pila<Integer> pilaEnteros = new Pila();

    public void ingresarNumeros(){
        while(JOptionPane.showConfirmDialog(null,"¿Desea ingresar un valor? ") == JOptionPane.YES_NO_OPTION){
            pilaEnteros.apilar(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor: ")));
        }
    }

    public String mostrarNumeros(){
        String mnj = "";
        Pila<Integer> pilaAux = new Pila();
        
        while(!pilaEnteros.estaVacia()){
                mnj += pilaEnteros.getElemento() + " - ";
                pilaAux.apilar(pilaEnteros.getElemento());
                pilaEnteros.desapilar();
                
        }
        
        while(pilaEnteros.estaVacia()){
            pilaEnteros.apilar(pilaAux.getElemento());
            pilaAux.desapilar();
        }
        
        return mnj;
    }
    
    public String mostarEspecifico(boolean c){
        Pila<Integer> pilaAux = new Pila();
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor a verificar:"));
            if(c){
               while(!pilaEnteros.estaVacia()){
                   if(a == pilaEnteros.getElemento()){
                       
                       return  "El numero "+ a + ", se encuentra en la pila";
                   }else
                       pilaAux.apilar(pilaEnteros.getElemento());
                       pilaEnteros.desapilar();
               }
            }  
        
            return "El valor no se encuentra en la pila";
        }
    }
    

