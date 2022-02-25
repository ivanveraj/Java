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
public class Planta {
    private int Codigo;
    private String Nombre;
    private String Cuidados;
    private int Tipo;
    private double Precio;
    public Planta(int C, String N, String Cu, int T, double P){
        this.Codigo=C;
        this.Nombre=N;
        this.Cuidados=Cu;
        this.Tipo=T;
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
    public String getCuidados() {
        return Cuidados;
    }
    public void setCuidados(String Cuidados) {
        this.Cuidados = Cuidados;
    }
    public int getTipo() {
        return Tipo;
    }
    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
}