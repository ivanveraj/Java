package ed3;
import java.util.*;
public class Vectores {
    private int V[];
    private int T;
    public Vectores(int T){
        this.T=T;
        this.V=new int[T];
    }
    public int getT() {
        return T;
    }
    public void setT(int T) {
        this.T = T;
    }
    public void Llenar(){
        int k;
        for(k=0; k< this.T; k++){
            this.V[k] = k+1;
        }
    }
    public String Imprimir(){
      String R="";
      int k;
      for(k = 0; k < this.T; k++){
          R+= "\n V["+k+"]= "+this.V[k];
        }
      return(R);    
    }
    public int Pares(){
        int Aux=0;
        for(int i=0;i<this.T;i++){
            if(this.V[i]%2==0){
                Aux++;
            }
        }
        return(Aux);
    }
    public int Buscar(int X){
        for(int i=0;i<this.T;i++){
            if(this.V[i]==X){
                return(i);
            }
        }
        return(-1);
    }
    public void Intercambiador(int X, int Y){
        int pos,cont=0;
        for(int i=0;i<this.T;i++){
            if(this.V[i]==X&&cont==0){
                this.V[i]=Y;
                cont++;
            }
        }
    }
    public void Pseudoaletorio(){
        Random R=new Random();
        for(int i=0;i<this.T;i++){
            this.V[i]=1+R.nextInt(99);
        }
    }
    public boolean Comparador(Vectores A){
        if(A.getT()!=this.getT()){
            return(false);
        }else{
            for(int i=0;i<this.T;i++){
                    if(this.V[i]!=A.V[i]){
                        return(false);
                    }
            }
            return(true);
        }
    }
    public void Intercambio(Vectores A){
            if(A.getT()==this.getT()){
                int Aux;
                for(int i=0;i<this.getT();i++){
                    Aux=this.V[i];
                    this.V[i]=A.V[i];
                    A.V[i]=Aux;
                }
                System.out.println("Intercambio realizado");
            }else{
                System.out.println("No se realizo el intercambio");
            }
        }
}
