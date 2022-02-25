/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

/**
 *
 * @author MILE-IVA
 */
public class Vehiculo {
    private long Doc, Placa;
    public Vehiculo(long D,long P){
        this.Doc=D;
        this.Placa=P;
    }
    public long getDoc() {
        return(this.Doc);
    }
    public void setDoc(long Doc) {
        this.Doc=Doc;
    }
    public long getPlaca() {
        return(this.Placa);
    }
    public void setPlaca(long Placa) {
        this.Placa=Placa;
    }
    public String Informacion(){
        return("El numero de documento: "+this.Doc+" y de placa: "+this.Placa);
    }
}
