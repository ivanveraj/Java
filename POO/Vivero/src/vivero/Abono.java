/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivero;

/**
 *
 * @author Usuario
 */
public class Abono {
    private int Codigo;
    private String Nombre;
    private String Descripcion;
    private String Utilidad;
    private double Precio;
    public Abono(int C, String N, String D, String U, double P){
        this.Codigo=C;
        this.Nombre=N;
        this.Descripcion=D;
        this.Utilidad=U;
        this.Precio=P;
    }
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    public String getUtilidad() {
        return Utilidad;
    }
    public void setUtilidad(String Utilidad) {
        this.Utilidad = Utilidad;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
}