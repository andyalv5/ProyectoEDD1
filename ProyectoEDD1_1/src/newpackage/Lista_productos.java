/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.swing.JOptionPane;

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
        tempo.setProximo(node);
        ultimo_producto = node;
        size ++;
    }
    
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
