package edcolas;

public class Cola {
    private Nodo Cab;
    public Cola(){
        this.Cab=null;
    }
    public boolean isEmpty(){
        return(this.Cab==null);
    }
    public int Size(){
        Nodo P=this.Cab;
        int K=0;
        while(P!=null){
            K++;
            P=P.getSig();
        }
        return(K);
    }
    public Nodo LastNodo(){
            Nodo P=this.Cab;
            if(isEmpty()){
                    return(null);
            }else{
                while(P.getSig()!=null){
                P=P.getSig();
                }
                return(P);
            }
        }
    public String Peek(){
        if(isEmpty()){
            return("Pila vacia");
        }else{
            return("Se debe atender: "+this.Cab.getInfo());
        }
    }
    public void Enqueue(int X){
        Nodo P=new Nodo(X);
        if(isEmpty()){
            this.Cab=P;
        }else{
            Nodo Q;
            Q=LastNodo();
            Q.setSig(P);
        }
    }
    public String Denqueue(){
        if(isEmpty()){
            return("Cola vacia");
        }else{
            Nodo P=this.Cab;
            this.Cab=this.Cab.getSig();
            P.setSig(null);
            return("El nodo atendido fue: "+P.getInfo());
        }
    }
}