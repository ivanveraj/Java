package edarbolesvanessa;

public class Arbol {
    private Nodo Root;
    public Arbol(){
        this.Root=null;
    }
    public boolean isEmpty(){
        return(this.Root==null);
    }
    public void InsertTo(int Info){
        Nodo P=new Nodo(Info);
        if(isEmpty()){
            this.Root=P;
        }else{
            InsertTo(this.Root,P);
        }
    }
    public void InsertTo(Nodo R, Nodo X) {
        if (X.getInfo() < R.getInfo()) {
            if (R.getIzq() == null) {
                R.setIzq(X);
            } else {
                InsertTo(R.getIzq(), X);
            }
        } else {
            if (X.getInfo() > R.getInfo()) {
                if (R.getDer() == null) {
                    R.setDer(X);
                } else {
                    InsertTo(R.getDer(), X);
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
    public int Suma(){
        int Sum=0;
        return(Suma(this.Root,Sum));
    }
    public int Suma(Nodo P, int X){
        if (P != null){
          X = Suma(P.getIzq(),X);
          X += P.getInfo();
          X =Suma(P.getDer(), X);
        }
        return(X);
    }
    
}
