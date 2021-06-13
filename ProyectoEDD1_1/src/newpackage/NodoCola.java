/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 * Clase NodoCola
 * En esta clase va a estar lo relacionado con los nodos que conformaran
 las colas
 * @author Andy,Hector,Ulises
 * @version 12/6/21
 */
public class NodoCola {
    private Vertex elemento;
    private NodoCola siguiente;
    
    /**
     * Procedimiento NodoCola
     * Constructor que se utilizara para inicializar las instancias de los 
     nodos de las colas
     * @author Ulises,Andy,Hector
     * @param x 
     */
    
    public NodoCola(Vertex x){
        elemento=x;
        siguiente=null;
    }

    /**
     * Funcion getElemento
     * Con esta funcion se retornara el elemento
     * @author Ulises,Hector,Andy
     * @return Vertex
     */
    public Vertex getElemento() {
        return elemento;
    }

    /**
     * Procedimiento setElemento
     * Con este procedimiento se le da un valor a la variable elemento
     * @author Hector,Ulises,Andy
     * @param elemento the elemento to set
     */
    public void setElemento(Vertex elemento) {
        this.elemento = elemento;
    }

    /**
     * Funcion getSiguiente
     * Con esta funcion se obtiene el siguiente a un nodo
     * @author Ulises, Hector,Andy
     * @return the siguiente
     */
    public NodoCola getSiguiente() {
        return siguiente;
    }

    /**
     * Procedimiento setSiguiente
     * Con este procedimiento se le da el valor a el siguiente de un nodo
     * @author Ulises,Hector,Andy
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
}
