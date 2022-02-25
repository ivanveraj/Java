import java.util.Date;

public class miFecha {
	private Date FH;
	
	public Date getFH() {
		return FH;
	}

	public void setFH(Date fH) {
		FH = fH;
	}

	public miFecha(){
		this.FH = new Date();
	}
	
	public miFecha(int d, int m, int a){
		this.FH = new Date(a-1900, m-1, d);
	}
	
	public miFecha(int d, int m, int a, int hh, int mm, int ss){
		this.FH = new Date(a-1900, m-1, d, hh, mm, ss);
	}
	
	public int getAnio(){
		return(this.FH.getYear()+1900);
	}
	
	public int getMes(){
		return(this.FH.getMonth()+1);
	}
	
	public int getDia(){
		return(this.FH.getDate());
	}
	// DiferenciaSegundos             DiferenciaHoras  
	public long diferenciaMinutos (miFecha FF){
		long X;
		X = (this.FH.getTime()-FF.FH.getTime())/60000;
		X = Math.abs(X);
		return(X);
	}
	
	public long diferenciaDias (miFecha FF){
		long X;
		X = (this.FH.getTime()-FF.FH.getTime())/(1000*60*60*24);
		X = Math.abs(X);
		return(X);
	}

	public String diferenciaTotal (miFecha FF){
		long X,dd, hh, mm, ss;
		X = (this.FH.getTime()-FF.FH.getTime());
		X = Math.abs(X);
		dd = X / (1000*60*60*24);
		X = (X-(dd*1000*60*60*24));

		hh = X /(1000*60*60);
		X = (X-(hh*1000*60*60));
		
		mm = X /(1000*60);
		X = (X-(mm*1000*60));

		ss = X /(1000);
		
		return("El tiempo Transcurrido es: "+dd+" dias "
				+hh+" Horas "+mm+" Minutos "+ss+" Segundos");
	}
	
	
	
	
	public String verFecha(){
		return("La Fecha es "+FH);
	}
}
