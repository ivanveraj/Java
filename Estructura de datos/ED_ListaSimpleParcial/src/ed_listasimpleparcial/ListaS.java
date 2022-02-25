package ed_listasimpleparcial;

public class ListaS {
    private Nodo Cab;
    public ListaS() {
        this.Cab = null;
    }
    public Nodo getCab() {
        return Cab;
    }
    public void setCab(Nodo cab) {
        Cab = cab;
    }
    public boolean isEmpty() {        // Valida si la lista esta vacia
        return (this.Cab == null);
    }
    public void insertFirst(int x) {
        Nodo P = new Nodo(x);
        P.setSig(this.Cab);
        this.Cab = P;
    }
    public void insertLast(int x) {
        Nodo P = new Nodo(x);
        // Caso 1... Lista vacia se debe insertar en la cabeza
        if (isEmpty()) {//me regresa True si no hay elementos en la lista
            this.Cab = P;
        } else { // Caso 2: Lista con elementos debo ubicar el ultimo elemento
            Nodo Q = this.Cab;
            while (Q.getSig() != null) {
                Q = Q.getSig();
            }
            Q.setSig(P);
        }

    }
    public void insertFirst(Nodo P) {
        P.setSig(this.Cab);
        this.Cab = P;
    }
    public void insertLast(Nodo P) {
        // Caso 1... Lista vacia se debe insertar en la cabeza
        if (isEmpty()) {//me regresa True si no hay elementos en la lista
            this.Cab = P;
        } else { // Caso 2: Lista con elementos debo ubicar el ultimo elemento
            Nodo Q = this.Cab;
            while (Q.getSig() != null) {
                Q = Q.getSig();
            }
            Q.setSig(P);
        }
    }
    public Nodo findNodo(int x) {
        Nodo P = this.Cab;
        while (P != null) {
            if (P.getInfo() == x) {
                return P;
            }
            P = P.getSig();
        }
        return null;
    }
    public Nodo buscarMayor() {
        Nodo P, Mayor;
        Mayor = this.Cab;
        if (this.Cab != null) {
            P = Mayor.getSig();
            while (P != null) {
                if (P.getInfo() > Mayor.getInfo()) {
                    Mayor = P;
                }
                P = P.getSig();
            }
        }
        return (Mayor);
    }
    public Nodo deleteFirst() {
        if (isEmpty()) {
            return null;
        } else {
            Nodo P = this.Cab;
            this.Cab = P.getSig();
            P.setSig(null);
            return P;
        }
    }
    public Nodo deleteTo(Nodo P) {
        if (P == this.Cab) {
            this.Cab = P.getSig();
            P.setSig(null);
        } else {
            Nodo Q = findAnterior(P);
            Q.setSig(P.getSig());
            P.setSig(null);
        }
        return (P);
    }
    public Nodo findAnterior(Nodo P) {
        if (P == this.Cab) {
            return(null);
        }
        Nodo Q = this.Cab;
        while (Q.getSig() != P) {
            Q = Q.getSig();
        }
        return (Q);
    }

    public void ordenarMejorado() {
        // Cab -> Lista Original   Aux -> Lista Nueva
        ListaS Aux = new ListaS();
        Nodo P;
        while (this.Cab != null) {
            P = buscarMayor();
            P = deleteTo(P);
            Aux.insertFirst(P);
        }
        this.Cab = Aux.getCab();
    }

    public String viewList() {
        String rta = "Cab-> ";
        Nodo P = this.Cab;
        while (P != null) {
            rta += P.getInfo() + "-> ";
            P = P.getSig();
        }
        rta += "null";
        return (rta);
    }

    public void eliminarRepetidos() {  // Propuesta Rafael
        Nodo P, Q, R;
        P = this.Cab;
        while (P.getSig() != null) {
            Q = P.getSig();
            while (Q != null) {
                if (P.getInfo() == Q.getInfo()) {
                    R = Q.getSig();
                    deleteTo(Q);
                    Q = R;
                } else {
                    Q = Q.getSig();
                }
            }
            P = P.getSig();
        }
    }

    public void eliminarRepetidos2() {  // Propuesta Profe
        ListaS Aux = new ListaS();
        Nodo P, R;
        while (this.Cab != null) {   // Recorro hasta que la Cabeza sea Null
            P = this.deleteFirst(); // Elimino el Primer elemento de la lista Original
            R = Aux.findNodo(P.getInfo()); // Busco si en la Nueva Lista existe el valor Info del nodo que retire de la lista Original
            if (R == null) {		// Valido que no lo encontro
                Aux.insertLast(P); // Inserto el Nodo que Retire de la Lista Original en la Lista Aux
            }
        }
        this.Cab = Aux.Cab; // Actualizo el Apuntador de la Cabeza
    }
    public String intercambioNodos(int x, int y) {
        Nodo P, Q, aP;
        P = this.findNodo(x);
        Q = this.findNodo(y);
        System.out.println("P: "+P.getInfo());
        System.out.println("Q: Cab"+Q.getInfo());
        if (P != null && Q != null) {// Valido que Existan los nodos X y Y
            if (Q.getSig() != P){ // Verifico que no sean contiguos
                aP = this.findAnterior(P); // Busco el Anterior de P
            }else{
                aP = this.findAnterior(Q); // Busco el Anterior de Q ya que el anterior de P es el mismo Q
                if(aP==null){
                    P = deleteTo(P);// Retiro el nodo P
                    this.Cab=P; //Lo combierto en cabeza
                    P.setSig(Q);// Inserto a Q despues de la P
                    return("Fin");
                }
            }
            P = deleteTo(P);// Retiro el nodo P
            P.setSig(Q.getSig());// Inserto a P despues de la Q
            Q.setSig(P);
            Q = deleteTo(Q);	// Retiro Q
            if (aP != null) {
                Q.setSig(aP.getSig());// Inserto Q despues de el Anterior de P "aP" 
                aP.setSig(Q);
                return("Fin");
            } else {// si aP es null inserto a Q en la Cabeza 
                Q.setSig(this.Cab);
                this.Cab = Q;
                return("Fin");
            }
        }
        return("No existe alguno de los nodos enviados");
    }

}
