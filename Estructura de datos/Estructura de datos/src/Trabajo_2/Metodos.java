package Trabajo_2;

import Trabajo_1.Metodo;
import Trabajo_1.Plantas;
import Trabajo_1.Materas;
import Trabajo_1.Abonos;
import Pila.Pila;
import javax.swing.JOptionPane;

public class Metodos {

    public Pila<Plantas[]> pilaPlanta = new Pila();
    public Pila<Materas[]> pilaMatera = new Pila();
    public Pila<Abonos[]> pilaAbono = new Pila();
    public Metodo M;

    public Metodos(int TP, int TM, int TA) {
        this.M = new Metodo(TP, TM, TA);
    }

    public Pila<Plantas[]> getPilaPlanta() {
        return pilaPlanta;
    }

    public void setPilaPlanta(Pila<Plantas[]> pilaPlanta) {
        this.pilaPlanta = pilaPlanta;
    }

    public Pila<Materas[]> getPilaMatera() {
        return pilaMatera;
    }

    public void setPilaMatera(Pila<Materas[]> pilaMatera) {
        this.pilaMatera = pilaMatera;
    }

    public Pila<Abonos[]> getPilaAbono() {
        return pilaAbono;
    }

    public void setPilaAbono(Pila<Abonos[]> pilaAbono) {
        this.pilaAbono = pilaAbono;
    }

    public void IngresarInformacion() {
        boolean conf = false;
        do {
            if (JOptionPane.showConfirmDialog(null, "¿Desea ingresar informacion?") == JOptionPane.YES_NO_OPTION) {
                conf = true;
                pilaPlanta.apilar(this.M.IngresarPlantas());
                pilaMatera.apilar(this.M.IngresarMateras());
                pilaAbono.apilar(this.M.IngresarAbonos());
            } else {
                conf = false;
            }
            if (conf) {
                if (JOptionPane.showConfirmDialog(null, "¿Desea imprimir la informacion almacenada?") == JOptionPane.YES_NO_OPTION) {
                    this.ImprimirInformacionRequerida();
                    conf = true;
                }
            }
        } while (conf);
    }

    public void IngresarInformacion2() {
        pilaPlanta.apilar(this.M.IngresarPlantas());
        pilaMatera.apilar(this.M.IngresarMateras());
        pilaAbono.apilar(this.M.IngresarAbonos());
    }

    public void ImprimirInformacionRequerida() {
        JOptionPane.showMessageDialog(null, "Numero de errores en la digitacion de codigos\n"
                + "N equivocaciones plantas:" + this.M.getErrorPlanta() + "\n"
                + "N equivocaciones Abono: " + this.M.getErrorAbono() + "\n"
                + "N equivocaciones Matera: " + this.M.getErrorMatera());

        JOptionPane.showMessageDialog(null, "Lista tamaños vectores Plantas:\n" + tamañoVectoresP() + "\n"
                + "Lista tamaños vectores Materas: \n" + tamañoVectoresM() + "\n"
                + "Lista tamaños vectores Abonos: \n" + tamañoVectoresA());
        JOptionPane.showMessageDialog(null, PrecioMayor());
        JOptionPane.showMessageDialog(null, nombreMaterialMateras());
    }

    public String tamañoVectoresP() {
        String mnj = " ";
        Pila<Plantas[]> pilaAux = new Pila();

        while (!pilaPlanta.estaVacia()) {
            int tmVp = pilaPlanta.getElemento().length;
            mnj += tmVp;
            pilaAux.apilar(pilaPlanta.getElemento());
            pilaPlanta.desapilar();
        }
        armarPilaPlantas(pilaAux);
        return mnj;
    }

    public String tamañoVectoresM() {
        String mnj = " ";
        Pila<Materas[]> pilaAux = new Pila();

        while (!pilaMatera.estaVacia()) {
            int tmVm = pilaMatera.getElemento().length;
            mnj += tmVm;
            pilaAux.apilar(pilaMatera.getElemento());
            pilaMatera.desapilar();
        }
        armarPilaMateras(pilaAux);
        return mnj;
    }

