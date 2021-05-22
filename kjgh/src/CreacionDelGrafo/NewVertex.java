/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreacionDelGrafo;

import javax.swing.JOptionPane;

/**
 *
 * @author andynet
 */
public class NewVertex {
   
//Devuelve verdadero o falso dependiendo si encuentra o no el elemento
    public boolean returnIfVxFounded(String Schain){
        NodoSimple newNodo = new NodoSimple(Schain);
        boolean Founded = false;
        for(int i =0;i<totalNodoNum;i++){
            Founded = getVertexarray()[i].equals(newNodo.nodoNum);
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
                vx.assingVtx(totalNodoNum);
                vertexarray[totalNodoNum++]=vx;
            }
        }
        catch(Exception e){
        }      
    }
    
    public int vertexidx(String cha){
        boolean founded = returnIfVxFounded(cha);
        Vertex newVer = new Vertex(cha);
        int i=0;
        for(;(i<totalNodoNum)&&!founded;){
            founded = vertexarray[i].equals(newVer);
            if(!founded) i++;
        }
        return(i<totalNodoNum)? i : -1;
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
