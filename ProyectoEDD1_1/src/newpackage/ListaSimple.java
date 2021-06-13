package newpackage;

import javax.swing.JOptionPane;

/**
 * Clase ListaSimple
 * Esta es la clase de la lista de pesos de los arcos
 * @author Ulises, Andy, Hector
 * @version 12/6/21
 */

public class ListaSimple 
{
    private Nodoweight pFirst;
    private Nodoweight pLast;
    private int size;
 
    /**
     * Constructor ListaSimple
     * Este seria el constructor con el que se inicializarian las instancias de 
     ListaSimple
     * @author Ulises,Andy,Hector
     */
    
    public ListaSimple(){
        
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;        
        
    }
    
    
    /**
     * Funcion getpFirst
     * Esta funcion devuelve el valor pFirst
     * @author Andy,Hector,Ulises
     * @return Nodoweight pFirst
     */
    
    public Nodoweight getpFirst() {
        return pFirst;
    }

     /**
     * Procedimiento setpFirst
     * Con este procedimiento se le asigna un valor a pFirst
     * @author Andy, Hector, Ulises
     * @param pFirst 
     */
    
    public void setpFirst(Nodoweight pFirst) {
        this.pFirst = pFirst;
    }

     /**
     * Funcion getpLast
     * Esta funcion devuelve el valor pLast
     * @author Andy,Hector,Ulises
     * @return Nodoweight pLast
     */
    
    
    public Nodoweight getpLast() {
        return pLast;
    }

     /**
     * Procedimiento setpLast
     * Con este procedimiento se le asigna un valor a pLast
     * @author Andy, Hector, Ulises
     * @param pLast 
     */
    
    public void setpLast(Nodoweight pLast) {
        this.pLast = pLast;
    }

    /**
     * Funcion getSize
     * Esta funcion devuelve el valor size
     * @author Andy,Hector,Ulises
     * @return int size
     */
    
    public int getSize() {
        return size;
    }

    /**
     * Procedimiento setSize
     * Con este procedimiento se le asigna un valor a size
     * @author Andy, Hector, Ulises
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
     * @return boolean si es vacia o no
     */
    
    public boolean IsEmpty(){
        return getpFirst() == null;
    }
    
    /**
     * Funcion Proximo
     * Esta funcion devolveria el siguiente nodo a un nodo dado
     * @author Andy
     * @param pValue
     * @return Nodoweight el proximo
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
     * @author Andy, Ulises, Hector
     * @return String la impresion de la lista
     */
    

 
    public String printList()
    {
        
        
        if (!IsEmpty()) {
            String lista_completa = "->";
            Nodoweight pAct = this.getpFirst();
            while(pAct != null){
                lista_completa += pAct.getweight() + "\n";
                pAct = pAct.getpNext();
            }
        
            return lista_completa;           
        } 
        
        return "->lista vacia";
        
    }
    
     /**
     * Procedimiento pntAllelmnt
     * Con este procedimiento se mostraria en pantalla todos los elmentos 
     de una lista
     * @author Andy, Ulises, Hector
     */
    
    public void pntAllelmnt(){
        Nodoweight nodoTmp = pFirst;
        if(this.IsEmpty()){
         JOptionPane.showMessageDialog(null,"The list is empty");
        }
        while(nodoTmp != null){
            JOptionPane.showMessageDialog(null,nodoTmp.getVertex1());
            nodoTmp=nodoTmp.getpNext();
        }
        
    }
    
      /**
     * Procedimiento addAtEnd
     * Con este procedimiento se agrega un elemento al final de la lista
     * @author Andy
     * @param node 
     */
    
    public void addAtEnd(Nodoweight node){
        if(this.IsEmpty()){
            addElementbegin(node);
        }
        else{Nodoweight tempo = this.pLast;
            tempo.setpNext(node);
            pLast = node;
            size ++;
        }
    }
    
     /**
     * Procedimiento addElementbegin
     * Con este procedimiento se añade un elemento al principio de la lista
     * @author Andy, Hector, Ulises
     * @param newNodo 
     */
    
    public void addElementbegin(Nodoweight newNodo){
        if(this.IsEmpty()){
            pFirst=pLast= newNodo;
        }
        else{
            Nodoweight pNew= pFirst; 
            pFirst=newNodo;
            pFirst.setpNext(pNew);
            
        }
        size++;
        
    }   
    
