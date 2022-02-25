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
public class Bodega {

    private Producto P[];
    private int T, Tmax;

    public Bodega(int T) {
        this.P = new Producto[T];
        this.T = 0;
        this.Tmax = T;
    }

    public String ReporteProductosAgotados() {
        String X = "Productos agotados \n";
        for (int i = 0; i < this.P.length; i++) {
            if (this.P[i].getExistencias() == 0) {
                X += this.P[i].Informacion();
            }
        }
        return X;
    }

    public String ListarProductosExistentes() {
        String X = "";
        for (int i = 0; i < this.P.length; i++) {
            if (this.P[i].getExistencias() != 0) {
                X += this.P[i].Informacion();
            }
        }
        return X;
    }

    public Producto[] getP() {
        return P;
    }

    public void setP(Producto P) {
        if (this.T == this.Tmax) {
            System.out.println("No se puede insertar mas productos");
        } else {
            this.P[this.T] = P;
            this.T++;
        }
    }

    public int getT() {
        return T;
    }

    public void setT(int T) {
        this.T = T;
    }

    public int getTmax() {
        return Tmax;
    }

    public void setTmax(int Tmax) {
        this.Tmax = Tmax;
    }

}
