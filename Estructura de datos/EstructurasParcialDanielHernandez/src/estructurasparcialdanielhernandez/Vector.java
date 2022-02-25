package estructurasparcialdanielhernandez;
public class Vector {
    private int V[];
    private int PLL;
    private int Tlleno;
    public Vector(int Tama){
        this.Tlleno=Tama;
        this.V=new int[Tama];
        this.PLL=0;
    }
    public void Impresion(){
      for(int i=0;i<this.PLL;i++){
          System.out.println("Vector ["+i+"]="+this.V[i]+"");
        }
        System.out.println("\n");
    }
    public int Buscador(int num){
        for(int i=0;i<this.PLL;i++){
            if(this.V[i]==num){
                return(1);
            }
        }
        return(0);
    }
    public void FunInvertir() {
        int X;
        int Tama=this.PLL-1;
        for (int j= 0; j<= (Tama/2); j+=1) {
            X=V[Tama];
            V[Tama]=V[j];
            V[j]=X;
            Tama--;
        }
    }
    public String Insertar(int X) {
        if (Buscador(X)==0) {
            if (this.PLL!=this.Tlleno) {
                this.V[PLL]=X;
                PLL++;
            }else{
                return("No se permite inserciones");
            }
        }else {
            return("Error, el elemento ya se encuentra en el vector");
        }
        return("");
    }
    public String FunBorrarUltimo(){
        this.PLL--;
        return("Elemento de ultima posicion eliminado");
    }
    public String FunBorrarPrimero(){
        for(int j=1;j<this.PLL;j+=1){
            V[j-1]=V[j];
        }
        this.PLL--;
        return("Primer elemento del vector eliminado");
    }
        
}
