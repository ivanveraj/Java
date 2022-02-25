/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase4;

/**
 *
 * @author iser
 */
public class Estudiante {
    private int cod,sex,edad;
    private String nomb;
    public Estudiante(){
        System.out.println("INICIO");
        this.cod=123;
        this.nomb="Juan";
        this.edad=0;
        this.sex=0;
        System.out.println("Fin");
    }
    public void setCod(int x){
        this.cod=x;
    }
    public void setNomb(String x){
        this.nomb=x;
    }
    public void setEdad(int x){
        this.edad=x;
    }
    public void setSex(int x){
        this.sex=x;
    }
    public int getCod(){
        return(this.cod);
    }
    public String getNomb(){
        return(this.nomb);
    }
    public int getEdad(){
        return(this.edad);
    }
    public int getSex(){
        return(this.sex);
    }
}
