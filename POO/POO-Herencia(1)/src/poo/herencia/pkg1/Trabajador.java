/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.herencia.pkg1;

/**
 *
 * @author MILE-IVA
 */
public class Trabajador extends Persona{
    private double Salario, Bonificacion;
    public Trabajador(int X,int Y, String Z){
        super(X,Y,Z);
        this.Salario=0;
        this.Bonificacion=0;
    }
    public void setSalario(double X){
        this.Salario=X;
    }
    public void setBonificacion(double X){
        this.Bonificacion=X;
    }
    public double getSalario(){
        return(this.Salario);
    }
    public double getBonificacion(){
        return(this.Bonificacion);
    }
}
