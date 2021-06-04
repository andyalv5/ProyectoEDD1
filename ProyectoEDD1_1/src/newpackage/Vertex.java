/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author andynet
 */
public class Vertex {
    private String name;
    private Lista_productos listaver;
    private int vertexNum;
    private int realvertexNum;
    private Vertex siguiente;
    private boolean Visitado;
    

    public Vertex(String x){
        name=x;
        vertexNum = -1;
        this.Visitado = false;
        
    }

    public Vertex(String x,Lista_productos listaver){
        this.name=x;
        this.listaver= listaver;
        vertexNum = 3;
        this.Visitado = false;
        this.realvertexNum = -1;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    public boolean vertexEquals(Vertex i){
        return getName().equals(i.getName());
    }
    
    public void assingVtx(int n){
        this.setVertexNum(n);
        this.setRealvertexNum(n);
    }
    
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the vertexNum
     */
    public int getVertexNum() {
        return vertexNum;
    }

 
    /**
     * @param vertexNum the vertexNum to set
     */
    public void setVertexNum(int vertexNum) {
        this.vertexNum = vertexNum;
    }
    
      /**
     * @return the listaver
     */
    public Lista_productos getListaver() {
        return listaver;
    }

    /**
     * @param listaver the listaver to set
     */
    public void setListaver(Lista_productos listaver) {
        this.listaver = listaver;
    }

    /**
     * @return the siguiente
     */
    public Vertex getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Vertex siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the Visitado
     */
    public boolean isVisitado() {
        return Visitado;
    }

    /**
     * @param Visitado the Visitado to set
     */
    public void setVisitado(boolean Visitado) {
        this.Visitado = Visitado;
    }

    /**
     * @return the realvertexNum
     */
    public int getRealvertexNum() {
        return realvertexNum;
    }

    /**
     * @param realvertexNum the realvertexNum to set
     */
    public void setRealvertexNum(int realvertexNum) {
        this.realvertexNum = realvertexNum;
    }

}
