package tiempodeejecucion_15;

public class TiempoDeEjecucion_15 {
    public static void Burbuja(int A[]) {
        int i, j, Aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    Aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = Aux;
                }
            }
        }
    }

    public static void Seleccion(int A[]) {
        int i, j, menor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) {
            menor = A[i];
            pos = i;
            for (j = i + 1; j < A.length; j++) {
                if (A[j] < menor) {
                    menor = A[j];
                    pos = j;
                }
            }
            if (pos != i) {
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }

    public static void Insercion(int A[]) {
        int p, j;
        int Aux;
        for (p = 1; p < A.length; p++) {
            Aux = A[p];
            j = p - 1;
            while ((j >= 0) && (Aux < A[j])) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = Aux;
        }
    }

    public static void Quicksort(int A[], int izq, int der) {
        int pivote = A[izq];
        int i = izq;
        int j = der;
        int aux;
        while (i < j) {
            while (A[i] <= pivote && i < j) {
                i++;
            }
            while (A[j] > pivote) {
                j--;
            }
            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }
        }

        A[izq] = A[j];
        A[j] = pivote;
        if (izq < j - 1) {
            Quicksort(A, izq, j - 1);
        }
        if (j + 1 < der) {
            Quicksort(A, j + 1, der);
        }
    }

    public static void Shell(int A[]) {
        int salto, aux, i;
        boolean cambios;
        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cambios = false;
                for (i = salto; i < A.length; i++) // se da una pasada
                {
                    if (A[i - salto] > A[i]) {       // y si están desordenados
                        aux = A[i];                  // se reordenan
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            }
        }
    }
    public static void Imprimir(int V[]){
        for(int i=0;i<V.length;i++){
            System.out.println("V["+i+"]="+V[i]);
        }
    }
    public static void main(String[] args) {
        int V1[]={15,14,23,1,141,150,2,8,7,46,55,4,3,2,51,125,14,134,12,111,130,9,48,70,61,52,4,3,2,1};
        int V2[]={15,14,23,1,141,150,2,8,7,46,55,4,3,2,51,125,14,134,12,111,130,9,48,70,61,52,4,3,2,1};
        int V3[]={15,14,23,1,141,150,2,8,7,46,55,4,3,2,51,125,14,134,12,111,130,9,48,70,61,52,4,3,2,1};
        int V4[]={15,14,23,1,141,150,2,8,7,46,55,4,3,2,51,125,14,134,12,111,130,9,48,70,61,52,4,3,2,1};
        int V5[]={15,14,23,1,141,150,2,8,7,46,55,4,3,2,51,125,14,134,12,111,130,9,48,70,61,52,4,3,2,1};
        long TInicio, TFin, Tiempo;

        System.out.println("Tiempo de ejecucion metodo de ordenamiento");
        System.out.println("Metodo burbuja");
        TInicio= System.nanoTime();
        System.out.println("TINi "+TInicio);
        Burbuja(V1);
        TFin =System.nanoTime();
        System.out.println("TFin "+TFin);
        Tiempo = TFin- TInicio;
        System.out.println("Tiempo de ejecución en nanosegundos: " + Tiempo);
        
        System.out.println("Metodo de seleccion");
        TInicio =System.nanoTime();
        System.out.println("TINi "+TInicio);
        Seleccion(V2);
        TFin =System.nanoTime();
        System.out.println("TFin "+TFin);
        Tiempo = TFin - TInicio;
        System.out.println("Tiempo de ejecución en milisegundos: " + Tiempo);
        
        
        System.out.println("Metodo de insercion directa");
        TInicio = System.nanoTime();
        System.out.println("TINi "+TInicio);
        Insercion(V3);
        TFin =System.nanoTime();
        System.out.println("TFin "+TFin);
        Tiempo = TFin - TInicio;
        System.out.println("Tiempo de ejecución en milisegundos: " + Tiempo);
        
        
        System.out.println("Metodo Quicksort");
        TInicio =System.nanoTime();
        Quicksort(V4,0,V4.length-1);
        TFin =System.nanoTime();
        System.out.println("TFin "+TFin);
        Tiempo = TFin - TInicio;
        System.out.println("Tiempo de ejecución en milisegundos: " + Tiempo);
        
        
        System.out.println("Metodo shell");
        TInicio =System.nanoTime();
        System.out.println("TINi "+TInicio);
        Shell(V5);
        TFin = System.nanoTime();
        System.out.println("TFin "+TFin);
        Tiempo = TFin - TInicio;
        System.out.println("Tiempo de ejecución en milisegundos: " + Tiempo);
        System.out.println("Impresion de vectores ordenados");
        Imprimir(V1);
        Imprimir(V2);
        Imprimir(V3);
        Imprimir(V4);
        Imprimir(V5);
        
    }
}
