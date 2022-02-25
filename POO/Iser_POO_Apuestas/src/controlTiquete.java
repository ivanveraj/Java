import java.util.ArrayList;

public class controlTiquete {
	private ArrayList<Tiquete> T;
	
	public controlTiquete(){
		this.T = new ArrayList<Tiquete>();
	}
	
	public ArrayList<Tiquete> getT() {
		return T;
	}

	public void setT(ArrayList<Tiquete> t) {
		T = t;
	}

	public int buscar(int x){
		for(int k = 0; k < this.T.size(); k++)
			if(this.T.get(k).getNumTiq() == x)
				return (k);
		return (-1);
	}
	// TT es TipoTiquete  que si tiene 1 es directo o 2 es Combinado
	public String crearTiquete(int TT, int N, int v, int N1, int N2, int N3){
		if (buscar(N) == -1){
			Tiquete Aux;
			if (TT == 1){
				Aux = new Directo(N, v, N1, N2, N3);
			}
			else{
				Aux = new Combinado(N, v, N1, N2, N3);
			}
			this.T.add(Aux);
			return ("Se Creo Correctamente");
		}else{
			return ("Error el # de Tiquete ya existe");
		}
	}
	
	// Consultar Tiquete ( Numero del Tiquete... y determine el Premio
	public String consultarPremio(int N, int N1, int N2, int N3){
		int P;
		P = buscar(N);
		if (P != -1){
			return(this.T.get(P).calPremio(N1, N2, N3));	
		}else{
			return("Error el Tiquete no existe");
		}
	}
	// Consultar Informacion (Numero Tiquete... y retorna toda la informacion
	public String consultarTiquete(int N){
		int P;
		P = buscar(N);
		if (P != -1){
			return(this.T.get(P).verTiquete());	
		}else{
			return("Error el Tiquete no existe");
		}
	}
	
}
