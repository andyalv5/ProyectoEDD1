package organizedchaos;

public class NodoVertice {
    NodoVertice pNext;
    Vertice element;
    
    
    public NodoVertice(Vertice el){
        
        this.pNext = null;
        this.element = el;
        
    }

    public NodoVertice getpNext() {
        return pNext;
    }

    public void setpNext(NodoVertice pNext) {
        this.pNext = pNext;
    }

    public Vertice getElement() {
        return element;
    }

    public void setElement(Vertice element) {
        this.element = element;
    }
    
}
