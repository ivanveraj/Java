package Trabajo_1;

public class Plantas extends Productos {
    private String  Cuidados;
    private int Tipo;
    public Plantas(int C, String N, int P, int Tipo, String Cuidado) {
        super(C,N,P);
        this.Cuidados=Cuidado;
        this.Tipo=Tipo;
    }
    
    public String Informacion(){
        return("Codigo: "+this.getCodigo()+"\nNombre: "+this.getNombre()+"\nPrecio: "+this.getPrecio()+"\nTipo:"+this.Tipo+"\nCuidado: "+this.Cuidados+"\n");
    }
    public String getCuidados() {
        return Cuidados;
    }
    public void setCuidados(String Cuidados) {
        this.Cuidados = Cuidados;
    }
    public int getTipo() {
        return Tipo;
    }
    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }
}

