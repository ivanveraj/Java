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
public class Material {
    private int NInventario, ISBN;
    private String Titulo, Descripcion, Autor;

    public Material(int NInventario, int ISBN, String Titulo, String Descripcion, String Autor) {
        this.NInventario = NInventario;
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
        this.Autor = Autor;
    }
    @Override
    public String toString(){
        return ("Numero de inventario: "+this.NInventario+"\nISBN: "+this.ISBN+"\nTitulo: "+this.Titulo+"\nDescripcion: "+this.Descripcion+"\n"
                + "Autor: "+this.Autor+"\n");
    }

    public int getNInventario() {
        return NInventario;
    }

    public void setNInventario(int NInventario) {
        this.NInventario = NInventario;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
}
