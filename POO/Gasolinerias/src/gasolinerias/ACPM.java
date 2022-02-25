/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasolinerias;
import java.util.Date;
/**
 *
 * @author PC-JIVJ
 */
public class ACPM extends Factura{
    private Date F;
    public ACPM(int N,int Cod,int CantGV,int CantAV,int CantG,int CantA){
        super(N,Cod,CantGV,CantAV,CantG,CantA);
        F=new Date();
    }
    public String Fecha(){
        return(F.getDate()+"/"+(F.getMonth()+1)+"/"+(F.getYear()+1900));
    }
    @Override
    public String Venta(){
        if(this.getCantGAV()>this.getCantA()){
            this.setRecaudado(this.getRecaudado()+(this.getCantA()*7600));
            this.setCantA(this.getCantA()-this.getCantA());
            return("Numero de Factura:"+this.getNumeroF()+"\nFecha de venta: "+Fecha()+"\n Cantidad de galones de ACPM: "+this.getCantA()+""
                + "\nPrecio por galon: "+7600+"\nTotal a pagar: "+(this.getCantA()*7600));
        }else{
            this.setRecaudado(this.getRecaudado()+(this.getCantGAV()*7600));
            this.setCantA(this.getCantA()-this.getCantGAV());
            return("Numero de Factura:"+this.getNumeroF()+"\nFecha de venta: "+Fecha()+"\n Cantidad de galones de ACPM: "+this.getCantGAV()+""
                + "\nPrecio por galon: "+7600+"\nTotal a pagar: "+(this.getCantGAV()*7600));
        }
    }
    public String InformacionF(){
        return("Numero de Factura: "+this.getNumeroF()+"\nFecha de venta"+FechaF()+"\nCantidad de galones de ACPM vendidos: "+this.getCantGAV());
    }
}
