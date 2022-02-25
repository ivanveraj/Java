/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author PC-JIVJ
 */
public class Estudiante {
    private int Documento;
    private String Nombre;
    private int Estrato;
    private int Modalidad;
    public Estudiante(int D, int E, int M, String N){
        this.Documento=D;
        this.Estrato=E;
        this.Nombre=N;
        this.Modalidad=M;
    }
    public int getDocumento() {
        return Documento;
    }
    public void setDocumento(int Documento) {
        this.Documento = Documento;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public int getEstrato() {
        return Estrato;
    }
    public void setEstrato(int Estrato) {
        this.Estrato = Estrato;
    }
    public int getModalidad() {
        return Modalidad;
    }
    public void setModalidad(int Modalidad) {
        this.Modalidad = Modalidad;
    }
    public String Informacion(){
        String I="Nombre del estudainte: "+getNombre()+"\nNumero de documento: "+getDocumento()+""
                + "\nEstrato del estudiante: "+getEstrato()+"\nModalidad: "+((getModalidad()==1)?"Presencial":"Virtual");
        return(I);
    }
}
