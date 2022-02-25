/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase6.trabajo;

public class Coordenadas
{
    private double X,Y,P;
    public Coordenadas(double x, double y)
    {
        this.X=x;
        this.Y=y;
        this.P=0;
    }

    public double getX() 
    {
        return(this.X);
    }

    public void setX(double x) 
    {
        this.X=x;
    }

    public double getY() 
    {
        return(this.Y);
    }

    public void setY(double x)
    {
        this.Y=x;
    }

    public double getP() 
    {
        return(this.P);
    }

    public void setP(double x) 
    {
        this.P=x;
    }
    
    public void pendiente(Coordenadas c)
    {
        double rx;
         rx=(c.getY()-this.Y)/(c.getX()-this.X);
         this.P=rx;
    }
    public boolean Verificacion(){
        boolean Pos=true;
        if(this.P<0){
            Pos=false;
        }else{
            Pos=true;
        }
        return(Pos);
    }
    public double Almacenamiento(){
        return(this.P);
    }
}