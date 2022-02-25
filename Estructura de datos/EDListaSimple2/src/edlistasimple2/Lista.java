package edlistasimple2;
public class Lista {
    private Nodo Cab;
    public Lista(){
        this.Cab=null;
    }
    public Nodo getCab() {
        return Cab;
    }
    public void setCab(Nodo Cab) {
        this.Cab = Cab;
    }
     public boolean isEmpty(){
        return(this.Cab==null);
    }
    public void InsertFirst(int X){  
            Nodo P=new Nodo(X);
            P.setSig(this.Cab);
            this.Cab=P;
    }
     public void insertFirst(Nodo P) {
        P.setSig(this.Cab);
        this.Cab = P;
    }
    private void InsertLast(int X){
            Nodo P=new Nodo(X);
            if(isEmpty()){
                this.Cab=P;
            }else{
                Nodo Q=AnteriorNodo();
                Q.setSig(P);
            }
       }
    public String InsertarOrdenado(int X){
            Nodo P=new Nodo(X);
            if(isEmpty()){
                this.Cab=P;
                return("Nodo insertado en la cabeza");
            }else{
                if(X<this.Cab.getInfo()){
                    InsertFirst(X);
                    return("Se inserto antes de la cabeza ");
                }
                Nodo B=Orden(X);
                if (B.getSig()==null){
                    InsertLast(X);
                    return("Nodo insertado de ultimo");
                }
                P.setSig(B.getSig());
                B.setSig(P);
                return("Nodo insertado en el medio");
            }
        }
    public Nodo buscarMayor() {
        Nodo P, Mayor;
        Mayor = this.Cab;
        if (!isEmpty()) {
            P = Mayor.getSig();
            while (P != null) {
                if (P.getInfo() > Mayor.getInfo()) {
                    Mayor = P;
                }
                P = P.getSig();
            }
        }
        return (Mayor);
    }
    public Nodo Orden(int X){
        Nodo P=this.Cab, Q=this.Cab;
        while(P!=null){
            if(P.getInfo()>X){
                return(Q);
            }
            Q=P;
            P=P.getSig();
        }
        return(Q);
    }
    public Nodo AnteriorNodo() {
        Nodo P = this.Cab;
        if (isEmpty()) {
            return (null);
        } else {
            while (P.getSig() != null) {
                P = P.getSig();
            }
            return (P);
        }
    }
    public String viewList(){
            Nodo P=this.Cab;
            String L="";
            while(P!=null){
                if(P.getSig()!=null){
                    L+="Info:"+P.getInfo()+"-";
                }else{
                    L+="Info:"+P.getInfo();
                }
                P=P.getSig();
            }
            return("["+L+"]");
    }
}
