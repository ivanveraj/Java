/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coldeportes;

/**
 *
 * @author Usuario
 */
public class Deporte{
    private int Codigo;
    private String Nombre;
    private int NJugadores;
    private String Categoria;
    private int NSets;
    private int DuracionSets;
    public Deporte(int C, String N, int NJ, String Categoria, int NS, int D){
        this.Codigo=C;
        this.Nombre=N;
        this.NJugadores=NJ;
        this.Categoria=Categoria;
        this.NSets=NS;
        this.DuracionSets=D;
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
    public int getNJugadores() {
        return NJugadores;
    }
    public void setNJugadores(int NJugadores) {
        this.NJugadores = NJugadores;
    }
    public String getCategoria() {
        return Categoria;
    }
    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    public int getNSets() {
        return NSets;
    }
    public void setNSets(int NSets) {
        this.NSets = NSets;
    }
    public int getDuracionSets() {
        return DuracionSets;
    }
    public void setDuracionSets(int DuracionSets) {
        this.DuracionSets = DuracionSets;
    }
}