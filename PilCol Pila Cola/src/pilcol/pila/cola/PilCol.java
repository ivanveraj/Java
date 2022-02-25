/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilcol.pila.cola;

/**
 *
 * @author Usuario
 */
public class PilCol {

    private Nodo Cab, End;
    private boolean Intercalado;

    public PilCol() {
        this.Cab = null;
        this.End = null;
        this.Intercalado = true;
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

    public String Peek() {
        if (isEmpty()) {
            return ("Pila vacia");
        } else {
            return ("Se debe atender: " + this.Cab.getInfo());
        }
    }

    public void IngresoPilCol(int X) {
        if (ValidaRepetido(X)) {
            System.out.println("Error: valor repetido");
        } else {
            if (X % 2 == 0) {
                this.IngresoInicio(X);
            } else {
                this.IngresoFinal(X);
            }
        }
    }

    public void IngresoFinal(int X) {
        Nodo P = new Nodo(X);
        if (isEmpty()) {
            this.Cab = P;
            this.End = P;
        } else {
            this.End.setSig(P);
            this.End = P;
        }
    }

    public void IngresoInicio(int X) {
        Nodo P = new Nodo(X);
        if (isEmpty()) {
            this.Cab = P;
            this.End = P;
        } else {
            Nodo Q = this.Cab;
            P.setSig(Q);
            this.Cab = P;
        }
    }

    public boolean ValidaRepetido(int X) {
        Nodo P = this.Cab;
        while (P != null) {
            if (P.getInfo() == X) {
                return true;
            }
            P = P.getSig();
        }
        return false;
    }

    public void IntercambioEspecial() {
        if (isEmpty()) {
            System.out.println("Error: PilCol vacio");
        } else {
            Nodo Aux = this.Cab;
            Nodo Q = this.Cab;
            Nodo P = this.End;
            if (this.Cab.getSig() == this.End) {
                System.out.println("Entro");
                P.setSig(Q);
                Q.setSig(null);
                this.Cab=P;
                this.End=Q;
            } else {
                System.out.println("Entro 2");
                System.out.println("Cab: " + this.Cab.getInfo());
                System.out.println("End: " + this.End.getInfo());
                while (Q.getSig() != this.End) {
                    Q = Q.getSig();
                }
                P.setSig(this.Cab.getSig());
                Q.setSig(Aux);
                Aux.setSig(null);
                this.Cab = P;
                this.End=Aux;
                System.out.println("Cab: " + this.Cab.getInfo());
                System.out.println("Cabx: " + this.Cab.getSig().getInfo());
                System.out.println("End: " + this.End.getInfo());
                System.out.println("Endx: " + this.End.getInfo());
            }

        }
    }

    public void Eliminador() {
        if (this.Intercalado == true) {
            System.out.println(this.EliminaPrimero());
            this.Intercalado = false;
        } else {
            System.out.println(this.EliminaUltimo());
            this.Intercalado = true;
        }
    }

    public String EliminaPrimero() {
        System.out.println("Eliminacion False");
        if (isEmpty()) {
            return ("Error: PilCol vacia");
        } else {
            Nodo P = this.Cab;
            this.Cab = this.Cab.getSig();
            P.setSig(null);
            return ("El nodo atendido fue: " + P.getInfo());
        }
    }

    public String EliminaUltimo() {
        System.out.println("Eliminacion True");
        if (isEmpty()) {
            return ("Error PilCol vacia");
        } else {
            if (this.Cab == this.End) {
                this.Cab = null;
                this.End = null;
                return ("Eliminado primer caso");
            } else {
                Nodo P = this.Cab;
                while (P.getSig() != this.End) {
                    P = P.getSig();
                }
                this.End = P;
                P.setSig(null);
                return ("Eliminado segundo caso");
            }
        }
    }

    public void ConsultarRetiro() {
        if (this.Intercalado == true) {
            System.out.println("El nodo a eliminar seria: " + this.Cab.getInfo());
        } else {
            System.out.println("El nodo a eliminar seria: " + this.End.getInfo());
        }
    }

    public String MostrarPilCol() {
        String s = "Cab => ";
        Nodo q = this.Cab;
        while (q != null) {
            s += q.getInfo() + " -> ";
            q = q.getSig();
            System.out.println(s);
        }
        s += "NULL";
        return s;
    }
}
