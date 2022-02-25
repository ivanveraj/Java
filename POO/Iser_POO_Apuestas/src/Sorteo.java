
public class Sorteo {
	private int numsor;
	private miFecha fecsor;
	private boolean est;
	private int NG [];
	private controlTiquete TQ;
	
	public Sorteo(int NS, int DD, int MM, int AA){
		this.numsor = NS;
		this.fecsor = new miFecha(DD, MM, AA);
		this.est = true;
		this.NG = new int [3];
		this.NG[0] = -1;
		this.NG[1] = -1;
		this.NG[2] = -1;
		this.TQ = new controlTiquete();
	}

	public int getNumsor() {
		return numsor;
	}

	public void setNumsor(int numsor) {
		this.numsor = numsor;
	}

	public miFecha getFecsor() {
		return fecsor;
	}

	public void setFecsor(miFecha fecsor) {
		this.fecsor = fecsor;
	}

	public boolean isEst() {
		return est;
	}

	public void setEst(boolean est) {
		this.est = est;
	}

	public int[] getNG() {
		return NG;
	}

	public void setNG(int[] nG) {
		NG = nG;
	}

	public controlTiquete getTQ() {
		return TQ;
	}

	public void setTQ(controlTiquete tQ) {
		TQ = tQ;
	}
	
	public String agregarTiquete(int TT, int NT, int V, int N1, int N2, int N3){
		if(this.est){
			if ( V > 0 && (N1 >=0 && N1 <=9) && (N2 >=0 && N2 <=9) && (N3 >=0 && N3 <=9)){
				return (this.TQ.crearTiquete(TT, NT, V, N1, N2, N3));
			}else{
				return ("Error de Validacion verifique el valor apostado o los numeros...");
			}
		}else{
			return ("Error el Sorteo no esta disponible...");
		}
	}
	
	public String verificarTiquete(int NT){
		if(this.est){
			return("No es posible dar informacion pues el sorteo no ha jugado");
		}else{
			return (this.TQ.consultarPremio(NT, this.NG[0], this.NG[1], this.NG[2]));
		}
	}
	
	public String informacionTiquete(int NT){
		return(this.TQ.consultarTiquete(NT));
	}
	
	// Retornar la infoamcion del Sorteo y cuantos tiquetes de chace tiene 
	// creados
	public String informacionSorteo(){
		String rta;
		rta = "Sorteo # "+this.getNumsor()+" juega el "+this.fecsor.verFecha();
		if (this.est)
			rta+= " el estado es DISPONIBLE";
		else
			rta+= " el estado es NO DISPONIBLE donde los numeros gadores fueron"
			+ this.NG[0]+", "+this.NG[1]+", "+this.NG[2];
		rta+= " y cuenta con "+this.TQ.getT().size()+" tiquetes de chance";
		return(rta);
	}
	
}
