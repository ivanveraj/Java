/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coldeportes;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Coldeportes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Digite la cantidad de competencias");
        int X=sn.nextInt();
        Control C=new Control(X);
        C.Llenar();
        sn.nextLine();
        System.out.println("Digite la temporada para acceder a la competencia y llenar la informacion\nEjemplo: 2021-2");
        String T=sn.nextLine();
        C.LlenarDeporte(T);
        C.PromedioPresupuestos();
        C.CompetenciasNacionales();
        System.out.println("Digite la temporada para acceder a la competencia y conocer el deporte con menor duracion de sets");
        String Cod=sn.nextLine();
        C.DeporteMenorDuracion(Cod);
    }
    
}
