/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.parcial2;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class Control{
    private Registro In[];
    private int T, Tmax;
    public Control(){
        this.T=0;
        this.Tmax=20;
    }
    public void RegistroInmueble(int Mes, int Anio, int Lec,int Id, String Dirr, int E){
        this.In[T]=new Registro(Mes,Anio,Lec,Id,E,Dirr);
        T++;
    }
    public double ValorFactura(int Id){
        double Valor;
        for(int i=0;i<this.T;i++){
            if(this.In[i].getEstrato()==1 || this.In[i].getEstrato()==2){
                Valor=(this.In[i].getLecturaI()-this.In[i].getLecturaF())*500;
                return(Valor);
            }
            if(this.In[i].getEstrato()==3 || this.In[i].getEstrato()==4){
                Valor=(this.In[i].getLecturaI()-this.In[i].getLecturaF())*1000;
                return(Valor);
            }
            if(this.In[i].getEstrato()==5 || this.In[i].getEstrato()==6){
                Valor=(this.In[i].getLecturaI()-this.In[i].getLecturaF())*1500;
                return(Valor);
            }
        }
        return(-1);
}
    }
