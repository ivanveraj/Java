package edpilas;

public class Cola {
    private int C[];
    private int Tope;
    private int Tmax;
    public Cola(int X){
        this.C=new int[X];
        this.Tmax=X;
        this.Tope=0;
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
            return(this.C[0]);
        }
        return(-1);
    }
    public void Enqueue(int X){
        if(!isFull()){
            this.C[this.Tope]=X;
            this.Tope++;
        }
    }
    public String Dequeue(){
        if(!isEmpty()){
            int Eliminado=this.C[0];
            for(int i=0;i<this.Tmax-1;i++){
                this.C[i]=this.C[i+1];
            }
            this.Tope--;
            return("Se elimino el elemento"+Eliminado);
        }
        return("No existen elementos");
    }
    
}
