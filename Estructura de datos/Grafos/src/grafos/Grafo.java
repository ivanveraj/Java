package grafos;

public class Grafo {
    private final int MaxVertices;
    private int NVertices;
    private boolean esDirigido;
    private boolean MAd[][];
    public Grafo(int MaxVertices, boolean esDirigido) {
        this.MaxVertices = MaxVertices;
        NVertices=0;
        this.esDirigido = esDirigido;
        this.MAd =new boolean[MaxVertices][MaxVertices];
    }
    public int getMaxVertices() {
        return this.MaxVertices;
    }
    public int getNVertices() {
        return this.NVertices;
    }
    public boolean isEsDirigido() {
        return this.esDirigido;
    }
    public boolean[][] getMAd() {
        return this.MAd;
    }
    
    //Programacion grafo
    public void InsertarVertice(){
        //Insertar datos al vertice
        if(this.MaxVertices==this.NVertices){
            System.out.println("Exceso de tamaño");
        }else{
            for(int i=0;i<this.NVertices;i++){
                this.MAd[i][this.NVertices]=false;
            }
            for(int i=0;i<this.NVertices;i++){
                this.MAd[this.NVertices][i]=false;
            }
            this.NVertices++;
        }
    }
    public void InsertarArista(int A, int B){
        if((A<this.NVertices) && (A>=0) && (B<this.NVertices) &&(B>=0)){
            this.MAd[A][B]=true;
            if(!this.esDirigido){
                this.MAd[A][B]=true;
            }
        }else{
            System.out.println("Los vertices no han sido encontrados");
        }
    }
    public void EliminarArista(int A, int B){
        if((A<this.NVertices) && (A>=0) && (B<this.NVertices) &&(B>=0)){
            this.MAd[A][B]=false;
            if(!this.esDirigido){
                this.MAd[A][B]=false;
            }
        }else{
            System.out.println("Los vertices no han sido encontrados");
        }
    }
    public boolean ExisteArista(int A, int B){
        if((A<this.NVertices) && (A>=0) && (B<this.NVertices) &&(B>=0)){
            return(this.MAd[A][B]);
        }else{
            return(false);
        }
    }
    public int GradoC(int A){
        int R=0;
        if(A<this.NVertices && A>=0){
            for(int i=0;i<this.NVertices;i++){
                if(this.MAd[i][A]){
                    R++;
                }
            }
        }
        return(R);
    }
    public int GradoF(int A){
        int R=0;
        if(A<this.NVertices && A>=0){
            for(int i=0;i<this.NVertices;i++){//Recorrido fila
                if(this.MAd[A][i]){
                    R++;
                }
            }
        }
        return(R);
    }
    
    public void Incidencia(int A){
        int R=0;
        if(A<this.NVertices && A>=0){
            if(!this.esDirigido){
                R=GradoC(A);
                if(R>0){
                    System.out.println("La incidencia de ["+A+"] es: "+R);
                }
            }else{
                R=GradoC(A)+GradoF(A);
                if(R>0){
                    System.out.println("La incidencia de ["+A+"] es: "+R);
                }
            }
        }
    }
    public int Tamanio(){//Calcula el numero total de aristas en el grafo
        int R=0;
        for(int i=0;i<this.NVertices;i++){
            for(int j=0;j<this.NVertices;j++){
                if(this.MAd[i][j]){
                    if(this.esDirigido || i>=j){
                        R++;
                    }
                }
            }
        }
        return(R);
    }
    public void Mostrar(){
        System.out.println("Cantidad de vertices: "+this.NVertices);
        if(this.esDirigido){
            System.out.println("Es dirigido");
        }else{
            System.out.println("No es dirigido");
        }
        String R="";
        for (int i=0;i<this.NVertices;i++){
            for(int j=0;j<this.NVertices;j++){
                if(this.MAd[i][j]){
                    R+="1 ";
                }else{
                    R+="0 ";
                }
            }
            System.out.println(R);
            R="";
        }
    }
}
