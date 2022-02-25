
package parcial2corteed;

/**
 *
 * @author Usuario
 */
public class ListaD {
    private Nodo Cab;
    private Nodo End;
    public ListaD(){
        this.Cab=null;
        this.End=null;
    }
        public Nodo getEnd() {
        return End;
    }

    public void setEnd(Nodo End) {
        this.End = End;
    }
    public boolean Compara(ListaD L2){
        if(this.isEmpty()!=true&&L2.isEmpty()!=true){
             if(this.Size()==L2.Size()){
                Nodo P=this.End;
                Nodo Q=L2.Cab;
                while(P!=null){
                    if(P.getInfo()==Q.getInfo()){
                        P=P.getAnt();
                        Q=Q.getSig();
                    }else{
                        return(false);
                    }
                }
                return(true);
            }
             return(false);
        }
        return(false);
    }
    public boolean isEmpty(){
        return(this.Cab==null);
    }
    public int Size(){
        int C1=0, C2=0;
        Nodo P;
        P = this.Cab;
        while(P != null){
            C1++;
            P = P.getSig();
        }
        P = this.End;
        while(P != null){
            C2++;
            P = P.getAnt();
        }
        if(C1==C2)
            return(C1);
        else
            return(-1);
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
        if(Buscar(X)){
            System.out.println("Dato repetido");
        }else{
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
                return("Nodo intermedio");
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
    public boolean Buscar(int Inter){
        Nodo P=this.Cab;
        while(P!=null){
            if(P.getInfo()==Inter){
                return(true);
            }
            P=P.getSig();
        }
        return(false);
    }
    public void DeleteFirst(){
        if(! isEmpty()){
            Nodo P=this.Cab;
            if(this.Cab.getSig()==null){
                this.Cab=null;
                this.End=null;
            }
            this.Cab=this.Cab.getSig();
            this.Cab.setAnt(null);
            P.setSig(null);
            P.setAnt(null);
            
        }
    }
     public void DeleteLast(){
        if(isEmpty()){
        }else{
            Nodo P;
            P=this.Cab;
            if(this.Cab.getSig()==null){
                this.Cab.setAnt(null);
                this.Cab=null;
            }else{
                Nodo Q= this.End;
                while(P.getSig()!=Q){
                    P=P.getSig();
                }
                this.End=P;
                P.setSig(null);
            }
        }
    }
    public String PrintList(){
        Nodo P;
        String Rta1, Rta2;
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
        Rta2 ="";
        P = this.End;
        while(P!=null){
            if(P.getAnt()==null){
                Rta2+="Info:"+P.getInfo();
            }else{
                Rta2+="Info:"+P.getInfo()+",";
            }
            P = P.getAnt();
        }
        return ("Recorrido Cab:\n["+Rta1+"]"+"\nRecorrido End:\n["+Rta2+"]");
    }
    public void miOrden(){
        System.out.println(OrderList());
        Nodo P=this.Cab;
        Nodo Q=this.Cab.getSig();
        int A=0;
        int B=Size();
        do{
            while(P!=null){
                int Mod1=P.getInfo()%2;
                int Mod2=Q.getInfo()%2;
                if(Mod1!=0&& Mod2==0){
                        int Aux=Q.getInfo();
                        Q.setInfo(P.getInfo());
                        P.setInfo(Aux);
                }else if(Mod1!=0&& P.getInfo()>Q.getInfo() && Mod2!=0){
                        int Aux=Q.getInfo();
                        Q.setInfo(P.getInfo());
                        P.setInfo(Aux);
                }
                P=P.getSig();
                Q=P.getSig();
                if(Q==null){
                    break;
                }
            }
            P=this.Cab;
            Q=P.getSig();
            A++;
            }while(A<B);
        }
    public String OrderList(){
        if(isEmpty()){
            return("Lista vacia");
        }else{
            Nodo P=this.Cab;
            Nodo Q=this.Cab.getSig();
            int A=0, B=Size();
            do{
                while(P!=null){
                    if(P.getInfo()>Q.getInfo()){
                        int Aux=Q.getInfo();
                        Q.setInfo(P.getInfo());
                        P.setInfo(Aux);
                }
                P=P.getSig();
                Q=P.getSig();
                if(Q==null){
                    break;
                }
            }
            P=this.Cab;
            Q=P.getSig();
            A++;
            }while(A<B);
            return(PrintList());
            }
        }
    }
   

