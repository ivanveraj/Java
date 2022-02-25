/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

import java.util.Date;

/**
 *
 * @author MILE-IVA
 */
public class ClassFecha {
    private Date FechaSystem;
    public ClassFecha(){
        this.FechaSystem=new Date ();
    }
    
    public ClassFecha(int dd,int MM,int yyyy,int hh,int mm,int ss){
        this.FechaSystem=new Date((yyyy-1900),(MM-1),dd,hh,mm,ss);
    }
    public Date getFechaSystem() {
        return FechaSystem;
    }

    public void setFS(Date FS) {
        this.FechaSystem= FS;
    }
    
    public String Info(){
        return(this.FechaSystem.getDate()+"/"+(this.FechaSystem.getMonth()+1)+"/"+(this.FechaSystem.getYear()+1900)+""
                + " Hora "+this.FechaSystem.getHours()+":"+this.FechaSystem.getMinutes()+":"+this.FechaSystem.getSeconds());
    }
    /*public int diferenciaD(ClassFecha x){
        int r;
        r = (int)(this.FechaSystem.getTime()-x.FechaSystem.getTime())/86400000;
        r=Math.abs(r);
        return r;
    }
    public int diferenciaM(ClassFecha X){
        int r;
        r=(int)(this.FechaSystem.getTime()-X.FechaSystem.getTime())/60000;
        r=Math.abs(r);
        return(r);
    }
    */
    public long diferenciaD(ClassFecha x){
        int r;
        r=(int)(this.FechaSystem.getTime()-x.FechaSystem.getTime())/60000;
        r=Math.abs(r);
        return(r);
    }
    
}

