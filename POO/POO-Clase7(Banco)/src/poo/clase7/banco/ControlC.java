/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase7.banco;

/**
 *
 * @author iser
 */
public class ControlC {
    private Cuenta V[];
    private int T,Tmax;
    public ControlC(){
        this.Tmax=50;
        this.T=0;
        this.V=new Cuenta[this.Tmax];
    }
    
    public void setT(int X){
        this.T=X;
    }
    public void setTmax(int X){
        this.Tmax=X;
    }
    public int getT(){
        return(this.T);
    }
    public long getTmax(){
        return(this.Tmax);
    }
    public int Buscar(long X){
        for(int i=0;i<this.T;i++){
            if(this.V[i].getNumero()==X){
                return(i);
            }
            
        }
        
        return(-1);
    }
    public String Crear(long N,long Ced,double S){
        int R;
        R=Buscar(N);
        if(R==-1){
            this.V[this.T]=new Cuenta(N,Ced,S);
            this.T++;
            return("ok");
        }
        return("Error no existe");
    }
    public String Consulta(long N){
        int R;
        R=Buscar(N);
        if(R!=-1){
            return(this.V[R].Informacion());
        }
        return("Esta cuenta no existe");
    }
    public String Retiro(long Num,double X){
        int B;
        B=Buscar(Num);
        if(Num!=-1){
            return(this.V[B].Retiro(X)); 
            }
            return("La cuenta no existe");
        }
    public String Consignacion(long Num,double X){
        int B;
        B=Buscar(Num);
        if(Num!=-1){
            return(this.V[B].Consignacion(X));
        }
        return("La consignacion es invalida");
    }
}
