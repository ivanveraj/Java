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
public class Cuenta {
    private long Numero,Ced;
    private double Saldo;
    public Cuenta(long Num,long C,double Sal){
        this.Numero=Num;
        this.Ced=C;
        this.Saldo=Sal;
    }
    public void setNumero(long X){
        this.Numero=X;
    }
    public void setCed(long X){
        this.Ced=X;
    }
    public void setSaldo(double X){
        this.Saldo=X;
    }
    public long getNumero(){
        return(this.Numero);
    }
    public long getCed(){
        return(this.Ced);
    }
    public double getSaldo(){
        return(this.Saldo);
    }
    public String Informacion(){
        return("El numero de su cuenta es "+this.Numero+" esta inscrita con la cedula "+this.Ced+" y el saldo total es: "+this.Saldo);
    }
    public String Retiro(double X){
        if(this.Saldo>=X){
            this.Saldo-=X;
            return("Retiro Completado, este es su nuevo saldo"+this.Saldo);
        }
        return("Saldo insuficiente");
    }
    public String Consignacion(double X){
        if(X>0){
            this.Saldo+=X;
            return("Consignacion completada, su nuevo saldo es "+this.Saldo);
        }
        return("La consignacion es invalida");
    }
}
