package gasolinerias;

import java.util.ArrayList;
import java.util.Date;

public class Control {
    private ArrayList<Estacion> E;
    public Control(){
        E=new ArrayList<Estacion>();
    }
    public int BuscarE(int X){
        int T=E.size();
        for(int i=0;i<T;i++){
            if(E.get(i).getCodigo()==X){
                return(i);
            }
        }
        return(-1);
    }
    public String CrearEstacion(int X, int CantG, int CantA){
        if(BuscarE(X)==-1){
            if(CantG>0&&CantA>0){
                E.add(new Estacion(X,CantG,CantA));
                return("Estacion creada");
            }
            return("Cantidades invalidas");
        }
        return("ERROR ya existe");
    }
    public String VentaGasolina(int Cod,int CantGV){
        int B=BuscarE(Cod);
        if(B!=-1){
            Date F=new Date();
            int C=E.get(B).getCantG();
            System.out.println(E.get(B).VentaGasolina(Cod,CantGV,0,C,0));
            return("Gracias por su compra");
        }
        return("Error no existe");
    }
    public String VentaACPM(int Cod,int CantAV){
        int B=BuscarE(Cod);
        if(B!=-1){
            Date F=new Date();
            int C=E.get(B).getCantA();
            System.out.println(E.get(B).VentaACPM(Cod,0,CantAV,0,C));
            return("Gracias por su compra");
        }
        return("Error no existe");
    }
    public String RecargarEstacion(int Cod,int ACPM,int Gasolina){
        int B=BuscarE(Cod);
        if(B!=-1){
            System.out.println(E.get(B).Recargar(ACPM, Gasolina));
            return("");
        }
        return("Error estacion no existe");
    }
    public void Resumen(){
        int Mas=0,MasC=0;
        int T=E.size();
        for(int i=0;i<T;i++){
            System.out.println(E.get(i).Informacion());
            System.out.println(E.get(i).InformacionFac());
            if(E.get(i).getRecaudado()>E.get(Mas).getRecaudado()){
                Mas=i;
            }
            if(E.get(i).getTotalC()>E.get(MasC).getTotalC()){
                MasC=i;
            }
        }
        System.out.println("La estacion que mas dinero recaudo fue: "+Mas+"\nTotal Recaudado: "+E.get(Mas).getRecaudado());
        System.out.println("La estacion con mas combustible es: "+MasC+"\nTotal Combustible (Suma entre ACPM y Gasolina) es: "
                + ""+E.get(Mas).getTotalC());
    }
}
