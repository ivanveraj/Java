/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_banco_pilas_colas;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private Cliente C;
    private Nodo Sig;
    public Nodo(Cliente X){
        this.C=X;
        this.Sig=null;
    }
    public Cliente getC() {
        return C;
    }
    public void setC(Cliente C) {
        this.C = C;
    }
    public Nodo getSig() {
        return Sig;
    }
    public void setSig(Nodo Sig) {
        this.Sig = Sig;
    }
}