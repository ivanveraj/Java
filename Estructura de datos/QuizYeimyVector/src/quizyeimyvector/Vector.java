package quizyeimyvector;
public class Vector {
    private int V[];
    private int T;
    private int Tmax;
    public Vector(int T){
        this.Tmax=T;
        this.V=new int[T];
        this.T=0;
    }
    public int getTmax() {
        return Tmax;
    }
    public void Insertar(int X){
        if(this.T!=this.Tmax){
            this.V[T]=X;
            T++;
        }else{
            System.out.println("Vector lleno, no puede ingresar mas elementos");
        }
    }
    public String Imprimir(){
      String R="";
      for(int k =0;k<this.Tmax;k++){
          R+= "\n V["+k+"]= "+this.V[k];
        }
      return(R);    
    }
    public boolean BuscarB(int X){
        for(int i=0;i<this.Tmax;i++){
            if(this.V[i]==X){
                return(true);
            }
        }
        return(false);
    }

    public String Compara(Vector V2){
        int k;
        boolean B=false;
        if(this.Tmax==V2.getTmax()){
            for(k=0;k<this.Tmax;k++){
                if(this.V[k]!=V2.V[k]){
                    return("No son identicos");
                }
                B=true;
            }
            if(B==true){
                return("Son identicos");
            }else{
                boolean B1=false;
            for(k=0;k<this.Tmax;k++){
                if(BuscarB(this.V[k])==BuscarB(V2.V[k])){
                    B1=true;
                }else{
                    B1=false;
                    System.out.println("No son equivalentes");
                    break;
                }
            }
            if(B1==true){
                return("Son equivalentes");
            }
            }
        }else{
            boolean B2=false;
            for(k=0;k<this.Tmax;k++){
                if(this.V[k]==V2.V[k]){
                    B2=true;
                }else{
                    B2=false;
                    System.out.println("No son iguales");
                    break;
                }
            }
            if(B2==true){
                return("Son iguales");
            }
    }
        return("");
    }
        
}
