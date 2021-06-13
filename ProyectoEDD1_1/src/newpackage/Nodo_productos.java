/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 * Clase Nodo_productos
 * En esta clase se encontrara todo lo referente a los nodos que conformaran la
 lista de productos
 * @author Ulises, Andy, Hector
 * @version 12/6/21
 */
public class Nodo_productos {
    private String nombre;
    private int cantidad;
    private Nodo_productos proximo;
    private int tamanio;

    /**
     * Procedimiento Nodo_productos
     * Constructor que se utilizara para inicializar todas las instancias de un
     * Nodo_productos en el programa
     * @author Ulises, Andy, Hector
     * @param nombre
     * @param cantidad 
     */
    
    public Nodo_productos(String nombre, int cantidad){
    this.nombre = nombre;
    this.cantidad = cantidad;
    this.proximo = null;
    this.tamanio = 0;
    }
    
    /**
     * Funcion getNombre
     * Con esta funcion se retornaria el elemento nombre de un Nodo_productos
     * @author Ulises,Andy,Hector
     * @return String
     */
    
    public String getNombre() {
        return nombre;
    }

    /**
     * Procedimiento setNombre
     * Con esto se le asignaria un valor al elemento nombre de un Nodo_productos
     * @author Ulises,Andy,Hector
     * @param String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Funcion getCantidad
     * Con esta funcion se retornaria el elemento cantidad de un Nodo_productos
     * @author Ulises,Andy,Hector
     * @return int
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Procedimiento setCantidad
     * Con esto se le asignaria un valor al elemento cantidad de un Nodo_productos
     * @author Ulises,Andy,Hector
     * @param int
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Funcion getProximo
     * Con esta funcion se retornaria el elemento proximo de un Nodo_productos
     * @author Ulises,Andy,Hector
     * @return Nodo_productos
     */
    public Nodo_productos getProximo() {
        return proximo;
    }

    /**
     * Procedimiento setProximo
     * Con esto se le asignaria un valor al elemento proximo de un Nodo_productos
     * @author Ulises,Andy,Hector
     * @param Nodo_productos
     */
    public void setProximo(Nodo_productos proximo) {
        this.proximo = proximo;
    }
    
}
