package ejerciciosuniversidad;
/**
 *
 * @author Usuario
 */
public class Control{
    private Profesor P[];
    private int Tam1, Tmax;
    public Control(){
        this.Tam1=0;
        this.Tmax=6;
        P=new Profesor[Tmax];
    }
    public int Buscar(int Ced){
        for(int i=0;i<Tam1;i++){
            if(P[i].getCedula()==Ced){
                return(i);
            }
        }
        return(-1);
    }
    public String CrearTitular(String Nombre, String Profesion, int Cedula){
        P[Tam1]=new Titular(Nombre,Profesion,Cedula);
        Tam1++;
        return("Titular ingresado correctamente");
    }
    public String CrearOcasional(String Nombre, String Profesion, int Cedula){
        P[Tam1]=new Ocasional(Nombre,Profesion,Cedula);
        Tam1++;
        return("Ocasional ingresado correctamente");
    }
    public void CalcularSueldo(int Cedula, int Horas){
        int B=Buscar(Cedula);
        if(B!=-1){
            System.out.println(P[B].CalcularSueldo(Horas));
        }else{
            System.out.println("Cedula no encontrada");
        }
    }
    public void MayorSueldo(){
        int Mayor=0;
        for(int i=1;i<Tam1;i++){
            if(P[Mayor].getSueldo()<P[i].getSueldo()){
                Mayor=i;
            }
        }
        System.out.println("El mayor sueldo de los profesores es: \n"+P[Mayor].Informacion());
    }
    public void Informacion(){
        for(int i=0;i<Tam1;i++){
            System.out.println(P[i].Informacion());
        }
    }
}
