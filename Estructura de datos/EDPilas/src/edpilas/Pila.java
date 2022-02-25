/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edpilas;

/**
 *
 * @author Usuario
 */
public class Pila {
    private int P[];
    private int Tope;
    private int Tmax;
    public Pila(int X){
        this.P=new int[X];
        this.Tope=0;
        this.Tmax=X;
    }
    public boolean isEmpty(){
        return(this.Tope==0);
    }
    public boolean isFull(){
        return(this.Tope==this.Tmax);
    }
    public int Size(){
        return(this.Tope);
    }
    public int maxSize(){
        return(this.Tmax);
    }
    public int Peek(){
        if(!isEmpty()){
            return(this.P[this.Tope-1]);
        }
        return(-1);
    }
    public void Push(int X){
        if(!isFull()){
            this.P[this.Tope]=X;
            this.Tope++;
        }
    }
    public String Pop(){
        if(!isEmpty()){
            this.Tope--;
            return("Se elimino el elemento"+this.P[this.Tope+1]);
        }
        return("No existen elementos");
    }
}
