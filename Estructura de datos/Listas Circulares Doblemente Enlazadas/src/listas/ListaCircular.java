package listas;

public class ListaCircular {
    private Nodo Raiz;
    public ListaCircular() {
        this.Raiz = null;
    }
    public void InsertTo(int X, int Posicion) {
        if (Posicion < this.Size()) {
            Nodo P = new Nodo(X);
            if (Posicion == 0) {
                Nodo Aux = this.Raiz;
                while (Aux.getSig() != this.Raiz) {
                    Aux = Aux.getSig();
                }
                Aux.setSig(P);
                P.setAnt(Aux);
                P.setSig(this.Raiz);
                this.Raiz.setAnt(P);
                this.Raiz = P;
            } else {
                if (Posicion == this.Size() - 1) {
                    Nodo Q = this.Raiz;
                    while (Q.getSig() != this.Raiz) {
                        Q = Q.getSig();
                    }
                    Q.setSig(P);
                    P.setAnt(Q);
                    P.setSig(this.Raiz);
                } else {
                    Nodo Q = this.Raiz;
                    int i = 0;
                    while (i < Posicion - 1) {
                        Q = Q.getSig();
                        i++;
                    }
                    Nodo R = Q.getSig();
                    Q.setSig(P);
                    P.setAnt(Q);
                    P.setSig(R);
                    R.setAnt(P);
                }
            }
        }
    }

    public void InsertFirst(int X) {
        Nodo P = new Nodo(X);
        if (this.Raiz == null) {
            P.setSig(P);
            P.setAnt(P);
            this.Raiz = P;
        } else {
            Nodo Aux = this.Raiz;
            while (Aux.getSig() != this.Raiz) {
                Aux = Aux.getSig();
            }
            Aux.setSig(P);
            P.setAnt(Aux);
            P.setSig(this.Raiz);
            this.Raiz.setAnt(P);
            this.Raiz = P;
        }
    }

    public boolean isEmpty() {
        return (this.Raiz == null);
    }

    public int Size() {
        int Cont = 0;
        if (!isEmpty()) {
            Nodo P = this.Raiz;
            do {
                Cont++;
                P = P.getSig();
            } while (P != this.Raiz);
        }
        return Cont;
    }

    public void Delete(int Posicion) {
        if (this.Raiz != null) {
            if (Posicion > 0) {
                int Cont = 1;
                Nodo Aux = this.Raiz;
                while (Aux.getSig() != this.Raiz && Cont < Posicion) {
                    Cont++;
                    Aux = Aux.getSig();
                }
                if (Cont == 1) {
                    if (Aux.getSig() == this.Raiz) {
                        this.Raiz = null;
                    } else {
                        Nodo A = Aux.getAnt();
                        A.setSig(Aux.getSig());
                        Aux = Aux.getSig();
                        Aux.setAnt(A);
                        this.Raiz = Aux;
                    }
                } else {
                    Nodo A = Aux.getAnt();
                    Aux.setAnt(null);
                    A.setSig(Aux.getSig());
                    Aux = Aux.getSig();
                    Aux.setAnt(A);
                }
            } else {
                System.out.println("Lista vacia");
            }
        } else {
            System.out.println("Lista vacia");
        }
    }

    public void Imprimir() {
        Nodo P = this.Raiz;
        do {
            System.out.print(P.getInfo() + "-");
            P = P.getSig();
        } while (P != this.Raiz);
        System.out.println("");
    }

    public Nodo BuscarNodo(int P) {
        if (!isEmpty()) {
            Nodo Q = this.Raiz;
            int C = 0;
            do {
                if (C == P) {
                    return (Q);
                }
                Q = Q.getSig();
                C++;
            } while (Q != this.Raiz);
        }
        return (null);
    }

    public void IntercambioInfo(int P1, int P2) {
        int T = Size();
        if (P1 >= 0 && P1 < T && P2 >= 0 && P2 < T) {
            Nodo Aux1 = BuscarNodo(P1);
            Nodo Aux2 = BuscarNodo(P2);
            if (Aux1 != null || Aux2 == null) {
                int Aux = Aux1.getInfo();
                Aux1.setInfo(Aux2.getInfo());
                Aux2.setInfo(Aux);
            } else {
                System.out.println("Alguna de las posiciones no fue encontrada");
            }
        }
    }
    public void Promedio() {
        double Prom = 0;
        int Tam = Size();
        Nodo P = this.Raiz;
        do {
            Prom += P.getInfo();
            P = P.getSig();
        } while (P != this.Raiz);
        System.out.println("El promedio de la lista es: " + Prom / Tam);
    }
}
