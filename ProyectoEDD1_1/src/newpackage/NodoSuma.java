package newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    
/**
 *
 * @author andy
 */
public class NodoSuma {
    private String Nombre;
    private String cantidad;
    private NodoSuma siguiente;
    
    public NodoSuma(String Nombre,String cantidad){
        this.Nombre=Nombre;
        this.cantidad=cantidad;
        this.siguiente=null;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the cantidad
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the siguiente
     */
    public NodoSuma getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoSuma siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
