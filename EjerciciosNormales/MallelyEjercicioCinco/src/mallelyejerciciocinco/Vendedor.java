package mallelyejerciciocinco;
public class Vendedor{
    private String Nombre;
    private int Cedula;
    private double Comision;
    private int CantidadA,T;
    private Articulo A[];
    public Vendedor(String N, int C,int Tam){
        this.Nombre=N;
        this.Cedula=C;
        this.T=0;
        A=new Articulo[Tam];
    }
    public void Venta(String N, double P, int C){
        A[T]=new Articulo(N,P,C);
        AumentarC(C);
        SumComision(A[T].CalcularC());
        T++;
    }
    public void Informacion(){
        System.out.println("Nombre del vendedor: "+this.Nombre+"\nCedula: "+this.Cedula
        +"\nTotal de comision: "+this.Comision+"\nCantidad de articulos vendidos: "+this.CantidadA);
    }
    public void SumComision(double Comision){
        this.Comision+=Comision;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public int getCedula() {
        return Cedula;
    }
    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }
    public double getComision() {
        return Comision;
    }
    public void setComision(double Comision) {
        this.Comision = Comision;
    }
    public int getCantidadA() {
        return CantidadA;
    }
    public void AumentarC(int C) {
        this.CantidadA+=C;
    }
}
