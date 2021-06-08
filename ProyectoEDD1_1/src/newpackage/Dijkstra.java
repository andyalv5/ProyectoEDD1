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
    
    public Nodo_productos devolverSigRecursive(MatrixGraph matrix,int v,String igual){
        String st ="";
        int anterior=ultimo[v];
        st+= matrix.getVerbyint(anterior).getName().toUpperCase();
        Vertex newver=matrix.vertices.BuscarVertex(st);
        Nodo_productos prod = newver.getListaver().getPrimer_producto();
        while(prod !=null){
            if(igual.equals(prod.getNombre())){
                return prod;
            }
        }
        if (s!=v){
            prod =devolverSigRecursive(matrix,anterior,igual);
        }
        return prod;
    }
    public void recursivesearch(MatrixGraph matrixre,String a,String alm,Inicio mywin,int newborrar,String quan){
        Dijkstra J=new Dijkstra(matrixre.getIndex(a), matrixre);
        J.caminosMinimos();
        String alm2=alm.toUpperCase();
        String sig = J.devolverSig(matrixre,matrixre.getIndex(alm2));
        Vertex mynewver= mywin.listaVersx.BuscarVertex(sig);
        Nodo_productos nd =J.devolverSigRecursive(matrixre, matrixre.getIndex(mynewver.getName()), quan);
        if (!"0".equals(nd.getCantidad())){
           if(nd.getCantidad()>=newborrar){
               nd.setCantidad(nd.getCantidad()-newborrar);
           }
           else{
               int newborrar1=newborrar-nd.getCantidad();
               recursivesearch(matrixre,a,alm2,mywin,newborrar1,quan);
           }
        }
    }
}
                    

