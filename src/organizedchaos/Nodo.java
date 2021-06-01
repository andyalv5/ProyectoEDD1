package organizedchaos;

public class Nodo 
{
    private Nodo pNext;
    //Object element;
    private String pNombre;
    private int pStock;
    
    public Nodo(String el){

        
        String[] aux = el.split(",");
        this.pNext = null;
        this.pNombre = aux[0];
        this.pStock = Integer.parseInt(aux[1]);
        
    }

    public Nodo getpNext() {
        return pNext;
    }

    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
    }

    public String getpNombre() {
        return pNombre;
    }

    public void setpNombre(String pNombre) {
        this.pNombre = pNombre;
    }

    public int getpStock() {
        return pStock;
    }

    public void setpStock(int pStock) {
        this.pStock = pStock;
    }

    
}
