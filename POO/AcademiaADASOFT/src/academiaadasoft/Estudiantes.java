package academiaadasoft;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class Estudiantes extends Personas {
    //atributos propios privados

    private int Aingreso, Antiguedad;

//constructores
//constructor vacio
    public Estudiantes() {
    }
//constructor con todos los datos

    public Estudiantes(int Aingreso, int Antiguedad) {
        this.Aingreso = Aingreso;
        this.Antiguedad = Antiguedad;
    }

    public Estudiantes(String Ident, String Nom, String Apell, String Direcc, String Tel, String Celular, String Email, int Aingreso, int Antiguedad, String Nacimiento) {
        super(Ident, Nom, Apell, Direcc, Tel, Celular, Email, Nacimiento);
        this.Aingreso = Aingreso;
        this.Antiguedad = Antiguedad;
    }

    public Estudiantes EntrarDatos(String id) {
        int Ai, Ant;
        IngresarDatos(id); //llamada al metodo de ingresar datos en persona que es la herencia
        Ai = Validaciones.leerEntero("Digite año de ingreso:");
        Ant = CalcularAntiguedad(Ai);
        Estudiantes objEst;
        objEst = new Estudiantes(getIdent(), getNom(), getApell(), getDirecc(), getTel(), getCelular(), getEmail(), Ai, Ant, Nacimiento);
        return objEst;
    }//fin ingresar datos

    public int CalcularAntiguedad(int ai) {
        int aa = ObtenerAActual(); //extraer de la fecha
        int X;
        X = aa - ai;
        return X;
        // Retornar aa-ai
    }//Fin calcular antiguedad

    /*este metodo toma de la fecha actual del sistema el año, quise colocarselas así para 
    que aprendan un tantin de manejo de fechas, que SIEMPRE las van a manejar mas
    adelante, y no pedir al usuario el año actual para calcular la edad del empleado*/
    public int ObtenerAActual() {
        /*se define la variable fecha tipo Calendar que es un nuevo tipo de dato 
        para manejo de fechas y se inicializa con la instancia de fecha actual 
        del sistema con getInstance*/
        Calendar fecha = Calendar.getInstance();
        //se define el año entero y se inicializa con el año(YEAR) de la fecha actual
        int An = fecha.get(Calendar.YEAR);
        return An;//se retorna el año actual, evitando su ingreso

    }//fin de obtener año actual del sistema

    @Override
    public String toString() {
        return "Identidad = " + Ident + "\nNombre = " + Nom + "\nApellido = " + Apell + "\nDirección = " + Direcc + "\nTeléfono = " + Tel + "\nCelular = " + Celular + "\nEmail = " + Email + "\nAingreso = " + Aingreso + "\nAntiguedad = " + Antiguedad
                + "\nAño de nacimiento= " + Nacimiento + "\nEdad: " + Edad;
    }

    //metodo que le da el orden al registro en el archivo plano de texto con el split elegido
    public String EstructuraReg() {
        return Ident + "," + Nom + "," + Apell + "," + Direcc + "," + Tel + "," + Celular + "," + Email + "," + Aingreso + "," + Antiguedad + ","
                + Nacimiento + "," + Edad;
    }

    /**
     * @return the Aingreso
     */
    public int getAingreso() {
        return Aingreso;
    }

    /**
     * @param Aingreso the Aingreso to set
     */
    public void setAingreso(int Aingreso) {
        this.Aingreso = Aingreso;
    }

    /**
     * @return the Antiguedad
     */
    public int getAntiguedad() {
        return Antiguedad;
    }

    /**
     * @param Antiguedad the Antiguedad to set
     */
    public void setAntiguedad(int Antiguedad) {
        this.Antiguedad = Antiguedad;
    }

}//fin clase estudiantes
