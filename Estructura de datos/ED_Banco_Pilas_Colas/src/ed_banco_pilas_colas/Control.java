package ed_banco_pilas_colas;

import java.util.Scanner;

public class Control {
    private Cola C1;
    private Cola C2;
    private Cola C3;
    private Pila P;
    private int AdultosM, NPersonaX, Tiempo;

    public Control() {
        this.C1 = new Cola();
        this.C2 = new Cola();
        this.C3 = new Cola();
        this.P = new Pila();
        this.AdultosM = 0;
        this.NPersonaX = 0;
        this.Tiempo = 0;
    }

    public void SeleccionVentanilla() {
        int TotalP = this.C1.Size() + this.C2.Size() + this.C3.Size();
        Scanner sn = new Scanner(System.in);
        if (TotalP == 3) {//Aqui
            System.out.println("Cola llena, vuelva en unos minutos");
            this.NPersonaX++;
        } else {
            System.out.println("Esta usted embarazada o tiene 60 años o mas \n[1]Si\n[2]No");
            int X = sn.nextInt();
            if (X == 1) {
                System.out.println("Dirigiendol@ a la ventanilla N° 3");
                this.IngresoV3();
            } else if (X == 2) {
                int NA = (int) Math.floor(Math.random() * (4 - 1 + 1) + 1);//Numero aleatorio seleccion de ventanilla
                if (NA >= 1 && NA <= 2) {
                    System.out.println("Dirigiendol@ a la ventanilla N° 1");
                    this.IngresoV1();
                } else {
                    System.out.println("Dirigiendol@ a la ventanilla N° 2");
                    this.IngresoV2();
                }
            }
        }
    }

    public void Soporte(Cliente X) {
        this.P.Push(X);
    }

    public void IngresoV1() {
            Scanner sn = new Scanner(System.in);
            System.out.println("Digite la transaccion a realizar");
            String T = sn.nextLine();
            System.out.println("Digite el nombre del cliente");
            String N = sn.nextLine();
            System.out.println("Digite el Id del cliente: ");
            int Id = sn.nextInt();
            System.out.println("Digite la edad del cliente: ");
            int E = sn.nextInt();
            Cliente X = new Cliente(N, Id, E, T);
            this.C1.Enqueue(X);
            this.Tiempo+=5;
    }

    public void IngresoV2() {
            Scanner sn = new Scanner(System.in);
            System.out.println("Digite la transaccion a realizar");
            String T = sn.nextLine();
            System.out.println("Digite el nombre del cliente");
            String N = sn.nextLine();
            System.out.println("Digite el Id del cliente: ");
            int Id = sn.nextInt();
            System.out.println("Digite la edad del cliente: ");
            int E = sn.nextInt();
            Cliente X = new Cliente(N, Id, E, T);
            this.C2.Enqueue(X);
            this.Tiempo+=5;
    }

    public void IngresoV3() {
            Scanner sn = new Scanner(System.in);
            System.out.println("Digite la transaccion a realizar");
            String T = sn.nextLine();
            System.out.println("Digite el nombre del cliente");
            String N = sn.nextLine();
            System.out.println("Digite el Id del cliente: ");
            int Id = sn.nextInt();
            System.out.println("Digite la edad del cliente: ");
            int E = sn.nextInt();
            if (E >= 60) {
                this.AdultosM++;
            }
            Cliente X = new Cliente(N, Id, E, T);
            this.C3.Enqueue(X);
            this.Tiempo+=5;
    }
    public void AtenderCliente(int V){
        if(V==1 && this.C1.isEmpty()==false){
            Soporte(this.C1.getCab().getC());
            this.C1.Denqueue();
        }else if(V==2 && this.C2.isEmpty()==false){
            Soporte(this.C2.getCab().getC());
            this.C2.Denqueue();
        }else if(V==3 && this.C3.isEmpty()==false){
            Soporte(this.C3.getCab().getC());
            this.C3.Denqueue();
        }else{
            System.out.println("Error cola vacia");
        }
    }

    public void NumeroPersonaXVentanilla() {
        System.out.println("Total de personas Ventanilla 1: " +this.C1.getAtendidos());
        System.out.println("Total de personas Ventanilla 2: " +this.C2.getAtendidos());
        System.out.println("Total de personas Ventanilla 3: " +this.C3.getAtendidos());
        System.out.println("Total de personas que atendieron en el banco: "
                +(this.C1.getAtendidos()+this.C2.getAtendidos()+this.C3.getAtendidos()));
    }
    public void PersonasMayoresAtendidas() {
        System.out.println("El total de personas mayores (60 años o mas) atendidas en la ventanilla de acceso especial fue: " + this.AdultosM);
    }

