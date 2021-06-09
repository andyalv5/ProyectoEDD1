/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
    
import Frames.Inicio;
import javax.swing.JOptionPane;

/**
 *
 * @author andy
 */
public class Dijkstra
{
    public int costo[][];
    public int distance[];
    public int ultimo[];
    public boolean F[];
    public int P[][];
    public int n,s;
    
    public Dijkstra(int s, MatrixGraph matrix) {
        
        this.n = matrix.vertices.getSize();
        this.s=s;
        this.P = new int[n][n];
        this.costo=matrix.adjacent;
        this.ultimo = new int[n];
        this.distance=new int[n];
        this.F=new boolean[n];
        
        
    }
    public void caminosMinimos(){
        
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                
                if(costo[i][j]==0){
                    P[i][j]=999;
                }else{
                    P[i][j]=costo[i][j];
                }
                
            }
        }
       
        
        for(int i=0;i<n;i++){
            
            F[i]=false;
            distance[i]=P[s][i];
            ultimo[i]=s;
        }
        
        
        F[s]=true;
        distance[s]=0;
        for(int j=0;j<n;j++){
            int v=minimo();
            F[v] =true;
            
            for(int i=0;i<n;i++){
                if(!F[i]){
                    if((distance[v]+P[v][i])<distance[i]){
                        distance[i]=distance[v]+P[v][i];
                        ultimo[i]=v;
                    }
                }
            }
            
        }
        
        
        
    }
    
    public int minimo(){
        int mx= 999;
        int v=1;
        for(int j=0;j<n;j++){
            
            if(!F[j]&&(distance[j]<=mx)){
                mx=distance[j];
                
                v=j;
            }
        }
        return v;
        
    }
        
    
    public String Print(MatrixGraph matrix,int v){
        String st ="";
        int anterior=ultimo[v];
        if(v!=s){
            st+=Print(matrix, anterior);
            st+= " ---> "+ " Almacen "+matrix.getVerbyint(v).getName();
        }
        else{
            System.out.print("V" +s);
            st+= " Almacen "+matrix.getVerbyint(s).getName();
        }
        return st;
    }
    
    public String devolverSig(MatrixGraph matrix,int v){
        String st ="";
        int anterior=ultimo[v];
        st+= matrix.getVerbyint(anterior).getName().toUpperCase();
        return st;
    }
    
    public String Printletters(MatrixGraph matrix,int v){
        String st ="";
        int anterior=ultimo[v];
        if(v!=s){
            st+=Print(matrix, anterior);
            st+= matrix.getVerbyint(v).getName()+",";
        }
        else{
            System.out.print("V" +s);
            st+= matrix.getVerbyint(s).getName() +",";
        }
        return st;
    }
    public Nodo_productos devuelveProd(MatrixGraph matrixre,String nombre){
        Vertex primero =matrixre.getVertices().getpFirst();
        while(primero !=null){
            Nodo_productos primProd = primero.getListaver().getPrimer_producto();
            while(primProd!=null){
                if(primProd.getNombre().equals(nombre)){
                    
                    return primProd;
                }
                primProd = primProd.getProximo();
            }
            primero=primero.getSiguiente();
        }
        return null;
    }
}
                    

