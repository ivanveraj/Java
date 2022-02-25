
package parcialmallely;

public class Numeros {
    private int N1, N2, N3, N4, N5, N6, N7, N8, N9, N10;
    public Numeros(int N1, int N2, int N3, int N4, int N5, int N6, int N7, int N8, int N9, int N10) {
        this.N1 = N1;
        this.N2 = N2;
        this.N3 = N3;
        this.N4 = N4;
        this.N5 = N5;
        this.N6 = N6;
        this.N7 = N7;
        this.N8 = N8;
        this.N9 = N9;
        this.N10 = N10;
    }
    public void Imprimir() {
        System.out.println("N1: "+N1 + "\nN2: " + N2 + "\nN3: " + N3 + "\nN4: " + N4+
                "\nN5: " + N5 + "\nN6: " + N6 + "\nN7: " + N7 + "\nN8: " +N8+ "\nN9: " + N9 + "\nN10: " + N10);
    }
    public void FuncionGlobal() {
        FunN1();
        FunN2();
        FunN3();
        FunN4();
        FunN5();
        FunN6();
        FunN7();
        FunN8();
        FunN9();
        FunN10();
    }
    public void FunN1(){
        int S= 0;
        int C= 0;
        String R= "";
        System.out.println("Divisores N1");
        for (int i = 1; i <= this.N1; i++) {
            if (this.N1 %i == 0) {
                S+=i;
                C++;
                R+=i+",";
            }
        }
        System.out.println(R);
        System.out.println("Suma de divisores: " + S);
        System.out.println("Cantidad de divisores: " + C);
    }
    public void FunN2(){
        int S= 0;
        int C= 0;
        String R= "";
        System.out.println("Divisores N2");
        for (int i = 1; i <= this.N2; i++) {
            if (this.N2 %i == 0) {
                S+=i;
                C++;
                R+=i+",";
            }
        }
        System.out.println(R);
        System.out.println("Suma de divisores: " + S);
        System.out.println("Cantidad de divisores: " + C);
    }
    public void FunN3(){
        int S= 0;
        int C= 0;
        String R= "";
        System.out.println("Divisores N3");
        for (int i = 1; i <= this.N3; i++) {
            if (this.N3 %i == 0) {
                S+=i;
                C++;
                R+=i+",";
            }
        }
        System.out.println(R);
        System.out.println("Suma de divisores: " + S);
        System.out.println("Cantidad de divisores: " + C);
    }
    public void FunN4(){
        int S= 0;
        int C= 0;
        String R= "";
        System.out.println("Divisores N4");
        for (int i = 1; i <= this.N4; i++) {
            if (this.N4 %i == 0) {
                S+=i;
                C++;
                R+=i+",";
            }
        }
        System.out.println(R);
        System.out.println("Suma de divisores: " + S);
        System.out.println("Cantidad de divisores: " + C);
    }
    public void FunN5(){
        int S= 0;
        int C= 0;
        String R= "";
        System.out.println("Divisores N5");
        for (int i = 1; i <= this.N5; i++) {
            if (this.N5 %i == 0) {
                S+=i;
                C++;
                R+=i+",";
            }
        }
        System.out.println(R);
        System.out.println("Suma de divisores: " + S);
        System.out.println("Cantidad de divisores: " + C);
    }
    public void FunN6(){
        int S= 0;
        int C= 0;
        String R= "";
        System.out.println("Divisores N6");
        for (int i = 1; i <= this.N6; i++) {
            if (this.N6 %i == 0) {
                S+=i;
                C++;
                R+=i+",";
            }
        }
        System.out.println(R);
        System.out.println("Suma de divisores: " + S);
        System.out.println("Cantidad de divisores: " + C);
    }
    public void FunN7(){
        int S= 0;
        int C= 0;
        String R= "";
        System.out.println("Divisores N7");
        for (int i = 1; i <= this.N7; i++) {
            if (this.N7 %i == 0) {
                S+=i;
                C++;
                R+=i+",";
            }
        }
        System.out.println(R);
        System.out.println("Suma de divisores: " + S);
        System.out.println("Cantidad de divisores: " + C);
    }
    public void FunN8(){
        int S= 0;
        int C= 0;
        String R= "";
        System.out.println("Divisores N8");
        for (int i = 1; i <= this.N8; i++) {
            if (this.N8 %i == 0) {
                S+=i;
                C++;
                R+=i+",";
            }
        }
        System.out.println(R);
        System.out.println("Suma de divisores: " + S);
        System.out.println("Cantidad de divisores: " + C);
    }
    public void FunN9(){
        int S= 0;
        int C= 0;
        String R= "";
        System.out.println("Divisores N9");
        for (int i = 1; i <= this.N9; i++) {
            if (this.N9 %i == 0) {
                S+=i;
                C++;
                R+=i+",";
            }
        }
        System.out.println(R);
        System.out.println("Suma de divisores: " + S);
        System.out.println("Cantidad de divisores: " + C);
    }
    public void FunN10(){
        int S= 0;
        int C= 0;
        String R= "";
        System.out.println("Divisores N10");
        for (int i = 1; i <= this.N10; i++) {
            if (this.N10 %i == 0) {
                S+=i;
                C++;
                R+=i+",";
            }
        }
        System.out.println(R);
        System.out.println("Suma de divisores: " + S);
        System.out.println("Cantidad de divisores: " + C);
    }
}
