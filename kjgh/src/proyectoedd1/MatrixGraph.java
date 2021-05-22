/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd1;

//Los comentarios servirán para luego hacer los DocStrings

import javax.swing.JOptionPane;


/**
 *
 * @author andynet
 */
public class MatrixGraph {
    private int numNodo;
    private Vertex [] vertexarray;
    private int [][] adjacent;
    
    //genera una matrix con un tamaño puesto por nosotros
    public MatrixGraph(int NodoId){
        try{
            this.adjacent = new int[NodoId][NodoId];
            this.vertexarray = new Vertex[NodoId];
            for(int i=0; i<NodoId;i++){
                for(int j=0;i<NodoId;i++){
                    adjacent[i][j] =0;
                }
            numNodo =0;
            }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ha introducido un tipo de dato inválido","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void newVertex(String chain){
        if (returnIfVxFounded(chain) >= 0){
            boolean isFound = returnIfVxFounded(chain) >=0;
            if(!isFound){
                Vertex vx = new Vertex(chain);
                vx.assingVtx(numNodo);
                vertexarray[numNodo++]=vx;
            }
        }
    }

 //Devuelve verdadero o falso dependiendo si encuentra o no el elemento
    public int returnIfVxFounded(String chain){
        Vertex newVertex = new Vertex(chain);
        boolean Founded = false;
        int i =0;
        for(;i<numNodo;i++){
            if (!Founded){
                Founded = vertexarray[i].equals(newVertex);
                if (!Founded){
                    i++;
            }
                }
        }
        return (i<numNodo)? i:-1;
    }
    
    public void newArc(String firstChain, String secondChain){
        int firstVar= returnIfVxFounded(firstChain);
        int secondVar = returnIfVxFounded(secondChain);
        if(firstVar<0||secondVar<0){
            JOptionPane.showMessageDialog(null,"No existe el vértice");
        }
        else{
            adjacent[firstVar][secondVar]=1;
        }
    }
    
}
