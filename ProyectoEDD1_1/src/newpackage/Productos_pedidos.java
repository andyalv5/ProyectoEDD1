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
public class Productos_pedidos {
    
    private String nombre;
    private int Size;
    private Nodo_Productos_pedidos Pfirst;
    private Nodo_Productos_pedidos Plast;
    
    public Productos_pedidos(){
        
        this.Pfirst = null;
        this.Plast = null;
        this.Size = 0;        
        
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
    public int getSize() {
        return Size;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setSize(int Size) {
        this.Size = Size;
    }

    /**
     * @return the Pfirst
     */
    public Nodo_Productos_pedidos getPfirst() {
        return Pfirst;
    }

    /**
     * @param Pfirst the Pfirst to set
     */
    public void setPfirst(Nodo_Productos_pedidos Pfirst) {
        this.Pfirst = Pfirst;
    }

    /**
     * @return the Plast
     */
    public Nodo_Productos_pedidos getPlast() {
        return Plast;
    }

    /**
     * @param Plast the Plast to set
     */
    public void setPlast(Nodo_Productos_pedidos Plast) {
        this.Plast = Plast;
    }
    
    
    public boolean IsEmpty(){
        return getPfirst() == null;
    }
    
    public void addElementbegin(Nodo_Productos_pedidos newNodo){
        if(this.IsEmpty()){
            Pfirst=Plast= newNodo;
        }
        else{
            Nodo_Productos_pedidos pNew= Pfirst; 
            Pfirst=newNodo;
            Pfirst.setSiguiente(pNew);
        }
        Size++;
        
    }  
    
    public void addAtEnd(Nodo_Productos_pedidos node){
        if(this.IsEmpty()){
            addElementbegin(node);
        }
        Nodo_Productos_pedidos tempo = this.Plast;
        tempo.setSiguiente(node);
        Plast = node;
        Size ++;
    }
    
}
