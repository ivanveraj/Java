package poo.parcialsegundocandersoncardozo;

import java.util.Date;

public class ClassFecha {
    private Date FH;
    public ClassFecha(){
        this.FH=new Date ();
    }
    
    public ClassFecha(int dd,int MM,int yyyy){
        this.FH=new Date((yyyy-1900),(MM-1),dd);
    }
    public Date getFH() {
        return FH;
    }
    public void setFH(Date FS) {
        this.FH= FS;
    }
    public void ActualizarFecha(int dd,int MM,int yyyy){
        this.FH.setYear(yyyy-1900);
        this.FH.setMonth(MM-1);
        this.FH.setDate(dd);
    }
    
    public String verFecha(){
        return(this.FH.getDate()+"/"+(this.FH.getMonth()+1)+"/"+(this.FH.getYear()+1900));
    }
    public boolean compruebaVencimiento(ClassFecha FA){
        if(this.FH.getTime()>=FA.getFH().getTime()){
            return(true);
        }else{
            return(false);
        }
    }
}

