
package academiaadasoft;

import java.io.*;

public class Archivos  
{
 /*Las clases FileReader y FileWriter permiten leer y escribir, respectivamente, en un archivo,
     *lo primero que se debe hacer es importar la libreria de estas clases, es java.io.
     *y luego crear un objeto de estas clases, deben estar dentro de un try-catch para controlar las excepciones.
     *PrintWriter Es el objeto que utilizamos para escribir directamente sobre el archivo de texto.*/
     
/*BufferedReader es una clase cuyas instancias permiten hacer lecturas sencillas de texto desde un flujo de caracteres, 
 *debido a que esta clase trabaja con su propio buffer provee una lectura eficiente de caracteres, arreglos y lineas de texto. */     
     
    File Arch;//archivo logico
    FileReader ArchLectura;//objeto para modo lectura del archivo
    BufferedReader Buffer;//objeto que reserva un espacio en memoria donde se guarda la informacion
    FileWriter ArchEscritura;//objeto para modo escritura del archivo
    PrintWriter objImpresion;//objeto para grabar directamente en el texto
   
    public String[] LeerRegistro(int tama)//retorna el registro con su estructura definida por split y recibe el tamaño para el vector
    {
        String Reg;
        String vec[];
        vec=new String[tama];//se crea un vector para que el registro sea de String con su tamaño
        try
        {
            Reg=Buffer.readLine();//lee una línea de texto. Una línea se considera terminada por cualquiera de un salto de línea
            vec=Reg.split(",");//metodo mas apropiado para dividir una cadena es  String.split(TOKEN o separador)
        }
        catch(Exception objException)
        {
            objException.getMessage();          
        }
        return vec;
    }//fin de leer reg
    
    public String EscribirRegistro(String Reg)//graba el texto se dice que lo imprime en el archivo
    {
        String mensaje="Grabar un registro";
        try{            
            objImpresion.print(Reg);//Básicamente, puede usar un PrintWriter para escribir en un archivo tal como lo haría con System
            objImpresion.println(); 
        }
        catch(Exception objException){
            mensaje=objException.getMessage(); //se captura el mensaje de la excepcion y se retorna         
        }
        return mensaje;
    }//fin de grabar el registro separado
    
    public String AbrirArchivoModoLectura(String ruta)
    {
        String mensaje="¡El archivo se abrirá de Modo lectura!";
        try{
            Arch= new File(ruta);
            ArchLectura= new FileReader(Arch);
            Buffer = new BufferedReader(ArchLectura);
        }
        catch(Exception objException){
            mensaje=objException.getMessage();          
        }
        return mensaje;
    }//fin de abrir modo lectura
    
    public String CerrarArchivoModoLectura()
    {
        String mensaje="¡El archivo se cerrará de Modo lectura!";
        try{
           Buffer.close();
        }
        catch(Exception objException){
            mensaje=objException.getMessage();          
        }
        return mensaje;
    }//fin de cerrar modo lectura
        
    public String AbrirArchivoModoEscritura(String ruta)
    {
        String mensaje="¡El archivo se abrirá de Modo escritura!";
        try{
            Arch= new File(ruta);
            ArchEscritura= new FileWriter(Arch,true);
            objImpresion = new PrintWriter(ArchEscritura);
        }
        catch(Exception objException){
            mensaje=objException.getMessage();          
        }
        return mensaje;
    }//fin de abrir modo escritura
    
    public String CerrarArchivoModoEscritura()
    {
        String mensaje="¡El archivo se cerrará de Modo escritura!";
        try{
            
            objImpresion.close();
        }
        catch(Exception objException){
            mensaje=objException.getMessage();          
        }
        return mensaje;
    }//fin de cerrar modo escritura

  
}//fin clase archivo
    

