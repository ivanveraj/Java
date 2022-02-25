package ed_listasimpleparcial;

public class ED_ListaSimpleParcial {
    public static void main(String[] args) {
        ListaS L = new ListaS();
        L.insertLast(5);
        L.insertLast(10);
        L.insertLast(15);
        L.insertLast(20);
        L.insertLast(25);
        L.insertLast(30);

        System.out.println(L.viewList());
        
        //Pruebas de escritorio
        //L.intercambioNodos(30,5);
        //Pruebas de escritorio dados por el docente
        //L.intercambioNodos(10, 25);   // 1ero P y despues Q
        //L.intercambioNodos(25, 10);	// 1ero Q y despues P
        //L.intercambioNodos(10, 20);	// Son Contiguos P y Q
        //L.intercambioNodos(20, 10);	// Son Contiguos Q y P
        //L.intercambioNodos(5, 25);	// P es Cabeza 1ero P y despues Q
        //L.intercambioNodos(25, 5);	// Q es Cabeza 1ero Q y despues P
        //L.intercambioNodos(5, 10);	// P es Cabeza Son Contiguos P y Q
        L.intercambioNodos(10, 5);	// Q es Cabeza Son Contiguos Q y P		
        System.out.println(L.viewList());
    }
    
}
