package ed2;
import java.util.*;
public class ED2 {
    /*public static boolean Par(int X){
        if(X%2==0){
            return(true);
        }else{
            return(false);
        }
    }*/
    public static String Numero(int X){
        if(X==0){
            return("Numero neutro");
        }else if(X<0){
            return("Numero negativo");
        }else if(X>0){
            return("Numero positivo");
        }
        return(null);
    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Digite un numero");
        int X=sn.nextInt();
        System.out.println(Numero(X));
        /*System.out.println(Par(X));*/
    }
    
}
