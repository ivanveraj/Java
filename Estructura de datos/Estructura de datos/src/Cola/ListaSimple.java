package Cola;

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
    
    //Utilizado por apilar
    public void insertarAlInicio(Object elemento){
        if(estaVacia()){
            this.establecer(new NodoSimple(elemento));
            return; //se sale del condicional y del método
        }
        //Se hace ya que es LIFO
        Object aux = this.inicio.getElemento();
        this.inicio.setElemento(elemento);
        this.enlazaA(inicio, aux);
    }
    
    //Utilizado por encolar
    public void anadir(Object elemento){
        if(this.estaVacia()){
            this.establecer(new NodoSimple(elemento));
            return;
        }
        //Se hace ya que es FIFO
        this.enlazaA(this.actual, elemento);
        this.actual = this.actual.getSiguiente();
    }
        
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
        this.inicio.setSiguiente(null);//si se desea se puede utilizar el método de JAVA que destruye los nodos
        this.inicio = aux;
    }
    
    public Object getElemento(){
        return this.inicio.getElemento();
    }
    
    public void setElemento(Object Elemento){
        this.inicio.setElemento(Elemento);
    }

    @Override
    public String toString() {
        if(this.estaVacia())
            return "";
        NodoSimple nodoActual = this.inicio;
        String str = nodoActual.toString();
        while((nodoActual = nodoActual.getSiguiente()) != null){
            str += "->" + nodoActual.toString();
        }
        return str;
    }
}
