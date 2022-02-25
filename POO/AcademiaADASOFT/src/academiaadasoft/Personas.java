package academiaadasoft;

import java.util.Calendar;

public class Personas {
    //atributos propios protegido

    protected String Ident, Nom, Apell, Direcc, Tel, Celular, Email, Nacimiento, Edad;

//constructores
//constructor vacio
    public Personas() {
    }

    public Personas(String Ident, String Nom, String Apell, String Direcc, String Tel, String Celular, String Email, String Nacimiento) {
        this.Ident = Ident;
        this.Nom = Nom;
        this.Apell = Apell;
        this.Direcc = Direcc;
        this.Tel = Tel;
        this.Celular = Celular;
        this.Email = Email;
        this.Nacimiento = Nacimiento;
        this.Edad =this.CalcularEdad();
    }

    public void IngresarDatos(String id) {
        setIdent(id);
        setNom(Validaciones.leerString("Digite Nombre:"));
        setApell(Validaciones.leerString("Digite Apellido:"));
        setDirecc(Validaciones.leerString("Digite dirección:"));
        setTel(Validaciones.leerString("Digite teléfono:"));
        setCelular(Validaciones.leerString("Digite número celular:"));
        setEmail(Validaciones.leerString("Digite email:"));
        setNacimiento(Validaciones.leerString("Digite año de nacimiento:"));
    }

    public String CalcularEdad() {
        int AA = ObtenerAnio();
        int X;
        int Nac = Integer.parseInt(this.Nacimiento);
        X = AA - Nac;
        String Edad = X + "";
        return Edad;
    }

    public int ObtenerAnio() {
        Calendar fecha = Calendar.getInstance();
        int An = fecha.get(Calendar.YEAR);
        return An;
    }

    @Override
    public String toString() {
        return "Identidad = " + Ident + "\nNombre = " + Nom + "\nApellido = " + Apell + "\nDirección = " + Direcc + "\nTeléfono = " + Tel + "\nCelular = " + Celular + "\nEmail = " + Email
                + "\nAño de nacimiento= " + Nacimiento+ "\nEdad= " + Edad;
    }

    /**
     * @return the Ident
     */
    public String getIdent() {
        return Ident;
    }

    /**
     * @param Ident the Ident to set
     */
    public void setIdent(String Ident) {
        this.Ident = Ident;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getApell() {
        return Apell;
    }

    /**
     * @param Apell the Apell to set
     */
    public void setApell(String Apell) {
        this.Apell = Apell;
    }

    /**
     * @return the Direcc
     */
    public String getDirecc() {
        return Direcc;
    }

    /**
     * @param Direcc the Direcc to set
     */
    public void setDirecc(String Direcc) {
        this.Direcc = Direcc;
    }

    /**
     * @return the Tel
     */
    public String getTel() {
        return Tel;
    }

    /**
     * @param Tel the Tel to set
     */
    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    /**
     * @return the Celular
     */
    public String getCelular() {
        return Celular;
    }

    /**
     * @param Celular the Celular to set
     */
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

}//fin clase persona
