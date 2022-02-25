package parcial2corteed2;

public class Lista {
    private Nodo Cab;
    public Lista(){
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
    public void Intercambio(int X, int Y){
        if(Buscar(X)==true && Buscar(Y)==true){
            Nodo B1=Antes2(X);      
            Nodo B2=Antes2(Y);
            Nodo P1=B1.getSig();
            Nodo P2=B1.getSig().getSig();
            Nodo Q1=B2.getSig();
            Nodo Q2=B2.getSig().getSig();
            if(B1==this.Cab && B2==this.Cab){
                System.out.println("Entro cab1");
                this.Cab=Q1;
                Q1.setSig(B1);
                B1.setSig(Q2);
            }else if(P2==Q1){
                System.out.println("Entro pegados");
                B1.setSig(Q1);
                Q1.setSig(P1);
                P1.setSig(Q2);
            }else if(B1==this.Cab && B2!=this.Cab){
                System.out.println("Entro cab2");
                B1.setSig(Q2);
                this.Cab=Q1;
                Q1.setSig(P1);
                B2.setSig(B1);
                B1.setSig(Q2);
            }else{
                System.out.println("Entro sep");
                B1.setSig(Q1);
                Q1.setSig(P2);
                B2.setSig(P1);
                P1.setSig(Q2);
            }
        }
    }
}
