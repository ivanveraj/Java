/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase4.pkg1;

/**
 *
 * @author iser
 */
public class Conversion {
    private double tasa,monto;
    public Conversion(){
        this.tasa=0;
        this.monto=0;
    }
    public void setTasa(double x){
        this.tasa=x;
    }
    public void setMonto(double x){
        this.monto=x;
    }
    public double getTasa(){
        return(this.tasa);
    }
    public double getMonto(){
        return(this.monto);
    }
    
}
