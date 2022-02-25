/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;
import java.util.*;
/**
 *
 * @author MILE-IVA
 */
public class Control {
    private double Total;
    private int T,Tmax;
    private Producto V[];
    public Control(){
        this.Total=0;
        this.T=0;
        this.Tmax=10;
        this.V=new Producto[this.Tmax];
    }

    public double getTotal() {
        return Total;
    }
    
    public int Buscar(long X){
        for(int i=0;i<this.T;i++){
            if(this.V[i].getCodigo()==X){
                return(i);
            }
        }
        return(-1);
    }
    public String InventarioProducto(long X){
        int R=Buscar(X);
        String Nombre;
        int CantidadE,Min,Max,opc,Carga;
        double Costo,Porcentaje;
        Scanner sn=new Scanner(System.in);
        if(R==-1){
            System.out.println("Digite el nombre del medicamento");
            Nombre=sn.nextLine();
            System.out.println("Digite la cantidad existente");
            CantidadE=sn.nextInt();
            System.out.println("Digite la cantidad minima del producto");
            Min=sn.nextInt();
            System.out.println("Digite la cantidad maxima del producto");
            Max=sn.nextInt();
            System.out.println("Digite el Costo de compra");
            Costo=sn.nextDouble();
            System.out.println("Digite el Porcentaje de venta");
            Porcentaje=sn.nextDouble();
            this.V[this.T]=new Producto(X, Nombre,CantidadE, Min, Max,Costo);
            this.V[this.T].CrearProducto(Costo, Porcentaje);
            this.T++;
        }else{
            System.out.println(this.V[R].InformacionProducto());
            System.out.println("Desea actualizar Nombre [1]Si\n[2]No");
            opc=sn.nextInt();
            if(opc==1){
                System.out.println("Digite el nombre del medicamento");
                sn.nextLine();
                Nombre=sn.nextLine();
            }else{
                Nombre=this.V[R].getNombre();
            }
            
            
            System.out.println("Desea actualizar la cantidad en existencia [1]Si\n[2]No");
            opc=sn.nextInt();
            if(opc==1){
                System.out.println("Digite la nueva cantidad en existencia del medicamento");
                CantidadE=sn.nextInt();
            }else{
                CantidadE=this.V[R].getCantidadE();
            }
            
            
            System.out.println("Desea actualizar el minimo en existencia [1]Si\n[2]No");
            opc=sn.nextInt();
            if(opc==1){
                System.out.println("Digite el nuevo minimo del medicamento");
                Min=sn.nextInt();
            }else{
                Min=this.V[R].getMin();
            }
            System.out.println("Desea actualizar el maximo en existencia [1]Si\n[2]No");
            opc=sn.nextInt();
            if(opc==1){
                System.out.println("Digite el nuevo maximo del medicamento");
                Max=sn.nextInt();
            }else{
                Max=this.V[R].getMax();
            }
            
            
            System.out.println("Desea actualizar Costo [1]Si\n[2]No");
            opc=sn.nextInt();
            if(opc==1){
                System.out.println("Digite el nuevo costo del medicamento");
                Costo=sn.nextDouble();
            }else{
                Costo=this.V[R].getCosto();
            }
            System.out.println("Desea actualizar Porcentaje de ganancia [1]Si\n[2]No");
            opc=sn.nextInt();
            if(opc==1){
                System.out.println("Digite el nuevo porcentaje del medicamento");
                Porcentaje=sn.nextDouble();
            }else{
                Porcentaje=this.V[R].getPorcentaje();
            }
            this.V[R].AjusteInformacion(Nombre, CantidadE, Min, Max, Costo, Porcentaje);
            System.out.println("LLego nueva mercancia [1]Si\n[2]No");
            opc=sn.nextInt();
            if(opc==1){
                System.out.println("Digite el total del medicamento");
                Carga=sn.nextInt();
                this.V[R].CargaInventario(Carga);
            }  
    }
        return("");
    }

    public String VentaMedicamento(long X, int C){
        int R=Buscar(X);
        boolean Respuesta;
        double TotalP=0;
        if(R!=-1){
            System.out.println("Entro");
            Respuesta=this.V[R].DescargaInventario(C);
            if(Respuesta){
                TotalP=this.V[R].getValorV()*C;
                this.Total=this.Total+TotalP;
            }
        }
        return("Total a pagar: "+TotalP);
    }
    public void InformacionMedicamento(long X){
        int R=Buscar(X);
        if(R!=-1){
            System.out.println(this.V[R].InformacionProducto());
        }else{
            System.out.println("No existe el codigo");
        }
    }
    public void InformePedido(){
        for(int i=0;i<this.T;i++){
            System.out.println(this.V[i].InformacionProducto());
        }
    }
    public String ResumenVentas(){
        return("El total fue: "+getTotal());
    }
}
