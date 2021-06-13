/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 * Clase Vertex
 * Se ecnuentra todo lo relacionado con los vertex del programa
 * @author andy, Ulises, Hector
 * @version 12/6/21
 */
public class Vertex {
    private String name;
    private Lista_productos listaver;
    private int vertexNum;
    private int realvertexNum;
    private Vertex siguiente;
    private boolean Visitado;
    

    /**
     * Procedimiento Vertex
     * Contructor con el que se inicializarian instancia de Vertex
     * @author Ulises,Andy,Hector
     * @param x 
     */
    
    public Vertex(String x){
        name=x;
        vertexNum = -1;
        this.Visitado = false;
        
    }

    /**
     * Procedimiento Vertex
     * Contructor con el que se inicializarian instancia de Vertex
     * @author Ulises,Andy,Hector
     * @param x
     * @param listaver 
     */
    
    public Vertex(String x,Lista_productos listaver){
        this.name=x;
        this.listaver= listaver;
        vertexNum = 3;
        this.Visitado = false;
        this.realvertexNum = -1;
    }
    /**
     * Funcion getName
     * Funcion en la cual se retorna el elemento name
     * @author Ulises,Andy,Hector
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Funcion vertexEquals
     * Dice si el nombre es igual al nombre del vertice que le pasas
     * @author Ulises,Andy,Hector
     * @param i
     * @return boolean si el nombre es igual o no
     */
    
    public boolean vertexEquals(Vertex i){
        return getName().equals(i.getName());
    }
    
    /**
     * Procedimiento assingVtx
     * Le asigna el mismo valor numerico a dos atributos
     * @author Ulises,Andy,Hector
     * @param n 
     */
    
    public void assingVtx(int n){
        this.setVertexNum(n);
        this.setRealvertexNum(n);
    }
    
    /**
     * Procedimiento setName
     * Se le asigna un valor al elemento name
     * @author Andy,Ulises,Hector
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Funcion getVertexNum
     * Funcion en la cual se retorna el elemento vertexNum
     * @author Ulises,Andy,Hector
     * @return the vertexNum
     */
    public int getVertexNum() {
        return vertexNum;
    }

 
    /**
     * Procedimiento setVertexNum
     * Se le asigna un valor al elemento vertexNum
     * @author Andy,Ulises,Hector
     * @param vertexNum the vertexNum to set
     */
    public void setVertexNum(int vertexNum) {
        this.vertexNum = vertexNum;
    }
    
    /**
     * Funcion getListaver
     * Funcion en la cual se retorna el elemento listaver
     * @author Ulises,Andy,Hector
     * @return the listaver
     */
    public Lista_productos getListaver() {
        return listaver;
    }

    /**
     * Procedimiento setListaver
     * Se le asigna un valor al elemento listaver
     * @author Andy,Ulises,Hector
     * @param listaver the listaver to set
     */
    public void setListaver(Lista_productos listaver) {
        this.listaver = listaver;
    }

    /**
     * Funcion getSiguiente
     * Funcion en la cual se retorna el elemento siguiente
     * @author Ulises,Andy,Hector
     * @return the siguiente
     */
    public Vertex getSiguiente() {
        return siguiente;
    }

    /**
     * Procedimiento setSiguiente
     * Se le asigna un valor al elemento siguiente
     * @author Andy,Ulises,Hector
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Vertex siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * Funcion isVisitado
     * Dice si el vertice fue visitado en el proceso de Dijsktra
     * @author Ulises, Andy, Hector
     * @return the Visitado
     */
    public boolean isVisitado() {
        return Visitado;
    }

    /**
     * Procedimiento setVisitado
     * Se le asigna un valor booleano a el elemento Visitado
     * @author Ulises,Andy,Hector
     * @param Visitado the Visitado to set
     */
    public void setVisitado(boolean Visitado) {
        this.Visitado = Visitado;
    }

    /**
     * Funcion getRealvertexNum
     * Funcion en la cual se retorna el elemento realvertexNum
     * @author Ulises,Andy,Hector
     * @return the realvertexNum
     */
    public int getRealvertexNum() {
        return realvertexNum;
    }

    /**
     * Procedimiento setRealvertexNum
     * Se le asigna un valor al elemento realvertexNum
     * @author Andy,Ulises,Hector
     * @param realvertexNum the realvertexNum to set
     */
    public void setRealvertexNum(int realvertexNum) {
        this.realvertexNum = realvertexNum;
    }

}
