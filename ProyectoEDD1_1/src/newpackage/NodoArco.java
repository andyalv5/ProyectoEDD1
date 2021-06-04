
package newpackage;


public class NodoArco 
{
    NodoArco pNext;
    Arco element;
    
    
    public NodoArco(Arco el){
        
        this.pNext = null;
        this.element = el;
        
    }

    public NodoArco getpNext() {
        return pNext;
    }

    public void setpNext(NodoArco pNext) {
        this.pNext = pNext;
    }

    public Arco getElement() {
        return element;
    }

    public void setElement(Arco element) {
        this.element = element;
    }    
    
}
