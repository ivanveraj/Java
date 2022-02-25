/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author PC-JIVJ
 */
public class Teorico extends Curso{
    private double N1,N2,N3,N4;
    public Teorico(int C, String N, int T){
        super(C,N,T);
        this.N1=0;
        this.N2=0;
        this.N3=0;
        this.N4=0;
    }
    public Teorico(int C, String N, int T,double Uno,double Dos, double Tres, double Cuatro){
        super(C,N,T);
        this.N1=Uno;
        this.N2=Dos;
        this.N3=Tres;
        this.N4=Cuatro;
        /*Definitiva*/
        CalcularDefinitiva();
    }
    public double getN1() {
        return N1;
    }
    public void setN1(double N1) {
        this.N1 = N1;
    }
    public double getN2() {
        return N2;
    }
    public void setN2(double N2) {
        this.N2 = N2;
    }
    public double getN3() {
        return N3;
    }
    public void setN3(double N3) {
        this.N3 = N3;
    }
    public double getN4() {
        return N4;
    }
    public void setN4(double N4) {
        this.N4 = N4;
    }
    @Override
    public void CalcularDefinitiva(){
        this.setDefCurso((N1*0.25)+(N2*0.25)+(N3*0.2)+(N4*0.30));
    }
    @Override
    public String InformacionCurso(){
        String I="N° Curso: "+this.getCodCurso()+"\n Nombre:"+this.getNomCurso()+"\n Tipo: Teorico"+""
                + "\nNotas: "+"\nExamen I: "+N1+"\nExamen II: "+N2+"\nQuiz y trabajos: "+N3+""
                + "\nExamen Final: "+N4+"\nDefinitiva: "+this.getDefCurso();
        return(I);
    }
}
