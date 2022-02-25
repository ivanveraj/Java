package poo.empresa.x;

public class Nomina {
    private double Mensual, Semestral, Trimestral, Anual;
    public Nomina(double S){
        this.Mensual=S;
    }
    public void CalculosNomina(){
        this.setSemestral(this.Mensual*6);
        this.setTrimestral(this.Mensual*3);
        this.setAnual(this.Mensual*12);
    }
    public void ListadoNomina(){
        System.out.println("Listado nomina empleados");
        System.out.println("Nomina mensual: "+this.Mensual+"\nNomina Trimestral: "+this.Trimestral+"\nNomina Semestral: "+this.Semestral+""
                + "\nNomina Anual: "+this.Anual);
    }
    public double getMensual() {
        return Mensual;
    }
    public void setMensual(double Mensual) {
        this.Mensual = Mensual;
    }
    public double getSemestral() {
        return Semestral;
    }
    public void setSemestral(double Semestral) {
        this.Semestral = Semestral;
    }
    public double getTrimestral() {
        return Trimestral;
    }
    public void setTrimestral(double Trimestral) {
        this.Trimestral = Trimestral;
    }
    public double getAnual() {
        return Anual;
    }
    public void setAnual(double Anual) {
        this.Anual = Anual;
    }
}
