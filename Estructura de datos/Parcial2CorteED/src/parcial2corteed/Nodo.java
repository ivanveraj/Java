package parcial2corteed;

public class Nodo {
    private int Info;
    private Nodo Sig, Ant;
    public Nodo(int X){
        this.Info=X;
        this.Sig=null;
        this.Ant=null;
    }
    public int getInfo() {
        return this.Info;
    }
    public void setInfo(int Info) {
        this.Info = Info;
    }
    public Nodo getSig() {
        return this.Sig;
    }
    public void setSig(Nodo Sig) {
        this.Sig = Sig;
    }
    public Nodo getAnt() {
        return Ant;
    }
    public void setAnt(Nodo Ant) {
        this.Ant = Ant;
    }
    
}
