package mallelyocho;
import java.util.Scanner;
public class MallelyOcho {
    public static int MCM(int N1, int N2, int N3){
        int i=2;
        int mcm=1;
        while(i <=N1 || i<=N2 || i<=N3){
            if(N1%i==0 || N2%i==0 || N3%i==0){
            mcm=mcm*i;
                if(N1%i==0){
                    N1=N1/i;
                }
                if(N2%i==0){
                    N2=N2/i;
                }
                if(N3%i==0){
                    N3=N3/i;
                }
            }
            else{
                i=i+1;     
            }
        }
        return (mcm);
    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
       int N1,N2,N3;
        System.out.println("Ingrese primer numero:");
        N1=sn.nextInt();
        System.out.println("Ingrese segundo numero:");
        N2=sn.nextInt();
        System.out.println("Ingrese tercer numero:");
        N3=sn.nextInt();
        System.out.println("El MCM  de ("+N1+","+N2+","+N3+")es = " +MCM(N1,N2,N3));   
    }
    
}
