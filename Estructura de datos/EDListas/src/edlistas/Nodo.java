package edlistas;

public class Nodo {
    private int Info;
    private Nodo Sig;
    public Nodo(int X){
        this.Info=X;
        this.Sig=null;
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
}
