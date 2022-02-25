/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chance;
import java.util.*;
/**
 *
 * @author PC-JIVJ
 */
public class Sorteo {
    private ArrayList<Tiquete> Tique;
    private int Numero,N1,N2,N3,Estado;
    private Date Fecha;
    public Sorteo(Date F, int N){
        this.Fecha=F;
        this.Numero=N;
        this.N1=-1;
        this.N2=-1;
        this.N3=-1;
        this.Estado=0;
        Tique=new ArrayList <Tiquete>();
    }
    public int BuscarT(int X){
        int B=Tique.size();
        for(int i=0;i<B;i++){
            if(Tique.get(i).getNumero()==X){
                return(i);
            }
        }
        return(-1);
    }
    public String ConsultarGanadorS(){
        for(int i=0;i<this.Tique.size();i++){
            return(Tique.get(i).Consulta2(N1,N2,N3));
            }
        return("");
    }
    public String CrearTiqueteD(int N,int N1,int N2,int N3,int T,int V){
        if(BuscarT(N)!=-1){
            Date F=new Date();
            Tique.add(new Directo(N,N1,N2,N3,F,1,V));
            return("Se creo correctamente");
        }
        return("Error chance ya existe");
    }
    public String CrearTiqueteC(int N,int N1,int N2,int N3,int T,int V){
        if(BuscarT(N)!=-1){
            Date F=new Date();
            Tique.add(new Combinado(N,N1,N2,N3,F,1,V));
            return("Se creo correctamente");
        }
        return("Error chance ya existe");
    }
    public String Consultar(int X){
        int B=BuscarT(X);
        if(B!=-1){
            return(Tique.get(B).Consulta(N1,N2,N3));
        }
        return("No existe numero de tiquete");
    }
    public void AsignarNumeros(int A,int B,int C){
        this.N1=A;
        this.N2=B;
        this.N3=C;
        this.Estado=1;
    }
    public String Informacion(){
        String I="Numero: "+this.Numero+" Fecha: "+this.Fecha+" Numeros \nN1:"+this.N1+""
                + "\nN2:"+this.N2+"\nN3:"+this.N3;
        return(I);
    }
    public int getNumero() {
        return Numero;
    }
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }
    public int getN1() {
        return N1;
    }
    public void setN1(int N1) {
        this.N1 = N1;
    }
    public int getN2() {
        return N2;
    }
    public void setN2(int N2) {
        this.N2 = N2;
    }
    public int getN3() {
        return N3;
    }
    public void setN3(int N3) {
        this.N3 = N3;
    }
    public int getEstado() {
        return Estado;
    }
    public void setEstado(int Estado) {
        this.Estado = Estado;
    }
    public Date getFecha() {
        return Fecha;
    }
    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
}
