/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase6.pkg2;
import java.util.Scanner;

/**
 *
 * @author iser
 */
public class POOClase62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn=new Scanner (System.in);
        double Px,Py;
        int N;
        System.out.println("Digite cuantos puntos");
        N=sn.nextInt();
        Punto V[]=new Punto[N];
        for(int i=0;i<N;i++){
            System.out.println("Creando Punto "+(i+1));
            System.out.println("Digite X("+i+")");
            Px=sn.nextDouble();
            System.out.println("Digite Y("+i+")");
            Py=sn.nextDouble();
            V[i]=new Punto(Px,Py);
        }
        for(int i=0;i<N;i++){
            for(int j=N-1;j>i;j--){
                V[i].CalD(V[j]);
                System.out.println("Distancia entre P["+i+"] y de P["+j+"] es de = "+V[i].getD());
            }
        }
        /*
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                V[i].CalD(V[j]);
                System.out.println("Distancia entre P["+i+"] y de P["+j+"] es de = "+V[i].getD());
            }
        }*/
        
    }
    
}
