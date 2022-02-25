package danilobuitrago;

import java.util.Scanner;

public class DaniloBuitrago {

    public static void main(String[] args) {
        /*Queremos mantener una colección de los libros que hemos ido leyendo, asignándole una calificación
        según nos haya gustado más o menos al leerlo. Para ello, se debe crear una la clase para almacenar título,
        autor, número de páginas y la calificación (entre 0 y 10) de cada libro. Crear los métodos típicos para
        poder modificar y obtener los atributos si tienen sentido. Posteriormente, crear una clase que almacena
        un conjunto de libros (con un array de un tamaño fijo). Se pueden añadir libros que no existan (siempre
        que haya espacio), eliminar libros por título o autor, mostrar por pantalla los libros con la mayor y menor 
        calificación dada y, por último, mostrar un contenido de todo el conjunto.
Crear una clase (Main), que realice varias pruebas con las clases creadas. 
        En concreto, pruebe crear dos libros, añadirlos al conjunto, eliminarlos por los dos criterios
        hasta que el conjunto esté vacío, volver a añaadir un libro y mostrar el contenido final.

Nota: todas las clases, atributos, métodos y variables se deben escribir en inglés (los valores pueden estar escritos en español).*/
    int Menu;
        Scanner sn=new Scanner(System.in);
        System.out.println("Digite la cantidad de libros fijos");
        int Tam=sn.nextInt();
        Library C=new Library(Tam);
        do{
            System.out.println("[1Insertar libro\n[2]Eliminar\n[3]"
                    + "Mejor y menor calificacion\n[4]Informacion libros\n[5]Salir");
            Menu=sn.nextInt();
            switch(Menu){
                case 0:{
                    C.Add("El principito", "Antoine", 120, 8);
                    C.Add("Cien años de soledad","Gabriel García Márquez",300,10);
                    C.Add("Almas muertas","Nikolai",230,5);
                    C.Add("Las mil y una noches","Anonimo",121,8);
                    C.Print();
                    C.Delete(1,"Almas muertas");
                    C.Print();
                    C.Add("El mundo","Clark",130,7);
                    C.Print();
                    C.Delete(2,"Anonimo");
                    C.Print();
                    C.MaxMin();
                }break;
                case 1:{
                    System.out.println("Digite titulo del libro: ");
                    sn.nextLine();
                    String Title=sn.nextLine();
                    System.out.println("Digite autor del libro");
                    sn.nextLine();
                    String Author=sn.nextLine();
                    System.out.println("Digite cantidad de paginas");
                    int Pages=sn.nextInt();
                    System.out.println("Digite la calificacion del libro: ");
                    int Qualification=sn.nextInt();
                    C.Add(Title, Author, Pages, Qualification);
                }break;
                case 2:{
                    System.out.println("Digite \n[1]Eliminar por titulo\n[2]Eliminar por autor");
                    int Op = sn.nextInt();
                    if (Op == 1) {
                        System.out.println("Digite titulo del libro: ");
                        sn.nextLine();
                        String Title = sn.nextLine();
                        C.Delete(Op, Title);
                    } else if (Op == 2) {
                        System.out.println("Digite autor del libro");
                        sn.nextLine();
                        String Author = sn.nextLine();
                        C.Delete(Op, Author);
                    }
                }break;
                case 3:{
                    C.MaxMin();
                }break;
                case 4:{
                    C.Print();
                }break;
                case 5:{
                    System.out.println("Muchas gracias...");
                }break;
            }
        }while(Menu!=5);
    }
    
}
