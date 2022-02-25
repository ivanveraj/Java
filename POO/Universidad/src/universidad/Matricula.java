/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;
import java.util.Date;
/**
 *
 * @author PC-JIVJ
 */
public class Matricula extends Estudiante {
    private int Numero;
    private Date Fecha;
    private boolean Estado;
    private double Valor;
    public Matricula(int Num, int D, int E, int M, String N){
        super(D,E,M,N);
        this.Numero=Num;
        this.Fecha=new Date();
        this.Estado=true;
        CalcularValor();
    }
    public int getNumero() {
        return Numero;
    }
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }
    public Date getFecha() {
        return Fecha;
    }
    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    public boolean isEstado() {
        return Estado;
    }
    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    public double getValor() {
        return Valor;
    }
    public void setValor(double Valor) {
        this.Valor = Valor;
    }
    public void CalcularValor(){
        if(this.getEstrato()>=1&&this.getEstrato()<=2){
            this.Valor=900000/2;
        }else if(this.getEstrato()>=3&&this.getEstrato()<=4){
            this.Valor=900000;
        }else if(this.getEstrato()>=5&&this.getEstrato()<=6){
            this.Valor=900000*2;
        }
    }
    public String InfoMatricula(){
        String I=this.Informacion();
        I+="\nNumero de matricula: "+this.Numero+"\nFecha: "+this.Fecha+"\nEstado de la matricula: "+((this.Estado)?"Pendiente":"Cancelada")+""
                + "Valor de la matricula: "+this.Valor;
        return(I);
    }
    
}
