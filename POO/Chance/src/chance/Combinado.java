package chance;
import java.util.Date;
/**
 *
 * @author PC-JIVJ
 */
public class Combinado extends Tiquete{
    public Combinado(int N,int N1,int N2,int N3, Date F,int T,int V){
        super(N,N1,N2,N3,F,T,V);
    }
    @Override
    public String Consulta(int A,int B, int C){
        String I="El tiquete "+this.Informacion()+" Resulto:";
        if(this.getN1()==A&&this.getN2()==B&&this.getN3()==C||
                this.getN1()==B&&this.getN2()==C&&this.getN3()==A||
                this.getN1()==C&&this.getN2()==A&&this.getN3()==B||
                this.getN1()==A&&this.getN2()==C&&this.getN3()==B||
                this.getN1()==B&&this.getN2()==A&&this.getN3()==C||
                this.getN1()==C&&this.getN2()==B&&this.getN3()==A){
            I+=" Ganador y gano: "+(getValor()*700);
        }else{
            I+="Perdedor";
        }
        return(I);
    }
    @Override
    public String Consulta2(int A,int B, int C){
        String I="El tiquete "+this.Informacion()+" Resulto:";
        if(this.getN1()==A&&this.getN2()==B&&this.getN3()==C||
                this.getN1()==B&&this.getN2()==C&&this.getN3()==A||
                this.getN1()==C&&this.getN2()==A&&this.getN3()==B||
                this.getN1()==A&&this.getN2()==C&&this.getN3()==B||
                this.getN1()==B&&this.getN2()==A&&this.getN3()==C||
                this.getN1()==C&&this.getN2()==B&&this.getN3()==A){
            I+=" Ganador y gano: "+(getValor()*700);
        }
        return(I);
    }
}