    public String tamañoVectoresA() {
        String mnj = " ";
        Pila<Abonos[]> pilaAux = new Pila();

        while (!pilaAbono.estaVacia()) {
            int tmVa = pilaAbono.getElemento().length;
            mnj += tmVa;
            pilaAux.apilar(pilaAbono.getElemento());
            pilaAbono.desapilar();
        }
        armarPilaAbonos(pilaAux);
        return mnj;
    }

    public String PrecioMayor() {
        int precioMayorP = 0, precioMayorM = 0, precioMayorA = 0;
        Pila<Plantas[]> pilaAuxP = new Pila();
        Pila<Materas[]> pilaAuxM = new Pila();
        Pila<Abonos[]> pilaAuxA = new Pila();
        while (!pilaPlanta.estaVacia()) {
            int p = pilaPlanta.getElemento().length;
            Plantas[] auxP = new Plantas[p];
            auxP = pilaPlanta.getElemento();
            pilaAuxP.apilar(pilaPlanta.getElemento());
            pilaPlanta.desapilar();
            for (int i = 0; i < auxP.length; i++) {
                if (auxP[i].getPrecio() > precioMayorP) {
                    precioMayorP = auxP[i].getPrecio();
                }
            }
        }

        while (!pilaMatera.estaVacia()) {
            int m = pilaMatera.getElemento().length;
            Materas[] auxM = new Materas[m];
            auxM = pilaMatera.getElemento();
            pilaAuxM.apilar(pilaMatera.getElemento());
            pilaMatera.desapilar();

            for (int i = 0; i < auxM.length; i++) {
                if (auxM[i].getPrecio() > precioMayorM) {
                    precioMayorM = auxM[i].getPrecio();
                }
            }
        }

        while (!pilaAbono.estaVacia()) {
            int a = pilaAbono.getElemento().length;
            Abonos[] auxA = new Abonos[a];
            auxA = pilaAbono.getElemento();
            pilaAuxA.apilar(pilaAbono.getElemento());
            pilaAbono.desapilar();

            for (int i = 0; i < auxA.length; i++) {
                if (auxA[i].getPrecio() > precioMayorA) {
                    precioMayorA = auxA[i].getPrecio();
                }
            }
        }
        armarPilaPlantas(pilaAuxP);
        armarPilaMateras(pilaAuxM);
        armarPilaAbonos(pilaAuxA);

        return "El mayor precio [Plantas]: " + precioMayorP + "\nEl mayor precio [Materas]: " + precioMayorM + "\nEl mayor precio [Abonos]: " + precioMayorA;
    }

