/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasolinerias;

import java.util.ArrayList;

/**
 *
 * @author PC-JIVJ
 */
public class Estacion{
    private ArrayList<Factura> F;
    private ArrayList<Gasolina> G;
    private ArrayList<ACPM> AC;
    private int Codigo,CantG,CantA,TotalC,N=1010,T;
    private double Recaudado;
    public Estacion(int Cod,int CantG,int CantA){
        this.Codigo=Cod;
        this.CantA=CantA;
        this.CantG=CantG;
        this.Recaudado=0;
        this.TotalC=(this.CantA+this.CantG);
    }
    public int BuscarF(int X){
        int B=F.size();
        for(int i=0;i<B;i++){
            if(F.get(i).getNumeroF()==X){
                return(i);
            }
        }
        return(-1);
    }
    public String Recargar(int ACPM,int Gasolina){
        setCantA((getCantA()+ACPM));
        setCantG((getCantG()+Gasolina));
        return("Recarga completada");
    }
    public String VentaACPM(int Cod,int CantGV,int CantAV,int CantG,int CantA){
        ACPM A=new ACPM(N,Cod,CantGV,CantAV,CantG,CantA);
        N++;
        T++;
        return(A.Venta());
    }
    public String VentaGasolina(int Cod,int CantGV,int CantAV,int CantG,int CantA){
        Gasolina A=new Gasolina(N,Cod,CantGV,CantAV,CantG,CantA);
        N++;
        T++;
        return(A.Venta());
    }
    public String Informacion(){
        return("Codigo de estacion: "+this.Codigo+"\nCantidad de galones de gasolina: "+this.CantG+""
                + "\nCantidad de galones de ACPM: "+this.CantA+"\nTotal Recaudado: "+getRecaudado());
    }
    public String InformacionFac(){
        for(int i=0;i<T;i++){
            System.out.println(AC.get(i).InformacionF());
            System.out.println(G.get(i).InformacionF());
            return("Facturas");
        }
        return("No existe facturas");
    }
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    public int getCantG() {
        return CantG;
    }
    public void setCantG(int CantG) {
        this.CantG = CantG;
    }
    public int getCantA() {
        return CantA;
    }
    public void setCantA(int CantA) {
        this.CantA = CantA;
    }
    public double getRecaudado() {
        return Recaudado;
    }
    public void setRecaudado(double Recaudo) {
        this.Recaudado=Recaudado;
    }
    public int getTotalC() {
        return TotalC;
    }
    public void setTotalC(int TotalC) {
        this.TotalC = TotalC;
    }
     
}
