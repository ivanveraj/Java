package Trabajo_1;

public class Materas extends Productos {
    private String Material, Tamanio;

    public Materas(int C, String N, int P, String M, String T) {
        super(C,N,P);
        this.Material =M;
        this.Tamanio =T;
    }
        public String Informacion(){
        return("Codigo: "+this.getCodigo()+"\nNombre: "+this.getNombre()+"\nPrecio: "+this.getPrecio()+"\nMaterial:"+this.Material+"\nTamaño: "
                +this.Tamanio+"\n");
    }
    public String getMaterial() {
        return Material;
    }
    public void setMaterial(String Material) {
        this.Material = Material;
    }
    public String getTamanio() {
        return Tamanio;
    }
    public void setTamanio(String Tamanio) {
        this.Tamanio = Tamanio;
    }
 
}