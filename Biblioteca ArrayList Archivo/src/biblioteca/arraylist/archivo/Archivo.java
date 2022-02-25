package biblioteca.arraylist.archivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.APPEND;

public class Archivo {

    private String rutaCompleta;

    public Archivo(String rutaArchivoPlano, String nombreArchivoPlano) throws IOException {
        rutaCompleta = rutaArchivoPlano + "\\" + nombreArchivoPlano + ".txt";
    }

    public void crearArchivoPlano() throws IOException {
        Path ruta = Paths.get(rutaCompleta);
        BufferedWriter escritor = null;
        try {
            escritor = Files.newBufferedWriter(ruta);
        } catch (IOException ioe) {
            System.out.println(ioe);
        } finally {
            if (escritor != null) {
                escritor.close();
            }
        }
    }

    public void agregarContenidoArchivoPlano(String informacion) throws IOException {
        Path ruta = Paths.get(rutaCompleta);
        BufferedWriter escritor = null;
        try {
            escritor = Files.newBufferedWriter(ruta, APPEND);
            escritor.write(informacion);
        } catch (IOException ioe) {
            System.out.println(ioe);
        } finally {
            if (escritor != null) {
                escritor.close();
            }
        }
    }

    public void imprimirContenidoArchivoPlano() throws IOException {
        Path ruta = Paths.get(rutaCompleta);
        String contenido = "";
        String linea;
        BufferedReader lector = null;
        try {
            lector = Files.newBufferedReader(ruta);
            while ((linea = lector.readLine()) != null) {
                contenido += linea + "\n";
            }
        } catch (IOException ioe) {
            System.err.println(ioe);
        } finally {
            if (lector != null) {
                lector.close();
            }
        }
        System.out.print(contenido);
    }
}
