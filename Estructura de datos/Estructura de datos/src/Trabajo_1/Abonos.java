package Trabajo_1;
public class Abonos extends Productos {

    private String Descripcion, Utilidad;

    public Abonos(int C, String N, int P, String D, String U) {
        super(C, N, P);
        this.Descripcion = D;
        this.Utilidad = U;
    }

    public String Informacion() {
        return ("Codigo: " + this.getCodigo() + "\nNombre: " + this.getNombre() + "\nPrecio: " + this.getPrecio() + "\nDescripcion:" + this.Descripcion +
                "\nUtilidad: " + this.Utilidad+"\n");
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getUtilidad() {
        return Utilidad;
    }

    public void setUtilidad(String Utilidad) {
        this.Utilidad = Utilidad;
    }
}
