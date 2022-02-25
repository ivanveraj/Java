package ed_parcial1_yeimysantos;
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
    public boolean Buscar(int X){
        for(int i=0;i<this.T;i++){
            if(this.V[i]==X){
                return(true);
            }
        }
        return(false);
    }
    public void Insertar(int X) {
        if (Buscar(X) == true) {
            System.out.println("Error elemento repetido");
        } else {
            if (this.T != this.Tmax) {
                this.V[T] = X;
                T++;
                System.out.println("Insercion realizada correctamente");
            } else {
                System.out.println("Vector lleno, no puede ingresar mas elementos");
            }
        }
    }
    public void BorrarUltimo(){
        System.out.println("Borrando el ultimo elemento del vector");
        this.V[this.T]=0;
        this.T--;
    }
    public void Imprimir(){
      String R="";
      for(int k =0;k<this.T;k++){
          R+= "V["+k+"]= "+this.V[k]+"\n";
        }
        System.out.println(R);    
    }
    public boolean BuscarB(int X){
        for(int i=0;i<this.Tmax;i++){
            if(this.V[i]==X){
                return(true);
            }
        }
        return(false);
    }
    public void Invertir() {
        System.out.println("Invirtiendo el vector");
        int Tam=this.T-1;
        int Aux;
        for (int i = 0; i <= (Tam)/2; i++) {
            Aux=V[Tam];
            V[Tam]=V[i];
            V[i]=Aux;
            Tam--;
        }
    }
    public void BorrarPrimero(){
        System.out.println("Borrando el primer elemento del vector y desplazando");
        for(int i=1;i<this.T;i++){
            V[i-1]=V[i];
        }
        this.T--;
    }
        
}
