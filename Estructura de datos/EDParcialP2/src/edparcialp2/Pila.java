package edparcialp2;

public class Pila {
    private Nodo Cab;
    public Pila(){
        this.Cab=null;
    }
    public boolean isEmpty(){
        return(this.Cab==null);
    }
    public boolean isFull(){
        return(this.Cab!=null);
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
            Nodo P=LastNodo();
            return("Nodo atendido: "+P.getInfo());
        }
    }
    public String Push(int X){
        Nodo P=new Nodo(X);
        if(isEmpty()){
            this.Cab=P;
            return("Nodo insertado");
        }else{
            Nodo Q;
            int B=Buscar(X);
                if(B==-1){
                    Q=LastNodo();
                    Q.setSig(P);
                    return("Nodo insertado");
                }
                return("Invalido, elemento repetido");
        }
    }
    public String Pop(){
        if(isEmpty()){
            return("Pila vacia.");
        }else{
            Nodo P=this.Cab;
            if(this.Cab.getSig()==null){
                this.Cab=null;
                return("El elemento eliminado fue: ");
            }else{
                Nodo Q=LastNodo();
                while(P.getSig()!=Q){
                    P=P.getSig();
                }
                P.setSig(null);
                return("Se atendio a: "+Q.getInfo());
            }
        }
    }
    public int Atencion(int X){
        if(isEmpty()){
            return(-1);
        }else{
            int B=Buscar(X);
            if(B!=-1){
                if(this.Cab.getSig()==null){
                    return(0);
                }
                return((Size()-B)-1);
            }
            return(-1);
        }
    }
    public int Buscar(int X){
        Nodo Q=this.Cab;
        int K=0;
        while(Q!=null){
            if(Q.getInfo()==X){
                return(K);
            }
            Q=Q.getSig();
            K++;
        }
        return(-1);
    }
}