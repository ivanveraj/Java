/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.parcial2;

/**
 *
 * @author Usuario
 */
public class Registro extends Inmueble{
     private int Mes;
     private int Anio;
     private int LecturaI, LecturaF;
     Registro(int m, int A,int L,int Id,int E,String D){
        super(Id,E,D);
        this.Anio=A;
        this.LecturaI=L;
        this.Mes=m;
     }
    public int getMes() {
        return Mes;
    }

    public void setMes(int Mes) {
        this.Mes = Mes;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int Anio) {
        this.Anio = Anio;
    }

    public int getLecturaI() {
        return LecturaI;
    }

    public void setLecturaI(int LecturaI) {
        this.LecturaI = LecturaI;
    }

    public int getLecturaF() {
        return LecturaF;
    }

    public void setLecturaF(int LecturaF) {
        this.LecturaF = LecturaF;
    }
     
     
     
    
}
