/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialgrupoa;
import java.math.*;
/**
 *
 * @author Usuario
 */
public class Eclipse extends Figura{
    private double AreaMay, AreaMen;
    private double Area, Perimetro;
    public Eclipse(double AM, double Am){
        super();
        this.AreaMay=AM;
        this.AreaMen=Am;
        this.Area=0;
    }
    @Override
    public double Area(){
        this.Area=this.AreaMay*this.AreaMen*Math.PI;
        return(this.Area);
    }
    @Override
    public double Perimetro(){
        this.Perimetro=Math.PI*(this.AreaMay+this.AreaMen);
        return(this.Perimetro);
    }

    public double getAreaMen() {
        return AreaMen;
    }

    public void setAreaMen(double AreaMen) {
        this.AreaMen = AreaMen;
    }

    public double getPerimetro() {
        return Perimetro;
    }

    public void setPerimetro(double Perimetro) {
        this.Perimetro = Perimetro;
    }
    
    
}
