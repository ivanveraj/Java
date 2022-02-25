package parcialprimercortepoo;
import java.util.*;
/**
 *
 * @author 
 */
public class ParcialPrimerCortePOO {

    public static void main(String[] args) {
        Control C=new Control();
        System.out.println(C.Inscripcion(12345, "Ivan", 19));
        System.out.println(C.Inscripcion(12346, "Keiner", 12));
        System.out.println(C.Inscripcion(12347, "Slayer", 23));
        System.out.println(C.Inscripcion(12348, "Jaider", 24));
        System.out.println(C.Inscripcion(12349, "Sebastian", 26));
        System.out.println(C.Inscripcion(12341, "Yeimy", 13));
        System.out.println(C.ControlFisico(12345,1.88,70));
        System.out.println(C.ControlFisico(12346,1.70,70));
        System.out.println(C.ControlFisico(12347,1.70,65));
        System.out.println(C.ControlFisico(12348,1.86,73));
        System.out.println(C.ControlFisico(1234,1.96,62));
        System.out.println(C.ControlFisico(12341,1.69,67));
        C.Seleccion();
        
    }
}
