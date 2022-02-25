package parcialmallely;

public class ParcialMallely {
    public static void main(String[] args) {
        
        int N1,N2,N3,N4,N5;
         int N6,N7,N8,N9,N10;
        int Rm=1,RM=99;
        System.out.println("Numeros aleatorio entre 1 y 99");
        N1 = (int) Math.floor(Math.random() * (RM - Rm + 1) + Rm);
        N2 = (int) Math.floor(Math.random() * (RM - Rm + 1) + Rm);
        N3 = (int) Math.floor(Math.random() * (RM - Rm + 1) + Rm);
        N4 = (int) Math.floor(Math.random() * (RM - Rm + 1) + Rm);
        N5 = (int) Math.floor(Math.random() * (RM - Rm + 1) + Rm);
        N6 = (int) Math.floor(Math.random() * (RM - Rm + 1) + Rm);
        N7 = (int) Math.floor(Math.random() * (RM - Rm + 1) + Rm);
        N8 = (int) Math.floor(Math.random() * (RM - Rm + 1) + Rm);
        N9 = (int) Math.floor(Math.random() * (RM - Rm + 1) + Rm);
        N10 = (int) Math.floor(Math.random() * (RM - Rm + 1) + Rm);
        Numeros C=new Numeros(N1, N2, N3, N4, N5, N6, N7, N8, N9, N10);
        C.Imprimir();
        C.FuncionGlobal();
        /*
        Divisores N1
1,2,4,5,10,20,
Suma de divisores: 42
Cantidad de divisores: 6
Divisores N2
1,2,3,6,13,26,39,78,
Suma de divisores: 168
Cantidad de divisores: 8
Divisores N3
1,2,31,62,
Suma de divisores: 96
Cantidad de divisores: 4
Divisores N4
1,53,
Suma de divisores: 54
Cantidad de divisores: 2
         */
    }
}
