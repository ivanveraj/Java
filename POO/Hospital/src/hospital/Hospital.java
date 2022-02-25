/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;
import java.util.*;
/**
 *
 * @author MILE-IVA
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn=new Scanner (System.in);
        System.out.println("Creando registro de un paciente");
        Paciente E=new Paciente ();
        System.out.println("Digite el Identificador del paciente");
        E.setIdentificador(sn.nextLong());
        System.out.println("Digite el Documento del paciente");
        E.setDocumento(sn.nextLong());
        System.out.println("Realizando la primera prueba");
        E.setTipo1(1);
        System.out.println("Resultado de la primera prueba\n[1]Positivo\n[2]Negativo");
        E.setResultado1(sn.nextInt());
        System.out.println("Realizando la segunda prueba");
        E.setTipo1(2);
        System.out.println("Resultado de la segunda prueba\n[1]Positivo\n[2]Negativo");
        E.setResultado2(sn.nextInt());
        System.out.println("Informacion completa del Paciente");
        E.Informacion();
        
        
        
        
    }
    
}
