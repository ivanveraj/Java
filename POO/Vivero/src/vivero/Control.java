/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivero;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Control {
    private Planta VectorPlanta[];
    private Matera VectorMatera[];
    private Abono VectorAbono[];
    public Control(int TP, int TM, int TA){
        this.VectorPlanta=new Planta[TP];
        this.VectorMatera=new Matera[TM];
        this.VectorAbono=new Abono[TA];
    }
    public void LlenarVectores(){
        LlenarVectorPlanta();
        LlenarVectorMatera();
        LlenarVectorAbono();
    }
    public void LlenarVectorPlanta() {
        Scanner sn = new Scanner(System.in);
        for (int i = 0; i < this.VectorPlanta.length; i++) {
            System.out.println("Digite el codigo de la Planta["+i+"]");
            int Codigo = sn.nextInt();
            System.out.println("Digite el nombre de la Planta["+i+"]");
            sn.nextLine();
            String Nombre = sn.nextLine();
            System.out.println("Digite el cuidado de la Planta["+i+"]");
            String Cuidado = sn.nextLine();
            System.out.println("Digite el tipo de la Planta["+i+"]");
            System.out.println("0=Tipo solar \n1=Tipo sombra");
            int Tipo= sn.nextInt();
            System.out.println("Digite el precio de la Planta["+i+"]");
            double Precio = sn.nextDouble();
            this.VectorPlanta[i]=new Planta(Codigo,Nombre,Cuidado,Tipo,Precio);
        }
    }
    public void LlenarVectorAbono() {
        Scanner sn = new Scanner(System.in);
        for (int i = 0; i < this.VectorAbono.length; i++) {
            System.out.println("Digite el codigo del Abono["+i+"]");
            int Codigo = sn.nextInt();
            System.out.println("Digite el nombre del Abono["+i+"]");
            sn.nextLine();
            String Nombre = sn.nextLine();
            System.out.println("Digite la descripcion del Abono["+i+"]");
            String Descripcion = sn.nextLine();
            System.out.println("Digite la utilidad del Abono["+i+"]");
            String Utilidad= sn.nextLine();
            System.out.println("Digite el Precio del Abono["+i+"]");
            double Precio = sn.nextDouble();
            this.VectorAbono[i]=new Abono(Codigo,Nombre,Descripcion,Utilidad,Precio);
        }
    }
    public void LlenarVectorMatera() {
        Scanner sn = new Scanner(System.in);
        for (int i = 0; i < this.VectorMatera.length; i++) {
            System.out.println("Digite el codigo de la Matera["+i+"]");
            int Codigo = sn.nextInt();
            System.out.println("Digite el nombre de la Matera["+i+"]");
            sn.nextLine();
            String Nombre = sn.nextLine();
            System.out.println("Digite el material de la Matera["+i+"]");
            String Material = sn.nextLine();
            System.out.println("Digite el tamaño de la Matera["+i+"]");
            int Tamanio= sn.nextInt();
            System.out.println("Digite el precio de la Matera["+i+"]");
            double Precio = sn.nextDouble();
            this.VectorMatera[i]=new Matera(Codigo,Nombre,Material,Tamanio,Precio);
        }
    }
    public void CantidadPlantasSombra(){
        int Cont=0;
        for(int i=0;i<this.VectorPlanta.length;i++){
            if(this.VectorPlanta[i].getTipo()==1){
                Cont++;
            }
        }
        System.out.println("Cantidad de plantas tipo sombra: "+Cont);
    }
    public void TotalPrecioMateras(){
        double Cont=0;
        for(int i=0;i<this.VectorMatera.length;i++){
            Cont+=this.VectorMatera[i].getPrecio();
        }
        System.out.println("Total de monto de Dinero X Materas: "+Cont);
    }
    public void ListarPlantasSolares(){
        System.out.println("Plantas solares");
        for(int i=0;i<this.VectorPlanta.length;i++){
            if(this.VectorPlanta[i].getTipo()==0){
                System.out.println("Codigo: "+this.VectorPlanta[i].getCodigo()+
                        "\nNombre: "+this.VectorPlanta[i].getNombre()+
                        "\nCuidados: "+this.VectorPlanta[i].getCuidados());
            }
        }
    }
    public void ListarAbonosPrecio(){
        System.out.println("Abonos con un precio mayor a 6.500");
        for(int i=0;i<this.VectorAbono.length;i++){
            if(this.VectorAbono[i].getPrecio()>6500){
                System.out.println("Codigo: "+this.VectorAbono[i].getCodigo()+
                        "\nNombre: "+this.VectorAbono[i].getNombre()+
                        "\nUtilidad: "+this.VectorAbono[i].getUtilidad());
            }
        }
    }
    public void PrecioMasBajo(){
        int Menor=0;
        for(int i=0;i<this.VectorPlanta.length;i++){
            if(this.VectorPlanta[i].getPrecio()<this.VectorPlanta[Menor].getPrecio()){
                Menor=i;
            }
        }
        System.out.println("La planta con el precio mas bajo es: "+this.VectorPlanta[Menor].getNombre());
        Menor=0;
        for(int i=0;i<this.VectorMatera.length;i++){
            if(this.VectorMatera[i].getPrecio()<this.VectorMatera[Menor].getPrecio()){
                Menor=i;
            }
        }
        System.out.println("La matera con el precio mas bajo es: " + this.VectorMatera[Menor].getNombre());
        Menor = 0;
        for (int i = 0; i < this.VectorAbono.length; i++) {
            if (this.VectorAbono[i].getPrecio() < this.VectorAbono[Menor].getPrecio()) {
                Menor = i;
            }
        }
        System.out.println("El abono con el precio mas bajo es: " + this.VectorAbono[Menor].getNombre());
    }
    
}
