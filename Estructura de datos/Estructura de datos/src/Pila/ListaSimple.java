package Pila;

//Esta clase enlaza los nodos creados por el constructor de la clase "NodoSimple"
public class ListaSimple<Object> {
    private NodoSimple<Object> inicio, actual;
    
    public ListaSimple(){
        establecer(null);
    }
    
    public ListaSimple(Object elemento){
        establecer(new NodoSimple(elemento));
    }
    
    //Este método se creó para inicializar o restablecer los valores de las variables "inicio" y "actual"
    private void establecer(NodoSimple valor){
        this.inicio = this.actual = valor;
    }
    
    public void reiniciar(){
        this.actual = this.inicio;
    }
    
    public void insertarAlInicio(Object elemento){
        if(estaVacia()){
            this.establecer(new NodoSimple(elemento));
            return; //se sale del condicional y del método
        }
        enlazaA(elemento);
    }
    
    //Enlaza nodos solamente para pilas
    public void enlazaA(Object elemento){
        NodoSimple nodo = new NodoSimple(elemento);
        nodo.setSiguiente(inicio);
        establecer(nodo);
    }
    
    //Enlaza nodos solamente para listas simples
    public void enlazaA(NodoSimple nodo, Object elemento){
        NodoSimple aux = nodo.getSiguiente();
        nodo.setSiguiente(new NodoSimple(elemento));
        nodo.getSiguiente().setSiguiente(aux);
    }
    
    public boolean estaVacia(){
        return inicio == null;
    }
    
    public void eliminarInicio(){
        NodoSimple aux = this.inicio.getSiguiente();
        if(this.actual == this.inicio){
            this.actual = this.inicio.getSiguiente();
        }
        this.inicio.setSiguiente(null);
        this.inicio = aux;
    }
    
    public Object getElemento(){
        return this.actual.getElemento();
    }
    
    public void setElemento(Object Elemento){
        this.actual.setElemento(Elemento);
    }
}
