package newpackage;

import javax.swing.JOptionPane;

/**
 * Clase ListaVertex
 * En esta clase esta todo lo relacionado con las listas de vertices
 * @author Ulises, Hector, Andy
 * @version 12/6/21
 */

public class ListaVertex 
{
    private Vertex pFirst;
    private Vertex pLast;
    private int size;
    
     /**
     * Procedimiento ListaVertex
     * Es el constructor con el que se iniciarian las instancias de 
     ListaVertex
     * @author Andy,Hector,Ulises
     */
    
    public ListaVertex(){
        
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;        
        
    }
    
    /**
     * Funcion getpFirst
     * Con esta funcion se retorna el valor pFirst
     * @author Andy,Hector,Ulises
     * @return Vertex pFirst
     */
    
    public Vertex getpFirst() {
        return pFirst;
    }
    
    /**
     * Procedimiento setpFirst
     * COn este procedimiento se le asigna valor a pFirst
     * @author Ulises,Andy,Hector
     * @param pFirst 
     */

    public void setpFirst(Vertex pFirst) {
        this.pFirst = pFirst;
    }
    
     /**
     * Funcion getpLast
     * Con esta funcion se retorna el valor pLast
     * @author Andy,Hector,Ulises
     * @return Vertex pLast
     */
    

    public Vertex getpLast() {
        return pLast;
    }
    
    /**
     * Procedimiento setpLast
     * COn este procedimiento se le asigna valor a pLast
     * @author Ulises,Andy,Hector
     * @param pLast 
     */

    public void setpLast(Vertex pLast) {
        this.pLast = pLast;
    }
    
     /**
     * Funcion getSize
     * Con esta funcion se retorna el valor size
     * @author Andy,Hector,Ulises
     * @return int size
     */

    public int getSize() {
        return size;
    }

    
    /**
     * Procedimiento setSize
     * COn este procedimiento se le asigna valor a size
     * @author Ulises,Andy,Hector
     * @param size 
     */
    
    public void setSize(int size) {
        this.size = size;
    }
    
     /**
     * Procedimiento DestroyList
     * Este es el destructor para vaciar una lista por completo
     * @author Andy, Hectro, Ulises
     */
    
    
    public void DestroyList(){
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
       
    }
    
    /**
     * Funcion IsEmpty
     * Esta es la funcion que determina si una lista esta vacia o no
     * @author Andy, Hector, Ulises
     * @return boolean si esta vacia o no 
     */
    
    public boolean IsEmpty(){
        return getpFirst() == null;
    }
    
    /**
     * Funcion Proximo
     * Esta funcion devolveria el siguiente nodo a un nodo dado
     * @author Andy
     * @param pValue
     * @return Nodoweight el proximo nodo
     */
    
    public Nodoweight Proximo(Nodoweight pValue)
    {
        
        if(pValue.getpNext() != null){
            pValue = pValue.getpNext();
            return pValue;
        }else{
            return null;
        }
    }
    
    /**
     * Funcion printList
     * Esta funcion devolveria un String en el cual estarian
     los datos de las listas
     * @author Andy, Hector, Ulises
     * @return String la impresion de la lista
     */
    

 
    public String printList()
    {
        
        
        if (!IsEmpty()) {
            String lista_completa = "->";
            Vertex pAct = this.getpFirst();
            while(pAct != null){
                lista_completa += pAct.getName() + "\n";
                pAct = pAct.getSiguiente();
            }
        
            return lista_completa;           
        } 
        
        return "->lista vacia";
        
    }
    
    /**
     * Procedimiento pntAllelmnt
     * Imprime en una lista los vertices
     * @author Ulises,Andy,Hector
     */
    
    public void pntAllelmnt(){
        Vertex nodoTmp = pFirst;
        if(this.IsEmpty()){
         JOptionPane.showMessageDialog(null,"The list is empty");
        }
        while(nodoTmp != null){
            JOptionPane.showMessageDialog(null,nodoTmp);
            nodoTmp=nodoTmp.getSiguiente();
        }
        
    }
    
    /**
     * Procedimiento addAtEnd
     * Agrega un vertice al final de la lista
     * @author Ulises,Hector,Andy
     * @param node 
     */
    
