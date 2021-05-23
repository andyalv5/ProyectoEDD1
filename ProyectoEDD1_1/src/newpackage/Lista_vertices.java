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
public class Lista_vertices {
    
    private Vertex primer_vertice;
    private Vertex ultimo_vertice;
    private int size;
    
    public Lista_vertices() {
        this.primer_vertice = null;
        this.ultimo_vertice = null;
        this.size = 0;
    
    }

    /**
     * @return the primer_vertice
     */
    public Vertex getPrimer_vertice() {
        return primer_vertice;
    }

    /**
     * @param primer_vertice the primer_vertice to set
     */
    public void setPrimer_vertice(Vertex primer_vertice) {
        this.primer_vertice = primer_vertice;
    }

    /**
     * @return the ultimo_vertice
     */
    public Vertex getUltimo_vertice() {
        return ultimo_vertice;
    }

    /**
     * @param ultimo_vertice the ultimo_vertice to set
     */
    public void setUltimo_vertice(Vertex ultimo_vertice) {
        this.ultimo_vertice = ultimo_vertice;
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
    
    public boolean EsVacio(){
        return primer_vertice == null;
    }
    
    public void InsertarFinal(String nombre){
        
       Vertex nuevo = new Vertex(nombre);
       
       if(EsVacio()){
           primer_vertice = nuevo;
           ultimo_vertice = nuevo;
       }else{
           Vertex aux = ultimo_vertice;
           aux.setProximo_vertex(nuevo);
           ultimo_vertice = nuevo;
       }
       
    }
    
    public void InsertarPrincipio(String nombre){
        
        Vertex nuevo = new Vertex(nombre);
       
       if(EsVacio()){
           primer_vertice = nuevo;
           ultimo_vertice = nuevo;
       }else{
           Vertex aux;
           aux.setProximo_vertex(primer_vertice);
           primer_vertice = nuevo;
       }
        
    }
    
}
