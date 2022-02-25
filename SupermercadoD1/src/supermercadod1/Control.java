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
public class Control {

    private Caja C;
    private Empleado Cajero;
    private Bodega B;
    private Principal P;
    public Control(int T) {
        this.B = new Bodega(T);
        this.P=new Principal();
    }

    public void CargaProductosBodega() {
        this.B.setP(new Producto(1, 5, "Aromatel", 1500));
        this.B.setP(new Producto(2, 5, "Fabuloso", 1700));
        this.B.setP(new Producto(3, 5, "Rindex", 4000));
        this.B.setP(new Producto(4, 5, "Arroz suelto", 2500));
        this.B.setP(new Producto(5, 0, "Aceite Las Palmas", 6500));
        this.B.setP(new Producto(6, 0, "Arroz Roa", 3000));
        this.B.setP(new Producto(7, 5, "Colada Maiceza", 9600));
        this.B.setP(new Producto(8, 5, "Papa", 9600));
    }

    public void InicioSistema() {
        CargaProductosBodega();
        this.Cajero = new Empleado(1200000, "Cajero", 1005, "Ivan");
        this.C = new Caja(1234, 50000, this.Cajero);
    }

    public int BuscarXId(int Id) {
        for (int i = 0; i < this.B.getT(); i++) {
            if (this.B.getP()[i].getId() == Id) {
                return i;
            }
        }
        return -1;
    }


    public String DineroEnCaja(){
       return(""+this.C.getDineroCaja());
    }
    public String TotalVentas(){
       return(""+this.C.getTotalVentas());
    }
    public String[] ProductosAgotados(){
        return(this.B.ReporteProductosAgotados());
    }
    public String[] ProductosExistentes(){
        return(this.B.ListarProductosExistentes());
    }

    public Caja getC() {
        return C;
    }

    public void setC(Caja C) {
        this.C = C;
    }

    public Empleado getCajero() {
        return Cajero;
    }

    public void setCajero(Empleado Cajero) {
        this.Cajero = Cajero;
    }

    public Bodega getB() {
        return B;
    }

    public void setB(Bodega B) {
        this.B = B;
    }

    public Principal getP() {
        return P;
    }

    public void setP(Principal P) {
        this.P = P;
    }
    

}
