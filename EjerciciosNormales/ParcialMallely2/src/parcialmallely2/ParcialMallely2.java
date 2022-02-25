
package parcialmallely2;

import java.util.Scanner;

public class ParcialMallely2 {
    public static void MaximoComunDivisor() {
        Scanner sn=new Scanner(System.in);
        int mcd=0,R=1;
        for(int i=1;i<=3;i++){
            System.out.println("Digite un numero:");
            int N=sn.nextInt();
            if(i==1){
                mcd=N;
            }else{
                do{
                    R=mcd%N;
                    if(R!=0){
                        mcd=N;
                        N=R;
                    }else{
                        mcd=N;
                    }
                }while(R!=0);
            }
        }
        System.out.println("MCD: "+mcd);
        }


    public static void main(String[] args) {
        MaximoComunDivisor();
        /*
        Si digita los siguientes numeros el resultado que debe aparecer es:
        (315,945,1575)=315
        (1750,1960,3080)=70
        */
    }
    
}
