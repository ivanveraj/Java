/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author PC-JIVJ
 */
public class Control {
    private ArrayList<Matricula> ControlMatricula;
    public Control(){
        this.ControlMatricula=new ArrayList<Matricula>();
    }
    public int Buscar(int X){
        int N=ControlMatricula.size();
        for(int i=0;i<N;i++){
            if(ControlMatricula.get(i).getNumero()==X){
                return(i);
            }
        }
        return(-1);
    }
    public void CrearMatriculaP(int Num, int D, int E, int M, String N){
        ControlMatricula.add(new Matricula(Num,D,E,M,N));
    }
    public void CrearMatriculaD(int Num, int D, int E, int M, String N){
        ControlMatricula.add(new MatriculaDistancia(Num,D,E,M,N));
    }
    public String Imprimir(int X){
        int I=Buscar(X);
        if(I!=-1){
            return(ControlMatricula.get(I).InfoMatricula());
        }
        return("No existe");
    }
    public String Pagar(int X, double Y){
        int B=Buscar(X);
        if(B!=-1){
            if(ControlMatricula.get(B).isEstado()==false){
                return("Matricula ya pagada");
            }else{
                if(ControlMatricula.get(B).getValor()==Y){
                    ControlMatricula.get(B).setEstado(false);
                    return("Pago registrado");
                }else{
                    return("Inconsistencia en el pago");
                }
            }
        }
        return("No se asigno pago");
    }
    public void TotalMatriculas(){
        int T=ControlMatricula.size();
        for(int i=0;i<T;i++){
            System.out.println(ControlMatricula.get(i).InfoMatricula());
        }
    }
    public void TotalMatriculasIterator(){
        Iterator<Matricula> it=ControlMatricula.iterator();
        Matricula Numero;
        if(it.hasNext()){
            Numero=it.next();
            System.out.println(Numero.InfoMatricula());
        }
    }
} 
