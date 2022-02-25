/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.parcial2;

/**
 *
 * @author Usuario
 */
public class Inmueble {
    private int idenclient;
    private int Estrato;
    private String direc;
    public Inmueble (int id,int est,String di){
        this.idenclient=id;
        this.Estrato=est;
        this.direc=di;
    }
    public void setId(int idc) {
        this.idenclient = idc;
    }

    public void setDir(String dir) {
        this.direc = dir;
    }
    
    public void setEstrato(int est) {
        this.Estrato = est;
    }
    
    public int getEstrato() {
        return (this.Estrato);
    }
    
    public String getDir() {
        return (this.direc);
    }
     
     public int getId() {
        return (this.idenclient);
    }

    
    public String inform (){
      String P="";
      P+="El inmueble del cliente identificado con id "+this.idenclient+""
              + "Tiene una direccion de "+this.direc+" Con estracto NÂ°"+this.Estrato;
      return(P);
    }
    
}
