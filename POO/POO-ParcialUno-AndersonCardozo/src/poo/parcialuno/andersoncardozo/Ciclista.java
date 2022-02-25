package poo.parcialuno.andersoncardozo;

import java.util.Scanner;

public class Ciclista {

    private int Codigo;
    private double Pista;
    private double T1, T2, T3;

    public Ciclista() {
        this.T1 = 0;
        this.T2 = 0;
        this.T3 = 0;
    }

    public String InformacionBasica(int Cod, double Pista) {
        this.Codigo = Cod;
        this.Pista = Pista;
        return ("Informacion correctamente ingresada");
    }

    public String VueltaMasRapida() {
        if (this.T1 > this.T2 && this.T1 > this.T3) {
            return ("La vuelta mas rapida del ciclista: " + this.Codigo + " fue: " + this.T1);
        }else if (this.T2 > this.T3 && this.T2 > this.T1) {
            return ("La vuelta mas rapida del ciclista: " + this.Codigo + " fue: " + this.T2);
        }else{
            return ("La vuelta mas rapida del ciclista: " + this.Codigo + " fue: " + this.T3);
        }
    }

    public void PromedioVuelta() {
        double Divisor, Dividendo;
        Divisor = this.T1 + this.T2 + this.T3;
        Dividendo = 3;
        System.out.println("El promedio de vuelta es: " + (Divisor / Dividendo));
    }

    public void Informacion() {
        System.out.println("Codigo ciclista: " + this.Codigo + "\nTamaño pista: " + this.Pista + "\nPrimer tiempo: " + this.T1 + ""
                + "\nSegundo tiempo: " + this.T2 + "\nTercer tiempo: " + this.T3);
    }

    public void TiempoClasificacion(double T1, double T2, double T3) {
        if (this.T1 != 0 && this.T2 != 0 && this.T3 != 0) {
            if(BuscarPeor()==1 && this.T1<T1){
                System.out.println("Actualizacion de tiempo");
                this.T1=T1;
            }else if(BuscarPeor()==2 && this.T2<T2){
                System.out.println("Actualizacion de tiempo");
                this.T2=T2;
            }else if(BuscarPeor()==3 && this.T3<T3){
                System.out.println("Actualizacion de tiempo");
                this.T3=T3;
            }else{
                System.out.println("No se realizo ningun cambio");
            }
        } else {
            this.T1 = T1;
            this.T2 = T2;
            this.T3 = T3;
        }

    }
    public int BuscarPeor(){
        if(this.T1<this.T2 && this.T1<this.T3){
            return(1);
        }else if(this.T2<this.T3 && this.T2<this.T1){
            return(2);
        }else{
            return(3);
        }
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public double getPista() {
        return Pista;
    }

    public void setPista(double Pista) {
        this.Pista = Pista;
    }

    public double getT1() {
        return T1;
    }

    public void setT1(double T1) {
        this.T1 = T1;
    }

    public double getT2() {
        return T2;
    }

    public void setT2(double T2) {
        this.T2 = T2;
    }

    public double getT3() {
        return T3;
    }

    public void setT3(double T3) {
        this.T3 = T3;
    }
}
