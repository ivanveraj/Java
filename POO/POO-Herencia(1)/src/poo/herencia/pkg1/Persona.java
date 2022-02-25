/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.herencia.pkg1;

/**
 *
 * @author MILE-IVA
 */
public class Persona {
    private int Edad,Doc;
    private String Nombre;
    public Persona(int X, int Y, String Z){
        this.Edad=X;
        this.Doc=Y;
        this.Nombre=Z;
    }
    public void setEdad (int X){
        this.Edad=X;
    }
    public int getEdad (){
        return(this.Edad);
    }

    public int getDoc() {
        return(this.Doc);
    }

    public void setDoc(int Doc) {
        this.Doc = Doc;
    }

    public String getNombre() {
        return(this.Nombre);
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
