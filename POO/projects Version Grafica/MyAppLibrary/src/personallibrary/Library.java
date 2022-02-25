/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personallibrary;

/**
 *
 * @author prog
 */
public class Library {

    private Book[] books = {};

    public Library(int maxSize) {
        books = new Book[maxSize];
    }

    private boolean isEmpty(int index){
        
        return (books[index] == null);
    }
    
    // Retorna el indice (posición) de la primera libre casilla disponible 
    // del arreglo  
    public int indexEmptyPosition() {
        for (int k = 0; k < books.length; k++) {
            if (isEmpty(k)) {
                return k;
            }
        }

        return -1;
    }

    public int indexBookByTitle(String title) {
        for (int k = 0; k < books.length; k++) {
            if (books[k] != null) {
                if (books[k].getTitle().equalsIgnoreCase(title)) {
                    return k;
                }
            }
        }

        return -1;
    }

    public int addBook(Book newBook) {
        int status = 0;
        int indexNullPos = indexEmptyPosition();

        if (indexNullPos != -1) { // Existe una posición libre
            int index = indexBookByTitle(newBook.getTitle());
            if (index == -1) { // El titulo del libro no existe en la colección
                books[indexNullPos] = newBook;
            }
            else { // El titulo del libro ya existe en la colección
                status = -1;
            }

        }
        else { // No existe una posición libre
            status = -2;
        }

        return status;
    }

    public boolean removeBookByTitle(String title) {
        int index = indexBookByTitle(title);

        if (index != -1) { // El libro existe en la colección
            books[index] = null;
            return true;
        }

        return false;
    }

    public boolean removeBookByAuthor(String author) {
        boolean removed = false;

        for (int k = 0; k < books.length; k++) {
            if (books[k] != null) {
                if (books[k].getAuthor().equalsIgnoreCase(author)) {
                    books[k] = null;
                    removed = true;
                }
            }
        }

        return removed;
    }

    // Este metodo es solo para pruebas
    /*
    public void printArray() {
        for (int k = 0; k < books.length; k++) {
            if (books[k] != null) {
                System.out.println("Book[" + k + "] = " + books[k].getTitle());
            }
            else {
                System.out.println("Book[" + k + "] = " + books[k]);
            }
        }
    }
*/

    public Book[] getBooks(){
        Book[] newBooks = new Book[books.length];
                
        for (int k = 0; k < newBooks.length; k++) {
            newBooks[k] = books[k];
        }
            
        return newBooks;
    }
    
    
}
