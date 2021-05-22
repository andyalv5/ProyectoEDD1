/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

//Los comentarios servirán para luego hacer los DocStrings

import javax.swing.JOptionPane;


/**
 *
 * @author andynet
 */
public class MatrixGraph {
    private int vertexNum;
    private static int maxVert =25;
    private Vertex [] vertexarray;
    private int [][] adjacent;
    private int [] weight;
    
    //genera una matrix con un tamaño puesto por nosotros
    public MatrixGraph(int num){
        this.adjacent = new int[num][num];
        this.vertexarray = new Vertex[num];
        for(int i=0; i<num;i++){
            for(int j=0;i<num;i++){
                adjacent[i][j] =0;
            }
        vertexNum =0;
        }
    }
    //genera una matrix con un tamaño determinado
    public MatrixGraph(){
        this(maxVert);
    }
    
    //Devuelve verdadero o falso dependiendo si encuentra o no el elemento
    public boolean returnIfVxFounded(String chain){
        Vertex newVertex = new Vertex(chain);
        boolean Founded = false;
        for(int i =0;i<vertexNum;i++){
            Founded = getVertexarray()[i].equals(newVertex);
            if (Founded){
                return true;
            }
        }
        return Founded;   
    }
    
    //Crea la matriz si no existe
    public void newVertex(String chain){
        try{
            boolean isFound = returnIfVxFounded(chain);
            if (!isFound){
                Vertex vx = new Vertex(chain);
                vx.assingVtx(vertexNum);
                vertexarray[vertexNum++]=vx;
            }
        }
        catch(Exception e){
        }      
    }
    
    public int vertexidx(String cha){
        boolean founded = returnIfVxFounded(cha);
        Vertex newVer = new Vertex(cha);
        int i=0;
        for(;(i<vertexNum)&&!founded;){
            founded = vertexarray[i].equals(newVer);
            if(!founded) i++;
        }
        return(i<vertexNum)? i : -1;
    }
    
    public void newArc(String firstChain, String secondChain,int firstWeight, int secondWeight){
        int firstVar= vertexidx(firstChain);
        int secondVar = vertexidx(secondChain);
        if(firstVar<0||secondVar<0){
            JOptionPane.showMessageDialog(null,"No existe el vértice");
        if(firstWeight > secondWeight){
            adjacent[firstVar][secondVar]=1;
        }
        adjacent[secondVar][firstVar]=1;
        }
    }

    /**
     * @return the vertexarray
     */
    public Vertex[] getVertexarray() {
        return vertexarray;
    }
    
}
