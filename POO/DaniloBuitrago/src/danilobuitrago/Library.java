package danilobuitrago;

public class Library {
    private Book B[];
    private int T,Tmax;
    public Library(int Tam){
        this.T=0;
        this.Tmax=Tam;
        this.B=new Book[this.Tmax];
    }
    public void Add(String T, String A, int P, int Q){
        if(this.T!=this.Tmax){
            this.B[this.T]=new Book(T,A,P,Q);
            this.T++;
            System.out.println("Libro agregado correctamente"+"\n");
        }else{
            System.out.println("Error, no se puede agregar nuevos libros"+"\n");
        }
    }
    public void Delete(int Op, String T){
        int B = Buscar(Op, T);
        if (B != -1) {
            for (int i = B; i < this.T; i++) {
                this.B[i] = this.B[i + 1];
            }
            this.T--;
            System.out.println("Libro eliminado correctamente"+"\n");
        }else{
            System.out.println("No existe libro"+"\n");
        }
    }
    public int Buscar(int Op, String T){
        if(Op==1){
            for(int i=0;i<this.T;i++){
                if(this.B[i].getTitle()==T){
                    return(i);
                }
            }
            return(-1);
        }else{
            for(int i=0;i<this.T;i++){
                if(this.B[i].getAuthor()==T){
                    return(i);
                }
            }
            return(-1);
        }
    }
    public void MaxMin(){
        int Max=0, Min=0;
        for(int i=0;i<this.T;i++){
            if(this.B[i].getQualification()>this.B[Max].getQualification()){
                Max=i;
            }
            if(this.B[i].getQualification()<this.B[Min].getQualification()){
                Min=i;
            }
        }
        System.out.println("\nLibro con mayor calificacion");
        this.B[Max].Information();
        System.out.println("\nLibro con menor calificacion");
        this.B[Min].Information();
    }
    public void Print(){
         for(int i=0;i<this.T;i++){
            this.B[i].Information();
        }
    }
}
