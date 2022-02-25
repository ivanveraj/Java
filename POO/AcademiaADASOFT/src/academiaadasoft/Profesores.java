
package academiaadasoft;

public class Profesores extends Personas
{
    //atributos propios y privados
    private double SalBasMen, SalNetoMen;

    public Profesores() {
    }
    
    public Profesores(double SalBasMen, double SalNetoMen) {
        this.SalBasMen = SalBasMen;
        this.SalNetoMen = SalNetoMen;
    }

    public Profesores(double SalBasMen, double SalNetoMen, String Ident, String Nom, String Apell, String Direcc, String Tel, String Celular, String Email, String Nacimiento) {
        super(Ident, Nom, Apell, Direcc, Tel, Celular, Email,Nacimiento);
        this.SalBasMen = SalBasMen;
        this.SalNetoMen = SalNetoMen;
    }

    public Profesores EntrarDatos(String id)
    {
    double sbm,sn;
    IngresarDatos(id); //llamada al metodo de ingresar datos en persona que es la herencia
    sbm=Validaciones.leerReal("Digite salario básico mensual:");
    sn= CalcularSalarioNeto(sbm);
    Profesores objPro ;
    objPro=new Profesores(sbm,sn,getIdent(), getNom(),getApell(), getDirecc(), getTel(),getCelular(), getEmail(), getNacimiento());
    return objPro;
}//fin entrar datos
    
    public double CalcularSalarioNeto(double sbm)
    {
        double sn;
        sn=sbm-(sbm*0.08);
        return sn;
    }//fin de calcular sal neto

    @Override
    public String toString() {
        return "Profesores{"+"Identidad = " + Ident + "\nNombre = " + Nom + "\nApellido = " + Apell + "\nDirección = " + Direcc + "\nTeléfono = " + Tel + "\nCelular = " + Celular + "\nEmail = " + Email + "\nSalBasMen=" + SalBasMen + "\nSalNetoMen=" + SalNetoMen +
                "Año nacimiento= "+Nacimiento+"\nEdad="+Edad+ '}';
    }
    
    /**
     * @return the SalBasMen
     */
    public double getSalBasMen() {
        return SalBasMen;
    }

    /**
     * @param SalBasMen the SalBasMen to set
     */
    public void setSalBasMen(double SalBasMen) {
        this.SalBasMen = SalBasMen;
    }

    /**
     * @return the SalNetoMen
     */
    public double getSalNetoMen() {
        return SalNetoMen;
    }

    /**
     * @param SalNetoMen the SalNetoMen to set
     */
    public void setSalNetoMen(double SalNetoMen) {
        this.SalNetoMen = SalNetoMen;
    }

}//fin clase profesores
