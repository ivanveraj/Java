package Trabajo_1;

public class Productos {
    private Integer Codigo;
    private String Nombre;
    private int Precio;

    public Productos(int codigo, String nombre, int precio) {
        this.Codigo = codigo;
        this.Nombre = nombre;
        this.Precio = precio;
    }

    public Integer getCodigo() {
        return Codigo;
    }
    public void setCodigo(Integer Codigo) {
        this.Codigo = Codigo;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public int getPrecio() {
        return Precio;
    }
    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
}