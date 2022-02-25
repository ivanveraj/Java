/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosuniversidad;

/**
 *
 * @author Usuario
 */
public class Control2 {
    private Titular T[];
    private Ocasional O[];
    private int Tam1,Tam2, Tmax;
    public Control2(){
        this.Tam1=0;
        this.Tam2=0;
        this.Tmax=3;
        T=new Titular[Tmax];
        O=new Ocasional[Tmax];
    }
    public int BuscarT(int Ced){
        for(int i=0;i<Tam1;i++){
            if(T[i].getCedula()==Ced){
                return(i);
            }
        }
        return(-1);
    }
    public int BuscarO(int Ced){
        for(int i=0;i<Tam2;i++){
            if(O[i].getCedula()==Ced){
                return(i);
            }
        }
        return(-1);
    }
    public String CrearTitular(String Nombre, String Profesion, int Cedula){
        T[Tam1]=new Titular(Nombre,Profesion,Cedula);
        Tam1++;
        return("Titular ingresado correctamente");
    }
    public String CrearOcasional(String Nombre, String Profesion, int Cedula){
        O[Tam2]=new Ocasional(Nombre,Profesion,Cedula);
        Tam2++;
        return("Ocasional ingresado correctamente");
    }
    public void CalcularSueldoT(int Cedula, int Horas){
        int B=BuscarT(Cedula);
        if(B!=-1){
                T[B].CalcularSueldo(Horas);
        }else{
            System.out.println("Cedula no encontrada");
        }
    }
    public void CalcularSueldoO(int Cedula, int Horas){
        int B=BuscarO(Cedula);
        if(B!=-1){
                O[B].CalcularSueldo(Horas);
        }else{
            System.out.println("Cedula no encontrada");
        }
    }
    public void MayorSueldo(){
        int MayorO=0,MayorT=0;
        for(int i=1;i<Tam2;i++){
            if(O[MayorO].getSueldo()<O[i].getSueldo()){
                MayorO=i;
            }
        }
        for(int i=1;i<Tam1;i++){
            if(T[MayorT].getSueldo()<T[i].getSueldo()){
                MayorT=i;
            }
        }
        System.out.println("El mayor sueldo de los ocasiones es: \n"+O[MayorO].Informacion());
        System.out.println("El mayor sueldo de los titulares es: \n"+T[MayorT].Informacion());
    }
    public void Informacion(){
        for(int i=0;i<Tam1;i++){
            System.out.println(T[i].Informacion());
        }
        for(int i=0;i<Tam2;i++){
            System.out.println(O[i].Informacion());
        }
    }
}
