/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.d1;

/**
 *
 * @author USUARIO
 */
public class Factura{
    private double TotalAPagar;
    private int IdCliente;
    private String Detalle;
    private String Informacion;
    public Factura(int IdCaja, Empleado Cajero) {
        this.Informacion="Id caja: "+IdCaja+" Nombre Cajero: "+Cajero.getNombre();
        this.TotalAPagar =0;
        this.Detalle ="";
    }
    public String ImprimirFactura(){
        return(this.Informacion+"\nDetalle \n"+this.Detalle+"\n"+this.TotalAPagar);
    }
    public String AñadirProducto(Producto P,int C){
        double Pago=P.getPrecio()*C;
        this.Detalle+="Id: "+P.getId()+" Nombre: "+P.getNombre()+" Cantidad: "+C+" PrecioXUnidad: "+P.getPrecio()+" PrecioXCantidad: "+Pago+
                "\n";
        this.TotalAPagar+=Pago;
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
    
    
}
