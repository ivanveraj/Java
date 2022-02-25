/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.d1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Control {

    private Caja C;
    private Empleado Cajero;
    private Bodega B;
    private Scanner sn;

    public Control(int T) {
        this.sn = new Scanner(System.in);
        this.B = new Bodega(T);
    }

    public void CargaProductosBodega() {
        this.B.setP(new Producto(1, 5, "Aromatel", 1500));
        this.B.setP(new Producto(2, 5, "Fabuloso", 1700));
        this.B.setP(new Producto(3, 5, "Rindex", 4000));
        this.B.setP(new Producto(4, 5, "Arroz suelto", 2500));
        this.B.setP(new Producto(5, 5, "Aceite Las Palmas", 6500));
        this.B.setP(new Producto(6, 0, "Arroz Roa", 3000));
        this.B.setP(new Producto(7, 5, "Colada Maiceza", 9600));
    }

    public void InicioSistema() {
        CargaProductosBodega();
        this.Cajero = new Empleado(1200000, "Cajero", 1005, "Ivan");
        this.C = new Caja(1234, 50000, this.Cajero);
    }

    public int BuscarXId(int Id) {
        for (int i = 0; i < this.B.getP().length; i++) {
            if (this.B.getP()[i].getId() == Id) {
                return i;
            }
        }
        return -1;
    }

    public void Venta() {
        System.out.println(this.B.ListarProductosExistentes());
        int Fin = 0;
        Factura F = new Factura(C.getIdCaja(), this.Cajero);
        do {
            System.out.println("Digite [1]Para finalizar [Cualquier numero] Continuar");
            Fin = sn.nextInt();
            if (Fin != 1) {
                System.out.println("Digite Id del producto");
                int Id = this.sn.nextInt();
                int X = BuscarXId(Id);
                if (X != -1) {
                    System.out.println(this.B.getP()[X].Informacion());
                    System.out.println("Digite la cantidad a llevar del producto");
                    int Cantidad = sn.nextInt();
                    if (Cantidad <= this.B.getP()[X].getExistencias()) {
                        F.AñadirProducto(this.B.getP()[X], Cantidad);
                        this.B.getP()[X].DisminuirExistencias(Cantidad);
                    } else {
                        System.out.println("Cantidad no disponible");
                    }
                } else {
                    System.out.println("Producto no encontrado");
                }
            }
        } while (Fin != 1);
        System.out.println("Digite el Id del cliente");
        int IdCliente = sn.nextInt();
        F.setIdCliente(IdCliente);
        F.ImprimirFactura();
        this.C.IngresoDinero(F.getTotalAPagar());
    }

    public void Reportes() {
        System.out.println(this.B.ReporteProductosAgotados());
        System.out.println(this.B.ListarProductosExistentes());
        System.out.println("Total ventas: " + this.C.getTotalVentas());
        System.out.println("Total dinero en caja: " + this.C.getDineroCaja());
    }
}
