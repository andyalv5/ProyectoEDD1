package newpackage;

   /**
 * Clase Nodoweight
 * En esta clase se encontrara lo referente a los Nodoweight
 * @author Ulises, Andy, Hector
 * @version 12/6/21
 */

public class Nodoweight {

 /**
     * Funcion getWeight
     * En esta funcion se retornar el elemento weight del nodo
     * @author Ulises,Andy,Hector
     * @return int
     */

    public int getWeight() {
        return weight;
    }

    
    /**
     * Procedimiento setWeight
     * En este procediiento se le dara valor el elemento weight del nodo
     * @author Ulises,Hector,Andy
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Procedimiento setVertex1
     * En este procediiento se le dara valor el elemento Vertex1 del nodo
     * @author Ulises,Hector,Andy
     * @param Vertex1 the Vertex1 to set
     */
    public void setVertex1(String Vertex1) {
        this.Vertex1 = Vertex1;
    }

     /**
     * Procedimiento setVertex2
     * En este procediiento se le dara valor el elemento Vertex2 del nodo
     * @author Ulises,Hector,Andy
     * @param Vertex2 the Vertex2 to set
     */
    public void setVertex2(String Vertex2) {
        this.Vertex2 = Vertex2;
    }
    private Nodoweight pNext;
    private int weight;
    private String Vertex1;
    private String Vertex2;
    
    /**
     * Procedimiento Nodoweight
     * Constructor que se utilizara para la inicializacion de los Nodoweight en
     el programa
     * @author Ulises,Andy,Hector
     * @param verx1
     * @param verx2
     * @param weight 
     */
    
    public Nodoweight(String verx1,String verx2,int weight){
        
        this.pNext = null;
        this.weight = weight;
        this.Vertex1= verx1;
        this.Vertex2 = verx2;
        
    }
    
     /**
     * Procedimiento Nodoweight
     * Constructor que se utilizara para la inicializacion de los Nodoweight en
     el programa
     * @author Ulises,Andy,Hector
     * @param verx1
     * @param verx2 
     */
    
    public Nodoweight(String verx1,String verx2){
        
        this.pNext = null;
        this.weight = 0;
        this.Vertex1= verx1;
        this.Vertex2 = verx2;
        
    }

    /**
     * Funcion getpNext
     * En esta funcion se retornar el elemento pNext del nodo
     * @author Ulises,Andy,Hector
     * @return Nodoweight
     */
    
    public Nodoweight getpNext() {
        return pNext;
    }
    
    /**
     * Funcion IsEmpty
     * Retorna si un nodo esta vacia
     * @author Ulises,Hector,Andy
     * @return boolean 
     */
    
    public boolean IsEmpty(){
            return true;
        }
    
    /**
     * Procedimiento setpNext
     * En este procediiento se le dara valor el elemento pNext del nodo
     * @author Ulises,Hector,Andy
     * @param pNext 
     */
    
    public void setpNext(Nodoweight pNext) {
        this.pNext= pNext;
    }

    
    /**
     * Funcion getweight
     * En esta funcion se retornar el elemento weight del nodo
     * @author Ulises,Andy,Hector
     * @return int
     */
    
    public int getweight() {
        return getWeight();
    }

    /**
     * Procedimiento setElement
     * En este procediiento se le dara valor el elemento element del nodo
     * @author Ulises,Hector,Andy
     * @param weight 
     */
    
    public void setElement(int weight) {
        this.setWeight(weight);
    }

    /**
     * Funcion getVertex1
     * En esta funcion se retornar el elemento Vertex1 del nodo
     * @author Ulises,Andy,Hector
     * @return String
     */
    
    public String getVertex1() {
        return Vertex1;
    }

    /**
     * Funcion getVertex2
     * En esta funcion se retornar el elemento Vertex2 del nodo
     * @author Ulises,Andy,Hector
     * @return String
     */
    
    public String getVertex2() {
        return Vertex2;
    }
    
}
