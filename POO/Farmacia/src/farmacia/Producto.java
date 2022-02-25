/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

/**
 *
 * @author MILE-IVA
 */
public class Producto {
    private long Codigo;
    private String Nombre;
    private int CantidadE,Min,Max;
    private double Costo, ValorV,Porcentaje;
    public Producto(long Cod, String Nom, int Cant, int Minimo, int Maximo,double Cos){
        this.Codigo=Cod;
        this.Nombre=Nom;
        this.Porcentaje=0;
        this.ValorV=0;
        this.CantidadE=Cant;
        this.Max=Maximo;
        this.Min=Minimo;
        this.Costo=Cos;
    }
    public String CrearProducto(double Cos, double Xcent){
        double V,P;
        P=Xcent/100;
        setPorcentaje(P);
        V=Cos+(Cos*P);
        setValorV(V);
        return("Producto creado correctamente");
    }
    public String CargaInventario(int X){
        this.CantidadE=this.CantidadE+X;
        return("Carga exitosa");
    }
    public boolean DescargaInventario(int X){
        if(this.CantidadE<X){
            return(false);
        }else{
            this.CantidadE=this.CantidadE-X;
            return(true);
        }
    }
    public String AjusteInformacion(String Nom, int Cant, int Minimo, int Maximo, double Cos, double Xcent){
        double V,P;
        setNombre(Nom);
        setCantidadE(Cant);
        setMin(Minimo);
        setMax(Maximo);
        setCosto(Cos);
        P=Xcent/100;
        setPorcentaje(P);
        V=Cos+(Cos*P);
        setValorV(V);
        return("Ajuste de informacion exitosa");
    }
    public String AjusteValorVenta(double X){
        double V,P;
        P=X/100;
        setPorcentaje(X);
        V=getCosto()+(getCosto()*P);
        setValorV(V);
        return("Porcentaje: "+P+"\nValor de venta: "+V+"\nActualizado Correctamente");
    }
    public String InformacionPedido(){
        int Pedido;
        if(this.CantidadE<this.Min){
            Pedido=this.CantidadE-this.Max;
            return("URGENTE!! Se debe realizar pedido, agotamiento de producto \nMaximo sugerido: "+Pedido);
        }
        if(this.CantidadE>this.Min&&this.CantidadE<this.Max){
            return("Limite de producto NO REALIZAR PEDIDO");
        }
        return("\n");
    }
    public String InformacionProducto(){
        String Info;
        Info="Nombre del producto: "+getNombre()+"\nNombre Codigo: "+getCodigo()+"\nCantidad en existencia: "+getCantidadE()+""
                + "\nCantidad Maxima de producto: "+getMax()+"\nCantidad Minima de producto: "+getMin()+"\nCosto: "+getCosto()+""
                + "\nPorcentaje de venta: "+(getPorcentaje()*100)+"%\nValor de venta: "+getValorV();
        System.out.println("Entro");
        return(Info);
    }
    
    public long getCodigo() {
        return Codigo;
    }
    public void setCodigo(long Codigo) {
        this.Codigo = Codigo;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public int getCantidadE() {
        return CantidadE;
    }
    public void setCantidadE(int CantidadE) {
        this.CantidadE = CantidadE;
    }
    public int getMin() {
        return Min;
    }
    public void setMin(int Min) {
        this.Min = Min;
    }
    public int getMax() {
        return Max;
    }
    public void setMax(int Max) {
        this.Max = Max;
    }
    public double getCosto() {
        return Costo;
    }
    public void setCosto(double Costo) {
        this.Costo = Costo;
    }
    public double getValorV() {
        return ValorV;
    }
    public void setValorV(double ValorV) {
        this.ValorV = ValorV;
    }
    public double getPorcentaje() {
        return Porcentaje;
    }
    public void setPorcentaje(double Porcentaje) {
        this.Porcentaje = Porcentaje;
    }
}
