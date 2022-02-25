package cafeteria.andersoncardozo;

public class Cafeteria {
    private int CantVasos,CantAzucar,VentaJNatural,VentaJAzucar;
    private double TotalRecaudo;
    public Cafeteria(int CucharadasA){
        this.CantVasos=80;
        this.CantAzucar=CucharadasA;
        this.VentaJAzucar=0;
        this.VentaJNatural=0;
    }
    public void Inventario(){
        System.out.println("Cantidad de vasos disponibles: "+this.CantVasos+"\nCantidad de azucar disponible: "
                +this.CantAzucar+"\n");
    }
    public void InfoRecaudado(){
        System.out.println("Total ventas");
        System.out.println("Cantidad jugo natural: "+this.VentaJNatural+"\nCantidad jugo azucar: "+this.VentaJAzucar+""
                + "\nTotal recaudado: "+this.TotalRecaudo);
    }
    public void VentaNatural(int Cant){
        if(this.CantVasos>Cant){
            double Pago=1000*Cant;
            this.TotalRecaudo+=Pago;
            System.out.println("Total a pagar: "+Pago);
            this.VentaJNatural+=1;
            this.CantVasos-=Cant;
            System.out.println("Venta realizada con exito");
        }else{
            System.out.println("Recursos insuficientes");
        }
    }
    public void VentaAzucar(int Cant){
        if(this.CantVasos>Cant && this.CantAzucar>2){
            double Pago=1500*Cant;
            this.TotalRecaudo+=Pago;
            this.VentaJAzucar+=1;
            this.CantVasos-=Cant;
            this.CantAzucar-=2*Cant;
            System.out.println("Total a pagar: "+Pago);
            System.out.println("Venta realizada con exito");
        }else{
            System.out.println("Recursos insuficientes");
        }
    }
    public int getCantVasos() {
        return CantVasos;
    }
    public void setCantVasos(int CantVasos) {
        this.CantVasos = CantVasos;
    }
    public int getCantAzucar() {
        return CantAzucar;
    }
    public void setCantAzucar(int CantAzucar) {
        this.CantAzucar = CantAzucar;
    }
    public int getVentaJNatural() {
        return VentaJNatural;
    }
    public void setVentaJNatural(int VentaJNatural) {
        this.VentaJNatural = VentaJNatural;
    }
    public int getVentaJAzucar() {
        return VentaJAzucar;
    }
    public void setVentaJAzucar(int VentaJAzucar) {
        this.VentaJAzucar = VentaJAzucar;
    }
    public double getTotalRecaudo() {
        return TotalRecaudo;
    }
    public void setTotalRecaudo(double TotalRecaudo) {
        this.TotalRecaudo = TotalRecaudo;
    }
    
}
