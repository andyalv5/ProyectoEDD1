package newpackage;

public class Nodoweight {

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @param Vertex1 the Vertex1 to set
     */
    public void setVertex1(String Vertex1) {
        this.Vertex1 = Vertex1;
    }

    /**
     * @param Vertex2 the Vertex2 to set
     */
    public void setVertex2(String Vertex2) {
        this.Vertex2 = Vertex2;
    }
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
    
    
    public boolean IsEmpty(){
            return true;
        }
    
    public void setpNext(Nodoweight pNext) {
        this.pNext= pNext;
    }

    public int getweight() {
        return getWeight();
    }

    public void setElement(int weight) {
        this.setWeight(weight);
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
