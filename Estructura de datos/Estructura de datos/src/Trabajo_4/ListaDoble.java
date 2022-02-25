package Trabajo_4;

public class ListaDoble<T> {

    private NodoDoble<NodoDoble> inicio, ultimo;

    public ListaDoble() {
        this.establecer(null);
    }

    public ListaDoble(Object elemento) {
        this.establecer(new NodoDoble(elemento));
    }

    private void establecer(NodoDoble valor) {
        this.ultimo = this.inicio = valor;
    }

    private void enlazarSiguienteA(NodoDoble nodo, Object elemento) {
        nodo.setSiguiente(new NodoDoble(elemento));
        nodo.getSiguiente().setAnterior(nodo);
        this.ultimo = nodo.getSiguiente();
    }

    public void insertarSiguiente(Object elemento) {
        if (this.estaVacia()) {
            this.establecer(new NodoDoble(elemento));
        } else {
            this.enlazarSiguienteA(this.ultimo, elemento);
        }
    }

    public boolean estaVacia() {
        return this.ultimo == null && this.inicio == null;
    }

    public NodoDoble<NodoDoble> getInicio() {
        return inicio;
    }

    public void setInicio(NodoDoble<NodoDoble> inicio) {
        this.inicio = inicio;
    }

    public NodoDoble<NodoDoble> getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoDoble<NodoDoble> ultimo) {
        this.ultimo = ultimo;
    }

    @Override
    public String toString() {
        if (this.estaVacia()) {
            return "Vacía";
        }
        NodoDoble nodoActual = this.inicio;
        String str = nodoActual.toString();
        while ((nodoActual = nodoActual.getSiguiente()) != null) {
            str += "<->" + nodoActual.toString();
        }
        return str;
    }
}
