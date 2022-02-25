package poo.herencia.fecha;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Fecha {
    private Date FechaSystem;
    public Fecha(){
        this.FechaSystem=new Date();
    }
    public Fecha(int A, int M, int D, int H, int Mi,int S){
        this.FechaSystem=new Date(A,M,D,H,Mi,S);
    }
    public Date getFechaSystem() {
        return(this.FechaSystem);
    }
    public void setFechaSystem(Date FechaSystem) {
        this.FechaSystem=FechaSystem;
    }
    public String FormatoDMA(){
        SimpleDateFormat SDF=new SimpleDateFormat("dd/MM/yyyy");
        String FechaFormato=SDF.format(this.FechaSystem);
        return(FechaFormato);
    }
    public String FormatoUsuarioDMA(){
        int A=this.FechaSystem.getYear();
        int M=this.FechaSystem.getMonth();
        int D=this.FechaSystem.getDate();
        return(D+"/"+M+"/"+A);
    }
    public String FormatoHMS(){
        int Horas=this.FechaSystem.getHours();
        int Minutos=this.FechaSystem.getMinutes();
        int Segundos=this.FechaSystem.getSeconds();
        return(Horas+":"+Minutos+":"+Segundos);
    }
    public long DiferenciaFechas(Fecha X){
        System.out.println("usuario"+X.FechaSystem.getTime());
        System.out.println("sistema "+this.FechaSystem.getTime());
        
        long F=this.FechaSystem.getTime()-X.FechaSystem.getTime();
        long Fe=F/86400000;
        Fe=Math.abs(Fe);
        return(Fe);
    }
    public long DiferenciaTiempo(Fecha X){
        System.out.println(X.FormatoHMS());
        long F=this.FechaSystem.getTime()-X.FechaSystem.getTime();
        long Fe=F/60000;
        Fe=Math.abs(Fe);
        return(Fe);
    }
    
    
    

    
    
    
}
