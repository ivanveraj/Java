package vacas;

public class Vacas {

    public static void LlenarMatriz(int M[][]) {
        M[0][0] = 43;
        M[0][1] = 40;
        M[0][2] = 25;
        M[0][3] = 28;
        M[0][4] = 33;
        M[0][5] = 50;
        M[0][6] = 23;
        M[1][0] = 48;
        M[1][1] = 23;
        M[1][2] = 34;
        M[1][3] = 28;
        M[1][4] = 21;
        M[1][5] = 38;
        M[1][6] = 40;
        M[2][0] = 36;
        M[2][1] = 20;
        M[2][2] = 24;
        M[2][3] = 25;
        M[2][4] = 22;
        M[2][5] = 22;
        M[2][6] = 30;
        M[3][0] = 28;
        M[3][1] = 38;
        M[3][2] = 36;
        M[3][3] = 26;
        M[3][4] = 22;
        M[3][5] = 59;
        M[3][6] = 32;
        M[4][0] = 34;
        M[4][1] = 37;
        M[4][2] = 35;
        M[4][3] = 35;
        M[4][4] = 37;
        M[4][5] = 27;
        M[4][6] = 23;
        M[5][0] = 48;
        M[5][1] = 37;
        M[5][2] = 49;
        M[5][3] = 28;
        M[5][4] = 46;
        M[5][5] = 43;
        M[5][6] = 35;
    }

    public static void Uno(int M[][]) {
        int P = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                P += M[i][j];
            }
        }
        System.out.println("La produccion de leche semanal en la finca fue: " + P);
    }

    public static void Dos(int M[][]) {
        int P = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                P += M[i][j];
            }
            System.out.println("Produccion de leche vaca N° " + (i + 1) + ": " + P);
            P = 0;
        }
    }

    public static void Tres(int M[][]) {
        int Mayor = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if (M[i][j] > M[i][Mayor]) {
                    Mayor = j;
                }
            }
            System.out.println("El dia de mayor produccion de leche de la vaca N° " + (i + 1) + " fue: " + (Mayor + 1));
            System.out.println("Leche producida: " + M[i][Mayor]);
            Mayor = 0;
        }
    }

    public static void Cuatro(int M[][]) {
        int Pd = 0, j = 0, i = 0;
        for (i = 0; i < M[0].length; i++) {
            for (j = 0; j < M.length; j++) {
                Pd += M[j][i];
            }
            System.out.println("Produccion dia [" + (i+ 1) + " fue: " + Pd);
            Pd=0;
        }
    }

    //En toda la semana
    public static void Cinco(int M[][]) {
        int Menor1 = 0, Menor2 = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if (M[i][j] < M[Menor1][Menor2]) {
                    Menor1 = i;
                    Menor2 = j;
                }
            }
        }
        System.out.println("En toda la semana la menor produccion de leche fue de la vaca N° " + (Menor1 + 1));
        System.out.println("Leche producida: " + M[Menor1][Menor2]);
    }

    public static void Seis(int M[][]) {
        int Menor = 0;
        for (int i = 0; i < M[0].length; i++) {
            for (int j = 0; j < M.length; j++) {
                if (M[j][i] < M[Menor][i]) {
                    Menor = j;
                }
            }
            System.out.println("El dia "+ (i+1)+" la menor produccion de leche fue de la vaca N° " + (Menor+ 1) + " fue: " );
            System.out.println("Leche producida: " + M[Menor][i]);
            Menor = 0;
        }
    }

    public static void Siete(int M[][]) {
        double P = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                P += M[i][j];
            }
        }
        System.out.println("El promedio de produccion de leche en la semana es: " + (P / 7));
    }

    public static void Ocho(int M[][]) {
        double P = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if (M[i][j] >= 25 && M[i][j] <= 45) {
                    P += M[i][j];
                }
            }
        }
        System.out.println("El promedio de produccion de leche de las vacas "
                + "que producieron entre 25 y 45 litros en la semana es: " + (P / 7));
    }

    public static void Nueve(int M[][]) {
        int Mayor1 = 0, Mayor2 = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if (M[i][j] > M[Mayor1][Mayor2]) {
                    Mayor1 = i;
                    Mayor2 = j;
                }
            }
        }
        System.out.println("En toda la semana la mayor produccion de leche fue de la vaca N° " + (Mayor1 + 1));
        System.out.println("Leche producida: " + M[Mayor1][Mayor2]);
    }

    public static void main(String[] args) {
        int F =6, C = 7;
        int M[][] = new int[F][C];
        System.out.println("Tamaño de filas "+M.length);
        System.out.println("Tamaño de columnas "+M[0].length);
        LlenarMatriz(M);
        Uno(M);
        Dos(M);
        Tres(M);
        Cuatro(M);
        Cinco(M);
        Seis(M);
        Siete(M);
        Ocho(M);
        Nueve(M);
    }
}