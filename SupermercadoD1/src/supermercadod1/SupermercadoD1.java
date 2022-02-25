/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercadod1;

public class SupermercadoD1 {
    public static void main(String[] args) {
        int CantidadProductosBodega = 30;
        Control C = new Control(CantidadProductosBodega);
        C.InicioSistema();
        Principal P = new Principal();
        P.Menu(C, C.getC());
        P.setVisible(true);
    }
}
