package ed3;
public class ED3 {
    public static void main(String[] args) {
        Vectores V=new Vectores(5);
        Vectores A=new Vectores(5);
        V.Llenar();
        A.Llenar();
        A.Intercambiador(1, 30);
        System.out.println("Impresion del vector A"+A.Imprimir());
        System.out.println("Impresion del vector V"+V.Imprimir());
        V.Intercambio(A);
        System.out.println("Impresion del vector A"+A.Imprimir());
        System.out.println("Impresion del vector V"+V.Imprimir());
        /*V.Llenar();
        System.out.println("Primer vector");
        System.out.println(V.Imprimir());
        System.out.println("Cuantos numeros pares hay en el vector: "+V.Pares());
        int B=V.Buscar(4);
        if(B==-1){
            System.out.println("Numero no encontrado");
        }else{
            System.out.println("Numero encontrado en la posicion: "+B);
        }
        System.out.println("Intercambiando vector");
        V.Intercambiador(2, 34);
        System.out.println(V.Imprimir());
        System.out.println("Generando un nuevo vector con valores aletorios entre 1 y 100");
        V.Pseudoaletorio();
        System.out.println(V.Imprimir());
        System.out.println(V.Comparador(A));*/
    }
}
