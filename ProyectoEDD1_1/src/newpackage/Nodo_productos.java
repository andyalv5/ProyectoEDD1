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
public class Nodo_productos {
    private String nombre;
    private int cantidad;
    private Nodo_productos proximo;

    /**
     * @return the nombre
     */
    
    Nodo_productos(String nombre, int cantidad){
    this.nombre = nombre;
    this.cantidad = cantidad;
    this.proximo = null;
    }
    
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
     * @return the proximo
     */
    public Nodo_productos getProximo() {
        return proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(Nodo_productos proximo) {
        this.proximo = proximo;
    }
    
    
    
}