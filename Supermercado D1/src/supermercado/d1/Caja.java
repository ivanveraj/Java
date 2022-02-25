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
public class Caja {

    private int IdCaja;
    private double TotalVentas, DineroCaja;
    private Empleado Cajero;

    public Caja(int IdCaja, double DineroCaja, Empleado Cajero) {
        this.IdCaja = IdCaja;
        this.TotalVentas = 0;
        this.DineroCaja = DineroCaja;
        this.Cajero = Cajero;
    }

    public void IngresoDinero(double Venta) {
        this.TotalVentas += Venta;
        this.DineroCaja += Venta;
    }

    public int getIdCaja() {
        return IdCaja;
    }

    public void setIdCaja(int IdCaja) {
        this.IdCaja = IdCaja;
    }

    public double getTotalVentas() {
        return TotalVentas;
    }

    public void setTotalVentas(double TotalVentas) {
        this.TotalVentas = TotalVentas;
    }

    public double getDineroCaja() {
        return DineroCaja;
    }

    public void setDineroCaja(double DineroCaja) {
        this.DineroCaja = DineroCaja;
    }

    public Empleado getCajero() {
        return Cajero;
    }

    public void setCajero(Empleado Cajero) {
        this.Cajero = Cajero;
    }

}