     /**
     * Funcion Buscar
     * Esta funcion devuelve el peso del arco si existe
     * @author Andy, Hector, Ulises
     * @param nom
     * @param nom2
     * @return int el peso
     */
    
    public int Buscar(String nom,String nom2){
        
        ListaSimple aux =this;
        Nodoweight auxiliar1=this.pFirst;
        while(auxiliar1 !=null){
            if(nom.equals(aux.getpFirst().getVertex1())){
                if (nom2.equals(aux.pFirst.getpNext().getVertex2())){
                    return aux.getpFirst().getweight();
                }
            }
            auxiliar1 = auxiliar1.getpNext();
        }     
        return -1;
    }
    
    
     /**
     * Funcion ReturnFE
     * Esta funcion comprueba si existe el nodo en el primer elemento
     y lo retorna
     * @author Andy,Hector,Ulises
     * @param name
     * @return String el nombre
     */
    
    public String ReturnFE(String name){
        Nodoweight actual=pFirst;
        String myStr = "";
        
        boolean founded = false;
        while(actual !=null){
            founded = actual.getVertex2().equals(name);
            if(founded){
                myStr+=actual.getVertex1()+",";
            }
            actual=actual.getpNext();
        }
        return myStr;
    }
    
    /**
     * Funcion ReturnSE
     * Esta funcion comprueba si existe el nodo en el ultimo elemento
     * @author Andy,Hector,Ulises
     * @param name
     * @return String el name
     */
    
    public String ReturnSE(String name){
        String myStr="";
        Nodoweight actual=pFirst;
        boolean founded = false;
        while(actual !=null){
            founded = actual.getVertex1().equals(name);
            if(founded){
                myStr+=actual.getVertex2()+",";
            }
            actual=actual.getpNext();
        }
        return myStr;
    }
   
     /**
     * Procedimiento delByNameSCE
     * Elimina por nombre el segundo elemento 
     * @author Ulises,Andy,Hector
     * @param name 
     */
    
    public void delByNameSCE(String name){
        Nodoweight actual=pFirst;
        Nodoweight anterior =null;
        boolean founded = false;
        while(actual !=null && !founded ){
            founded = actual.getVertex1().equals(name);
            if(!founded){
                anterior =actual;
                actual=actual.getpNext();
            }
        
        }
        if(actual!=null){
            if (actual==pFirst){
                pFirst = actual.getpNext();
                if (actual==pFirst){
                    pFirst = actual.getpNext();
                }
            }
            else{
                anterior.setpNext(actual.getpNext());
            }
            actual=null;
        }
    }
    
     /**
     * Procedimiento delByNameFE
     * Elimina por nombre el primer elemento 
     * @author Ulises,Andy,Hector
     * @param name 
     */
    
    public void delByNameFE(String name){
        Nodoweight actual=pFirst;
        Nodoweight anterior =null;
        boolean founded = false;
        while(actual !=null && !founded ){
            founded = actual.getVertex2().equals(name);
            if(!founded){
                anterior =actual;
                actual=actual.getpNext();
            }
        }
        if(actual!=null){
            if (actual==pFirst){
                pFirst = actual.getpNext();
            }
            else{
                anterior.setpNext(actual.getpNext());
            }
            actual=null;
        
        }
    }
    
    /**
     * Funcion ExistFE
     * Retorna si existe o no el primer elemento 
     * @author Ulises,Andy,Hector
     * @param name
     * @return boolena si existe o no
     */
    
    
    public boolean ExistFE(String name){
        Nodoweight actual=pFirst;
        boolean founded = false;
        while(actual !=null && !founded ){
            founded = actual.getVertex2().equals(name);
            if(!founded){
                actual=actual.getpNext();
            }
            if(founded){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Funcion ExistSE
     * Retorna si existe o no el segundo elemento 
     * @author Ulises,Andy,Hector
     * @param name
     * @return 
     */
    
    public boolean ExistSE(String name){
        Nodoweight actual=pFirst;
        boolean founded = false;
        while(actual !=null && !founded ){
            founded = actual.getVertex1().equals(name);
            if(!founded){
                actual=actual.getpNext();
            }
            if(founded){
                return true;
            }
        }
        return false;
    }
    
    
}
