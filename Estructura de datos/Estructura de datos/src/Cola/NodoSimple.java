package Cola;

//Esta clase por medio del constructor construye el nodo el cual se divide en "elemento" y "siguiente"
//"elemento", es el objeto que se va a almacenar
//"siguiente", espacio de memoria que permite el enlace con el otro nodo
public class NodoSimple<Object> {
    private Object elemento;
    private NodoSimple siguiente;
    
    public NodoSimple(Object elemento){
        this.elemento = elemento;
        siguiente = null;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public NodoSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }
    
    public boolean elementoIgualA(Object elemento){
        //FORMA 1
//        boolean bandera;
//        if(elemento == null){
//            bandera = true;
//        }
//        else{
//            bandera = false;
//        }
        //FORMA 2
//        if(elemento == null){
//            return true;
//        }
//        else{
//            return false;
//        }
        //FORMA 3
//        return this.elemento == null;
        //FORMA 4
//        if(elemento == null)
//            //return true;
//            return this.elemento == null;
//        else
//            return elemento == this.elemento;
        //FORMA 5
//        if(elemento == null)
//            return this.elemento == null;
//        if(elemento == this.elemento){
//            return true;
//        }
//        else{
//            return false;
//        }
        //FORMA 6
//        return (elemento == null)?  this.elemento == null : elemento == this.elemento;
        //FORMA 7 - Como se encuentra en la cartilla
//        if(elemento == null || elemento == this.elemento)
//            return true;
//        return false;
        //FORMA 8 - Como se encuentra en la cartilla
        if(elemento == null)
            return this.elemento == null;
        return elemento == this.elemento;
    }
}
