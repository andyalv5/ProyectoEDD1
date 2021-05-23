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
    private int vertexNum;
    private Vertex Proximo_vertex;
    
    
    public Vertex(String x){
        name=x;
        vertexNum = -1;
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
        this.vertexNum =n;
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
     * @return the Proximo_vertex
     */
    public Vertex getProximo_vertex() {
        return Proximo_vertex;
    }

    /**
     * @param Proximo_vertex the Proximo_vertex to set
     */
    public void setProximo_vertex(Vertex Proximo_vertex) {
        this.Proximo_vertex = Proximo_vertex;
    }
    
}
