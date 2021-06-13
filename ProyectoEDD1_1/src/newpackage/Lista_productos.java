/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.swing.JOptionPane;

/**
 * Clase Lista_productos
 * En esta clase esta todo lo relacionado con las listas de productos
 * @author Ulises
 * @version 12/6/21
 */
public class Lista_productos {
  
    private Nodo_productos primer_producto;
    private Nodo_productos siguiente;
    private int size;
    
    /**
     * Procedimiento Lista_productos
     * Es el constructor mediante el cual se inicializaran las instancias de esta
     clase
     * @author Ulises,Andy,Hector
     */
    
    public Lista_productos() {
        this.primer_producto = null;
        this.siguiente= null;
        this.size = 0;
    
    }
    
    /**
     * Funcion returnInlistProducts
     * Retorna un String con los datos de la lista
     * @author Ulises,Andy,Hector
     * @return String productos
     */
    
    public String returnInlistProducts(){
        String toPrint = "";
        Nodo_productos nodoTmp = this.getPrimer_producto();
        if(this.IsEmpty()){
         toPrint = "The list is empty";
        }
        while(nodoTmp != null){
            toPrint += "Producto: "+nodoTmp.getNombre() + "  Cantidad: " +nodoTmp.getCantidad()+"\n";
            nodoTmp=nodoTmp.getProximo();
        }
        return toPrint;
    }
    
    /**
     * Funcion IsEmpty
     * verifica si una lista esta vacia
     * @author Ulises,Hector,Andy
     * @return boolean si esta vacia o no
     */
    
     public boolean IsEmpty(){
        return this.primer_producto == null;
    }
     
    /**
     * Procedimiento addElementbegin
     * Agrega un elemento al principio de la lista
     * @author Ulises,Andy,Hector
     * @param newNodo 
     */
     
    public void addElementbegin(Nodo_productos newNodo){
        if(this.IsEmpty()){
            this.primer_producto = this.siguiente = newNodo;
        }
        else{
            Nodo_productos pNew= primer_producto; 
            primer_producto=newNodo;
            primer_producto.setProximo(pNew);
        }
        size++; 
    } 
     
    /**
     * Procedimiento addAtEnd
     * Agrega un elemento al final de la lista
     * @author Ulises,Andy,Hector
     * @param node 
     */
    
    public void addAtEnd(Nodo_productos node){
        if(this.IsEmpty()){
            addElementbegin(node);
        }
        else{
            Nodo_productos tempo = this.getUltimo_producto();
            tempo.setProximo(node);
            siguiente = node;
            size ++;
        }
    }
    
    /**
     * Procedimiento pntAllelmntinList
     * Imprime un String con los elemento de la lista
     * @author Ulises,Hector,Andy
     */
    
    public void pntAllelmntinList(){
        String toPrint = "";
        Nodo_productos nodoTmp = this.getPrimer_producto();
        if(this.IsEmpty()){
         JOptionPane.showMessageDialog(null,"The list is empty");
        }
        while(nodoTmp != null){
            toPrint += "Producto: "+nodoTmp.getNombre() + " Cantidad: " +nodoTmp.getCantidad()+"\n";
            nodoTmp=nodoTmp.getProximo();
        }
        JOptionPane.showMessageDialog(null,toPrint);
    }
    
     /**
     * Funcion BuscarProducto
     * Busca si un elemento con el mismo nombre dado esta en la lista
     * @author Ulises,Hector,Andy
     * @param searched
     * @return Nodo_productos producto buscado
     */
    
    
    public Nodo_productos BuscarProducto(String searched){
        
        Nodo_productos aux;
        try{
            for(aux=this.getPrimer_producto();aux !=null;aux=aux.getProximo()){
                if(searched.equals(aux.getNombre())){
                    return aux;
                } 
            }     
        }
        catch(Exception e){
            return null;
        }
        return null;
    }
    
    /**
     * Funcion getPrimer_producto
     * Retorna el atriburo primer_producto
     * @author Ulises,Andy,Hector
     * @return the primer_producto
     */
    
    public Nodo_productos getPrimer_producto() {
        return primer_producto;
    }

    /**
     * Procedimiento setPrimer_producto
     * Se le asigna un valor a primer_producto
     * @author Ulises,Anyd,Hector
     * @param primer_producto the primer_producto to set
     */
    
    public void setPrimer_producto(Nodo_productos primer_producto) {
        this.primer_producto = primer_producto;
    }

    /**
     * Funcion getUltimo_producto
     * Retorna el atriburo siguiente
     * @author Ulises,Andy,Hector
     * @return the ultimo_producto
     */
    
    public Nodo_productos getUltimo_producto() {
        return siguiente;
    }

    /**
     * Procedimiento setUltimo_producto
     * Se le asigna un valor a siguiente
     * @author Ulises,Anyd,Hector
     * @param ultimo_producto the ultimo_producto to set
     */
    
    public void setUltimo_producto(Nodo_productos ultimo_producto) {
        this.siguiente = ultimo_producto;
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
    
   
    public Lista_productos addVarios(Lista_productos lispro, String a,int b,String c,int d,String e,int f,String g,int h){
        Nodo_productos nodPro=new Nodo_productos(a,b);
        Nodo_productos nodPro1=new Nodo_productos(c,d);
        Nodo_productos nodPro2=new Nodo_productos(e,f);
        Nodo_productos nodPro3=new Nodo_productos(g,h);
        if(a !=null){
            lispro.addAtEnd(nodPro);
        }
        if(c != null){
            lispro.addAtEnd(nodPro1);
        }
        if(e !=null){
            lispro.addAtEnd(nodPro2);
        }
        if(g !=null){
            lispro.addAtEnd(nodPro3);
        }
        return lispro;
    }
    
}
