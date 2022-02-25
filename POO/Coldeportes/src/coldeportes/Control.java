/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coldeportes;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Control {
    private Competencia Vec[];
    public Control(int Cant){
        this.Vec=new Competencia[Cant];
    }
    public int Buscar(String T){
        for(int i=0; i<this.Vec.length;i++){
            if(this.Vec[i].getTemporada().equals(T)){
                return(i);
            }
        }
        return(-1);
    }
    public void Llenar(){
        Scanner sn=new Scanner(System.in);
        for(int i=0;i<this.Vec.length;i++){
            System.out.println("Digite la temporada de la competencia: ");
            String Temporada=sn.nextLine();
            System.out.println("Digite la descripcion de la competencia: ");
            String Descripcion=sn.nextLine();
            System.out.println("Digite el tipo de la competencia (Nacional, Internacional, Barrial, etc...): ");
            String Tipo=sn.nextLine();
            System.out.println("Digite el presupuesto total para la competencia");
            double Presupuesto=sn.nextDouble();
            System.out.println("Digite la cantidad de deportes a participar en la competencia: ");
            int CantidadDeportes=sn.nextInt();
            sn.nextLine();
            this.Vec[i]=new Competencia(Temporada,Descripcion,Tipo,Presupuesto,CantidadDeportes);
        }
    }
    public void LlenarDeporte(String Cod){
        int B=Buscar(Cod);
        if(B!=-1){
            this.Vec[B].LlenarDeporte();
        }else{
            System.out.println("No existe la competencia");
        }
    }
    public void PromedioPresupuestos(){
        double P=0;
        for(int i=0;i<this.Vec.length;i++){
            P+=this.Vec[i].getPresupuesto();
        }
        System.out.println("El promedio de presupuesto para las "+this.Vec.length+" competencias es: "+P/this.Vec.length);
    }
    public void CompetenciasNacionales(){
        boolean Bandera=false;
        for(int i=0;i<this.Vec.length;i++){
            if(this.Vec[i].getTipo().equals("Nacional")){
                Bandera=true;
                System.out.println("Temporada: "+this.Vec[i].getTemporada()+"\n"
                        + "Descripcion:"+this.Vec[i].getDescripcion()+"\n"
                                + "Tipo:"+this.Vec[i].getTipo()+"\n"
                                        + "Presupuesto: "+this.Vec[i].getPresupuesto()+"\n"
                                                + "Cantidad de deportes: "+this.Vec[i].getCantidadDeportes()+"\n");
            }
        }
        if(Bandera==false){
            System.out.println("No existen competencias a nivel nacional");
        }
    }
    public void DeporteMenorDuracion(String Cod){
        int B=Buscar(Cod);
        if(B!=-1){
            this.Vec[B].MenorDuracionDeporte();
        }else{
            System.out.println("No existe la competencia");
        }
    }
}