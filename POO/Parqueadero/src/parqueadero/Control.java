/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;
import java.util.Date;

/**
 *
 * @author MILE-IVA
 */
public class Control extends ClassFecha{
    private Tiquete V[];
    private int T,Tmax;
    private int Vehiculos, VehiculosP;
    private double Val,TotalRecaudado;
    private long PromedioTiempo=0;
    public Control(){
        this.T=0;
        this.Tmax=10;
        this.V=new Tiquete[Tmax];
        this.VehiculosP=0;
    }

    public long getPromedioTiempo() {
        return PromedioTiempo;
    }

    public void setPromedioTiempo(long PromedioTiempo) {
        this.PromedioTiempo = PromedioTiempo;
    }
    public Tiquete[] getV() {
        return V;
    }
    public void setV(Tiquete[] V) {
        this.V = V;
    }
    public int getT() {
        return T;
    }
    public void setT(int T) {
        this.T=T;
    }
    public int getTmax() {
        return Tmax;
    }
    public void setTmax(int Tmax) {
        this.Tmax = Tmax;
    }
    public int getVehiculos() {
        return Vehiculos;
    }
    public void setVehiculos(int Vehiculos) {
        this.Vehiculos = Vehiculos;
    }
    public double getVal() {
        return Val;
    }
    public void setVal(double Val) {
        this.Val = Val;
    }
    public int Buscar(long T){
        for(int i=0;i<this.Tmax;i++){
            if(this.V[i].getNumTiquete()==T){
                if(this.V[i].isEstado()==true){
                    return(i);
                }
        }
    }
        return(-1);
    }
    public String IngresarVehiculo(long Doc, long Placa){
            if(this.T<this.Tmax){
                this.V[this.T]=new Tiquete(Doc,Placa,T);
                int B=this.V[this.T].CrearTiquete();
                Date Fe=this.V[this.T].RegistrarEntrada();
                String Fentrada=Fe.getDate()+"/"+(Fe.getMonth()+1)+"/"+(Fe.getYear()+1900)+" Hora "+Fe.getHours()+""
                        +":"+Fe.getMinutes()+":"+Fe.getSeconds();
                this.T++;
                this.Vehiculos++;
                return("El tiquete numero "+B+" ha registrado entrada a "+Fentrada);
                
        }
        return("No hay espacio disponible");  
    }
    public String RetirarVehiculo(int dd,int MM,int yyyy,int hh,int mm,int ss,long NumT){
        int B=Buscar(NumT);
        if(B!=-1){
            if(this.V[B].isEstado()==true){
                Val=this.V[B].Salida(yyyy,MM,dd,hh,mm,ss);
                this.PromedioTiempo=this.PromedioTiempo+this.V[B].getDifD();
                this.TotalRecaudado=this.TotalRecaudado+this.Val;
                this.V[B].setEstado(false);
                this.T--;
                this.VehiculosP++;
                String Fs=dd+"/"+MM+"/"+yyyy+" Hora "+hh+":"+mm+":"+ss;
                return("Puesto de tiquete: "+NumT+" retirado, Total a Pagar: "+Val+" Tiempo en Minutos "+this.V[B].getDifD()+"\n Fecha Entrada "+Info()
                        + "\n Fecha Salida "+Fs);
            }
    }
            return("Tiquete no ocupado/ no exite");
        }
}


