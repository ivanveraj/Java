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
public class Producto {
    private int Id, Existencias;
    private String Nombre;
    private double Precio;

    public Producto(int Id, int Existencias, String Nombre, double Precio) {
        this.Id = Id;
        this.Existencias = Existencias;
        this.Nombre = Nombre;
        this.Precio = Precio;
    }
    public String Informacion(){
        return("Id: "+this.Id+" Nombre: "+this.Nombre+" Precio: "+this.Precio+" Existencias: "+this.Existencias+"\n");
    }
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getExistencias() {
        return Existencias;
    }

    public void setExistencias(int Existencias) {
        this.Existencias = Existencias;
    }
    public void DisminuirExistencias(int Existencias) {
        this.Existencias-= Existencias;
    }
    public void AumentarExistencias(int Existencias) {
        this.Existencias+= Existencias;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
}
