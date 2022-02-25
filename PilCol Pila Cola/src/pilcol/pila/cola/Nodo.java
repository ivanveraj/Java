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
public class Nodo {
    private int Info;
    private Nodo Sig;
    public Nodo(int X){
        this.Info=X;
        this.Sig=null;
    }
    public int getInfo() {
        return Info;
    }
    public void setInfo(int Info) {
        this.Info = Info;
    }
    public Nodo getSig() {
        return Sig;
    }
    public void setSig(Nodo Sig) {
        this.Sig = Sig;
    }
}
