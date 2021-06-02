/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author andy
 */
public class NodoPila {
    private Vertex elemento;
    private NodoPila siguiente;
    
    public NodoPila(Vertex x){
        elemento=x;
        siguiente=null;
    }

    /**
     * @return the elemento
     */
    public Vertex getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(Vertex elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the siguiente
     */
    public NodoPila getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
}

