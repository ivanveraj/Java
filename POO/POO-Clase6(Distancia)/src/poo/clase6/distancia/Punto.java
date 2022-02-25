/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase6.distancia;

/**
 *
 * @author iser
 */
public class Punto{
    private double X,Y,D;
    public Punto(double Px,Double Py){
        this.X=Px;
        this.Y=Py;
        this.D=0;
    }
    public void setX(double x){
        this.X=x;
    }
    public void setY(double x){
        this.Y=x;
    }
    public void setD(double x){
        this.D=x;
    }
    public double getX(){
        return(this.X);
    }
    public double getY(){
        return(this.Y);
    }
    public double getD(){
        return(this.D);
    }
    public void CalD(Punto P2){
        this.D=Math.sqrt(Math.pow((P2.getX()-this.X),2)+Math.pow((P2.getY()-this.Y),2));
    }
    

    
    
}
