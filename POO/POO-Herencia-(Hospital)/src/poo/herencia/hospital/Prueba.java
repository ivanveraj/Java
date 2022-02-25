/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.herencia.hospital;

/**
 *
 * @author MILE-IVA
 */
public class Prueba extends Paciente{
    private long Identificador;
    private int Tipo,Resultado1,Resultado2,Estado;
    public Prueba(long I,long D, int T){
        super(I,D,T);
        this.Resultado1=0;
        this.Resultado2=0;
        this.Estado=1;

    }
    public long getIdentidicador() {
        return(this.Tipo);
    }
    public void setIdentificador(long Identificador) {
        this.Identificador=Identificador;
    }
    public int getTipo() {
        return(this.Tipo);
    }
    public void setTipo(int Tipo) {
        this.Tipo=Tipo;
    }
    public int getResultado1() {
        return(this.Resultado1);
    }
    public int getEstado() {
        return Estado;
    }
    public void setEstado(int Estado) {
        this.Estado=Estado;
    }
    public void setResultado1(int T) {
        this.Resultado1=T;
    }
    public int getResultado2() {
        return(this.Resultado2);
    }
    public void setResultado2(int T) {
        this.Resultado2=T;
    }
    public String Resultado(){
        if(this.Resultado1==1&&Resultado2==1){
            return("Positivo");
        }
        if(this.Resultado1==1&&Resultado2==2){
            return("Posible");
        }
        if(this.Resultado1==2&&Resultado2==2){
            return("Negativo");
        }
        if(this.Resultado1==2&&Resultado2==1){
            return("Posible");
        }
        return("Incoherencia");
    }
}
    
    

