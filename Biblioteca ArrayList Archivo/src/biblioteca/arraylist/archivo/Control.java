/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.arraylist.archivo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Control {

    private ArrayList<Material> M;
    private ArrayList<Video> V;
    private ArrayList<Libro> L;
    private ArrayList<Revista> R;
    private Archivo A;

    public Control() throws IOException {
        this.V = new ArrayList<Video>();
        this.L = new ArrayList<Libro>();
        this.R = new ArrayList<Revista>();
        this.A = new Archivo("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Biblioteca ArrayList Archivo", "DatosBiblioteca");
        this.A.imprimirContenidoArchivoPlano();
    }
     /*
    Autor: Johan Alvarez
    AgregarVideo()
    Es un formulario en el cual se guarda la informacion en las variables y se crea un objeto de tipo video
    despues se guarda en el arraylist de tipo video y se guarda la informacion en el archivo .txt
    */
    public void AgregarVideo() throws IOException {
        Scanner sn = new Scanner(System.in);
        System.out.println("Digite la duracion: ");
        int Duracion = sn.nextInt();
        System.out.println("Digite el formato  (MP4, AVI, MKV): ");
        sn.nextLine();
        String Formato = sn.nextLine();
        System.out.println("Digite el numero de inventario: ");
        int NInventario = sn.nextInt();
        System.out.println("Digite el ISBN");
        int ISBN = sn.nextInt();
        System.out.println("Digite el titulo");
        sn.nextLine();
        String Titulo = sn.nextLine();
        System.out.println("Digite el la descripcion");
        String Descripcion = sn.nextLine();
        System.out.println("Digite el autor");
        String Autor = sn.nextLine();
        Video X = new Video(Duracion, Formato, NInventario, ISBN, Titulo, Descripcion, Autor);
        this.A.agregarContenidoArchivoPlano(X.toString());
        this.V.add(X);
        System.out.println("Video agregado correctamente");
    }
     /*
    Autor: Johan Alvarez
    AgregarLibro()
    Es un formulario en el cual se guarda la informacion en las variables y se crea un objeto de tipo libro
    despues se guarda en el arraylist de tipo libro y se guarda la informacion en el archivo .txt
    */
    public void AgregarLibro() throws IOException {
        Scanner sn = new Scanner(System.in);
        System.out.println("Digite el numero de capitulos");
        int NCapitulos = sn.nextInt();
        System.out.println("Digite el numero de edicion");
        int NEdicion = sn.nextInt();
        System.out.println("Digite el genero principal");
        sn.nextLine();
        String Genero = sn.nextLine();
        System.out.println("digite la cantidad de paginas");
        int CantPaginas = sn.nextInt();
        System.out.println("Digite el numero de inventario: ");
        int NInventario = sn.nextInt();
        System.out.println("Digite el ISBN");
        int ISBN = sn.nextInt();
        System.out.println("Digite el titulo");
        sn.nextLine();
        String Titulo = sn.nextLine();
        System.out.println("Digite el la descripcion");
        String Descripcion = sn.nextLine();
        System.out.println("Digite el autor");
        String Autor = sn.nextLine();
        Libro X = new Libro(NCapitulos, NEdicion, Genero, CantPaginas, NInventario, ISBN, Titulo, Descripcion, Autor);
        this.L.add(X);
        this.A.agregarContenidoArchivoPlano(X.toString());
        System.out.println("Libro agregado correctamente");
    }
    /*
    Autor: Johan Alvarez
    AgregarRevista()
    Es un formulario en el cual se guarda la informacion en las variables y se crea un objeto de tipo revista
    despues se guarda en el arraylist de tipo revista y se guarda la informacion en el archivo .txt
    */
    public void AgregarRevista() throws IOException {
        Scanner sn = new Scanner(System.in);
        System.out.println("Digite la cantidad de articulos: ");
        int CantArticulos = sn.nextInt();
        System.out.println("Digite la frecuencia de paginas (Diaria, Semanal, Mensual): ");
        sn.nextLine();
        String FrecuenciaP = sn.nextLine();
        System.out.println("Digite la cantidad de paginas");
        int CantPaginas = sn.nextInt();
        System.out.println("Digite el numero de inventario: ");
        int NInventario = sn.nextInt();
        System.out.println("Digite el ISBN");
        int ISBN = sn.nextInt();
        System.out.println("Digite el titulo");
        sn.nextLine();
        String Titulo = sn.nextLine();
        System.out.println("Digite el la descripcion");
        String Descripcion = sn.nextLine();
        System.out.println("Digite el autor");
        String Autor = sn.nextLine();
        Revista X = new Revista(CantArticulos, FrecuenciaP, CantPaginas, NInventario, ISBN, Titulo, Descripcion, Autor);
        this.R.add(X);
        this.A.agregarContenidoArchivoPlano(X.toString());
        System.out.println("Revista agregado correctamente");
    }
    /*
    Autor: Johan Alvarez
    ModificarVideo()
    Es un formulario en el cual se guarda la informacion en las variables, ademas se hace una busqueda por el isbn del material
    pues este campo es unico para cada material, despues se hace uso de los set y se cambia la informacion
    */
    public void ModificarVideo(int ISBN) {
        int B = BuscarVideo(ISBN);
        if (B != -1) {
            Scanner sn = new Scanner(System.in);
            System.out.println("Digite la duracion: ");
            int Duracion = sn.nextInt();
            System.out.println("Digite el formato (MP4, AVI, MKV): ");
            String Formato = sn.nextLine();
            System.out.println("Digite el numero de inventario: ");
            int NInventario = sn.nextInt();
            System.out.println("Digite el titulo");
            String Titulo = sn.nextLine();
            System.out.println("Digite el la descripcion");
            String Descripcion = sn.nextLine();
            System.out.println("Digite el autor");
            String Autor = sn.nextLine();
            this.V.get(B).setAutor(Autor);
            this.V.get(B).setDescripcion(Descripcion);
            this.V.get(B).setDuracion(Duracion);
            this.V.get(B).setNInventario(NInventario);
            this.V.get(B).setTitulo(Titulo);
            this.V.get(B).setFormato(Formato);
        }
    }
   /*
    Autor: Johan Alvarez
    ModificarLibro()
    Es un formulario en el cual se guarda la informacion en las variables, ademas se hace una busqueda por el isbn del material
    pues este campo es unico para cada material, despues se hace uso de los set y se cambia la informacion
    */
    public void ModificarLibro(int ISBN) {
        int B = BuscarVideo(ISBN);
        if (B != -1) {
            Scanner sn = new Scanner(System.in);
            System.out.println("Digite el numero de capitulos");
            int NCapitulos = sn.nextInt();
            System.out.println("Digite el numero de edicion");
            int NEdicion = sn.nextInt();
            System.out.println("Digite el genero principal");
            sn.nextLine();
            String Genero = sn.nextLine();
            System.out.println("Digite el numero de inventario: ");
            int NInventario = sn.nextInt();
            System.out.println("Digite el titulo");
            sn.nextLine();
            String Titulo = sn.nextLine();
            System.out.println("Digite el la descripcion");
            String Descripcion = sn.nextLine();
            System.out.println("Digite el autor");
            String Autor = sn.nextLine();
            this.L.get(B).setNCapitulos(NCapitulos);
            this.L.get(B).setNEdicion(NEdicion);
            this.L.get(B).setAutor(Autor);
            this.L.get(B).setGenero(Genero);
            this.L.get(B).setDescripcion(Descripcion);
            this.L.get(B).setNInventario(NInventario);
            this.L.get(B).setTitulo(Titulo);
        }
    }
   /*
    Autor: Johan Alvarez
    ModificarRevista()
    Es un formulario en el cual se guarda la informacion en las variables, ademas se hace una busqueda por el isbn del material
    pues este campo es unico para cada material, despues se hace uso de los set y se cambia la informacion
    */
    public void ModificarRevista(int ISBN) {
        int B = BuscarRevista(ISBN);
        if (B != -1) {
            Scanner sn = new Scanner(System.in);
            System.out.println("Digite la cantidad de articulos: ");
            int CantArticulos = sn.nextInt();
            System.out.println("Digite la frecuencia de paginas: ");
            sn.nextLine();
            String FrecuenciaP = sn.nextLine();
            System.out.println("Digite el numero de inventario: ");
            int NInventario = sn.nextInt();
            System.out.println("Digite el titulo");
            sn.nextLine();
            String Titulo = sn.nextLine();
            System.out.println("Digite el la descripcion");
            String Descripcion = sn.nextLine();
            System.out.println("Digite el autor");
            String Autor = sn.nextLine();
            this.R.get(B).setCantArticulos(CantArticulos);
            this.R.get(B).setFrecuenciaP(FrecuenciaP);
            this.R.get(B).setAutor(Autor);
            this.R.get(B).setDescripcion(Descripcion);
            this.R.get(B).setNInventario(NInventario);
            this.R.get(B).setTitulo(Titulo);
        }
    }
   /*
    Autor: Johan Alvarez
   BuscarVideo()
   Hace un while para que se pase por todo el arraylist y verifique si esta el isbn que se solicita, sino es asi devuelve
    -1 que significa que no lo encontro
    */
    public int BuscarVideo(int ISBN) {
        int i = 0;
        while (i < this.V.size()) {
            if (this.V.get(i).getISBN() == 1) {
                return (i);
            }
        }
        return (-1);
    }
   /*
    Autor: Johan Alvarez
   BuscarLibro()
   Hace un while para que se pase por todo el arraylist y verifique si esta el isbn que se solicita, sino es asi devuelve
    -1 que significa que no lo encontro
    */
    public int BuscarLibro(int ISBN) {
        int i = 0;
        while (i < this.L.size()) {
            if (this.L.get(i).getISBN() == 1) {
                return (i);
            }
        }
        return (-1);
    }
   /*
    Autor: Johan Alvarez
   BuscarRevista()
   Hace un while para que se pase por todo el arraylist y verifique si esta el isbn que se solicita, sino es asi devuelve
    -1 que significa que no lo encontro
    */
    public int BuscarRevista(int ISBN) {
        int i = 0;
        while (i < this.R.size()) {
            if (this.R.get(i).getISBN() == 1) {
                return (i);
            }
        }
        return (-1);
    }
/*
    Autor: Johan Alvarez
   ListadoVideo()
    Con el uso de un for imprime la informacion almacenada en el arraylist haciendo uso del metodo toString()
    */
    public void ListadoVideo() {
        for (int i = 0; i < this.V.size(); i++) {
            System.out.println(this.V.get(i).toString());
        }
    }
/*
    Autor: Johan Alvarez
   ListadoLibro()
    Con el uso de un for imprime la informacion almacenada en el arraylist haciendo uso del metodo toString()
    */
    public void ListadoLibro() {
        for (int i = 0; i < this.L.size(); i++) {
            System.out.println(this.L.get(i).toString());
        }
    }
/*
    Autor: Johan Alvarez
   ListadoRevista()
    Con el uso de un for imprime la informacion almacenada en el arraylist haciendo uso del metodo toString()
    */
    public void ListadoRevista() {
        for (int i = 0; i < this.R.size(); i++) {
            System.out.println(this.R.get(i).toString());
        }
    }

}
