package edlistasdoblementeenlazadas;

public class EDListasDoblementeEnlazadas {

    public static void main(String[] args) {
        ListaD L=new ListaD();
        System.out.println(L.InsertTo(5));
        System.out.println(L.InsertTo(9));
        System.out.println(L.InsertTo(3));
        System.out.println(L.InsertTo(1));
        System.out.println(L.PrintList());
        System.out.println("\n"+L.PrintList());
    }
    
}
