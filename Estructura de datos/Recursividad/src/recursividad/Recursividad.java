/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Recursividad {
public static int Factorial(int X){
        if(X==0){
            return(1);
        }
        return(X*Factorial(X-1));
}
    public static int Factorial2(int X){
        int F=1, i;
        for(i=1;i<=X;i++){
            F=F*i;
        }
        return(F);
}
    public static void main(String[] args) {
        int N;
        long TInicio, TFin, Tiempo, TInicio2, TFin2, Tiempo2; 
        Scanner sn=new Scanner(System.in);
        System.out.println("Digite un numero");
        N=sn.nextInt();
        System.out.println("Factorial con recursividad");
        
        MemoryMXBean mbean = ManagementFactory.getMemoryMXBean();
        MemoryUsage beforeHeapMemoryUsage = mbean.getHeapMemoryUsage();

        MemoryUsage afterHeapMemoryUsage = mbean.getHeapMemoryUsage();
        
        TInicio = System.currentTimeMillis();
        System.out.println(Factorial(N));
        TFin = System.currentTimeMillis();
        Tiempo=TFin - TInicio;
        System.out.println("Tiempo de ejecución en milisegundos: " +Tiempo);
        long Consumo= afterHeapMemoryUsage.getUsed() - beforeHeapMemoryUsage.getUsed();
        System.out.println("Total consumed Memory:" +Consumo);
        
        
        System.out.println("Factorial sin recursividad");
        TInicio2 = System.currentTimeMillis();
        System.out.println(Factorial2(N));
        TFin2 = System.currentTimeMillis();
        Tiempo2=TFin2 - TInicio2;
        System.out.println("Tiempo de ejecución en milisegundos: " +Tiempo2);
        
        
        
        
    }
    
    
}
