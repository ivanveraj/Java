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
public class Vendedor extends Trabajador {
    private double Ventas,Comision;
    
    public Vendedor(int X,int Y, String Z){
        super(X,Y,Z);
        this.Ventas=0;
        this.Comision=0;
    }

    public double getVentas() {
        return Ventas;
    }

    public void setVentas(double Ventas) {
        this.Ventas = Ventas;
    }

    public double getComision() {
        return Comision;
    }

    public void setComision(double Comision) {
        this.Comision = Comision;
    }
    
}
