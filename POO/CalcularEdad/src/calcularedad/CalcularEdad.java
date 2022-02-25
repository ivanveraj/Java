package calcularedad;

import java.util.Scanner;

public class CalcularEdad {

    public static void main(String[] args) {
        
        Scanner sn=new Scanner(System.in);
        System.out.println("Prueba");
        ClassDate D=new ClassDate("Anderson",2002,10,8);
        D.Calcular();
        String Nombre;
        int An, Dia, Mes;
        System.out.println("Digite su nombre");
        sn.nextLine();
        Nombre=sn.nextLine();
        System.out.println("Digite su año de nacimiento");
        An=sn.nextInt();
        System.out.println("Digite su mes de nacimiento");
        Mes=sn.nextInt();
        System.out.println("Digite su dia de nacimiento");
        Dia=sn.nextInt();
        ClassDate X=new ClassDate(Nombre,An,Mes,Dia);
        X.Calcular();
    }
    
}
