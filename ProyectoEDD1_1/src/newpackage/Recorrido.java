/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author andy
 */
public class Recorrido {
    private int[][]pesos;
    private int[][]traza;
    private int[][]d;
    private String[][]almacenes;
    private int n;
    private MatrixGraph matrix;
    public Recorrido() {
         //To change body of generated methods, choose Tools | Templates.
    }
    /*
    public String ReporteAlmacenBFS(MatrixGraph matrix, ListaVertex lisver,String origen)//ANCHURA usar cola
    {
        Cola cola = new Cola();
        String reporte = "Reporte de almacenes por Ancho:\n";
        //INICIA DESDE EL ALMACEN DE MENOR ID
        Vertex pTemp = matrix.getVertices().getpFirst();
        ColaProceso vertice;
        pTemp.setVisitado(true);
        cola.Encolar(pTemp);
        int counter =0;
    
        while(counter !=20){
            vertice = cola.getCimaCola();
            cola.Eliminar();
            reporte +="Almacen: "+vertice.getElement().getName()+"/n";
            reporte += vertice.getElement().getListaver().returnInlistProducts();
            String segundo=matrix.getPeso().ReturnFE(vertice.getElement().getName());
            String primero=matrix.getPeso().ReturnSE(vertice.getElement().getName());
            String joint= primero +segundo;
            String[] jointvar = joint.split(",");
            
            counter ++;
            }
        
        }  
    }
*/
    public String ReporteAlmacenDFS(MatrixGraph matrix, ListaVertex lisver)//PROFUNDIDAD usar pila
    {
        //INICIA DESDE EL ALMACEN DE MENOR ID
        Pila pila = new Pila();
        String reporte = "<html><b>Tipo de Recorrido DFS (Depth-first search)-Busqueda en profundidad:</b><html>"+"\n";
        //INICIA DESDE EL ALMACEN DE MENOR ID
        Vertex pTemp = matrix.getVertices().getpFirst();
        Vertex vertice;
        pTemp.setVisitado(true);
        pila.Apilar(pTemp);
        while(!pila.IsEmpty())
        {
            vertice =pila.Desapilar();
            reporte +="Almacen: "+vertice.getName()+"\n";
            reporte += vertice.getListaver().returnInlistProducts();
            reporte += "\n";
            String segundo=matrix.getPeso().ReturnFE(vertice.getName());
            String primero=matrix.getPeso().ReturnSE(vertice.getName());
            String joint= primero +segundo;
            String[] jointvar = joint.split(",");
            for(int i =0; i<jointvar.length;i++){
                String st =jointvar[i];
                Vertex temporal=matrix.getVertices().BuscarVertex(st);
                if(!temporal.isVisitado()){
                    temporal.setVisitado(true);
                    pila.Apilar(temporal);
                }
            }
        }
        return reporte;
    }

    
    public void SetTrueDFS(MatrixGraph matrix, ListaVertex lisver)//PROFUNDIDAD usar pila
    {
        //INICIA DESDE EL ALMACEN DE MENOR ID
        Pila pila = new Pila();
        Vertex pTemp = matrix.getVertices().getpFirst();
        Vertex vertice;
        pTemp.setVisitado(true);
        pila.Apilar(pTemp);
        while(!pila.IsEmpty())
        {
            vertice =pila.Desapilar();
            String segundo=matrix.getPeso().ReturnFE(vertice.getName());
            String primero=matrix.getPeso().ReturnSE(vertice.getName());
            String joint= primero +segundo;
            String[] jointvar = joint.split(",");
            for(int i =0; i<jointvar.length;i++){
                String st =jointvar[i];
                Vertex temporal=matrix.getVertices().BuscarVertex(st);
                if(!temporal.isVisitado()){
                    temporal.setVisitado(true);
                    pila.Apilar(temporal);
                }
            }
        }
    }
        
