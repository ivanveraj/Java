package edlistas;
public class EDListas {
    public static void main(String[] args) {
        Lista L=new Lista();
        Lista L2=new Lista();
        Lista L3=new Lista();
        Lista L22=new Lista();
        System.out.println(L.InsertTo(1));
        System.out.println(L.InsertTo(2));
        System.out.println(L.InsertTo(3));
        System.out.println(L.InsertTo(4));
        System.out.println(L.PrintList());
        L2.InsertLast(4);
        L2.InsertLast(6);
        L2.InsertLast(2);
        L2.InsertLast(1);
        System.out.println("\n"+L2.PrintList());
        System.out.println(L2.Compara(L));
        System.out.println(L3.Compara(L22));
        /*L.InsertFirst(1);
        L.InsertAfter(3,1);
        L.InsertAfter(5,3);
        L.InsertAfter(90,5);
        L.InsertAfter(19,90);
        L.InsertFirst(15);
        L.InsertAfter(50,15);
        L.InsertAfter(23,50);
        L.InsertAfter(80,23);
        /*L.InsertTo(1);
        L.InsertTo(2);
        L.InsertTo(3);
        L.InsertTo(4);
        L.InsertTo(5);
        L.InsertTo(7);
        L.InsertFirst(1);
        L.InsertFirst(2);
        L.InsertFirst(3);
        L.InsertFirst(4);
        L.InsertFirst(5);
        System.out.println("Print: "+L.PrintList());
        System.out.println(L.OrderList());*/
        
    }
    
}
