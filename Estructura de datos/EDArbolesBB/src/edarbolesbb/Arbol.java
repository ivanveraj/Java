package edarbolesbb;

public class Arbol {
    private Nodo Root;
    public Arbol(){
        this.Root=null;
    }
    public boolean isEmpty(){
        return(this.Root==null);
    }
    public void InsertToR(int Info){
        Nodo P=new Nodo(Info);
        if(isEmpty()){
            this.Root=P;
        }else{
            InsertToR(this.Root,P);
        }
    }
    public void InsertToR(Nodo R, Nodo X) {
        if (X.getInfo() < R.getInfo()) {
            if (R.getIzq() == null) {
                R.setIzq(X);
            } else {
                InsertToR(R.getIzq(), X);
            }
        } else {
            if (X.getInfo() > R.getInfo()) {
                if (R.getDer() == null) {
                    R.setDer(X);
                } else {
                    InsertToR(R.getDer(), X);
                }
            }
        }
    }
    public String PreOrden(){
        System.out.println("Recorrido en PreOrden:");
        String X ="";
        return (PreOrden(this.Root, X));
    }
    public String PreOrden(Nodo P, String X){
        if (P != null){
          X += P.getInfo() + ", ";
          X = PreOrden(P.getIzq(), X);
          X = PreOrden(P.getDer(), X);
        }
        return (X);
    }
    public String InOrden(){
        System.out.println("Recorrido en InOrden:");
        String X ="";
        return (InOrden(this.Root, X));
    }
    public String InOrden(Nodo P, String X){
        if (P != null){
          X = InOrden(P.getIzq(), X);
          X += P.getInfo() + ", ";
          X = InOrden(P.getDer(), X);
        }
        return(X);
    }
    public String PostOrden(){
        System.out.println("Recorrido en PostOrden:");
        String X ="";
        return (PostOrden(this.Root, X));
    }
    public String PostOrden(Nodo P, String X){
        if (P != null){
          X = PostOrden(P.getIzq(), X);
          X = PostOrden(P.getDer(), X);
          X += P.getInfo() + ", ";
        }
        return (X);
    }
    public int Size(){
        int X=0;
        return (Size(this.Root, X));
    }
    public int Size(Nodo P, int X){
        if (P != null){
            X++;
            X = Size(P.getIzq(), X);
            X = Size(P.getDer(), X);
        }
        return (X);
    }
    public int ContHojas(){
        int X=0;;
        return(ContHojas(this.Root,X));
    }
    public int ContHojas(Nodo P, int X) {
        if (P != null) {
            if (P.getIzq() == null && P.getDer() == null) {
                X++;
            }
            X = ContHojas(P.getIzq(), X);
            X = ContHojas(P.getDer(), X);
        }
        return (X);
    }
    public int Grado(Nodo P) {
        int X = 0;
        if (P != null) {
            if (P.getIzq() != null) {
                X++;
            }
            if (P.getDer() != null) {
                X++;
            }
        }
        return (X);
    }
    public int Padre(int Q){
        if(Padre(Q,this.Root)==null){
            return -1;
        }
        return(Padre(Q,this.Root).getInfo());
    }
    public Nodo Padre(int Q, Nodo R) {
        if (isEmpty()) {
            return (null);
        } else {
            if (Q == this.Root.getInfo()) {
                return (null);
            } else {
                Nodo P = R;
                while (P != null) {
                    if (Q < P.getInfo()) {
                        if (P.getIzq() != null) {
                            if (P.getIzq().getInfo() == Q) {
                                return P;
                            }
                            P = P.getIzq();
                        } else {
                            return (null);
                        }
                    } else {
                        if (P.getDer() != null) {
                            if (P.getDer().getInfo() == Q) {
                                return (P);
                            }
                            P = P.getDer();
                        } else {
                            return (null);
                        }
                    }
                }
                return (null);
            }
        }
    }
    public Nodo FindPadre(Nodo P){
        if(P == this.Root)
            return(null);
        
        return(findPadre(this.Root, P));
    }
    
    private Nodo findPadre(Nodo R, Nodo P){
        if (R.getDer() == P || R.getIzq() == P)
            return(R);
        if(R.getInfo() > P.getInfo())
            return(findPadre(R.getIzq(), P));
        else
            return(findPadre(R.getDer(), P));
    }

