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
public class Practico extends Curso{
    private double N1,N2;
    public Practico(int C, String N, int T){
        super(C,N,T);
        this.N1=0;
        this.N2=0;
    }
    public Practico(int C, String N, int T,double Uno,double Dos){
        super(C,N,T);
        this.N1=Uno;
        this.N2=Dos;
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
    @Override
    public void CalcularDefinitiva(){
        this.setDefCurso((N1*0.60)+(N2*0.40));
    }
    @Override
    public String InformacionCurso(){
        String I="N° Curso: "+this.getCodCurso()+"\n Nombre:"+this.getNomCurso()+"\n Tipo: Practico"+""
                + "\nNotas: "+"\nPracticas durante el semestre: "+N1+"\nProyecto Final: "+N2+"\nDefinitiva: "+this.getDefCurso();
        return(I);
    }
}
