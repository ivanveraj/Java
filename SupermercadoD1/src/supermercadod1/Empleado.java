/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercadod1;

/**
 *
 * @author USUARIO
 */
public class Empleado extends Persona{
    private double Nomina;
    private String Rol;

    public Empleado(double Nomina, String Rol, int Documento, String Nombre) {
        super(Documento, Nombre);
        this.Nomina = Nomina;
        this.Rol = Rol;
    }

    public double getNomina() {
        return Nomina;
    }

    public void setNomina(double Nomina) {
        this.Nomina = Nomina;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }
    
}