    public String ReporteAlmacenBFS(MatrixGraph matrix, ListaVertex lisver)//ANCHURA usar cola
    {
        Cola cola = new Cola();
        String reporte = "<html><b>Tipo de Recorrido BFS (Breadth-first search)-Busqueda en Anchura:</b><html>"+"\n";
        JLabel label=new JLabel(reporte);
        label.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        //INICIA DESDE EL ALMACEN DE MENOR ID
        Vertex pTemp = matrix.getVertices().getpFirst();
        Vertex vertice;
        pTemp.setVisitado(true);
        cola.insertar(pTemp);
    
        while(!cola.colaVacia()){
            vertice = cola.desencolar().getElemento();
            
            reporte +="Almacen: "+vertice.getName()+"\n";
            reporte += vertice.getListaver().returnInlistProducts();
            reporte += "\n";
            String segundo=matrix.getPeso().ReturnFE(vertice.getName());
            String primero=matrix.getPeso().ReturnSE(vertice.getName());
            String joint= primero +segundo;
            String[] jointvar = joint.split(",");
            for(int i =0; i<jointvar.length;i++){
                String st =jointvar[i];
                Vertex temporal=matrix.getVertices().BuscarVertex(st);
                if(!temporal.isVisitado()){
                    temporal.setVisitado(true);
                    cola.insertar(temporal);
                }
            }
        }
        
        
        return reporte; 
    }
    
    public void SetTrueBFS(MatrixGraph matrix, ListaVertex lisver)//ANCHURA usar cola
    {
        Cola cola = new Cola();
        
        Vertex pTemp = matrix.getVertices().getpFirst();
        Vertex vertice;
        pTemp.setVisitado(true);
        cola.insertar(pTemp);
    
        while(!cola.colaVacia()){
            vertice = cola.desencolar().getElemento();
            
            
            String segundo=matrix.getPeso().ReturnFE(vertice.getName());
            String primero=matrix.getPeso().ReturnSE(vertice.getName());
            String joint= primero +segundo;
            String[] jointvar = joint.split(",");
            for(int i =0; i<jointvar.length;i++){
                String st =jointvar[i];
                Vertex temporal=matrix.getVertices().BuscarVertex(st);
                if(temporal.isVisitado()){
                    temporal.setVisitado(false);
                    cola.insertar(temporal);
                }
            }
        }
    }
    
  
    public Recorrido(MatrixGraph matrix,ListaVertex lisver){
        n= lisver.getSize();
        int[][]P =new int[n][n];
        String[][]F=new String[n][n];
        for (int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                P[i][j]= matrix.adyacentebynum(i, j);
                F[i][j]=matrix.getVerbyint(i).getName();
            }
        }
        pesos=P;
        almacenes =F;
        d=new int[n][n];
        traza=new int[n][n];
        this.matrix=matrix;
    }
    
   
    public void caminosminFloyd(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                d[i][j]=pesos[i][j];
                traza[i][j]=-1;
            }
        }
        
        for(int i=0;i<n;i++){
            d[i][i]=0;
            almacenes[i][i]="-";
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                
                for(int j=0;j<n;j++){
                    int suma=d[i][k]+d[k][j];
                    if(suma<d[i][j]){
                        d[i][j]=d[i][k]+d[k][j];
                        almacenes[i][j]=matrix.getVerbyint(k).getName();
                        traza[i][j]=k;
                        
                    }
                    
                }
            }
        }
        
    }
    
    
     public String RetornarMatriz()
    {
        String aux = "";
        for (int i = 0; i < this.n; i++) {
            String line = "";
            for (int j = 0; j < this.n; j++) { 
                line += " | " + this.almacenes[i][j] + " | ";  
            }
            aux += line+"\n";
            
        }
        
        return aux;
                
    }
    
    
    


    /**
     * @return the pesos
     */
    public int[][] getPesos() {
        return pesos;
    }

    /**
     * @param pesos the pesos to set
     */
    public void setPesos(int[][] pesos) {
        this.pesos = pesos;
    }

    /**
     * @return the traza
     */
    public int[][] getTraza() {
        return traza;
    }

    /**
     * @param traza the traza to set
     */
    public void setTraza(int[][] traza) {
        this.traza = traza;
    }

    /**
     * @return the almacenes
     */
    public String[][] getAlmacenes() {
        return almacenes;
    }

    /**
     * @param almacenes the almacenes to set
     */
    public void setAlmacenes(String[][] almacenes) {
        this.almacenes = almacenes;
    }
}
