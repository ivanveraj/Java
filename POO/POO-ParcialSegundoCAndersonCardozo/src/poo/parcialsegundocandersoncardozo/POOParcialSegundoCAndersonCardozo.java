/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.parcialsegundocandersoncardozo;

public class POOParcialSegundoCAndersonCardozo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaseControl C=new ClaseControl();
        C.CrearVacuna(1, "Pfizer", 6, 6, 2021);
        C.CrearVacuna(2, "Pfizer2", 6, 6, 2021);
        C.CrearVacuna(3, "Pfizer3", 4, 6, 2021);
        C.CrearVacuna(4, "Pfize4", 9, 6, 2021);
        C.CrearVacuna(5, "Pfizer5", 6, 6, 2021);
        C.CrearVacuna(6, "Pfizer6", 4, 6, 2021);
        C.CrearVacuna(7, "Pfizer7", 4, 6, 2021);
        System.out.println(C.InformacionVacuna(5));
        System.out.println(C.aplicarVacuna(2));
        System.out.println(C.aplicarVacuna());
        System.out.println(C.informeAlerta(3));
        C.InformeInventario();
    }
    
}
