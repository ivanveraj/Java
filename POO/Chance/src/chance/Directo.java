/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chance;
import java.util.Date;
/**
 *
 * @author PC-JIVJ
 */
public class Directo extends Tiquete {
    public Directo(int N,int N1,int N2,int N3, Date F,int T,int V){
        super(N,N1,N2,N3,F,T,V);
    }
    
    @Override
    public String Consulta(int A,int B, int C){
        String I="El tiquete "+this.Informacion()+" Resulto:";
        if(this.getN1()==A&&this.getN2()==B&&this.getN3()==C){
            I+=" Ganador y gano: "+(getValor()*1000);
        }else{
            I+="Perdedor";
        }
        return(I);
    }
    @Override
    public String Consulta2(int A,int B, int C){
        String I="El tiquete "+this.Informacion()+" Resulto:";
        if(this.getN1()==A&&this.getN2()==B&&this.getN3()==C){
            I+=" Ganador y gano: "+(getValor()*1000);
        }
        return(I);
    }
}
