/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd1;

/**
 *
 * @author andynet
 */
public class Vertex {
    private String name;
    private int vertexNum;
    
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
    
    public boolean equals(Vertex i){
        return getName().equals(i.getName());
    }
    
    public void assingVtx(int n){
        this.vertexNum =n;
    }
    
    public String toString(){
        return getName()+ " ("+ getVertexNum()+")";
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
    
}
