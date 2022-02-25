package parcialprimercortepoo;
import java.util.*;
/**
 *
 * @author KeinerSlayer10
 */
public class Control {
    private ArrayList<Estudiante> Estu;
    public Control(){
        this.Estu=new ArrayList<Estudiante>();
    }
    public int Buscar(int D){
        for(int i=0;i<Estu.size();i++){
            if(Estu.get(i).getDocumento()==D){
                return(i);
            }
        }
        return(-1);
    }
    public String Inscripcion(int D, String N, int E){
        int B=Buscar(D);
        if(E>=16&&E<=26){
            if(B==-1){
            Estudiante ClassE=new Estudiante(N,D,E);
            Estu.add(ClassE);
            return("Estudiante inscrito");
            }
            return("Error el estudiante se encuentra registrado ");
        }
        return("Error el estudiante no posee la edad apropiada ");
    }
    public String ControlFisico(int D, double Es, double P){
        int B=Buscar(D);
        if(B!=-1){
            Estu.get(B).setEstatura(Es);
            Estu.get(B).setPeso(P);
            double FormulaIMC;
            FormulaIMC=P/Math.pow(Es,2);
            Estu.get(B).setIMC(FormulaIMC);
            return("Su IMC es de: "+FormulaIMC);
        }
        return("El estudiante no se encuentra escrito !!!ERROR");
    }
    public void Seleccion(){
        for(int i=0;i<Estu.size();i++){
            double IMC=Estu.get(i).getIMC();
            if(IMC>=18.5&&IMC<=24.9){
                Estu.get(i).setEstado(true);
                System.out.println(Estu.get(i).Informacion());
            }else{
                System.out.println(Estu.get(i).Informacion());
                Estu.remove(i);
            }
        }
    }
}

