package poo.empresa.x;

public class Persona extends Nomina{
    private int Documento;
    private String Nombre;
    private int Edad;
    private String FechaIngreso;
    private String Estudios;
    private String Cargo;
    private double Sueldo;
    public Persona(int Doc, String Nom, double S){
        super(S);
        this.Documento=Doc;
        this.Nombre=Nom;
        this.Sueldo=S;
        this.Cargo="";
    }
    public Persona(int Doc, String Nom, int Edad, String FI, String Est, String C, double S){
        super(S);
        this.Documento=Doc;
        this.Nombre=Nom;
        this.Edad=Edad;
        this.FechaIngreso=FI;
        this.Estudios=Est;
        this.Cargo=C;
        this.Sueldo=S;
    }
    public void Informacion(){
        System.out.println("N° Documento: "+this.Documento+"\nNombre: "+this.Nombre+"\nEdad: "+this.Edad+"\nFecha ingreso: "+
                this.FechaIngreso+"\nEstudios: "+this.Estudios+"\nCargo: "+this.Cargo+"\nSueldo: "+this.Sueldo);
    }
    @Override
    public void ListadoNomina(){
        this.CalculosNomina();
        System.out.println("Documento: "+this.Documento);
        System.out.println("Listado nomina empleados");
        System.out.println("Nomina mensual: "+getMensual()+"\nNomina Trimestral: "+getTrimestral()+"\nNomina Semestral: "+getSemestral()+""
                + "\nNomina Anual: "+getAnual());
    }
    public void CalculoNomina(){
        this.CalculosNomina();
    }
    public int getDocumento() {
        return Documento;
    }
    public void setDocumento(int Documento) {
        this.Documento = Documento;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    public String getFechaIngreso() {
        return FechaIngreso;
    }
    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }
    public String getEstudios() {
        return Estudios;
    }
    public void setEstudios(String Estudios) {
        this.Estudios = Estudios;
    }
    public String getCargo() {
        return Cargo;
    }
    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    public double getSueldo() {
        return Sueldo;
    }
    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }
}