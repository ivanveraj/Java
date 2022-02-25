
public class Combinado extends Tiquete{
	public Combinado (int N, int V, int N1, int N2,  int N3){
		super(N, V, N1, N2, N3);
	}
	public String calPremio(int N1, int N2, int N3){
		// codigo
		return("");
	}
	public String verTiquete(){
		String rta;
		int []V = this.getNA();
		rta = "Tiquete # "+this.getNumTiq()+" jugado el "+
				this.getF().verFecha()+" en modalidad COMBINADO por "+
				this.getValor()+" pesos aposto los numeros "
				+V[0]+","+V[1]+","+V[2];
		return (rta);
	}
}

