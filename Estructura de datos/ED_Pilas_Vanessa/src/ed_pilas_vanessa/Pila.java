package ed_pilas_vanessa;

public class Pila {
    private int P[];
    private int Tope;
    private int Tmax;
    public Pila(int X){
        this.P=new int[X];
        this.Tope=0;
        this.Tmax=X;
    }
    public boolean isEmpty(){
        return(this.Tope==0);
    }
    public boolean isFull(){
        return(this.Tope==this.Tmax);
    }
    public int Size(){
        return(this.Tope);
    }
    public int maxSize(){
        return(this.Tmax);
    }
    public int Peek(){
        if(!isEmpty()){
            return(this.P[this.Tope-1]);
        }
        return(-1);
    }
    public void Push(int X){
        if(!isFull()){
            this.P[this.Tope]=X;
            this.Tope++;
        }
    }
    public String Pop(){
        if(!isEmpty()){
            this.Tope--;
            return("Se elimino el elemento "+this.P[this.Tope+1]);
        }
        return("No existen elementos");
    }
    public void Print(){
        for(int i=0;i<this.Tope;i++){
            System.out.println("Nota["+(i+1)+"]= "+this.P[i]);
        }
    }
    public void Media(){
        double Prom=0;
        for(int i=0;i<this.Tope;i++){
            Prom+=this.P[i];
        }
        System.out.println("La media (Promedio) de las notas es: "+(Prom/this.Tope));
        Print();
    }
    public void Moda() {
        System.out.println("Ordenando la pila");
        this.Burbuja();
        int Moda = 0;
        int MaximoR = 0;
        for (int i = 0; i < this.P.length; i++) {
            int Rep = 0;
            for (int j = 0; j < this.P.length; j++) {
                if (this.P[i] == this.P[j]) {
                    Rep++;
                }
                if (Rep > MaximoR) {
                    Moda = this.P[i];
                    MaximoR = Rep;
                }
            }
        }
        System.out.print("La moda es: " + Moda+"\n");
    }
    public void Burbuja(){
      int Aux;
      for(int i=2; i <this.P.length;i++){
        for(int j=0;j <this.P.length-i;j++){
          if(this.P[j]>this.P[j+1]){
            Aux=this.P[j];
            this.P[j] =this.P[j+1];
            this.P[j+1]=Aux;
          }   
        }
      }
    }
    
}
