/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chance;
import java.util.*;
/**
 *
 * @author PC-JIVJ
 */
public abstract class Tiquete extends Sorteo {
    private int Tipo, Valor;
    public Tiquete(int N,int N1,int N2,int N3, Date F,int T,int V){
        super(F,N);
        this.Tipo=T;
        this.Valor=V;
        AsignarNumeros(N1,N2,N3);
    }
    public abstract String Consulta(int A,int B,int C);
    public abstract String Consulta2(int A,int B,int C);
    public int getTipo() {
        return Tipo;
    }
    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }
    public int getValor() {
        return Valor;
    }
    public void setValor(int Valor) {
        this.Valor = Valor;
    }
}
