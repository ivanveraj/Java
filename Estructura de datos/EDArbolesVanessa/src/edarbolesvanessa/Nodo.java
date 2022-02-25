package edarbolesvanessa;
public class Nodo {
    private Nodo Izq;
    private Nodo Der;
    private int Info;
    public Nodo(int Info){
        this.Info=Info;
        this.Der=null;
        this.Izq=null;
    }
    public Nodo getIzq() {
        return Izq;
    }
    public void setIzq(Nodo Izq) {
        this.Izq = Izq;
    }
    public Nodo getDer() {
        return Der;
    }
    public void setDer(Nodo Der) {
        this.Der = Der;
    }
    public int getInfo() {
        return Info;
    }
    public void setInfo(int Info) {
        this.Info = Info;
    }
}
