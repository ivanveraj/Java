/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edarreglosdinamicos;

/**
 *
 * @author Usuario
 */
public class Pila {
    private Nodo Cab;
    public Pila(){
        this.Cab=null;
    }
    public boolean isEmpty(){
        return(this.Cab==null);
    }
    public boolean isFull(){
        return(this.Cab!=null);
    }
    public int Size(){
        Nodo P=this.Cab;
        int K=0;
        while(P!=null){
            K++;
            P=P.getSig();
        }
        return(K);
    }
    public Nodo LastNodo(){
            Nodo P=this.Cab;
            if(isEmpty()){
                    return(null);
            }else{
                while(P.getSig()!=null){
                P=P.getSig();
                }
                return(P);
            }
        }
    public String Peek(){
        if(isEmpty()){
            return("Pila vacia");
        }else{
            Nodo P=LastNodo();
            return("Nodo atendido: "+P.getInfo());
        }
    }
    public void Push(int X){
        Nodo P=new Nodo(X);
        if(isEmpty()){
            this.Cab=P;
        }else{
            Nodo Q;
            Q=LastNodo();
            Q.setSig(P);
        }
    }
    public String Pop(){
        if(isEmpty()){
            return("Pila vacia.");
        }else{
            Nodo P=this.Cab;
            if(this.Cab.getSig()==null){
                this.Cab=null;
                return("El elemento eliminado fue: ");
            }else{
                Nodo Q=LastNodo();
                while(P.getSig()!=Q){
                    P=P.getSig();
                }
                P.setSig(null);
                return("Se atendio a: "+Q.getInfo());
            }
        }
}
}

