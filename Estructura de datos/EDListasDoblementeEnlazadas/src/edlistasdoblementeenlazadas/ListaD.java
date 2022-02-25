package edlistasdoblementeenlazadas;

public class ListaD {
    private Nodo Cab;
    private Nodo End;
    public ListaD(){
        this.Cab=null;
        this.End=null;
    }
    public boolean isEmpty(){
        return(this.Cab==null);
    }
    public void InsertFirst(int X){
        Nodo N = new Nodo(X);
        if (isEmpty()){
            this.Cab=N;
            this.End=N;
        }
        else{
            this.Cab.setAnt(N);
            N.setSig(this.Cab);
            this.Cab = N;
        }
    }
    public void InsertLast(int X){
            Nodo P=new Nodo(X);
            if(isEmpty()){
                this.Cab=P;
                this.End=P;
            }else{
                this.End.setSig(P);
                P.setAnt(this.End);
                this.End=P;
        }
    }
    public String InsertTo(int X){
        Nodo P=new Nodo(X);
            if(isEmpty()){
                InsertFirst(X);
                return("Nodo en la cabeza");
            }else{
                if(this.Cab.getInfo()>X){
                    InsertFirst(X);
                    return("Nodo en la cabeza");
                }
                Nodo Q=BuscarM(X);
                if(Q.getSig()==null){
                    InsertLast(X);
                    return("Nodo al final");
                }
                Nodo R=Q.getSig();
                Q.setSig(P);
                P.setAnt(Q);
                P.setSig(R);
                R.setAnt(P);
                return("Nodo entre los demas");
            }
    }
    public Nodo BuscarM(int I){
        Nodo P=this.Cab;
        Nodo Q=this.Cab;
        while(P!=null){
            if(P.getInfo()>I){
                return(Q);
            }
            Q=P;
            P=P.getSig();
        }
        return(Q);
    }
    public String PrintList(){
        Nodo P;
        String Rta1;
        Rta1="";
        P = this.Cab;
        while(P != null){
            if(P.getSig()==null){
                Rta1+="Info:"+P.getInfo();
            }else{
                Rta1+="Info:"+P.getInfo()+",";
            }
            P = P.getSig();
        }
        return ("Recorrido Cab:\n["+Rta1+"]");
    }
}
