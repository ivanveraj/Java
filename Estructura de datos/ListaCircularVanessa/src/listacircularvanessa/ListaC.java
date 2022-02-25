package listacircularvanessa;
public class ListaC {
    private Nodo Inicio;
    private Nodo Ultimo;
    public void Lista(){
        this.Inicio=null;
        this.Ultimo=null;
    }
    public boolean isEmpty(){
        return(this.Inicio==null);
    }
    public void Agregar(int X){
        Nodo P=new Nodo(X);
        if (isEmpty()){
            this.Inicio=P;
            this.Ultimo=P;
            this.Ultimo.setSig(this.Inicio);
        }else{
            this.Ultimo.setSig(P);
            P.setSig(this.Inicio);
            this.Ultimo=P;
        }
    }
    public int ObtenerInfo(int Pos){
        Nodo Aux=this.Inicio;
        int C=0;
        while(C!=Pos){
            Aux=Aux.getSig();
            C++;
        }
        return(Aux.getInfo());
    }
    public int Buscar(int X){
        Nodo P=this.Inicio;
        int i=0;
        do{
            if(P.getInfo()==X){
                return(i);
            }
            P=P.getSig();
            i++;
        }while(P!=this.Inicio);
        return(-1);
    }
    public void Imprimir(){
        if (!isEmpty()) {
            Nodo Aux=this.Inicio;
            int i=0;
            System.out.print("=> ");
           do{
                System.out.print(i + ".[ " + Aux.getInfo()+" ]"+" =>  ");
                Aux=Aux.getSig();
                i++;
            }while(Aux!=this.Inicio);
            System.out.println("termino");
        }else{
            System.out.println("Lista vacio error");
        }
    }
    public String Mayor(){
        if (!isEmpty()) {
            int Mayor=this.Inicio.getInfo();
            Nodo Aux=this.Inicio;
            do{
                if(Aux.getInfo()>Mayor){
                    Mayor=Aux.getInfo();
                }
                Aux=Aux.getSig();
            }while(Aux!=this.Inicio);
            int B=Buscar(Mayor);
            return("Competidor N° "+B+"\nTotal kilometros: "+Mayor);
        }else{
            return("Lista vacio error");
        }
    }
}

