package Cola;

import Cola.ListaSimple;

public class Cola<Object> {
    private ListaSimple<Object> elementos;
    
    public Cola(){
        this.elementos = new ListaSimple();
    }
    
    public void encolar(Object elemento){
        this.elementos.anadir(elemento);
    }
    
     public Object getElemento() {
        return elementos.getElemento();
    }
    
    public void desencolar(){
        this.elementos.eliminarInicio();
    }
    
    //Trabaja con concepto de Abstración
    public boolean estaVacia(){
        return elementos.estaVacia();
    }
}
