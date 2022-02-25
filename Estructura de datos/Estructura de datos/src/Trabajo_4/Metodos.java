/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo_4;

import Pila.Pila;
import Trabajo_1.*;
import Trabajo_3.*;
import javax.swing.JOptionPane;
public class Metodos {
    private ListaDoble LD,LM,LA;
    private Trabajo_1.Metodo M;
    private Trabajo_2.Metodos MM;
    private Trabajo_3.Metodox MMM;
    public Metodos(int TamVP, int TamVM, int TamVA, int TamPP, int TamPM, int TamPA, int TamCP, int TamCM, int TamCA){
        this.LD=new ListaDoble();
        this.LM=new ListaDoble();
        this.LA=new ListaDoble();
        this.M=new Metodo(TamVP,TamVM,TamVA);
        this.MM=new Trabajo_2.Metodos(TamPP,TamPM,TamPA);
        this.MMM=new Metodox(TamCP,TamCM,TamCA);
    }
    public String RangoPlantasPrecio() {
        String RangoPlantas="Rango de plantas entre 13000 y 21000 Pila\n";
        Pila<Plantas[]> X=(Pila<Plantas[]>)this.LD.getInicio().getSiguiente().getElemento();
        if (!X.estaVacia()) {
            int Tam= X.getElemento().length;
            Plantas[] auxP = new Plantas[Tam];
            auxP=X.getElemento();
            for (int i = 0; i < auxP.length; i++) {
                if (auxP[i].getPrecio()>=13000 && auxP[i].getPrecio()<=21000) {
                    RangoPlantas+=auxP[i].Informacion();
                }
            }
        }
        return RangoPlantas;
    }
    public String RangoMaterasPrecio() {
        String RangoMateras="Rango de materas entre 13000 y 21000 Pila\n";
        Pila<Materas[]> X=(Pila<Materas[]>)this.LM.getInicio().getSiguiente().getElemento();
        if(!X.estaVacia()) {
            int Tam= X.getElemento().length;
            Materas[] auxP = new Materas[Tam];
            auxP=X.getElemento();
            for (int i = 0; i < auxP.length; i++) {
                if (auxP[i].getPrecio()>=13000 && auxP[i].getPrecio()<=21000) {
                    RangoMateras+=auxP[i].Informacion();
                }
            }
        }
        return RangoMateras;
    }
    public String RangoAbonosPrecio() {
        String RangoAbonos="Rango de abonos entre 13000 y 21000 Pila\n";
        Pila<Abonos[]> X=(Pila<Abonos[]>)this.LA.getInicio().getSiguiente().getElemento();
        if (!X.estaVacia()) {
            int Tam= X.getElemento().length;
            Abonos[] auxP = new Abonos[Tam];
            auxP=X.getElemento();
            for (int i = 0; i < auxP.length; i++) {
                if (auxP[i].getPrecio()>=13000 && auxP[i].getPrecio()<=21000) {
                    RangoAbonos+=auxP[i].Informacion();
                }
            }
        }
        return RangoAbonos;
    }
    public String ImprimirVectorP() {
        if (this.LD.estaVacia()==false) {
            NodoDoble<NodoDoble> nodoActual = this.LD.getInicio();
            Plantas[] P = (Plantas[]) nodoActual.getElemento();
            String R="Vector planta\n";
            int i=0;
            while(i<P.length){
                R+=P[i].Informacion();
                i++;
            }
            return (R);
        }
        return "No existe informacion";
    }
    
    public String ImprimirVectorM() {
        if (!this.LM.estaVacia()) {
            NodoDoble<NodoDoble> nodoActual = this.LM.getInicio();
            Materas[] M = (Materas[]) nodoActual.getElemento();
            String R="Vector matera\n";
            int i=0;
            while(i<M.length){
                R+=M[i].Informacion();
                i++;
            }
            return (R);
        }
        return "No existe informacion";
    }
    public String ImprimirVectorA() {
        if (!this.LA.estaVacia()) {
            NodoDoble<NodoDoble> nodoActual = this.LA.getInicio();
            Abonos[] A = (Abonos[]) nodoActual.getElemento();
            String R="Vector abono\n";
            int i=0;
            while(i<A.length){
                R+=A[i].Informacion();
                i++;
            }
            return (R);
        }
        return "No existe informacion";
    }
    
    public void ImprimirVectores(){
        JOptionPane.showMessageDialog(null, this.ImprimirVectorP());
        System.out.println("Paso 1");
        JOptionPane.showMessageDialog(null, this.ImprimirVectorM());
        System.out.println("Paso 2");
        JOptionPane.showMessageDialog(null, this.ImprimirVectorA());
        System.out.println("Paso 3");
    }
    public void ImprimirPilas(){
        JOptionPane.showMessageDialog(null, this.RangoPlantasPrecio());
        System.out.println("Paso 1");
        JOptionPane.showMessageDialog(null, this.RangoMaterasPrecio());
        System.out.println("Paso 2");
        JOptionPane.showMessageDialog(null, this.RangoAbonosPrecio());
        System.out.println("Paso 3");
    }
    
    public void ListaDoblePlanta(){
        JOptionPane.showMessageDialog(null, "Ingreso de datos vectores");
        this.M.IngresarInfo();
        JOptionPane.showMessageDialog(null, "Ingreso de datos pilas");
        this.MM.IngresarInformacion2();
        JOptionPane.showMessageDialog(null, "Ingreso de datos colas");
        this.MMM.IngresoInformacion2();
        this.LD.insertarSiguiente(M.getP());
        this.LD.insertarSiguiente(MM.getPilaPlanta());
        this.LD.insertarSiguiente(MMM.getColaPlantassolares());
    }
    public void ListaDobleMatera(){
        this.LM.insertarSiguiente(M.getM());
        this.LM.insertarSiguiente(MM.getPilaMatera());
        this.LM.insertarSiguiente(MMM.getColaMaterasCera());
    }
    public void ListaDobleAbono(){
        this.LA.insertarSiguiente(M.getA());
        this.LA.insertarSiguiente(MM.getPilaAbono());
        this.LA.insertarSiguiente(MMM.getColaAbonos15());
    }
}
