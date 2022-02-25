/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;
import java.util.*;
/**
 *
 * @author MILE-IVA
 */
public class Tiquete extends Vehiculo{
    private int NumTiquete,C;
    private boolean Estado;
    private ClassFecha FechaI, FechaS;
    private long DifD;
    private double Val,TotalRecaudado;
    public Tiquete(long Doc,long Placa,int T){
        super(Doc,Placa);
        this.Estado=false;
        this.NumTiquete=0;
        this.FechaI=new ClassFecha();
        this.C=T;
    }
    public double getTotalRecaudado() {
        return TotalRecaudado;
    }
    public void setTotalRecaudado(double TotalRecaudado) {
        this.TotalRecaudado=TotalRecaudado;
    }
    public double getVal() {
        return Val;
    }
    public void setVal(double Val) {
        this.Val = Val;
    }
    public int getC() {
        return C;
    }
    public void setC(int C) {
        this.C=C;
    }
    public long getDifD() {
        return DifD;
    }
    public void setDifD(long DifD) {
        this.DifD=DifD;
    }
    public int getNumTiquete() {
        return(this.NumTiquete);
    }
    public void setNumTiquete(int NumTiquete) {
        this.NumTiquete=NumTiquete;
    }
    public boolean isEstado(){
        return Estado;
    }
    public void setEstado(boolean Estado) {
        this.Estado=Estado;
    }
    public ClassFecha getFechaI(){
        return(this.FechaI);
    }
    public void setFechaI(ClassFecha FechaI){
        this.FechaI=FechaI;
    }
    public ClassFecha getFechaS(){
        return(this.FechaS);
    }
    public void setFechaS(ClassFecha FechaS){
        this.FechaS=FechaS;
    }       
    public int CrearTiquete(){
        this.NumTiquete=1010+this.C;
        this.Estado=true;
        return(this.NumTiquete);
    }
    public Date RegistrarEntrada(){
        this.FechaI=new ClassFecha();
        return(this.FechaI.getFechaSystem());
    }
    public double Salida(int yyyy,int MM,int dd,int hh,int mm,int ss){
        this.FechaS=new ClassFecha(dd,MM,yyyy,hh,mm,ss);
        this.Estado=false;
        this.DifD=this.FechaI.diferenciaD(FechaS);
        this.Val=DiferenciaT(this.DifD);
        return(Val);
    }
    public double DiferenciaT(long DifD){
        long Diferencia,DifTotal;
        if(this.DifD>=1440){
            Diferencia=this.DifD-1440;
            DifTotal=(Diferencia*72)+20000;
        }else{
            DifTotal=(DifD*72);
        }
        return(DifTotal);
    }


    
    
    
    
    
    
}
