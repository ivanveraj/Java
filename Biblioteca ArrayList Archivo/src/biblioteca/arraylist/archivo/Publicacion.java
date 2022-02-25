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
public class Publicacion extends Material{
    private final int CantPaginas;

    public Publicacion(int CantPaginas,int NInventario, int ISBN, String Titulo, String Descripcion, String Autor) {
        super(NInventario, ISBN,  Titulo,Descripcion, Autor);
        this.CantPaginas = CantPaginas;
    }@Override
    public String toString(){
        return ("Numero de inventario: "+super.getNInventario()+"\nISBN: "+super.getISBN()+"\nTitulo: "+super.getTitulo()+"\nDescripcion: "
                +super.getDescripcion()+"\nAutor: "+super.getAutor()+"\nCantidad de paginas: "+this.CantPaginas);
    }
    
    
    public int getCantPaginas() {
        return CantPaginas;
    }
}
