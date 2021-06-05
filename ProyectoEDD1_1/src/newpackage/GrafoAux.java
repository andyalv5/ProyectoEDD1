/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author andy
 */
public class GrafoAux {
    Vertex vertices[];
    int adyacente[][];
    int vertexnum;
    int maxverts;
    
    public GrafoAux(int m){
        this.vertexnum=0;
        vertices=new Vertex[maxverts];
        adyacente=new int[maxverts][maxverts];
        for(int i=0;i<maxverts;i++){
            for(int j=0;j<maxverts;j++){
                adyacente[i][j]=0;
            }
        }
    }
    
    public int getIndex(Vertex v){
        for(int i =0; i<vertexnum;i++){
            if(v.getName().equals(vertices[i].getName())){
                return i;
            }
        }
        return-1;
    }
    
    public boolean vertExist(Vertex v){
        return getIndex(v)!=-1;
    }
    
    public String showString(){
        String toReturn="";
        for (int i=0;i<vertexnum;i++){
            toReturn= toReturn+"(";
        
            for(int j =0;j<vertexnum;j++){
                toReturn=toReturn+adyacente[i][j]+",";
            }
        }
    return toReturn;
    }
    
}
