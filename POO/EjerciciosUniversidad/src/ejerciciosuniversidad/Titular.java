package ejerciciosuniversidad;
/**
 *
 * @author Usuario
 */
public class Titular extends Profesor{
    private String Nombre, Profesion;
    private int Cedula, Horas;
    private double Sueldo;
    public Titular(String N, String P, int C){
        super(N,P,C);
        this.Nombre=N;
        this.Profesion=P;
        this.Cedula=C;
        this.Sueldo=0;
        this.Horas=0;
    }
    @Override
    public String CalcularSueldo(int Horas){
        setSueldo(15800*Horas);
        setHoras(Horas);
        return("(Titular) El sueldo es: "+this.Sueldo);
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
    @Override
    public double getSueldo() {
        return Sueldo;
    }
    @Override
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
