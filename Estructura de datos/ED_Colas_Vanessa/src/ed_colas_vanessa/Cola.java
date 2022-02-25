package ed_colas_vanessa;

import java.util.ArrayList;

public class Cola {
    private ArrayList<Integer> C;
    public Cola(){
        this.C=new ArrayList();
    }
    public boolean isEmpty(){
        return(this.C.size()==0);
    }
    public void Enqueue(int X){
            this.C.add(X);
    }
    public String Dequeue(){
        if(!isEmpty()){
            int Eliminado=this.C.get(0);
            this.C.remove(0);
            return("Se elimino el elemento"+Eliminado);
        }
        return("No existen elementos");
    }
    public void Imprimir(){
        if (!isEmpty()) {
            for (int i = 0; i <this.C.size(); i++) {
                System.out.println("Nota["+(i+1)+"]= "+this.C.get(i));
            }
        }
    }
    public void Media(){
        double Prom=0;
        for(int i=0;i<this.C.size();i++){
            Prom+=this.C.get(i);
        }
        System.out.println("La media (Promedio) de las notas es: "+(Prom/this.C.size()));
    }
    public void Moda() {
        System.out.println("Ordenando la cola");
        this.Burbuja();
        int Moda = 0;
        int MaximoR = 0;
        for (int i = 0; i < this.C.size(); i++) {
            int Rep = 0;
            for (int j = 0; j < this.C.size(); j++) {
                if (this.C.get(i)==this.C.get(j)) {
                    Rep++;
                }
                if (Rep > MaximoR) {
                    Moda = this.C.get(i);
                    MaximoR = Rep;
                }
            }
        }
        System.out.print("La moda es: " + Moda+"\n");
    }
    public void Burbuja(){
      int Aux;
      for(int i=2; i <this.C.size();i++){
        for(int j=0;j <this.C.size()-i;j++){
          if(this.C.get(j)>this.C.get(j+1)){
            Aux=this.C.get(j);
            this.C.set(j,this.C.get(j+1));
            this.C.set(j+1,Aux);
          }   
        }
      }
    }
    
}
