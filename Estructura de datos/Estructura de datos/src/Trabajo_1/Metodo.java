package Trabajo_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Metodo {
    private Plantas[] P;
    private Materas[] M;
    private Abonos[] A;
    private int ErrorPlanta = 0, ErrorMatera = 0, ErrorAbono = 0;

    public Metodo(int tp, int tm, int ta) {
        this.P = new Plantas[tp];
        this.M = new Materas[tm];
        this.A = new Abonos[ta];
    }
    public Metodo() {
    }
    
    public void IngresarInfo() {
        this.IngresarPlantas();
        this.IngresarMateras();
        this.IngresarAbonos();
    }

    public boolean ValidacionNombre(String Nombre) {
        boolean R = false;
        Pattern pat = Pattern.compile(".*[^\\d]$");
        Matcher mat = pat.matcher(Nombre);
        if (mat.matches()) {
            R = true;
        }
        return R;
    }

    public Plantas[] IngresarPlantas() {
        for (int i = 0; i < this.P.length; i++) {
            int codigo, Precio, Tipo;
            String nombre, Cuidados;
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la planta: "));
            while (codigo <= 0) {
                this.ErrorPlanta++;
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Error, Ingrese el código de la planta: "));
            }
            nombre = JOptionPane.showInputDialog("Ingrese el nombre de la planta: ");
            while (ValidacionNombre(nombre) == false) {
                nombre = JOptionPane.showInputDialog("Error: Ingrese el nombre de la planta: ");
            }
            Precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de la planta: "));
            while (Precio < 99) {
                Precio = Integer.parseInt(JOptionPane.showInputDialog("Error: Ingrese el precio de la planta: "));
            }
            Tipo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de la planta\n[1]Solar\n[2]Sombra"));
            Cuidados = JOptionPane.showInputDialog("Ingrese los cuidados de la planta: ");
            this.P[i] = new Plantas(codigo, nombre, Precio, Tipo, Cuidados);
        }
        return this.P;
    }

    public String TipoMaterial(int X) {
        String Material = "";
        if (X == 0) {
            Material = "Barro";
        } else if (X == 1) {
            Material = "Ceramica";
        } else if (X == 2) {
            Material = "Cemento";
        } else if (X == 3) {
            Material = "Plastico";
        }
        return (Material);
    }

    public String TipoTamanio(int X) {
        String T = "";
        if (X == 0) {
            T = "Pequeño";
        } else if (X == 1) {
            T = "Mediano";
        } else if (X == 2) {
            T = "Grande";
        }
        return (T);
    }

    public Materas[] IngresarMateras() {
        for (int i = 0; i < this.M.length; i++) {
            int codigo, Precio, X, Y;
            String nombre, Material, Tamanio;
            String Botones[] = {"Barro", "Ceramica", "Cemento", "Plastico"};
            String BotonesT[] = {"Pequeño", "Mediano", "Grande"};
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la matera: "));
            while (codigo <= 0) {
                this.ErrorMatera++;
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Error, Ingrese el código de la matera: "));
            }
            nombre = JOptionPane.showInputDialog("Ingrese el nombre de la matera: ");
            while (ValidacionNombre(nombre) == false) {
                nombre = JOptionPane.showInputDialog("Error: Ingrese el nombre de la matera: ");
            }
            X = JOptionPane.showOptionDialog(null, " Ingrese el material", "Clic", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, Botones, Botones[0]);
            Material = TipoMaterial(X);
            Y = JOptionPane.showOptionDialog(null, " Ingrese el tamaño", "Clic", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, BotonesT, BotonesT[0]);
            Tamanio = TipoTamanio(Y);
            Precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de la matera: "));
            while (Precio < 99) {
                Precio = Integer.parseInt(JOptionPane.showInputDialog("Error: Ingrese el precio de la matera: "));
            }
            this.M[i] = new Materas(codigo, nombre, Precio, Material, Tamanio);
        }
        return this.M;
    }

    public Abonos[] IngresarAbonos() {
        for (int i = 0; i < this.A.length; i++) {
            int codigo, Precio;
            String nombre, Descripcion, Utilidad;
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la abono: "));
            while (codigo <= 0) {
                this.ErrorAbono++;
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Error, Ingrese el código de la abono: "));
            }
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del abono: ");
            while (ValidacionNombre(nombre) == false) {
                nombre = JOptionPane.showInputDialog("Error: Ingrese el nombre del abono: ");
            }
            Descripcion = JOptionPane.showInputDialog("Ingrese la descripcion del abono: ");
            Utilidad = JOptionPane.showInputDialog("Ingrese la utilidad del abono: ");
            Precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del abono: "));
            while (Precio < 99) {
                Precio = Integer.parseInt(JOptionPane.showInputDialog("Error: Ingrese el precio del abono: "));
            }
            this.A[i] = new Abonos(codigo, nombre, Precio, Descripcion, Utilidad);
        }
        return this.A;
    }


    /*public Plantas[] ingresarDatosP(int tm) { //sobrecarga ingreso plantas
        Plantas[] vp = new Plantas[tm];
        for (int i = 0; i < vp.length; i++) {
            vp[i] = new Plantas(val.validacionCodigoPlantas(Integer.parseInt(JOptionPane.showInputDialog("Ingrese [codigo] planta"))),
                    val.validarCaracteres(),
                    menuCuidados(), val.validacionPrecio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese [precio] planta:"))));
        }
        return vp;
    }*/

 /*public void ingresarDatosM() { //int cod, String nombre, String material, float tamaño, Int  precio
        for (int i = 0; i < m.length; i++) {
            m[i] = new Materas(Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo matera:")),
                    JOptionPane.showInputDialog("Ingrese nombre matera:").trim(),
                    JOptionPane.showInputDialog("Ingrese material:"),
                    JOptionPane.showInputDialog("Ingrese tamaño en [cm]:"),
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio:")));
        }
    }
    public Materas[] ingresarDatosM(int tm) { //Sobrecarga ingresar materas
        Materas[] vm = new Materas[tm];
        for (int i = 0; i < vm.length; i++) {
            vm[i] = new Materas(val.validacionCodigoMateras(Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo matera:"))),
                    val.validarCaracteres(),
                    menuMaterial(), menuTamaño(), val.validacionPrecio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio:"))));
        }
        return vm;
    }
    public void ingresarDatosA() { // int cod, String nombre,String descripcion, String utilidad, float precio
        for (int i = 0; i < ab.length; i++) {
            ab[i] = new Abonos(Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo abono:")),
                    JOptionPane.showInputDialog("Ingrese nombre abono:").trim(),
                    JOptionPane.showInputDialog("Ingrese descripcion:"),
                    JOptionPane.showInputDialog("Ingrese utilidad:"),
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio:")));
        }
    }

    public Abonos[] ingresarDatosA(int tm) { // sobrecarga ingreso abonos
        Abonos[] vab = new Abonos[tm];
        for (int i = 0; i < vab.length; i++) {
            vab[i] = new Abonos(val.validacionCodigoAbonos(Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo abono:"))),
                    val.validarCaracteres(),
                    JOptionPane.showInputDialog("Ingrese descripcion:"),
                    JOptionPane.showInputDialog("Ingrese utilidad:"),
                    val.validacionPrecio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio:"))));
        }
        return vab;
    }*/
    
    public int CantidadPlantasSombra() {
        int cont = 0;
        for (int i = 0; i <this.P.length; i++) {
            if (this.P[i].getTipo() == 2) {
                cont++;
            }
        }
        return cont;
    }

    public double TotalPrecioMateras() {
        double precio = 0;
        for (int i = 0; i <this.M.length; i++) {
            precio +=this.M[i].getPrecio();
        }
        return (precio);
    }

    public String ListaPlantasSolaresCuidados() {
        String msg = "";
        for (int i = 0; i <this.P.length; i++) {
            if (this.P[i].getTipo() == 1) {
                msg +=this.P[i].Informacion();
            }
        }
        return msg;
    }

    public String AbonoPrecioMayor() {
        String msg = "\n";
        for (int i = 0; i <this.A.length; i++) {
            if (this.A[i].getPrecio() > 6500) {
                msg += "Nombre: " + this.A[i].getNombre() + "\nUtilidad: " +this.A[i].getUtilidad()+"\n";
            }
        }
        return msg;
    }

    public String PrecioMasBajoPlanta() {
        int menor = 0;
        for (int i = 1; i <this.P.length; i++) {
            if (this.P[menor].getPrecio() >this.P[i].getPrecio()) {
                menor = i;
            }
        }
        return ("La planta con el precio mas bajo es: " + this.P[menor].getNombre());
    }

    public String PrecioMasBajoMatera() {
        int menor = 0;
        for (int i = 1; i <this.M.length; i++) {
            if (this.M[menor].getPrecio() >this.M[i].getPrecio()) {
                menor = i;
            }
        }
        return ("La matera con el precio mas bajo es: " +this.M[menor].getNombre());
    }

    public String PrecioMasBajoAbono() {
        int menor = 0;
        for (int i = 1; i <this.A.length; i++) {
            if (this.A[menor].getPrecio() >this.A[i].getPrecio()) {
                menor = i;
            }
        }
        return ("El abono con el precio mas bajo es: " +this.A[menor].getNombre());
    }
 
    public void InformacionRequerida() {
        JOptionPane.showMessageDialog(null, "La cantidad de plantas de sombra son: " +this.CantidadPlantasSombra());
        JOptionPane.showMessageDialog(null, "El total en pesos de todas las materas es: " +this.TotalPrecioMateras());
        JOptionPane.showMessageDialog(null, "Listado de plantas solares con sus cuidados: " +this.ListaPlantasSolaresCuidados());
        JOptionPane.showMessageDialog(null, "Listado de abonos con valor superior a 6500 COP: " +this.AbonoPrecioMayor());
        if (this.P.length>0) {
            JOptionPane.showMessageDialog(null, PrecioMasBajoPlanta());
        }
        if (this.M.length>0) {
            JOptionPane.showMessageDialog(null, PrecioMasBajoMatera());
        }
        if (this.A.length>0) {
            JOptionPane.showMessageDialog(null, PrecioMasBajoAbono());
        }
    }

    public Plantas[] getP() {
        return P;
    }

    public void setP(Plantas[] P) {
        this.P = P;
    }

    public Materas[] getM() {
        return M;
    }

    public void setM(Materas[] M) {
        this.M = M;
    }

    public Abonos[] getA() {
        return A;
    }

    public void setA(Abonos[] A) {
        this.A = A;
    }

    public int getErrorPlanta() {
        return ErrorPlanta;
    }

    public void setErrorPlanta(int ErrorPlanta) {
        this.ErrorPlanta = ErrorPlanta;
    }

    public int getErrorMatera() {
        return ErrorMatera;
    }

    public void setErrorMatera(int ErrorMatera) {
        this.ErrorMatera = ErrorMatera;
    }

    public int getErrorAbono() {
        return ErrorAbono;
    }

    public void setErrorAbono(int ErrorAbono) {
        this.ErrorAbono = ErrorAbono;
    }

    
}
