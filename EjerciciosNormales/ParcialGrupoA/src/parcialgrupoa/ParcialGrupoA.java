package parcialgrupoa;
import java.util.*;

public class ParcialGrupoA {

    public static void main(String[] args) {
        int Menu;
        double AreaMayor,AreaMenor,L;
        Scanner sn=new Scanner (System.in);
        Figura F=new Figura();
        do{
            System.out.println("[1]Crear Eclipse\n[2]Crear Cuadrado\n"
                    + "[3]Calcular Area\n[4]Calcular Perimetro cuadrado\n[5]Aproximacion\n[6]Salir");
            Menu=sn.nextInt();
            switch(Menu){
                case 0:{
                    F.CrearEclipse(7.5,3);
                    F.CrearCuadrado(5);
                }break;
                case 1:{
                    System.out.println("Digite Area Mayor del Eclipse: ");
                    AreaMayor=sn.nextInt();
                    System.out.println("Digite Area Menor del Eclipse: ");
                    AreaMenor=sn.nextInt();
                    F.CrearEclipse(AreaMayor,AreaMenor);
                }break;
                case 2:{
                     System.out.println("Digite el lado del Cuadrado: ");
                     L=sn.nextInt();
                     F.CrearCuadrado(L);
                }break;
                case 3:{
                    F.Area();
                }break;
                case 4:{
                    F.Perimetro();
                }break;
                case 5:{
                    System.out.println("Generando aproximacion de las figuras");
                    F.Recursividad();
                }break;
                case 6:{
                    System.out.println("Muchas gracias...");
                }break;
            }
        }while(Menu!=5);
    }
    
}
