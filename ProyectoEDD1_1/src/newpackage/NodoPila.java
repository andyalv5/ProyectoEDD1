/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 * Clase NodoPila
 * En esta clase se conseguira lo referencial a los nodos que formaran parte de
 las pilas
 * @author andy, Ulises,Hector
 * @version 12/6/21
 */
public class NodoPila {
    private Vertex elemento;
    private NodoPila siguiente;
    
    
    /**
     * Constructor NodoPila
     * Constructor que se utilizaara al inicializar un nodo de una pila en el 
     programa
     * @author Andy,Ulises,Hector
     * @param x 
     */
    
    public NodoPila(Vertex x){
        elemento=x;
        siguiente=null;
    }
 /**
     * Funcion getElemento
     * En esta funcion se retornaria el elemento de un NodoPila
     * @author Ulises,Andy,Hector
     * @return Vertex
     */
    public Vertex getElemento() {
        return elemento;
    }

    /**
     * Procedimiento setElemento
     * Con este procedimiento se le asignaria un valor a el elemento de un NodoPila
     * @author Ulises,Andy,Hector
     * @param elemento
     */
    public void setElemento(Vertex elemento) {
        this.elemento = elemento;
    }

   /**
     * Funcion getSiguiente
     * En esta funcion se retornaria el siguiente nodo de un NodoPila
     * @author Ulises,Andy,Hector
     * @return NodoPila
     */
    
    public NodoPila getSiguiente() {
        return siguiente;
    }

    /**
     * Procedimiento setSiguiente
     * Con este procedimiento se le asignaria un valor a el siguiente nodo
     de un NodoPila
     * @author Ulises,Andy,Hector
     * @param siguiente
     */
    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
}

