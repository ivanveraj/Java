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
public class Competencia{
    private String Temporada;
    private String Descripcion;
    private String Tipo;
    private double Presupuesto;
    private int CantidadDeportes;
    private Deporte Vec[];
    public Competencia(String T, String D, String Tipo, double P, int Cant){
        this.Temporada=T;
        this.Descripcion=D;
        this.Tipo=Tipo;
        this.Presupuesto=P;
        this.CantidadDeportes=Cant;
        this.Vec=new Deporte[Cant];
    }
    public void LlenarDeporte(){
        Scanner sn=new Scanner(System.in);
        for(int i=0;i<this.Vec.length;i++){
            System.out.println("Digite el codigo del deporte: ");
            int Codigo=sn.nextInt();
            System.out.println("Digite el nombre del deporte: ");
            sn.nextLine();
            String Nombre=sn.nextLine();
            System.out.println("Digite el numero de jugadores del deporte "+Nombre);
            int NJugadores=sn.nextInt();
            System.out.println("Digite la categoria del deporte "+Nombre);
            sn.nextLine();
            String Categoria=sn.nextLine();
            System.out.println("Digite el numero de sets del deporte "+Nombre);
            int NSets=sn.nextInt();
            System.out.println("Digite la duracion de los sets del deporte "+Nombre);
            int DuracionSets=sn.nextInt();
            this.Vec[i]=new Deporte(Codigo,Nombre,NJugadores,Categoria,NSets,DuracionSets);
        }
    }
    public void MenorDuracionDeporte() {
        int Menor = 0;
        for (int i = 0; i < this.Vec.length; i++) {
            if (this.Vec[i].getDuracionSets() < this.Vec[Menor].getDuracionSets()) {
                Menor = i;
            }
        }
        System.out.println("El deporte con menor duracion de set es: " + this.Vec[Menor].getNombre());
    }
    public String getTemporada() {
        return Temporada;
    }
    public void setTemporada(String Temporada) {
        this.Temporada = Temporada;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    public double getPresupuesto() {
        return Presupuesto;
    }
    public void setPresupuesto(double Presupuesto) {
        this.Presupuesto = Presupuesto;
    }
    public int getCantidadDeportes() {
        return CantidadDeportes;
    }
    public void setCantidadDeportes(int CantidadDeportes) {
        this.CantidadDeportes = CantidadDeportes;
    }
    public Deporte[] getVecDeporte() {
        return Vec;
    }
    public void setVecDeporte(Deporte[] Vec) {
        this.Vec = Vec;
    }
}