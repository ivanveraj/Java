/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.arraylist.archivo;

/**
 *
 * @author Usuario
 */
public class Revista extends Publicacion{
    private int CantArticulos;
    private String FrecuenciaP;

    public Revista(int CantArticulos, String FrecuenciaP, int CantPaginas, int NInventario, int ISBN, String Titulo, String Descripcion, String Autor) {
        super(CantPaginas, NInventario, ISBN, Titulo, Descripcion, Autor);
        this.CantArticulos = CantArticulos;
        this.FrecuenciaP = FrecuenciaP;
    }
@Override
    public String toString() {
        return ("Numero de inventario: " + super.getNInventario() + "\nISBN: " + super.getISBN() + "\nTitulo: " + super.getTitulo() + "\nDescripcion: "
                + super.getDescripcion() + "\nAutor: " + super.getAutor() + "\nCantidad de paginas: " + super.getCantPaginas() + "\nCantidad de articulos: "
                + this.CantArticulos + "\nFrecuencia publicacion: " + this.FrecuenciaP + "\n");
    }

    public int getCantArticulos() {
        return CantArticulos;
    }

    public void setCantArticulos(int CantArticulos) {
        this.CantArticulos = CantArticulos;
    }

    public String getFrecuenciaP() {
        return FrecuenciaP;
    }

    public void setFrecuenciaP(String FrecuenciaP) {
        this.FrecuenciaP = FrecuenciaP;
    }
    
    
    
}
