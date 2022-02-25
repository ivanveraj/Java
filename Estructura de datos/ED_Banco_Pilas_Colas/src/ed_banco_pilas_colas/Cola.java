package ed_banco_pilas_colas;

public class Cola {
    private Nodo Cab;
    private int Contador,Atendidos;
    private Nodo Primer,Ultimo;
    public Cola() {
        this.Cab = null;
        this.Contador=0;
        this.Atendidos=0;
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
            System.out.println("Cola vacia");
        } else {
            System.out.println("Se debe atender: ");
            this.Cab.getC().Informacion();
        }
    }

    public void Enqueue(Cliente X) {
            Nodo P = new Nodo(X);
            if (isEmpty()) {
                this.Cab = P;
            } else {
                Nodo Q;
                Q = LastNodo();
                Q.setSig(P);
            }
            this.Contador++;
    }

    public void Denqueue() {
        if (isEmpty()) {
            System.out.println("Cola vacia");
        } else {
            Nodo P = this.Cab;
            this.Cab = this.Cab.getSig();
            P.setSig(null);
            System.out.println("El nodo atendido fue: ");
            P.getC().Informacion();
            this.Atendidos++;
            if(this.Atendidos==1){
                this.Primer=P;
            }
            this.Ultimo=P;
        }
    }

    public int getContador() {
        return Contador;
    }
    public void setContador(int Contador) {
        this.Contador = Contador;
    }

    public Nodo getPrimer() {
        return Primer;
    }

    public void setPrimer(Nodo Primer) {
        this.Primer = Primer;
    }

    public Nodo getUltimo() {
        return Ultimo;
    }

    public void setUltimo(Nodo Ultimo) {
        this.Ultimo = Ultimo;
    }

    public Nodo getCab() {
        return Cab;
    }

    public void setCab(Nodo Cab) {
        this.Cab = Cab;
    }
    public void MostrarCola() {
        Nodo P = this.Cab;
        while (P != null) {
            P.getC().Informacion();
            P = P.getSig();
        }
    }

    public int getAtendidos() {
        return Atendidos;
    }

    public void setAtendidos(int Atendidos) {
        this.Atendidos = Atendidos;
    }
    
}