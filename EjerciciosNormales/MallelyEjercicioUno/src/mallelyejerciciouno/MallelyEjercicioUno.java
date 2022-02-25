package mallelyejerciciouno;
import java.util.Scanner;
public class MallelyEjercicioUno {
    public static double SalarioNominal(double ValorH,int Horas){
        double SalarioN=ValorH*Horas;
        return(SalarioN);
    }
    public static double Retencion(double SalarioN){
        double RF=0;
        if(SalarioN>2000000){
            RF=0.10;
        }else if(SalarioN>=800000 && SalarioN<=2000000){
            RF=0.07;
        }else{
            RF=0.03;
        }
        return(RF);
    }
    public static String TotalSalario(String Nombre, double ValorH,int Horas){
        double SalarioN=SalarioNominal(ValorH,Horas);
        double RF=Retencion(SalarioN);
        double Total=SalarioN-(SalarioN*RF);
        
        return("Nombre empleado: "+Nombre+"\nEl total del salario es: "+Total+"\n"
                + "Salario nominal: "+SalarioN+"\nRetencion de fuente: "+RF*100+"%");
    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String Nombre;
        int Horas,i=0;
        double PrecioHora;
        System.out.println("Pruebas\n");
        System.out.println(TotalSalario("Ivan",80000,70)+"\n");
        System.out.println(TotalSalario("Jaider",60000,60)+"\n");
        System.out.println(TotalSalario("Mallely",50000,40)+"\n");
        System.out.println(TotalSalario("Andres",30000,30)+"\n");
        System.out.println(TotalSalario("Rogelio",40000,50)+"\n");
        while(i<5){
        System.out.println("Digite el nombre del trabajador");
        sn.nextLine();
        Nombre=sn.nextLine();
        System.out.println("Digite el precio por hora del empleado");
        PrecioHora=sn.nextDouble();
        System.out.println("Digite la cantidad de horas trabajadas");
        Horas=sn.nextInt();
        System.out.println(TotalSalario(Nombre,PrecioHora,Horas)+"\n");
        i++;
        }
        
    }
}
