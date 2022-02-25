/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.herencia.hospital;
import java.util.*;
/**
 *
 * @author MILE-IVA
 */
public class Control extends Paciente {
    Scanner sn=new Scanner (System.in);
    private int Tpruebas,TpEspera,TpFinalizadas,TpPositivas,TpNegativas,TpPosibles;
    private Paciente V[];
    private int T,Tmax;
    public Control(long I, long D, int T){
        super(I,D,T);
        this.Tmax=10;
        this.T=0;
        this.V=new Paciente[Tmax];
        this.Tpruebas=0;
        this.TpEspera=0;
        this.TpFinalizadas=0;
        this.TpPositivas=0;
        this.TpPosibles=0;
        this.TpNegativas=0;
    }
    public int getTpruebas(){
        return(this.Tpruebas);
    }
    public void setT(int X){
        this.T=X;
    }
    public void setTmax(int X){
        this.Tmax=X;
    }
    public int getT(){
        return(this.T);
    }
    public long getTmax(){
        return(this.Tmax);
    }
    public int Buscar(long I){
        for(int i=0;i<this.T;i++){
            if(this.V[i].getIdentificador()==I){
                return(i);
            }
        }
        return(-1);
    }
    public String Crear(long I, long D,int T){
        int P=Buscar(I);
        if(P==-1){
            this.V[this.T]=new Paciente(I,D,T);
            this.T++;
            this.Tpruebas++;
            return("Creado satisfactoriamente");
        }
        return("Error ya existe");
    }
    public String AsignarEstado(long I){
        int P=Buscar(I);
        if(P!=-1){
            if(this.V[P].getEstado()==1){
                System.out.println("Asignar Resultado 1\n[1]Positivo\n[2]Negativo");
                this.V[P].setResultado1(sn.nextInt());
                System.out.println("Asignar Resultado 2\n[1]Positivo\n[2]Negativo");
                this.V[P].setResultado2(sn.nextInt());
                System.out.println("Resultados asignado");
                this.V[P].setEstado(2);
                return("Correcto Resultados ya asignados");
            }
        }
        return("Error no existe");
    }
    public String DiagnosticoDePrueba(long I){
        int P=Buscar(I);
        if(P!=-1){
            if(this.V[P].getEstado()==2){
                return(this.V[P].Resultado());
            }
        }
        return("Error no existe");
    }
    public String BusquedaPorPaciente(long D){
        for(int i=0;i<this.T;i++){
            int Pos=0;
            if(this.V[i].getDocumento()==D){
                Pos=i;
                if(this.V[Pos].getEstado()==2){
                    System.out.println("[1]En espera\n[2]Finalizada");
                    System.out.println("El estado en la prueba "+this.V[Pos].getIdentificador()+" es "+this.V[Pos].getEstado());
                    this.V[Pos].Resultado();
                }
                }else{
                Pos=-1;
            }
        }
        return("Finalizando");
        
    }
       
    
    public String Resumen(){
        for(int i=0;i<this.T;i++){
            if(this.V[i].getEstado()==1){
                this.TpEspera++;
            }
            if(this.V[i].getEstado()==2){
                this.TpFinalizadas++;
                if(this.V[i].Resultado()=="Positivo"){
                    this.TpPositivas++;
                }
                if(this.V[i].Resultado()=="Negativo"){
                    this.TpNegativas++;
                }
                if(this.V[i].Resultado()=="Posible"){
                    this.TpPosibles++;
                }
            }
        }
        return("El total de pruebas realizadas fueron "+this.Tpruebas+"\n"
                + "Total de pruebas en espera"+this.TpEspera+"\n"
                + "Total de pruebas Finalizadas"+this.TpFinalizadas+"\n"
                + "Total de pruebas positivas"+this.TpPositivas+"\n"
                + "Total de pruebas negativas"+this.TpNegativas+"\n"
                + "Total de pruebas posibles"+this.TpPosibles+"\n");
    }
    
}

