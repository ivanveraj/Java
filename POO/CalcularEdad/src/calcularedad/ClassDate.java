package calcularedad;
import java.util.Date;

public class ClassDate{
    private String Nombre;
    private Date FN,FA;
    public ClassDate(String N,int A, int M, int D){
        this.Nombre=N;
        this.FN=new Date(A,M,D);
        this.FA=new Date();
    }
    public void Calcular(){
        int A,D,M;
        D=this.FA.getDate()-this.FN.getDate();
        M=this.FN.getMonth()-(this.FA.getMonth()+1);
        A=(this.FA.getYear()+1900)-this.FN.getYear();
        if((this.FA.getYear()+1900)!=this.FN.getYear()){
            A=A-1;
        }
        System.out.println("Edad exacta de "+Nombre);
        System.out.println("Total de años: "+A+"\nTotal de meses: "+M+"\nTotal de dias: "+D);
    }
    
}
