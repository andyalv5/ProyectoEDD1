/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Ulises
 */
public class Nodo_Productos_pedidos {
    
    private String nombre;
    private int cantidad;
    private Nodo_Productos_pedidos siguiente;
    private Nodo_Productos_pedidos anterior;

    public Nodo_Productos_pedidos(String nombre, int cantidad){
        
        this.anterior = null;
        this.siguiente = null;
        this.cantidad = cantidad;
        this.nombre = nombre;
        
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the siguiente
     */
    public Nodo_Productos_pedidos getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo_Productos_pedidos siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public Nodo_Productos_pedidos getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Nodo_Productos_pedidos anterior) {
        this.anterior = anterior;
    }
    
}
