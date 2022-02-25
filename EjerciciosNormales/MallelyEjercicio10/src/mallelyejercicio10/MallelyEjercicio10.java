package mallelyejercicio10;
public class MallelyEjercicio10{
    public static void main(String[] args) {
        Contador C=new Contador();
        int NumEntero;
        int Rm=5,RM=10;
        System.out.println("Numeros aleatorio entre 5 y 10");
        for(int i=0;i<20;i++){
             NumEntero=(int)Math.floor(Math.random()*(RM-Rm+1)+Rm);
             System.out.println("Entero:"+NumEntero);
             C.Contador(NumEntero);
        }
        C.ImprimirInfo();
    }
}
