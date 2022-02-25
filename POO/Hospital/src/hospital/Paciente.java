package hospital;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILE-IVA
 */
public class Paciente {
    private long Identificador, Documento;
    private int Tipo1,Tipo2,Resultado1,Resultado2;
    public Paciente(){
        this.Identificador=0;
        this.Documento=0;
        this.Tipo1=0;
        this.Tipo2=0;
        this.Resultado1=0;
        this.Resultado2=0;

    }
    public long getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(long Identificador) {
        this.Identificador = Identificador;
    }

    public long getDocumento() {
        return Documento;
    }

    public void setDocumento(long Documento) {
        this.Documento = Documento;
    }

    public int getTipo1() {
        return Tipo1;
    }

    public void setTipo1(int Tipo) {
        this.Tipo1=Tipo;
    }
    public int getTipo2() {
        return Tipo2;
    }

    public void setTipo2(int Tipo) {
        this.Tipo2=Tipo;
    }
    
    public int getResultado1() {
        return(this.Resultado1);
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
    public void Informacion(){
        System.out.println("El identificador del paciente es "+this.Identificador+" su numero de documento es "+this.Documento+" Se realizaron los dos tipos"
                + " de prueba y su resultado fue "+Resultado());
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
