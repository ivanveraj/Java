package chance;
import java.util.*;
/**
 *
 * @author PC-JIVJ
 */
public class Chance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Menu;
        Scanner sn=new Scanner(System.in);
        Control C=new Control();
        do{
            System.out.println("[1]Registro de Sorteo\n[2]Asignar numeros ganadores de un sorteo\n[3]"
                    + "Registro de chance (Directo o combinado)\n[4]Consultar ganadores de sorteo\n[5]"
                    + "Consultar tiquete de chance");
            Menu=sn.nextInt();
            switch(Menu){
                case 1:{
                    
                }break;
            }
        }while(Menu!=6);
    }
    
}
