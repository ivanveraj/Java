public abstract class Tiquete {
	private int numTiq, valor;
	private miFecha F;
	private int [] NA = new int [3];
	
	public Tiquete (int N, int V, int N1, int N2,  int N3){
		this.numTiq = N;
		this.valor = V;
		this.F = new miFecha();
		this.NA[0] = N1;
		this.NA[1] = N2;
		this.NA[2] = N3;		
	}

	public int getNumTiq() {
		return numTiq;
	}

	public void setNumTiq(int numTiq) {
		this.numTiq = numTiq;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public miFecha getF() {
		return F;
	}

	public void setF(miFecha f) {
		F = f;
	}

	public int[] getNA() {
		return NA;
	}

	public void setNA(int[] nA) {
		NA = nA;
	}
	
	public abstract String calPremio(int N1, int N2,  int N3);
	
	public abstract String verTiquete();
	
}
