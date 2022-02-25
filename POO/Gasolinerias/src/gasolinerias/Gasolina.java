/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasolinerias;
import java.util.*;
/**
 *
 * @author PC-JIVJ
 */
public class Gasolina extends Factura {
    private Date F;
    public Gasolina(int N,int Cod,int CantGV,int CantAV,int CantG,int CantA){
        super(N,Cod,CantGV,CantAV,CantG,CantA);
        F=new Date();
    }
    
    public String Fecha(){
        return(F.getDate()+"/"+(F.getMonth()+1)+"/"+(F.getYear()+1900));
    }
    @Override
    public String Venta(){
        if(this.getCantGGV()>this.getCantG()){
            this.setRecaudado(this.getRecaudado()+(this.getCantG()*8500));
            System.out.println(this.getRecaudado()+"Pendiente");
            this.setCantG(this.getCantG()-this.getCantG());
            return("Numero de Factura:"+this.getNumeroF()+"\nFecha de venta: "+Fecha()+"\n Cantidad de galones de ACPM: "+this.getCantG()+""
                + "\nPrecio por galon: "+8500+"\nTotal a pagar: "+(this.getCantG()*8500));
        }else{
            this.setRecaudado(this.getRecaudado()+(this.getCantGGV()*8500));
            this.setCantG(this.getCantG()-this.getCantGGV());
            return("Numero de Factura:"+this.getNumeroF()+"\nFecha de venta: "+Fecha()+"\n Cantidad de galones de gasolina: "+this.getCantGGV()+""
                + "\nPrecio por galon: "+8500+"\nTotal a pagar: "+(this.getCantGGV()*8500));
        }
    }
    public String InformacionF(){
        return("Numero de Factura: "+this.getNumeroF()+"\nFecha de venta"+FechaF()+"\nCantidad de galones de gasolina vendidos: "+this.getCantGGV());
    }
}
