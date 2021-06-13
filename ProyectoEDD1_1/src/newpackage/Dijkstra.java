/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
    

/**
 * Clase Dijsktra
 * Esta es la clase en la cual estan los procedimientos y funciones para determinar
 el camino mas corto
 * @author Andy, Ulises, Hector
 * @version 12/6/21
 */
public class Dijkstra
{
    public int costo[][];
    public int distance[];
    public int ultimo[];
    public boolean F[];
    public int P[][];
    public int n,s;
    
        /**
     * Constructor Dijkstra
     * Constructor con el cual se inicializaria las instancias de la clase
     * @author Ulises,Andy,Hector
     * @param s
     * @param matrix 
     */
    
    public Dijkstra(int s, MatrixGraph matrix) {
        
        this.n = matrix.vertices.getSize();
        this.s=s;
        this.P = new int[n][n];
        this.costo=matrix.adjacent;
        this.ultimo = new int[n];
        this.distance=new int[n];
        this.F=new boolean[n];
        
        
    }
    
     /**
     * Procedimiento caminosMinimos
     * Crea la matriz de djikstra y saca los caminos minimos
     * @author Ulises,Andy,Hector
     */
    
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
    
     /**
     * Funcion minimo
     * Busca el minimo como comparacion
     * @author Ulises,Andy,Hector
     * @return int el minimo
     */
    
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
        
     /**
     * Funcion Print
     * Imprime la matriz
     * @author Andy,Ulises,Hector
     * @param matrix
     * @param v
     * @return Stirng la matriz
     */
    
    
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
    
      /**
     * Funcion devolverSig
     * Retorna el siguiente almacen que este en el camino minimo
     * @author Ulises,Andy,Hector
     * @param matrix
     * @param v
     * @return String el siguinete almacen en el camino mas corto
     */
    
    
    public String devolverSig(MatrixGraph matrix,int v){
        String st ="";
        int anterior=ultimo[v];
        st+= matrix.getVerbyint(anterior).getName().toUpperCase();
        return st;
    }
    
      /**
     * Funcion Printletters
     * Retorna las letras del camino minimo de los almacenes 
     * @author Ulises,Hector,Andy
     * @param matrix
     * @param v
     * @return String las letras
     */
    
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
    
    /**
     * Funcion devuelveProd
     * Devuelve el producto si es conseguido
     * @author Andy,Hector,Ulises
     * @param matrixre
     * @param nombre
     * @return Nodo_productos producto
     */
    
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
                    

