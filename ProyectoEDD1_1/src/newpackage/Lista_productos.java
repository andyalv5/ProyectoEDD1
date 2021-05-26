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
public class Lista_productos {
  
    private Nodo_productos primer_producto;
    private Nodo_productos ultimo_producto;
    private int size;
    
    public Lista_productos() {
        this.primer_producto = null;
        this.ultimo_producto = null;
        this.size = 0;
    
    }
    
     public boolean IsEmpty(){
        return this.primer_producto == null;
    }
    
    public void addElementbegin(Nodo_productos newNodo){
        if(this.IsEmpty()){
            this.primer_producto = this.ultimo_producto = newNodo;
        }
        else{
            Nodo_productos pNew= primer_producto; 
            primer_producto=newNodo;
            primer_producto.setProximo(pNew);
        }
        size++; 
    } 
     
    public void addAtEnd(Nodo_productos node){
        if(this.IsEmpty()){
            addElementbegin(node);
        }
        Nodo_productos tempo = this.ultimo_producto;
        primer_producto.setProximo(tempo);
        ultimo_producto = node;
        size ++;
    }
    
    /**
     * @return the primer_producto
     */
    public Nodo_productos getPrimer_producto() {
        return primer_producto;
    }

    /**
     * @param primer_producto the primer_producto to set
     */
    public void setPrimer_producto(Nodo_productos primer_producto) {
        this.primer_producto = primer_producto;
    }

    /**
     * @return the ultimo_producto
     */
    public Nodo_productos getUltimo_producto() {
        return ultimo_producto;
    }

    /**
     * @param ultimo_producto the ultimo_producto to set
     */
    public void setUltimo_producto(Nodo_productos ultimo_producto) {
        this.ultimo_producto = ultimo_producto;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
}
