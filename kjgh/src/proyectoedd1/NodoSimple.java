package organizedchaos;

public class NodoSimple {
    NodoSimple pNext;
    String element;
    
    
    public NodoSimple(String el){
        
        this.pNext = null;
        this.element = el;
        
    }

    public NodoSimple getpNext() {
        return pNext;
    }

    public void setpNext(NodoSimple pNext) {
        this.pNext = pNext;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }
    
}
