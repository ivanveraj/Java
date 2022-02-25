package edarreglosdinamicos;

public class EDArreglosDinamicos {

    public static void main(String[] args) {
        Pila P=new Pila();
        Nodo N;
        
        System.out.println("Esta vacio: "+P.isEmpty());
        System.out.println("Cuantos elementos: "+P.Size());
        P.Push(23);
        P.Push(26);
        P.Push(29);
        System.out.println(P.Peek());
        System.out.println(P.Pop());
        System.out.println(P.Peek());
    }
    
}
