package Trabajo_3;

import Trabajo_2.Metodos;
import Trabajo_1.Materas;
import Trabajo_1.Abonos;
import Trabajo_1.Plantas;
import Cola.Cola;
import Pila.Pila;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Metodox {

    private Cola colaPlantassolares = new Cola();
    private Cola colaMaterasCera = new Cola();
    private Cola colaAbonos15 = new Cola();
    private Cola colaGlobal = new Cola();
    private Metodos M;

    public Metodox(int TP, int TM, int TA) {
        M = new Metodos(TP, TM, TA);
    }

    public Cola getColaPlantassolares() {
        return colaPlantassolares;
    }

    public void setColaPlantassolares(Cola colaPlantassolares) {
        this.colaPlantassolares = colaPlantassolares;
    }

    public Cola getColaMaterasCera() {
        return colaMaterasCera;
    }

    public void setColaMaterasCera(Cola colaMaterasCera) {
        this.colaMaterasCera = colaMaterasCera;
    }

    public Cola getColaAbonos15() {
        return colaAbonos15;
    }

    public void setColaAbonos15(Cola colaAbonos15) {
        this.colaAbonos15 = colaAbonos15;
    }

    public void IngresoInformacion2() {
        this.M.IngresarInformacion2();
        extraerInfoPlantas();
        extraerInfoMateras();
        extraerInfoAbonos();
        String X = this.ImprimirCola1();
        JOptionPane.showMessageDialog(null, X);
        String Y = this.ImprimirCola2();
        JOptionPane.showMessageDialog(null, Y);
        String Z = this.ImprimirCola3();
        JOptionPane.showMessageDialog(null, Z);
    }

    public void IngresoInformacion() {
        this.M.IngresarInformacion();
        extraerInfoPlantas();
        extraerInfoMateras();
        extraerInfoAbonos();
    }

    public void IncluirInfoArchivo() throws IOException {
        Archivo A = new Archivo("C:\\Users\\Usuario\\Downloads\\Estructura de datos", "ArchivoPlantas");
        A.crearArchivoPlano();
        Archivo A2 = new Archivo("C:\\Users\\Usuario\\Downloads\\Estructura de datos", "ArchivoMateras");
        A2.crearArchivoPlano();
        Archivo A3 = new Archivo("C:\\Users\\Usuario\\Downloads\\Estructura de datos", "ArchivoAbonos");
        A3.crearArchivoPlano();
        Archivo Global = new Archivo("C:\\Users\\Usuario\\Downloads\\Estructura de datos", "Global");
        Global.crearArchivoPlano();
        String X = this.ImprimirCola1();
        JOptionPane.showMessageDialog(null, X);
        String Y = this.ImprimirCola2();
        JOptionPane.showMessageDialog(null, Y);
        String Z = this.ImprimirCola3();
        JOptionPane.showMessageDialog(null, Z);
        A.agregarContenidoArchivoPlano(X);
        A2.agregarContenidoArchivoPlano(Y);
        A3.agregarContenidoArchivoPlano(Z);
        Global.agregarContenidoArchivoPlano(X);
        Global.agregarContenidoArchivoPlano(Y);
        Global.agregarContenidoArchivoPlano(Z);
        A.imprimirContenidoArchivoPlano();
        A2.imprimirContenidoArchivoPlano();
        A3.imprimirContenidoArchivoPlano();
        Global.imprimirContenidoArchivoPlano();
    }

    public void extraerInfoPlantas() {
        Pila<Plantas[]> AuxPlantas = new Pila();
        while (!this.M.pilaPlanta.estaVacia()) {
            int p = this.M.pilaPlanta.getElemento().length;
            Plantas[] vectorPlantas = new Plantas[p];
            vectorPlantas = this.M.pilaPlanta.getElemento();
            AuxPlantas.apilar((Plantas[]) this.M.pilaPlanta.getElemento());
            this.M.pilaPlanta.desapilar();
            for (int i = 0; i < p; i++) {
                if (vectorPlantas[i].getTipo() == 1) {
                    System.out.println("Plantas solares");
                    colaPlantassolares.encolar(vectorPlantas[i].Informacion());
                }
            }
        }
    }

    public void extraerInfoMateras() {
        Pila<Materas[]> AuxMateras = new Pila();
        while (!this.M.pilaMatera.estaVacia()) {
            int m = this.M.pilaMatera.getElemento().length;
            Materas[] vectorMateras = new Materas[m];
            vectorMateras = this.M.pilaMatera.getElemento();
            AuxMateras.apilar((Materas[]) this.M.pilaMatera.getElemento());
            this.M.pilaMatera.desapilar();
            for (int i = 0; i < m; i++) {
                if (vectorMateras[i].getMaterial().equals("Ceramica")) {
                    System.out.println("Ceramica");
                    colaMaterasCera.encolar(vectorMateras[i].Informacion());
                }
            }
        }
    }

    public void extraerInfoAbonos() {
        Pila<Abonos[]> AuxAbonos = new Pila();
        while (!this.M.pilaAbono.estaVacia()) {
            int a = this.M.pilaAbono.getElemento().length;
            Abonos[] vectorAbonos = new Abonos[a];
            vectorAbonos = this.M.pilaAbono.getElemento();
            AuxAbonos.apilar((Abonos[]) this.M.pilaAbono.getElemento());
            this.M.pilaAbono.desapilar();
            for (int i = 0; i < a; i++) {
                if (this.M.contarCaracteres(vectorAbonos[i].getDescripcion())) {
                    colaAbonos15.encolar(vectorAbonos[i].Informacion());
                }
            }
        }
    }

    public String ImprimirCola1() {
        String m = "Plantas solares almacenadas en la cola";
        while (!colaPlantassolares.estaVacia()) {
            m += colaPlantassolares.getElemento() + " \n";
            colaPlantassolares.desencolar();
        }
        return m;
    }

    public String ImprimirCola2() {
        String m = "Materas de ceramica almacenadas en la cola\n";
        while (!colaMaterasCera.estaVacia()) {
            m += colaMaterasCera.getElemento() + " \n";
            colaMaterasCera.desencolar();
        }
        return m;
    }

    public String ImprimirCola3() {
        String m = "Abonos con descripcion mayor a 15 caracteres almacenados en la cola\n";
        while (!colaAbonos15.estaVacia()) {
            m += colaAbonos15.getElemento() + "\n";
            colaAbonos15.desencolar();
        }
        return m;
    }
}
