package ed_banco_pilas_colas;

public class Pila {

    private Nodo Cab;

    public Pila() {
        this.Cab = null;
    }

    public boolean isEmpty() {
        return (this.Cab == null);
    }

    public int Size() {
        Nodo P = this.Cab;
        int K = 0;
        while (P != null) {
            K++;
            P = P.getSig();
        }
        return (K);
    }

    public Nodo LastNodo() {
        Nodo P = this.Cab;
        if (isEmpty()) {
            return (null);
        } else {
            while (P.getSig() != null) {
                P = P.getSig();
            }
            return (P);
        }
    }

    public void Peek() {
        if (isEmpty()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("Se debe atender: ");
            Nodo P = LastNodo();
            P.getC().Informacion();
        }
    }

    public void Push(Cliente X) {
        Nodo P = new Nodo(X);
        if (isEmpty()) {
            this.Cab = P;
        } else {
            Nodo Q;
            Q = LastNodo();
            Q.setSig(P);
        }
    }

    public void Pop() {
        if (isEmpty()) {
            System.out.println("Pila vacia");
        } else {
            Nodo P = this.Cab;
            Nodo Q = this.LastNodo();
            System.out.println("El nodo atendido fue: ");
            Q.getC().Informacion();
            while (P.getSig() != Q) {
                P = P.getSig();
            }
            P.setSig(null);
        }
    }

    public void MostrarPila() {
        Nodo P = this.Cab;
        while (P != null) {
            P.getC().Informacion();
            P = P.getSig();
        }
    }
}
