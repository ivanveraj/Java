package pilcol.pila.cola;

public class Pila {

    private Nodo cab;
    private Nodo end;

    public Pila() {
        this.cab = null;
    }

    public boolean isEmpty() {
        return this.cab == null;
    }

    public void push(int x) { // insertar de a un elemento
        Nodo n = new Nodo(x);
        if (isEmpty()) {
            this.cab = n;
            this.end = n;
        } else {
            end.setSig(n);
            end = n;
        }
    }

    public int size(){
        int s = 0;
        Nodo q = this.cab;
        while (q != null) {
            q = q.getSig();
            s++;
        }
        return s;
    }

    public Nodo delete() {
        if (isEmpty()){
            return null;
        }else{
            if(this.cab == this.end){
                Nodo P = this.cab;
                this.cab = null;
                this.end = null;
                return P;
            }
            else{
                Nodo P = this.cab;
                while(P.getSig() != this.end){
                    P = P.getSig();
                }
                Nodo Q = this.end;
                this.end = P;
                P.setSig(null);
                return Q;
            }
        }
    }

    public String view() {
        String s = "Cab -> ";
        Nodo q = this.cab;
        while (q != null) {
            s += q.getInfo() + " -> ";
            q = q.getSig();
        }
        s += "NULL";
        return s;
    }

    public int peek(){
        if (isEmpty())
            return -1;
        int s = 0;
        Nodo q = this.cab;
        while (q != null) {
            s = q.getInfo();
            q = q.getSig();
        }
        return (s);
    }
}
