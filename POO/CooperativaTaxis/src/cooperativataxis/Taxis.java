/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cooperativataxis;

/**
 *
 * @author MILE-IVA
 */
public class Taxis {
    private Taxi V[];
    private int T,Tmax;
    public Taxis(){
        this.T=0;
        this.Tmax=50;
        this.V=new Taxi[this.Tmax];
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
                System.out.println("Entro");
                return(i);
            }
        }
        return(-1);
    }
    public String RegistroDelMovil(long X){
        int F=Buscar(X);
        if(F==-1){
            this.V[this.T]=new Taxi(X);
            this.T++;
            return("Fue registrado Satisfactoriamente");
            
        }
        return("El numero de movil ya existe");
    }
    public String RegistroDeServicio(long X,double V){
        int F=Buscar(X);
        if(F!=-1){
            System.out.println("Entro");
            this.V[F].Servicios(V);
            return("Fue registrado Satisfactoriamente");
            
        }
        return("El numero de movil no existe");
    }
    public String InformacionDelMovil(long X){
        int F=Buscar(X);
        if(F!=-1){
            return(this.V[F].Informacion());
        }
        return("El numero de movil no existe");
    }
}
