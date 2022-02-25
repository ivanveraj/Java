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
public class POOHerencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Vendedor E=new Vendedor (10,11,"Ivan");
       E.setSalario(5000);
       E.setBonificacion(1000);
       E.setVentas(10000);
       E.setComision(2);
       System.out.println("El nombre del trabajador "+E.getNombre()+" Doc "+E.getDoc()+" Bonificacion "+E.getBonificacion()
       +" Salario "+E.getSalario()+" su comision es de "+E.getComision()+" y sus ventas "+E.getVentas());
    }
    
}
