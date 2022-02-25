/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosuniversidad;

public class Ocasional extends Profesor{
    private String Nombre, Profesion;
    private int Cedula, Horas;
    private double Sueldo;
    public Ocasional(String N, String P, int C){
        super(N,P,C);
        this.Nombre=N;
        this.Profesion=P;
        this.Cedula=C;
        this.Sueldo=0;
    }
    
    @Override
    public String CalcularSueldo(int Horas){
        setSueldo(12300*Horas);
        setHoras(Horas);
        return("(Ocasional) El sueldo es: "+this.Sueldo);
    }
    @Override
    public String Informacion(){
        return(super.Informacion()+"Horas trabajadas: "+this.Horas+"\nSueldo: "+this.Sueldo);
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
    public int getHoras() {
        return Horas;
    }
    public void setHoras(int Horas) {
        this.Horas = Horas;
    }
    public double getSueldo() {
        return Sueldo;
    }
    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }
}
