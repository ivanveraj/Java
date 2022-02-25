/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edarbolesbb;
public class EDArbolesBB {
    
    public static void main(String[] args) {
        Arbol A=new Arbol();
        Nodo P,Q;
        A.InsertToR(20);
        A.InsertToR(12);
        A.InsertToR(25);
        A.InsertToR(10);
        A.InsertToR(18);
        A.InsertToR(15);
        A.InsertToR(14);
        A.InsertToR(19);
        A.InsertToR(30);
        A.InsertToR(28);
        A.InsertToR(35);
        System.out.println(A.PreOrden());
        System.out.println(A.Delete(12));
        System.out.println(A.PreOrden());

        /*System.out.println(A.PreOrden());
        System.out.println(A.ContHojas());
        P=A.FindNodo(10);
        if(P!=null){
            System.out.println("Entro: "+P.getInfo());
            if(A.FindPredecesor(P)!=null){
                System.out.println(A.FindPredecesor(P).getInfo());
            }else{
                System.out.println("No hay");
            }
        }else{
            System.out.println("No existe");
        }*/
        
        
        /*Q=A.PadreNodo(10);
        if(Q!=null){
            System.out.println(Q.getInfo());
        }else{
            System.out.println("No existe el padre");
        }
        System.out.println("FindNodo");
        P=A.FindNodo(11);
        if(P!=null){
            System.out.println("Existe");
        }else{
            System.out.println("No existe");
        }*/
        
    }
    
}
