/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.herencia.fecha;
import java.util.*;
/**
 *
 * @author MILE-IVA
 */
public class POOHerenciaFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        Fecha F=new Fecha();
        int d,m,a,h,mi,s;
        
        
        System.out.println("Digite fecha");

        /*System.out.println("Dia de (1-31)");
        d=sn.nextInt();
        System.out.println("Mes (0-11)");
        m=sn.nextInt();
        System.out.println("Año (1900+(Numero))");
        a=sn.nextInt();
        System.out.println("Hora");
        h=sn.nextInt();
        System.out.println("Minutos de ");
        mi=sn.nextInt();
        System.out.println("Segundos de ");
        s=sn.nextInt();*/
        Fecha Fu=new Fecha(2020,4,22,15,6,0);

        System.out.println("Fecha en Formato Sistema Dia/Mes/Año "+F.FormatoDMA());
        System.out.println("Fecha en Formato Sistema Hora/Minutos/Segundos "+F.FormatoHMS());
        System.out.println("Fecha en Formato Usuario Dia/Mes/Año "+Fu.FormatoUsuarioDMA());
        System.out.println("Diferencia entre Fechas "+F.DiferenciaFechas(Fu));
        System.out.println("Diferencia entre Tiempo "+F.DiferenciaTiempo(Fu));
    }
    
}