    public void PersonasNoIngresadas() {
        System.out.println("El total de personas no ingresadas en el banco fue de: " + this.NPersonaX);
    }

    public void PrimeraTransaccionXVentanillas() {
        if(this.C1.getPrimer()==null){
            System.out.println("No se realizo ninguna transaccion en la ventanilla N°1");
        }else{
            System.out.println("Primera transaccion de la ventanilla N°1 "+this.C1.getPrimer().getC().getTransaccion());
        }
        if(this.C2.getPrimer()==null){
            System.out.println("No se realizo ninguna transaccion en la ventanilla N°2");
        }else{
            System.out.println("Primera transaccion de la ventanilla N°2 "+this.C2.getPrimer().getC().getTransaccion());
        }
        if(this.C3.getPrimer()==null){
            System.out.println("No se realizo ninguna transaccion en la ventanilla N°3");
        }else{
            System.out.println("Primera transaccion de la ventanilla N°3 "+this.C3.getPrimer().getC().getTransaccion());
        }
    }

    public void UltimaTransaccionXVentanillas() {
        if(this.C1.getPrimer()==null){
            System.out.println("No se realizo ninguna transaccion en la ventanilla N°1");
        }else{
            System.out.println("Ultima transaccion de la ventanilla N°1 "+this.C1.getUltimo().getC().getTransaccion());
        }
        if(this.C2.getPrimer()==null){
            System.out.println("No se realizo ninguna transaccion en la ventanilla N°2");
        }else{
            System.out.println("Ultima transaccion de la ventanilla N°2 "+this.C2.getUltimo().getC().getTransaccion());
        }
        if(this.C3.getPrimer()==null){
            System.out.println("No se realizo ninguna transaccion en la ventanilla N°3");
        }else{
            System.out.println("Ultima transaccion de la ventanilla N°3 "+this.C3.getUltimo().getC().getTransaccion());
        }
    }

    public void TiempoServicioXVentanilla() {
        System.out.println("Nota: Cada persona atendida dura aproximadamente 5 minutos en la ventanilla");
        System.out.println("Total de servicio en la ventanilla N° 1: " + (this.C1.getAtendidos() * 5) + " minutos");
        System.out.println("Total de servicio en la ventanilla N° 2: " + (this.C2.getAtendidos() * 5) + " minutos");
        System.out.println("Total de servicio en la ventanilla N° 3: " + (this.C3.getAtendidos() * 5) + " minutos");
    }

    public void PromedioXVentanillas() {
        System.out.println("Nota: Promedio es igual tiempo que tardo cada cajero por el numero de personas atendidos");
        if(this.C1.getAtendidos()==0){
            System.out.println("No se atendio a ninguna persona en la ventanilla N° 1");
        }else{
            System.out.println("Promedio de tiempo en la atencion de la ventanilla N° 1: " + ( this.Tiempo/this.C1.getAtendidos()) + " minutos");
        }
        if(this.C2.getAtendidos()==0){
            System.out.println("No se atendio a ninguna persona en la ventanilla N° 2");
        }else{
            System.out.println("Promedio de tiempo en la atencion de la ventanilla N° 2: " + (this.Tiempo/this.C2.getAtendidos()) + " minutos");
        }
        if(this.C3.getAtendidos()==0){
            System.out.println("No se atendio a ninguna persona en la ventanilla N° 3");
        }else{
            System.out.println("Promedio de tiempo en la atencion de la ventanilla N° 3: " + (this.Tiempo/this.C3.getAtendidos()) + " minutos");
        }
    }

    public void FinDelDia() {
        NumeroPersonaXVentanilla();
        PersonasMayoresAtendidas();
        PersonasNoIngresadas();
        PrimeraTransaccionXVentanillas();
        UltimaTransaccionXVentanillas();
        TiempoServicioXVentanilla();
        PromedioXVentanillas();
    }

    public Cola getC1() {
        return C1;
    }

    public void setC1(Cola C1) {
        this.C1 = C1;
    }

    public Cola getC2() {
        return C2;
    }

    public void setC2(Cola C2) {
        this.C2 = C2;
    }

    public Cola getC3() {
        return C3;
    }

    public void setC3(Cola C3) {
        this.C3 = C3;
    }

    public Pila getP() {
        return P;
    }

    public void setP(Pila P) {
        this.P = P;
    }
    public void MostrarColas(){
        this.C1.MostrarCola();
        this.C2.MostrarCola();
        this.C3.MostrarCola();
    }
    public void MostrarPila(){
        this.P.MostrarPila();
    }
}
