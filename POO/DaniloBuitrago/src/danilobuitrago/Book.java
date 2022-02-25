package danilobuitrago;

public class Book {
    private String Title;
    private String Author;
    private int Pages;
    private int Qualification;
    public Book(String T, String A, int P, int Q){
        this.Title=T;
        this.Author=A;
        this.Pages=P;
        this.Qualification=Q;
    }
    public void Information(){
        System.out.println("Titulo: "+this.Title+"\nAutor: "+this.Author+"\n"
                + "Total paginas: "+this.Pages+"\nCalificacion: "+this.Qualification+"\n");
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String Title) {
        this.Title = Title;
    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String Author) {
        this.Author = Author;
    }
    public int getPages() {
        return Pages;
    }
    public void setPages(int Pages) {
        this.Pages = Pages;
    }
    public int getQualification() {
        return Qualification;
    }
    public void setQualification(int Qualification) {
        this.Qualification = Qualification;
    }
}
