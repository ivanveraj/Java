
public class Directo extends Tiquete{
	public Directo (int N, int V, int N1, int N2,  int N3){
		super(N, V, N1, N2, N3);
	}
	public String calPremio(int N1, int N2, int N3){
		int []V = this.getNA();
		if(V[0] == N1 && V[1] == N2 && V[2] == N3)
			return ("GANO!!!! su premio es "+(this.getValor()*1000));
		else
			return ("No Gano Siga intentando...");
	}
	public String verTiquete(){
		String rta;
		int []V = this.getNA();
		rta = "Tiquete # "+this.getNumTiq()+" jugado el "+
				this.getF().verFecha()+" en modalidad DIRECTO por "+
				this.getValor()+" pesos aposto los numeros "
				+V[0]+","+V[1]+","+V[2];
		return (rta);
	}
}
