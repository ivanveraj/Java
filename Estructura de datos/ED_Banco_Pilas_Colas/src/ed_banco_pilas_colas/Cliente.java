package ed_banco_pilas_colas;

public class Cliente {
    private String Nombre, Transaccion;
    private int Identificacion, Edad;
    public Cliente(String N, int Id, int E, String T){
        this.Nombre=N;
        this.Identificacion=Id;
        this.Edad=E;
        this.Transaccion=T;
    }
    public void Informacion(){
        System.out.println("Identificacion: "+this.Identificacion+"\nNombre: "+this.Nombre+"\nEdad: "+this.Edad+
                "\nTipo de transaccion: "+this.Transaccion);
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getTransaccion() {
        return Transaccion;
    }
    public void setTransaccion(String Transaccion) {
        this.Transaccion = Transaccion;
    }
    public int getIdentificacion() {
        return Identificacion;
    }
    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
}