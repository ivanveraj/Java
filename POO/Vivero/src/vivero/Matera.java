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
public class Matera {
    private int Codigo;
    private String Nombre;
    private String Material;
    private int Tamanio;
    private double Precio;
    public Matera(int C, String N, String M, int T, double P){
        this.Codigo=C;
        this.Nombre=N;
        this.Material=M;
        this.Tamanio=T;
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
    public String getMaterial() {
        return Material;
    }
    public void setMaterial(String Material) {
        this.Material = Material;
    }
    public int getTamanio() {
        return Tamanio;
    }
    public void setTamanio(int Tamanio) {
        this.Tamanio = Tamanio;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
}