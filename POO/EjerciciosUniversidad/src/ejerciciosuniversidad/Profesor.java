/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosuniversidad;

/**
 *
 * @author Usuario
 */
public abstract class Profesor {
    private String Nombre, Profesion;
    private int Cedula,Horas;
    private double Sueldo;
    public Profesor(String N, String P, int C){
        this.Nombre=N;
        this.Profesion=P;
        this.Cedula=C;
    }
    
    public String CalcularSueldo(int Horas){
        setSueldo(Sueldo*Horas);
        return(""+this.Sueldo);
    }
     public String Informacion(){
        return("Informacion personal\nNombre: "+this.Nombre+"\nCedula: "+this.Cedula+"\nProfesion:"
                + this.Profesion+"\n");
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getProfesion() {
        return Profesion;
    }
    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }
    public int getCedula() {
        return Cedula;
    }
    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }
    
    
}
