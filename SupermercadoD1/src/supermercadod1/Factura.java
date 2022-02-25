/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercadod1;

/**
 *
 * @author USUARIO
 */
public class Factura{
    private double TotalAPagar;
    private int IdCliente;
    private String Detalle;
    private String Informacion;
    private int X;
    public Factura(int IdCaja, Empleado Cajero) {
        this.Informacion="Id caja: "+IdCaja+" Nombre Cajero: "+Cajero.getNombre();
        this.TotalAPagar =0;
        this.Detalle ="";
        this.X=0;
    }
    public String[] ImprimirFactura(int T){
        String Info[]=new String[(T*2)+1];
        Info[0]=this.Informacion;
        for (int i = 1; i <T*2; i++) {
            System.out.println("Info "+Info[0]);
            Info[i]=this.Detalle;
            System.out.println("Deta "+Info[i]);
        }
        Info[T*2]="Total a pagar: "+this.TotalAPagar;
        System.out.println("Total: "+Info[T*2]);
        return(Info);
    }
    public String AñadirProducto(Producto P,int C){
        double Pago=P.getPrecio()*C;
        this.Detalle+="Id: "+P.getId()+" Nombre: "+P.getNombre()+" Cantidad: "+C+" PrecioXUnidad: "+P.getPrecio()+" PrecioXCantidad: "+Pago+
                "\n";
        this.TotalAPagar+=Pago;
        this.X++;
        return this.Detalle;
    }

    public double getTotalAPagar() {
        return TotalAPagar;
    }

    public void setTotalAPagar(double TotalAPagar) {
        this.TotalAPagar = TotalAPagar;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

    public String getInformacion() {
        return Informacion;
    }

    public void setInformacion(String Informacion) {
        this.Informacion = Informacion;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }
    
    
}
