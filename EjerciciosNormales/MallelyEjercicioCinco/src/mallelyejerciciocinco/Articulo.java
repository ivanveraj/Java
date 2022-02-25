package mallelyejerciciocinco;

public class Articulo{
    private String Nombre;
    private double Precio;
    private int Cantidad;
    public Articulo(String N, double P, int C){
        this.Nombre=N;
        this.Precio=P;
        this.Cantidad=C;
    }
    public double CalcularC(){
        if(Precio<=1000){
            return((this.Precio*0.10)*this.Cantidad);
        }else{
             return((Precio*0.07)*this.Cantidad);
        }
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
}
