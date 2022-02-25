/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.parcialsegundocandersoncardozo;

/**
 *
 * @author Usuario
 */
public class Vacuna extends ClassFecha{
    private int CodVacuna,  Estado;
    private String NombreV;
    public Vacuna(int Cod, String N, int D, int M, int A){
        super(D,M,A);
        this.CodVacuna=Cod;
        this.NombreV=N;
        this.Estado=1;
    }
    public void compruebaVacuna(){
        ClassFecha FechaActual=new ClassFecha();
        if(this.Estado==1){
            if(super.compruebaVencimiento(FechaActual)==false){
                this.setEstado(4);
            }
        }
    }
    public boolean compruebaVacuna2(){
        ClassFecha FechaActual=new ClassFecha();
        if(this.Estado==1){
            if(super.compruebaVencimiento(FechaActual)){
                return(true);
            }
        }
        return(false);
    }
    public String Informacion(){
        return("Codigo vacuna: "+this.getCodVacuna()+"\nNombre vacuna: "
                +this.getNombreV()+"\nEstado: "+this.getEstado()+"\nFecha de vencimiento: "+this.verFecha());
    }
    public int getCodVacuna() {
        return CodVacuna;
    }
    public void setCodVacuna(int CodVacuna) {
        this.CodVacuna = CodVacuna;
    }
    public int getEstado() {
        return Estado;
    }
    public void setEstado(int Estado) {
        this.Estado = Estado;
    }
    public String getNombreV() {
        return NombreV;
    }
    public void setNombreV(String NombreV) {
        this.NombreV = NombreV;
    }
}
