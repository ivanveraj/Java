/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialgrupoa;

public class Figura {
    private Figura V[];
    private int Tam, Tmax;
    public Figura(){
        this.Tam=0;
        this.Tmax=5;
        this.V=new Figura[Tmax];
    }
    public void CrearEclipse(double AM, double Am){
        this.V[Tam]=new Eclipse(AM,Am);
        Tam++;
        System.out.println("Eclipse creada correctamente");
    }
    public void CrearCuadrado(double L){
        this.V[Tam]=new Cuadrado(L);
        Tam++;
        System.out.println("Cuadrado creado correctamente");
    }
    public double Area(){
        for(int i=0;i<this.Tam;i++){
            System.out.println("El area de V["+i+"]= "+this.V[i].Area());
        }
        return(0);
    }
    public double Perimetro(){
        for(int i=0;i<this.Tam;i++){
            System.out.println("El perimetro de V["+i+"]= "+this.V[i].Perimetro());
        }
        return(0);
    }
    public void Recursividad(){
        long A, Suma;
        for(int i=0;i<this.Tam;i++){
            A=Math.round(this.V[i].Area());
            Suma=Sumatoria(A);
            System.out.println("La sumatoria recursiva de: "+A+" es: "+Suma);
        }
    }
    public long Sumatoria(long A){
        if(A==1){
            return 1;
        }else{
            return A+Sumatoria(A-1);
        }   
    }
}