    public Nodo PadreNodo(int Q) {
        if (isEmpty()) {
            return (null);
        } else {
            Nodo P = this.Root;
            if (Q == P.getInfo()) {
                return (null);
            }
            while (P != null) {
                if (Q < P.getInfo()) {
                    if (P.getIzq() != null) {
                        if (P.getIzq().getInfo() == Q) {
                            return P;
                        }
                        P = P.getIzq();
                    } else {
                        return (null);
                    }
                } else {
                    if (P.getDer() != null) {
                        if (P.getDer().getInfo() == Q) {
                            return (P);
                        }
                        P = P.getDer();
                    } else {
                        return (null);
                    }
                }
            }
            return (null);
        }
    }
    public Nodo FindNodo(int Q) {
            Nodo P =this.Root;
            while (P != null) {
                if (P.getInfo() == Q) {
                    return (P);
                } else {
                    if (Q < P.getInfo()) {
                        P = P.getIzq();
                    } else {
                        P = P.getDer();
                    }
                }
            }
            return (null);
        }
    public Nodo FindPredecesor(Nodo P) {
        if (P != null) {
            if (P.getIzq() == null) {
                return (null);
            }
            P = P.getIzq();
            while (P.getDer() != null) {
                P = P.getDer();
            }
            return (P);
        }
        return (null);
    }
     public Nodo FindSucesor(Nodo P) {
        if (P != null) {
            if (P.getDer() == null) {
                return (null);
            }
            P = P.getDer();
            while (P.getIzq() != null) {
                P = P.getIzq();
            }
            return (P);
        }
        return (null);
    }
     public Nodo SucesorR(Nodo P){
         return(FindSucesorR(P.getDer()));
     }
     public Nodo FindSucesorR(Nodo P){
         if(P.getIzq()==null){
             return(P);
         }
         return(FindSucesorR(P.getIzq()));
     }
     public String Delete(int X){
         Nodo F=FindNodo(X);
         Nodo FF;
         if(F!=null){
             int G=Grado(F);
             FF=FindPadre(F);
             if(G==0){
                 return(DeleteHoja(F,FF));
             }else{
                 if(G==1){
                     return(DeleteHijo(F,FF));
                 }else{
                     return(DeleteHijoPredecesor(F,FF));
                 }
             }
         }
         return("Error nodo no existe");
     }
    public String DeleteHoja(Nodo F, Nodo FF){
        if (FF == null) {
            this.Root = null;
        } else {
            if (FF.getIzq() == F) {
                FF.setIzq(null);
            } else {
                FF.setDer(null);
            }
        }
        return("Hoja eliminada");
    }
    public String DeleteHijo(Nodo F, Nodo FF) {
        Nodo Q;
        if (FF == null) {
            if (FF.getIzq() != null) {
                this.Root = FF.getIzq();
                F.setIzq(null);
            } else {
                this.Root = FF.getDer();
                F.setDer(null);
            }
        } else {
            if (F.getIzq() != null) {
                Q = F.getIzq();
            } else {
                Q = F.getDer();
            }
                if (FF.getIzq() == F) {
                    FF.setIzq(Q);
                    F.setIzq(null);
                    F.setDer(null);
                } else {
                    FF.setDer(Q);
                    F.setIzq(null);
                    F.setDer(null);
                }
            }
        return ("Hijo eliminado");
    }
    public String DeleteHijoPredecesor(Nodo F, Nodo FF) {
        Nodo Q = SucesorR(F);
        int G = Grado(Q);
        if (G == 0) {
            DeleteHoja(Q, FindPadre(Q));
        } else if (G == 1) {
            DeleteHijo(Q, FindPadre(Q));
        }
        Nodo Izq = F.getIzq();
        Nodo Der = F.getDer();
        if (FF == null) {
            this.Root = Q;
            F.setDer(null);
            F.setIzq(null);
            Q.setDer(Der);
            Q.setIzq(Izq);
        } else {
            if (FF.getIzq() == F) {
                FF.setIzq(Q);
                F.setDer(null);
                F.setIzq(null);
                Q.setIzq(Izq);
                Q.setDer(Der);
            } else {
                FF.setDer(Q);
                F.setDer(null);
                F.setIzq(null);
                Q.setIzq(Izq);
                Q.setDer(Der);
            }
        }
        return ("Hijo eliminado");
    }
    
    
}
