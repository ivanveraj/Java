package sistemadeinformacioncine_danilo_buitrago;

public class Pelicula {
     private String Title;
    private String Poster;
    private String Gender;
    private int Duration,Code;
    private String Description;
    private String Date, Horario;
    public Pelicula(int C, String T, String P, String G, int D, String De, String F, String H){
        this.Code=C;
        this.Title=T;
        this.Poster=P;
        this.Gender=G;
        this.Duration=D;
        this.Description=De;
        this.Date=F;
        this.Horario=H;
    }
    public void Information(){
        System.out.println("Codigo: "+this.Code+"\nTitulo: "+this.Title+"\nPoster: "+this.Poster+"\n"
                + "Genero: "+this.Gender+"\nDuracion: "+this.Duration+"\nDescripcion: "+this.Description+"\nFecha: "+this.Date+
                "\nHorario: "+this.Horario+"");
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String Title) {
        this.Title = Title;
    }
    public String getPoster() {
        return Poster;
    }
    public void setPoster(String Poster) {
        this.Poster = Poster;
    }
    public String getGender() {
        return Gender;
    }
    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    public int getDuration() {
        return Duration;
    }
    public void setDuration(int Duration) {
        this.Duration = Duration;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String Description) {
        this.Description = Description;
    }
    public int getCode() {
        return Code;
    }
    public void setCode(int Code) {
        this.Code = Code;
    }
    public String getDate() {
        return Date;
    }
    public void setDate(String Date) {
        this.Date = Date;
    }
    public String getHorario() {
        return Horario;
    }
    public void setHorario(String Horario) {
        this.Horario = Horario;
    }
    
}