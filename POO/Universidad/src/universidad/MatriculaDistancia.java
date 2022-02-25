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
public class MatriculaDistancia extends Matricula{
    public MatriculaDistancia(int Num, int D, int E, int M, String N){
        super(Num,D,E,M,N);
    }
    @Override
    public void CalcularValor(){
        if(this.getEstrato()>=1&&this.getEstrato()<=3){
            this.setValor(900000/2);
        }else if(this.getEstrato()>=4&&this.getEstrato()<=6){
            this.setValor(900000);
        }
    }
}
