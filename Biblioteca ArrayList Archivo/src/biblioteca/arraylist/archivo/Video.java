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
public class Video extends Material {

    private int Duracion;
    private String Formato;
   
    public Video(int Duracion, String Formato, int NInventario, int ISBN, String Titulo, String Descripcion, String Autor) {
        super(NInventario, ISBN, Titulo, Descripcion, Autor);
        this.Duracion = Duracion;
        this.Formato = Formato;
    }

    @Override
    public String toString() {
        return ("Numero de inventario: " + super.getNInventario() + "\nISBN: " + super.getISBN() + "\nTitulo: " + super.getTitulo() + "\nDescripcion: "
                + super.getDescripcion() + "\nAutor: " + super.getAutor() + "\nDuracion: " + this.Duracion + "\nFormato: " + this.Formato + "\n");
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public String getFormato() {
        return Formato;
    }

    public void setFormato(String Formato) {
        this.Formato = Formato;
    }

}