    public String PrecioMenor() {

        int precioMenorP;
        int precioMenorM;
        int precioMenorA;

        Pila<Plantas[]> pilaAuxP = new Pila();
        Pila<Materas[]> pilaAuxM = new Pila();
        Pila<Abonos[]> pilaAuxA = new Pila();

        int m = pilaPlanta.getElemento().length;
        Plantas[] menor = new Plantas[m];
        menor = pilaPlanta.getElemento();
        precioMenorP = menor[0].getPrecio();

        System.out.print(precioMenorP);

        while (!pilaPlanta.estaVacia()) {

            int tvp = pilaPlanta.getElemento().length;
            Plantas[] auxP = new Plantas[tvp];
            auxP = pilaPlanta.getElemento();
            pilaAuxP.apilar(pilaPlanta.getElemento());
            pilaPlanta.desapilar();

            for (int i = 0; i < auxP.length; i++) {
                if (precioMenorP > auxP[i].getPrecio()) {
                    precioMenorP = auxP[i].getPrecio();
                }
            }
        }

        int ma = pilaMatera.getElemento().length;
        Materas[] menora = new Materas[ma];
        menora = pilaMatera.getElemento();
        precioMenorM = menora[0].getPrecio();
        System.out.print(precioMenorM);

        while (!pilaMatera.estaVacia()) {

            int tvm = pilaMatera.getElemento().length;
            Materas[] auxM = new Materas[tvm];
            auxM = pilaMatera.getElemento();
            pilaAuxM.apilar(pilaMatera.getElemento());
            pilaMatera.desapilar();

            for (int i = 0; i < auxM.length; i++) {

                if (precioMenorM > auxM[i].getPrecio()) {
                    precioMenorM = auxM[i].getPrecio();
                }
            }
        }

        int mae = pilaAbono.getElemento().length;
        Abonos[] menorae = new Abonos[mae];
        menorae = pilaAbono.getElemento();
        precioMenorA = menorae[0].getPrecio();

        while (!pilaAbono.estaVacia()) {

            int tva = pilaAbono.getElemento().length;
            Abonos[] auxA = new Abonos[tva];
            auxA = pilaAbono.getElemento();
            pilaAuxA.apilar(pilaAbono.getElemento());
            pilaAbono.desapilar();

            for (int i = 0; i < auxA.length; i++) {
                if (precioMenorA > auxA[i].getPrecio()) {
                    precioMenorA = auxA[i].getPrecio();
                }
            }
        }
        this.pilaPlanta = armarPilaPlantas(pilaAuxP);
        this.pilaMatera = armarPilaMateras(pilaAuxM);
        this.pilaAbono = armarPilaAbonos(pilaAuxA);
        return "El menor precio [Plantas]: " + precioMenorP + "\nEl menor precio [Materas]: " + precioMenorM + "\nEl menor precio [Abonos]: " + precioMenorA;
    }

    public Pila armarPilaPlantas(Pila pilaAux) {
        while (!pilaAux.estaVacia()) {
            pilaPlanta.apilar((Plantas[]) pilaAux.getElemento());
            pilaAux.desapilar();
        }
        return pilaPlanta;
    }

    public Pila armarPilaMateras(Pila pilaAux) {
        while (!pilaAux.estaVacia()) {
            pilaMatera.apilar((Materas[]) pilaAux.getElemento());
            pilaAux.desapilar();
        }
        return pilaMatera;
    }

    public Pila armarPilaAbonos(Pila pilaAux) {
        while (!pilaAux.estaVacia()) {
            pilaAbono.apilar((Abonos[]) pilaAux.getElemento());
            pilaAux.desapilar();
        }
        return pilaAbono;
    }

    public String nombreMaterialMateras() {
        String mnj = "";
        Pila pilaAux = new Pila();
        int contB = 0, contC = 0, contCe = 0, contPla = 0;
        while (!pilaMatera.estaVacia()) {
            int tm = pilaMatera.getElemento().length;
            Materas[] Maux = new Materas[tm];
            Maux = pilaMatera.getElemento();
            pilaAux.apilar(pilaMatera.getElemento());
            pilaMatera.desapilar();
            for (int i = 0; i < Maux.length; i++) {
                if (Maux[i].getMaterial().equals("Barro")) {
                    contB++;
                } else if (Maux[i].getMaterial().equals("Ceramica")) {
                    contC++;
                } else if (Maux[i].getMaterial().equals("Cemento")) {
                    contCe++;
                } else if (Maux[i].getMaterial().equals("Plastico")) {
                    contPla++;
                }
            }
        }

        if (contB > contC && contB > contCe && contB > contPla) {
            mnj = "El material mas utilizado en las materas es:\n "
                    + "[ Barro ]";
        } else if (contC > contCe && contC > contPla) {
            mnj = "El material mas utilizado en las materas es:\n "
                    + "[ Ceramica ]";
        } else if (contCe > contPla) {
            mnj = "El material mas utilizado en las materas es:\n "
                    + "[ Cemento ]";
        } else {
            mnj = "El material mas utilizado en las materas es:\n "
                    + "[ Plastico ]";
        }
        armarPilaMateras(pilaAux);
        return mnj;
    }

    public boolean contarCaracteres(String m) {
        if (m.length() > 15) {
            return true;
        }
        return false;
    }

}
