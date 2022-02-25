package Pila;
public class Pila<Object> {
    private ListaSimple<Object> elementos;
        
    //Este constructor crea el objeto llamado "elementos" que es tipo de dato "ListaSimple"
    public Pila(){
        this.elementos = new ListaSimple();
    }
    
    //Método que almacena el objeto en la estructura pila
    public void apilar(Object elemento){
        this.elementos.insertarAlInicio(elemento);
    }
    
    public void desapilar(){
        this.elementos.eliminarInicio();
    }
    
    public boolean estaVacia(){
        return this.elementos.estaVacia();
    }
    
    public Object getElemento(){
        return this.elementos.getElemento();
    }
   
    public void setElemento(Object elemento){
        this.elementos.setElemento(elemento);
    }
}
