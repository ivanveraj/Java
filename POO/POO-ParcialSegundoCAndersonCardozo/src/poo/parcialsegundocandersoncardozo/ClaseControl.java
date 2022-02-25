package poo.parcialsegundocandersoncardozo;

import java.util.ArrayList;

public class ClaseControl {
    private ArrayList<Vacuna> Vac;
    public ClaseControl(){
        this.Vac=new ArrayList<Vacuna>();
    }
     public String CrearVacuna(int Cod, String N, int D, int M, int A){
         this.Vac.add(new Vacuna(Cod,N,D,M,A));
         return("Se creo vacuna");
    }
    public int BuscarEstado(){
        for(int i=0;i<this.Vac.size();i++){
            if(1==this.Vac.get(i).getEstado()){
                return(i);
            }
        }
        return(-1);
    }
    public int BuscarVacuna(int X){
        for(int i=0;i<this.Vac.size();i++){
            if(X==this.Vac.get(i).getCodVacuna()){
                return(i);
            }
        }
        return(-1);
    }
    public String InformacionVacuna(int X){
        int B=BuscarVacuna(X);
        if(B!=-1){
            return(this.Vac.get(B).Informacion());
        }else{
            return("Error no existe");
        }
    }
    public String aplicarVacuna(int X){
        int B=BuscarVacuna(X);
        if(B!=-1){
            if(this.Vac.get(B).getEstado()==1 && this.Vac.get(B).compruebaVacuna2()){
                this.Vac.get(B).setEstado(2);
                return("Puede aplicar la vacuna de codigo "+this.Vac.get(B).getCodVacuna());
            }else{
                return("Error no se puede aplicar");
            }
        }
        return("Error no se puede aplicar");
    }
    public String aplicarVacuna(){
        int B=BuscarEstado();
        if(B!=-1){
            if(this.Vac.get(B).compruebaVacuna2()){
                this.Vac.get(B).setEstado(2);
                return("Puede aplicar la vacuna de codigo "+this.Vac.get(B).getCodVacuna());
            }else{
                return("Error no se puede aplicar");
            }
        }
        return("Error no se puede aplicar");
    }
    public void InformeInventario(){
        System.out.println("Cantidad de vacunas totales: "+this.Vac.size());
        System.out.println("Cantidad de vacunas estado (1)"+this.VacunasPorEstado(1));
        System.out.println("Cantidad de vacunas estado (2)"+this.VacunasPorEstado(2));
        System.out.println("Cantidad de vacunas estado (3)"+this.VacunasPorEstado(3));
        System.out.println("Cantidad de vacunas estado (4)"+this.VacunasPorEstado(4));
        System.out.println("Cantidad de vacuna a vencer en 2 dias "+this.vencimientoDosDias());
    }
    
    public int VacunasPorEstado(int X){
        int Cant=0;
        for(int i=0;i<this.Vac.size();i++){
            if(X==this.Vac.get(i).getEstado()){
                Cant++;
            }
        }
        return(Cant);
    }
    public int vencimientoDosDias(){
        ClassFecha FechaActual=new ClassFecha();
        int Cant=0;
        for(int i=0;i<this.Vac.size();i++){
            int T=(int)(this.Vac.get(i).getFH().getTime()-FechaActual.getFH().getTime());
            if(T<172800000){
                Cant++;
            }
        }
        return(Cant);
    }
    public int vencimientoDiasX(int X){
        ClassFecha FechaActual=new ClassFecha();
        int Cant=0;
        for(int i=0;i<this.Vac.size();i++){
            int T=(int)(this.Vac.get(i).getFH().getTime()-FechaActual.getFH().getTime());
            if(T<(86400000)*X){
                Cant++;
            }
        }
        return(Cant);
    }
    public String informeAlerta(int X){
        return("Cantidad de vacunas a vencer en "+X+" dias: "+this.vencimientoDiasX(X));
    }
        
}

