package listaenlazadas;

public class Lista {
    private Nodo Cab;
    public Lista(){
        this.Cab=null;
    }
     public boolean isEmpty(){
        return(this.Cab==null);
    }
    public void Insert(int X){
        Nodo P=new Nodo(X);
        if(isEmpty()){
                this.Cab=P;
        }else{
                Nodo Q=LastNodo();
                Q.setSig(P);
            }
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
    public void Imprimir(){
            Nodo P=this.Cab;
            while(P!=null){
                System.out.println(P.getInfo());
                P=P.getSig();
            }
    }
    public double Promedio(){
        Nodo P=this.Cab;
        int Tam=0;
        double Sum=0,Prom;
        while(P!=null){
            Tam++;
            Sum=Sum+P.getInfo();
            P=P.getSig();
        }
        Prom=Sum/Tam;
        return(Prom);
    }
}
