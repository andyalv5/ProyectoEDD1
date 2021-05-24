package organizedchaos;

public class Nodo 
{
    Nodo pNext;
    Object element;
    
    
    public Nodo(Object el){
        
        this.pNext = null;
        this.element = el;
        
    }

    public Nodo getpNext() {
        return pNext;
    }

    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }
}
