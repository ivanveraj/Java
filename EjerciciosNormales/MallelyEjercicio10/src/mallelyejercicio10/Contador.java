package mallelyejercicio10;
public class Contador {
    private int N5,N6,N7,N8,N9,N10;
    public Contador(){
        this.N5=0;
        this.N6=0;
        this.N7=0;
        this.N8=0;
        this.N9=0;
        this.N10=0;
    }
    public void ImprimirInfo(){
        System.out.println("\nConteo de numeros");
        System.out.println("N5: "+N5+"\nN6: "+N6+"\nN7: "+N7+"\nN8: "+N8
                +"\nN9: "+N9+"\nN10: "+N10);
    }
    public void Contador(int N){
        if(N==5){
            this.N5++;
        }else if(N==6){
            this.N6++;
        }else if(N==7){
            this.N7++;
        }else if(N==8){
            this.N8++;
        }else if(N==9){
            this.N9++;
        }else if(N==10){
            this.N10++;
        }
    }
    
}
