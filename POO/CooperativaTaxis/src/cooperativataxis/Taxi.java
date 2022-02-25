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
public class Taxi {
    private long Numero;
    private double Valor;
    private int Servicios;
    public Taxi(long N){
        this.Numero=N;
        this.Valor=0;
        this.Servicios=0;
    }
    public void setNumero(long N){
        this.Numero=N;
    }
    public void setValor(double V){
        this.Valor=V;
    }
    public long getNumero(){
        return(this.Numero);
    }
    public double getValor(){
        return(this.Valor);
    }
    public int getServicios(){
        return(this.Servicios);
    }
    public String Informacion(){
        return("El numero del Movil es:"+this.Numero+" y el total recaudado fue $"+this.Valor+" , el total de servicios realizados es:"
                +this.Servicios);
    }
    public String Servicios(double V){
        this.Servicios+=1;
        this.Valor+=V;
        return("Servicio guardado");
    }
    
    
    
    
    
}
