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
public abstract  class Curso {
    private int CodCurso;
    private String NomCurso;
    private int TipCurso;
    private double DefCurso;
    public Curso(int C,String N, int T){
        this.CodCurso=C;
        this.DefCurso=0;
        this.NomCurso=N;
        this.TipCurso=T;
    }
    public int getCodCurso() {
        return CodCurso;
    }
    public void setCodCurso(int CodCurso) {
        this.CodCurso = CodCurso;
    }
    public String getNomCurso() {
        return NomCurso;
    }
    public void setNomCurso(String NomCurso) {
        this.NomCurso = NomCurso;
    }
    public int getTipCurso() {
        return TipCurso;
    }
    public void setTipCurso(int TipCurso) {
        this.TipCurso = TipCurso;
    }
    public double getDefCurso() {
        return DefCurso;
    }
    public void setDefCurso(double DefCurso) {
        this.DefCurso = DefCurso;
    }
    public abstract void CalcularDefinitiva();
    public abstract String InformacionCurso();

}
