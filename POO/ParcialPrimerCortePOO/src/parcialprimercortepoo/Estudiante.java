/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialprimercortepoo;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    private String Nombre;
    private int Documento;
    private int Edad;
    private double Estatura;
    private double Peso;
    private double IMC;
    private boolean Estado=false;
    public Estudiante(String N, int D, int E){
        this.Nombre=N;
        this.Documento=D;
        this.Edad=E;
    }
    public String Informacion(){
        return("Estudiante: "+this.Nombre+"\nNumero de documento: "+this.Documento+"\n"
                + "Edad: "+this.Edad+"\nEstatura: "+this.Estatura+"\nPeso: "+this.Peso+"\n"
                + "IMC: "+this.IMC+"\n Aprobado: "+this.Estado);
    }
    public double getEstatura() {
        return Estatura;
    }
    public void setEstatura(double Estatura) {
        this.Estatura = Estatura;
    }
    public double getPeso() {
        return Peso;
    }
    public void setPeso(double Peso) {
        this.Peso = Peso;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public int getDocumento() {
        return Documento;
    }
    public void setDocumento(int Documento) {
        this.Documento = Documento;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
}
