/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialgrupoa;

/**
 *
 * @author Usuario
 */
public class Cuadrado extends Figura{
    private double L;
    private double Area, Perimetro;
    public Cuadrado(double L){
        super();
        this.L=L;
    }
    @Override
    public double Area(){
        this.Area=this.L*this.L;
        return(this.Area);
    }
    @Override
    public double Perimetro(){
        this.Perimetro=this.L*4;
        return(this.Perimetro);
    }
    public double getArea() {
        return Area;
    }
    public void setArea(double Area) {
        this.Area = Area;
    }
    public double getPerimetro() {
        return Perimetro;
    }
    public void setPerimetro(double Perimetro) {
        this.Perimetro = Perimetro;
    }
}
