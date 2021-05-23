/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< HEAD:ProyectoEDD1/src/CreacionDelGrafo/Nodo.java
package CreacionDelGrafo;
=======
package newpackage;
>>>>>>> 80856db29f1145e72719957941dee1a9e6631d53:ProyectoEDD1/src/newpackage/Vertex.java

/**
 *
 * @author andynet
 */
public class Nodo {
    private String name;
    private int vertexNum;
    
    public Nodo(String x){
        name=x;
        vertexNum = -1;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    public boolean equals(Nodo i){
        return getName().equals(i.getName());
    }
    
    public void assingVtx(int n){
        this.vertexNum =n;

    /**
     * @param name the name to set
     */
    }
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
