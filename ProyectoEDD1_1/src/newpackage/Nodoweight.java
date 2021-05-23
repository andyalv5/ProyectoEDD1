package newpackage;

public class Nodoweight {
    private Nodoweight pNext;
    private int weight;
    private String Vertex1;
    private String Vertex2;
    
    
    public Nodoweight(String verx1,String verx2,int weight){
        
        this.pNext = null;
        this.weight = weight;
        this.Vertex1= verx1;
        this.Vertex2 = verx2;
        
    }
    
    public Nodoweight(String verx1,String verx2){
        
        this.pNext = null;
        this.weight = 0;
        this.Vertex1= verx1;
        this.Vertex2 = verx2;
        
    }

    public Nodoweight getpNext() {
        return pNext;
    }

    public void setpNext(Nodoweight pNext) {
        this.pNext = pNext;
    }

    public int getweight() {
        return weight;
    }

    public void setElement(int weight) {
        this.weight = weight;
    }

    /**
     * @return the Vertex1
     */
    public String getVertex1() {
        return Vertex1;
    }

    /**
     * @return the Vertex2
     */
    public String getVertex2() {
        return Vertex2;
    }
    
}