    public void addAtEnd(Vertex node){
        if(this.IsEmpty()){
            addElementbegin(node);
        }
        else{
            Vertex tempo = this.pLast;
            tempo.setSiguiente(node);
            pLast = node;
        }
        size ++;
    }
    
    /**
     * Procedimiento addElementbegin
     * Agrega un vertice al principio de la lista
     * @author Ulises,Andy,Hector
     * @param newNodo 
     */
    
    public void addElementbegin(Vertex newNodo){
        if(this.IsEmpty()){
            pFirst=pLast= newNodo;
        }
        else{
            Vertex pNew= pFirst; 
            pFirst=newNodo;
            pFirst.setSiguiente(pNew);
            
            size++;
        }
        
    }   
    
     /**
     * Funcion Buscar
     * Busca el vertice y devuelve su numero de vertice, si no lo consigue
     devuelve -1
     * @author Andy, Hector, Ulises
     * @param nom
     * @return int el numero del vertice
     */
    
    public int Buscar(String nom){
        
        ListaVertex aux =this;
        Vertex auxiliar1=aux.getpFirst();
        while(auxiliar1 !=null){
            if(nom.equals(auxiliar1.getName())){
                return auxiliar1.getVertexNum();
            }
            auxiliar1 = auxiliar1.getSiguiente();
        }     
        return -1;
    }
    
    /**
     * Funcion BuscarVertex
     * Busca en la lista y devuelve el vertice
     * @author Ulises,Andy,Hector
     * @param searched
     * @return Vertex vertice
     */
    
   public Vertex BuscarVertex(String searched){
        
        Vertex aux;
        try{
            for(aux=this.pFirst;aux !=null;aux=aux.getSiguiente()){
                if(searched.equals(aux.getName())){
                    return aux;
                } 
            }     
        }
        catch(Exception e){
            return null;
        }
        return null;
    }
   
    /**
     * Funcion returnAlmacenes
     * Devuelve todos los almacenes
     * @author Ulises, Andy, Hector
     * @return String los almacenes
     */
   
    public String returnAlmacenes(){
        String almacenes = "";
        Vertex temp = this.pFirst;
        while(temp!=null){
            almacenes+= temp.getName() +",";
            temp = temp.getSiguiente();
        }
        return almacenes;
    }
    
     /**
     * Procedimiento delAtEnd
     * Elimina al final de la lista
     * @author Ulises,Hector,Andy
     */
    
    public void delAtEnd(){
        Vertex temp= pFirst;
        if(pFirst == pLast){
            pFirst = pLast = null;
        }
        else{
            while(temp.getSiguiente()!=pLast){
                temp = temp.getSiguiente();
            }
        pLast =temp;
        pLast.setSiguiente(null);
        }
    }
   
    
     /**
     * Procedimiento delByName
     * Elimina por nombre de almacen
     * @author Hector,Andy,Ulises
     * @param name 
     */
    
    public void delByName(String name){
        if(name.equals(this.pFirst.getName())){
            this.pFirst = this.pFirst.getSiguiente();
        }
        else if(name.equals(this.pLast.getName())){
            delAtEnd();
        }
        else{
            int contador =0;
            Vertex nodoTmp = this.pFirst;
            while(contador < size-1 && nodoTmp.getSiguiente() !=null){
                if(name.equals(nodoTmp.getSiguiente().getName())){
                    nodoTmp.setSiguiente(nodoTmp.getSiguiente().getSiguiente());
                }
                nodoTmp = nodoTmp.getSiguiente(); 
            }
        }
        size--;
    }
    
    
    /**
     * Funcion SumarLista
     * Devuele un String con texto que tiene almacen y productos
     * @param lisver
     * @return String almacenes y productos
     */
    
    public String SumarLista(ListaVertex lisver){
        
        String almacenes = "";
        Vertex temp = lisver.getpFirst();
        for(int s=0; s<lisver.getSize();s++){
            almacenes+= "Almacen "+temp.getName()+"\n";
            almacenes+= temp.getListaver().returnInlistProducts();
            almacenes+="\n";
            temp = temp.getSiguiente();
            
        }
        JOptionPane.showMessageDialog(null, almacenes);
        return almacenes;
        
    }
    
}
            
            
