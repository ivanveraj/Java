package chance;
import java.util.*;
/**
 *
 * @author PC-JIVJ
 */
public class Control {
    private ArrayList<Sorteo> Sorteos;
    public Control(){
        Sorteos=new ArrayList<Sorteo>();
    }
    public int BuscarS(int X){
        int T=Sorteos.size();
        for(int i=0;i<T;i++){
            if(Sorteos.get(i).getNumero()==X){
                return(i);
            }
        }
        return(-1);
    }
    public String CrearSorteo(int N,Date F){
        if(BuscarS(N)==-1){
            Sorteos.add(new Sorteo(F,N));
            return("Se creo un nuevo sorteo");
        }
        return("Error sorteo ya existente ");
    }
    public String NumerosS(int X,int A,int B,int C){
        int P=BuscarS(X);
        if(P!=-1){
            Sorteos.get(P).AsignarNumeros(A, B, C);
            return("Numeros asignados correctamente");
        }
        return("Error no existe el sorteo");
    }
    public String ConsultarS(int X){
        int B=BuscarS(X);
        if(B!=-1){
            return("Sorteo: "+Sorteos.get(B).Informacion());
        }
        return("Error sorteo no existe");
    }
    public String AgregarT(int NS,int N,int N1,int N2,int N3,int T,int V){
        int B=BuscarS(NS);
        if(B!=-1){
            if(T==1){
                //Directo
                return(Sorteos.get(B).CrearTiqueteD(N, N1, N2, N3, T, V));
            }else{
                //Combinado
                return(Sorteos.get(B).CrearTiqueteC(N, N1, N2, N3, T, V));
            }
        }
        return("Error Sorteo no existe");
    }
    public String ConsultarTS(int NS,int NT){
        int B=BuscarS(NS);
        if(B!=-1){
            return(Sorteos.get(B).Consultar(NT));
        }
        return("Error sorteo no existe");
    }
    public String ConsultarGanadores(int NS){
        int B=BuscarS(NS);
        if(B!=-1){
            return(Sorteos.get(B).ConsultarGanadorS());
        }
        return("Error sorteo no existe");
    }
}