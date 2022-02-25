/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase6.trabajo;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author MILE-IVA
 */
public class POOClase6Trabajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Programa Orientado a objetos que halla la pendiente de dos rectas,\n con el maximo de almacenamiento de 4 Puntos (X1,X2,Y1,Y2) y que \nverifique si es una pendiente positiva o negativa,\n"+
                "ademas debe validar el cooeficiente para que no sea indefinido (X1=X2), si\n lo es el programa se cerrara, tambien este programa almacena la cantidad de pendientes que usted realice el \ncalculo, y todo esta informacion se mostrara al final de dicho proceso");
        Scanner L = new Scanner(System.in);
        int Cont=1;
        System.out.println("Digite el numero de repeticiones que desea almacenar en el vector \n(Estas seran almacenadas dentro del mismo y se mostraran al final)");
        int N=L.nextInt();
        double V[]=new double[N];
        if(N==0){
            System.out.println("Hasta luego");
        }else{
            int i=0;
        do{
        double x,y,F;
        System.out.println("Digite X1");
        x=L.nextDouble();
        System.out.println("Digite Y1");
        y=L.nextDouble();
        Coordenadas c1= new Coordenadas(x, y);
        System.out.println("Digite X2");
        x=L.nextDouble();
        System.out.println("Digite Y2");
        y=L.nextDouble();
        Coordenadas c2= new Coordenadas(x,y);
        c1.pendiente(c2);
        if(c1.getX()==c2.getX()){
            System.out.println("El coeficiente es indefinido, ya que la division por cero no existe");
        }else{
            if(c1.Verificacion()==true){ 
            System.out.println("El resultado es: "+c1.getP()+" la pendiente es Positiva");
            F=c1.Almacenamiento();
            V[i]=F;
        }else{
            System.out.println("El resultado es: "+c1.getP()+" la pendiente es Negativa");
            F=c1.Almacenamiento();
            V[i]=F;
        }      
        }
        i++;
        Cont++;
        }while(Cont<=N);
        }
        for(int k=0;k<N;k++){
            System.out.println("Las pendientes almacenadas son:"+V[k]);
        }
        System.out.println("Hasta luego");
    }

   
    
    
}
        
        
        
        
        
        
        
    
    

