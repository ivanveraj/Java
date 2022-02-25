/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeinformacioncine_danilo_buitrago;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class SistemaDeInformacionCine_Danilo_Buitrago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Menu;
        Scanner sn=new Scanner(System.in);
        System.out.println("Digite el codigo del teatro");
        int Code=sn.nextInt();
        System.out.println("Digite el nombre del teatro: ");
        sn.nextLine();
        String Name=sn.nextLine();
        System.out.println("Digite el municipio del teatro: ");
        String Municipally=sn.nextLine();
        System.out.println("Digite la cantidad de salas del teatro");
        int Cant=sn.nextInt();
        Teatro T=new Teatro(Code, Name, Municipally,Cant);
        do{
            System.out.println("[0]Pruebas\n[1]Crear Sala\n[2]Eliminar Sala\n[3]"
                    + "Modificar Sala\n[4]Consultar Sala\n[5]Crear Pelicula\n[6]Eliminar Pelicula\n[7]"
                    + "Modificar Pelicula\n[8]Consultar Pelicula\n[9]Consultar teatro\n[10]Modificar teatro\n[11]Salir");
            Menu=sn.nextInt();
            switch(Menu){
                case 0:{
                    T.Create(1010, "Sala 1", 1000, 4);
                    T.Create(1011, "Sala 2", 1111, 3);
                     T.CreateMovie(1010,3333,"Rapidos y furiosos 9", "Fast and furious", "Accion",123, "Carros y mas carros", "24/06/2021", "Solo tarde");
                    T.CreateMovie(1010,2222,"Rapidos y furiosos 5", "Fast and furious 5", "Accion",120, "Carros y mas carros", "23/06/2021", "Solo tarde");
                    T.ConsultarMovie(1011,"Rapidos y furiosos 9");
                    T.ConsultarMovie(1010,"Rapidos y furiosos 9");
                    //T.Modify(1010);
                    /*T.Consultar(1010);
                    T.CreateMovie(1010,22,"Rapidos y furiosos 9", "Fast and furious", "Accion",123, "Carros y mas carros", "24/06/2021", "Solo tarde");
                    T.CreateMovie(1010,23,"Rapidos y furiosos 5", "Fast and furious 5", "Accion",120, "Carros y mas carros", "23/06/2021", "Solo tarde");
                    T.CreateMovie(1011,56,"Rapidos y furiosos 3", "Fast and furious 5", "Accion",120, "Carros y mas carros", "23/06/2021", "Solo tarde");
                    T.Consultar(1011);
                    T.ConsultarMovie(1011,"Rapidos y furiosos 9");
                    T.ConsultarMovie(1010,"Rapidos y furiosos 5");
                    T.ConsultarMovie(1010, "Rapidos y furiosos 3");
                    T.DeleteMovie(1010, "Rapidos y furiosos 9");
                    T.ConsultarMovie(1010,"Rapidos y furiosos 5");*/
                }break;
                case 1:{
                    System.out.println("Digite el codigo de la sala");
                    int C=sn.nextInt();
                    System.out.println("Digite el nombre de la sala");
                    sn.nextLine();
                    String N=sn.nextLine();
                    System.out.println("Digite la capacidad de la sala");
                    int Cap=sn.nextInt();
                    System.out.println("Digite la cantidad de peliculas de la sala");
                    int Peliculas=sn.nextInt();
                    T.Create(C, N, Cap, Peliculas);
                }break;
                case 2:{
                    System.out.println("Digite el codigo de la sala");
                    int C=sn.nextInt();
                    T.Delete(C);
                }break;
                case 3:{
                    System.out.println("Digite el codigo de la sala");
                    int C=sn.nextInt();
                    T.Modify(C);
                }break;
                case 4:{
                    System.out.println("Digite el codigo de la sala");
                    int C=sn.nextInt();
                    T.Consultar(C);
                }break;
                case 5:{
                    System.out.println("Digite el codigo de la sala");
                    int C=sn.nextInt();
                    System.out.println("Digite el codigo de la pelicula");
                    int CodeP=sn.nextInt();
                    System.out.println("Digite el nombre de la pelicula");
                    sn.nextLine();
                    String N=sn.nextLine();
                    System.out.println("Digite el poster de la pelicula");
                    String P=sn.nextLine();
                    System.out.println("Digite el genero de la pelicula");
                    String G=sn.nextLine();
                    System.out.println("Digite la duracion de la pelicula");
                    int D=sn.nextInt();
                    System.out.println("Digite la descripcion de la pelicula");
                    sn.nextLine();
                    String Desc=sn.nextLine();
                    System.out.println("Digite la fecha de estreno de la pelicula");
                    String F=sn.nextLine();
                    System.out.println("Digite la horario de la pelicula");
                    String H=sn.nextLine();
                    T.CreateMovie(C, CodeP, N, P, G, D, Desc, F, H);
                }break;
                case 6:{
                    System.out.println("Digite el codigo de la sala");
                    int CS=sn.nextInt();
                    System.out.println("Digite el nombre de la pelicula");
                    sn.nextLine();
                    String CP=sn.nextLine();
                    T.DeleteMovie(CS, CP);
                }break;
                case 7:{
                    System.out.println("Digite el codigo de la sala");
                    int CS=sn.nextInt();
                    System.out.println("Digite el nombre de la pelicula");
                    sn.nextLine();
                    String CP=sn.nextLine();
                    T.ModifyMovie(CS, CP);
                }break;
                case 8:{
                    System.out.println("Digite el codigo de la sala");
                    int CS=sn.nextInt();
                    System.out.println("Digite el codigo de la pelicula");
                    sn.nextLine();
                    String NP=sn.nextLine();
                    T.ConsultarMovie(CS, NP);
                }break;
                case 9:{
                    T.ConsultarTeatro();
                }break;
                case 10:{
                    T.ModifyTeatro();
                }break;
                case 11:{
                    System.out.println("Hasta luego....");
                }break;
            }
        }while(Menu!=9);
    }
    
}
