package gasolinerias;
import java.util.*;
/**
 *
 * @author PC-JIVJ
 */
public abstract class Factura extends Estacion{
    private int NumeroF,CantGGV,CantGAV;
    private Date F;
    public Factura(int N,int Cod,int CantGV,int CantAV,int CantG,int CantA){
        super(Cod,CantG,CantA);
        this.NumeroF=N;
        this.CantGAV=CantAV;
        this.CantGGV=CantGV;
        F=new Date();
    }
    public String FechaF(){
        return(F.getDay()+"/"+F.getMonth()+"/"+F.getYear());
    }
    public abstract String Venta();
    public int getNumeroF() {
        return NumeroF;
    }
    public void setNumeroF(int NumeroF) {
        this.NumeroF = NumeroF;
    }
    public int getCantGGV() {
        return CantGGV;
    }
    public void setCantGGV(int CantGGV) {
        this.CantGGV = CantGGV;
    }
    public int getCantGAV() {
        return CantGAV;
    }
    public void setCantGAV(int CantGAV) {
        this.CantGAV = CantGAV;
    }
    }

