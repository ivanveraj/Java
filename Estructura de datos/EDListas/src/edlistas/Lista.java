package edlistas;

public class Lista {
    private Nodo Cab;
    public Lista(){
        this.Cab=null;
    }
    public boolean Compara(Lista L2){
        if(this.isEmpty()!=true&&L2.isEmpty()!=true){
             if(this.Size()==L2.Size()){
                Nodo P=LastNodo();
                Nodo Q=L2.Cab;
                while(Q!=null){
                    if(Q.getInfo()==P.getInfo()){
                        P=Antes(P);
                        Q=Q.getSig();
                    }else{
                        return(false);
                    }
                }
                return(true);
                }else{
                return(false);
                }
            }
        return(false);
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
    public void InsertFirst(int X){
        if(Buscar(X)){
            System.out.println("Dato repetido");
        }else{    
            Nodo P=new Nodo(X);
            P.setSig(this.Cab);
            this.Cab=P;
        }
    }
    
    public void InsertLast(int X){
        if(Buscar(X)){
            System.out.println("Dato repetido");
        }else{
            Nodo P=new Nodo(X);
            if(isEmpty()){
                this.Cab=P;
            }else{
                Nodo Q=LastNodo();
                Q.setSig(P);
            }
        }
    }
    
    public String DeleteFirst(){
        if(isEmpty()){
            return("Lista vacia");
        }else{
            Nodo P=this.Cab;
            this.Cab=this.Cab.getSig();
            P.setSig(null);
            return("El elemento atendido fue: "+P.getInfo());
        }
    }
    
    public String DeleteLast(){
        if(isEmpty()){
            return("Pila vacia.");
        }else{
            Nodo P=this.Cab;
            if(this.Cab.getSig()==null){
                this.Cab=null;
                return("El elemento eliminado fue: "+P.getInfo());
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
    public String DeleteTo(int X){
        Nodo B=Antes2(X);
        if(B!=null){
            if(X==this.Cab.getInfo()){
                DeleteFirst();
                return("Nodo eliminado");
            }else if(X==LastNodo().getInfo()){
                DeleteLast();
                return("Nodo eliminado");
            }else{
                Nodo P=B.getSig();
                B.setSig(P.getSig());
                P.setSig(null);
                return("Nodo eliminado");
            }
        }
        return("No existe el elemento en la lista");
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
    public String PrintList(){
            Nodo P=this.Cab;
            String L="";
            while(P!=null){
                if(P.getSig()!=null){
                    L+=P.getInfo()+",";
                }else{
                    L+=P.getInfo()+"";
                }
                P=P.getSig();
            }
            return("["+L+"]");
    }
    public void InsertAfter(int X, int Inter){
        if(Buscar(X)){
            System.out.println("Dato repetido");
        }else{
            Nodo B=BuscarC(Inter);
            if(B!=null){
                Nodo Q=new Nodo(X);
                Q.setSig(B.getSig());
                B.setSig(Q);
            }
        }
    }
    public void InsertBefore(int X, int Inter){
        if(Buscar(X)){
            System.out.println("Dato repetido");
        }else{
            Nodo B=BuscarC(Inter);
            if(B!=null){
                if(B==this.Cab){
                    InsertFirst(X);
                }else{
                    Nodo Q=new Nodo(X);
                    Nodo P=Antes(B);
                    Q.setSig(B);
                    P.setSig(Q);
                }
            }
        }
    }
    public String InsertTo(int X){
        if(Buscar(X)){
            return("Dato repetido");
        }else{
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
    
    public void InsertBefore2(int X, int Inter){
        if(Buscar(X)){
            System.out.println("Dato repetido");
        }else{
            Nodo B=Antes2(Inter);
            if(B!=null){
                if(B.getInfo()==this.Cab.getInfo()){
                    InsertFirst(X);
                }else{
                    Nodo Q=new Nodo(X);
                    Nodo P=B.getSig();
                    Q.setSig(P);
                    B.setSig(Q);
                }
            }
        }
    }
    public Nodo Antes(Nodo B){
        Nodo P=this.Cab;
        while(P!=null){
            if(P.getSig()==B){
                return(P);
            }
            P=P.getSig();
        }
        return(null);
    }
    public Nodo Antes2(int B){
        Nodo P=this.Cab, Q=this.Cab;
        while(P!=null){
            if(P.getInfo()==B){
                return(Q);
            }
            Q=P;
            P=P.getSig();
        }
        return(null);
    }
    
    public Nodo BuscarC(int Inter){
        Nodo P=this.Cab;
        while(P!=null){
            if(P.getInfo()==Inter){
                return(P);
            }
            P=P.getSig();
        }
        return(null);
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
    /*public String OrderList(){
        if(isEmpty()){
            Nodo P=this.Cab;
            Nodo Q=this.Cab.getSig(); 
            while(P.getSig()!=null){
                while(Q!=null){
                    Nodo A=Antes2(Q.getInfo());
                    Nodo L=LastNodo();
                    System.out.println("Inicio: "+" P: "+P.getInfo()+" Q:"+Q.getInfo()+" A: "+A.getInfo());
                    if(P.getInfo()>Q.getInfo()){
                        System.out.println("Entro 1");
                        
                        Nodo X=P.getSig();
                        if(X.getInfo()==A.getInfo()){
                            System.out.println("Entro al primer if");
                            P.setSig(Q.getSig());
                            Q.setSig(P);
                            X.setSig(Q);
                            this.Cab=X;
                            Q=P.getSig();
                            P=this.Cab;
                        }else if(X==Q){
                            System.out.println("Entro al segundo if");
                            P.setSig(Q.getSig());
                            Q.setSig(P);
                            this.Cab=Q;
                            Q=P.getSig();
                            P=this.Cab;
                        }else{
                            System.out.println("Entro al tercer if");
                            P.setSig(Q.getSig());
                            Q.setSig(X);
                            A.setSig(P);
                            this.Cab=Q;
                            Q=P.getSig();
                            P=this.Cab;
                        }
                        System.out.println("Salio o que");
                        
                    }else if(A.getInfo()>Q.getInfo()){
                        System.out.println("Entro 2");
                        Nodo AA=Antes2(A.getInfo());
                        A.setSig(Q.getSig());
                        AA.setSig(Q);
                        Q.setSig(A);
                        Q=Q.getSig();
                    }
                    System.out.println("EE");
                    System.out.println("Lista dentro de while Q"+PrintList());
                    if(Q==null||L==null){
                        break;
                    }
                }
                System.out.println("Termino ciclo");
                P=P.getSig();
                Q=P.getSig();
                if(P==null){
                    break;
                }
            }
            return(PrintList());
        }
        return("Lista vacia");
    }*/
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
