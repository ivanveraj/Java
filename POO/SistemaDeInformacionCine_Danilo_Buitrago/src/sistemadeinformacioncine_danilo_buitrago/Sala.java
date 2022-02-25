package sistemadeinformacioncine_danilo_buitrago;
import java.util.Scanner;

public class Sala {
    private int Code,T,Tmax;
    private String Name;
    private int Size;
    private Pelicula Movie[];
    public Sala(int C, String N, int S, int Cant){
        this.Code=C;
        this.Name=N;
        this.Size=S;
        this.T=0;
        this.Tmax=Cant;
        this.Movie=new Pelicula[Cant];
    }
        public int Buscar(String C) {
        for (int i = 0; i < this.T; i++) {
            System.out.println("NOmbres: "+ this.Movie[i].getTitle());
            if (this.Movie[i].getTitle().equals(C)) {
                return (i);
            }
        }
        return (-1);
    }
    public void CreateMovie(int CodeP, String T, String P, String G, int D, String De, String F, String H) {
        if (this.T < this.Tmax) {
            this.Movie[this.T] = new Pelicula(CodeP, T, P, G, D, De,F,H);
            this.T++;
            System.out.println("Pelicula creada correctamente" + "\n");
        } else {
            System.out.println("No se pueden ingresar mas peliculas");
        }
    }
    public void Delete(String C) {
        int B = Buscar(C);
        if (B != -1) {
            for (int i = B; i < this.T; i++) {
                this.Movie[i] = this.Movie[i + 1];
            }
            this.T--;
            System.out.println("Pelicula eliminada correctamente" + "\n");
        } else {
            System.out.println("No existe la pelicula" + "\n");
        }
    }

   public void Consultar(String C) {
        int B = Buscar(C);
        System.out.println("nombre pelicula: "+C);
        if (B != -1) {
            this.Movie[B].Information();
            System.out.println("Pelicula consultada correctamente" + "\n");
        } else {
            System.out.println("No existe la pelicula" + "\n");
        }
    }
   
   public void Modify(String C) {
        int B = Buscar(C);
        if (B != -1) {
            Scanner sn=new Scanner(System.in);
            String Title, Poster, Gender, Description, Date, Horario;
            int Duration;
            System.out.println("Digite el titulo: ");
            sn.nextLine();
            Title=sn.nextLine();
            this.Movie[B].setTitle(Title);
            System.out.println("Digite el poster: ");
            sn.nextLine();
            Poster=sn.nextLine();
            this.Movie[B].setPoster(Poster);
            System.out.println("Digite el genero");
            sn.nextLine();
            Gender=sn.nextLine();
            this.Movie[B].setGender(Gender);
            System.out.println("Digite la descripcion: ");
            sn.nextLine();
            Description=sn.nextLine();
            this.Movie[B].setDescription(Description);
            System.out.println("Digite la duracion: ");
            Duration=sn.nextInt();
            this.Movie[B].setDuration(Duration);
            System.out.println("Digite la fecha");
            sn.nextLine();
            Date= sn.nextLine();
            this.Movie[B].setDate(Date);
            System.out.println("Digite el horario: ");
            sn.nextLine();
            Horario= sn.nextLine();
            this.Movie[B].setHorario(Horario);
            System.out.println("Pelicula modificada correctamente" + "\n");
        } else {
            System.out.println("No existe la pelicula" + "\n");
        }
    }
    public void Information(){
        System.out.println("Codigo: "+this.Code+"\nName: "+this.Name+"\n"
                + "Capacidad: "+this.Size+"");
    }
    public int getCode(){
        return Code;
    }
    public void setCode(int Code) {
        this.Code = Code;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public int getSize() {
        return Size;
    }
    public void setSize(int Size){
        this.Size = Size;
    }
    public int getT() {
        return T;
    }
    public void setT(int T) {
        this.T = T;
    }
    public int getTmax() {
        return Tmax;
    }
    public void setTmax(int Tmax) {
        this.Tmax = Tmax;
    }
    public Pelicula[] getMovie() {
        return Movie;
    }
    public void setMovie(Pelicula[] Movie) {
        this.Movie = Movie;
    }
    
}