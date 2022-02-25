package listas;
    public class Listas {
        public static void main(String[] args) {
            ListaCircular L=new ListaCircular();
            L.InsertFirst(20);
            L.InsertFirst(39);
            L.InsertFirst(40);
            L.InsertFirst(2);
            L.InsertFirst(12);
            L.InsertFirst(45);
            L.InsertFirst(67);
            L.Imprimir();
            L.InsertTo(36, 6);
            L.Imprimir();
            System.out.println(L.Size());
            L.Imprimir();
            L.Delete(2);
            System.out.println("Luego de borrar un elemento");
            L.IntercambioInfo(0, 2);
            L.Imprimir();
            L.Promedio();
        }

    }
