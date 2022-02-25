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
public class Libro extends Publicacion {

    private int NCapitulos, NEdicion;
    private String Genero;

    public Libro(int NCapitulos, int NEdicion, String Genero, int CantPaginas, int NInventario, int ISBN, String Titulo, String Descripcion, String Autor) {
        super(CantPaginas, NInventario, ISBN, Titulo, Descripcion, Autor);
        this.NCapitulos = NCapitulos;
        this.NEdicion = NEdicion;
        this.Genero = Genero;
    }
    @Override
    public String toString() {
        return ("Numero de inventario: " + super.getNInventario() + "\nISBN: " + super.getISBN() + "\nTitulo: " + super.getTitulo() + "\nDescripcion: "
                + super.getDescripcion() + "\nAutor: " + super.getAutor() + "\nCantidad de paginas: " + super.getCantPaginas() + "\nNumero de capitulos: "
                + this.NCapitulos + "\nNumero de edicion: " + this.NEdicion + "\nGenero: " + this.Genero);
    }

    public int getNCapitulos() {
        return NCapitulos;
    }

    public void setNCapitulos(int NCapitulos) {
        this.NCapitulos = NCapitulos;
    }

    public int getNEdicion() {
        return NEdicion;
    }

    public void setNEdicion(int NEdicion) {
        this.NEdicion = NEdicion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

}
