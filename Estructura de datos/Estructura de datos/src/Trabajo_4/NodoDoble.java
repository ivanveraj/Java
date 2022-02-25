package Trabajo_4;

public class NodoDoble<T> { // "T" es algo teórico, se coloca para indicar que cualquier clase u objeto se puede utilizar
    
    private Object elemento;
    private NodoDoble anterior, siguiente;
    private int indice;

    //Esté constructor me crea un nodo doble
    public NodoDoble(Object elemento) {
        this.anterior = null;
        this.elemento = elemento;
        this.siguiente = null;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return (this.elemento == null) ? "nulo" : this.elemento.toString();
    }
}
