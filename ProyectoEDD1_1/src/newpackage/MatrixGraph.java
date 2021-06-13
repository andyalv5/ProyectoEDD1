/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

//Los comentarios servirán para luego hacer los DocStrings

import javax.swing.JOptionPane;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;


/**
 * Clase MatrixGraph
 * En esta clase esta todo lo relacionado con la matriz
 * @author Andy, Ulises, Hector
 */
public class MatrixGraph {

    /**
     * Funcion getVertices
     * Retorna el atributo vertices
     * @author Ulises,Andy,Hector
     * @return the vertices
     */
    
    public ListaVertex getVertices() {
        return vertices;
        
    }

    /**
     * Funcion getPeso
     * Retorna el atributo peso
     * @author Ulises,Andy,Hector
     * @return the peso
     */
    
    public ListaSimple getPeso() {
        return peso;
    }

    /**
     * Funcion getNumNodo
     * Retorna el atributo numNodo
     * @author Ulises,Andy,Hector
     * @return the numNodo
     */
    
    public int getNumNodo() {
        return numNodo;
    }

    /**
     * Funcion getVertexarray
     * Retorna el atributo vertexarray
     * @author Ulises,Andy,Hector
     * @return the vertexarray
     */
    
    public Vertex[] getVertexarray() {
        return vertexarray;
    }

    /**
     * Funcion getAdjacent
     * Retorna el atributo adjacent
     * @author Ulises,Andy,Hector
     * @return the adjacent
     */
    
    public int[][] getAdjacent() {
        return adjacent;
    }
    public ListaVertex vertices;
    public ListaSimple peso;
    public int numNodo;
    public int realnumNodo;
    public Vertex [] vertexarray;
    public int [][] adjacent;
    
  
    
    /**
     * Procedimiento MatrixGraph
     * Crea una matriz de tamaño dado por nosotros
     * @author Ulises,Andy,Hector
     * @param vertices
     * @param peso
     * @param NodoId
     * @param RealNum 
     */
    
    public MatrixGraph(ListaVertex vertices,ListaSimple peso,int NodoId,int RealNum){
        try{
            
            this.vertices=vertices;
            this.peso=peso;
            this.adjacent = new int[RealNum][RealNum];
            this.vertexarray = new Vertex[RealNum];
            for(int i=0; i<RealNum;i++){
                for(int j=0;j<RealNum;j++){
                    adjacent[i][j] =0;
                }
            numNodo =0;
            realnumNodo=0;
            }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ha introducido un tipo de dato inválido","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
     /**
     * Procedimiento pntAllelmnt
     * Imprime los elementos de la matriz
     * @author Ulises,Andy,Hector
     */
    
     public void pntAllelmnt(){
        
        for(int i=0; i<realnumNodo;i++){
            for(int j=0; j<realnumNodo;j++){
                JOptionPane.showMessageDialog(null,this.adjacent[i][j]);
            }
        }
    }
    
     /**
      * Procedimiento newVertex
      * Crea el vertice de la matriz
      * @author Ulises,Andy,Hector
      * @param vertice
      */
     
    public void newVertex(Vertex vertice){
        boolean isfound =returnIfVxFounded(vertice.getName());
        if(!isfound){
            vertexarray[realnumNodo++]=vertice;
        }
                
    }
 /**
     * Funcion returnIfVxFounded
     * Devuelve verdadero si se encuentra el vertice en la matriz, falso
     si no se consigue
     * @author Ulises,Hector,Andy
     * @param vertice
     * @return boolean
     */
    
    public boolean returnIfVxFounded(String vertice){
       for(int i=0;i<realnumNodo;i++){
            if (vertice.equals(vertexarray[i].getName())){
                return true;
            }
        }
        return false;
    }
           
    /**
     * Funcion getIndex
     * Se obtiene el indice de un elemento en la matriz
     * @author Andy,Hector,Ulises
     * @param v
     * @return int
     */
    
    public int getIndex(String v){
        for(int i =0; i<realnumNodo;i++){
           if(v.equals(vertexarray[i].getName())){
               return i;
           }

        }
        return-1;
    }
    
    /**
     * Funcion getVertex
     * Se obtiene el indice pero sin el numero del vertice
     * @param v
     * @return int
     */
    
    public int getVertex(Vertex v){
        for(int i =0; i<realnumNodo;i++){
           if(v.getName().equals(vertexarray[i].getName())){
               return i;
           }

        }
        return-1;
    }
    
     /**
     * Procedimiento newArc
     * Se crea un arco
     * @author Ulises,Andy,Hector
     * @param origen
     * @param destino
     * @param weight 
     */
    
    public void newArc(String origen, String destino, int weight){
        boolean founded =returnIfVxFounded(origen);
        boolean founded2 = returnIfVxFounded(destino);
        if((founded==true)&&(founded2==true)){
            int i=getIndex(origen);
            int j=getIndex(destino);
            adjacent[i][j]=weight;
        }
    }
    
    /**
     * Funcion adyacentebynum
     * Se devuelve el arco buscado
     * @author Ulises,Andy,Hector
     * @param i
     * @param k
     * @return int
     */
    
    public int adyacentebynum(int i,int k){
        return adjacent[i][k];
    }

    /**
     * Funcion RetornarMatriz
     * Se imprime la matriz
     * @author Andy,Hector,Ulises
     * @return 
     */
  
    public String RetornarMatriz()
    {
        String aux = "";
        for (int i = 0; i < this.realnumNodo; i++) {
            String line = "";
            for (int j = 0; j < this.realnumNodo; j++) { 
                line += " | " +this.getAdjacent()[i][j] + " | ";  
            }
            aux += line+"\n";
            
        }
        
        return aux;
                
    }
    
    /**
     * Funcion MotrarGraph
     * Crea graficamente el grafo
     * @author Ulises,Andy,Hector
     * @return Graph
     */
    
    public Graph MotrarGraph()
    {
        System.setProperty("org.graphstream.ui", "swing");
        
        Graph graph = new SingleGraph("GRAFO");
        graph.setAttribute("ui.stylesheet", "graph { padding: 40px; } edge { arrow-shape: arrow; arrow-size: 20px, 8px; } node { size: 40px; fill-color: yellow, black; fill-mode: gradient-horizontal; text-alignment: at-right; text-padding: 10px, 15px; text-background-mode: rounded-box; text-background-color: #EB2; text-color: #222; } ");    
        Viewer viewer = graph.display();
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
        
        return graph;
        
    }
    
    /**
     * Funcion getVerbyint
     * Se obtiene el vertex buscado al pasar el indice
     * @author Ulises,Hector,Andy
     * @param index
     * @return Vertex
     */
    
    public Vertex getVerbyint(int index){
        Vertex s=this.vertexarray[index];
        return s;
    }
    
    /**
     * Funcion IndividualEdge
     * Se utiliza para poder mostrar el grafo
     * @author Ulises,Andy,Hector
     * @param graph
     * @param peso
     * @param ver1
     * @param ver2
     * @return Graph
     */
    
    public Graph IndividualEdge(Graph graph, int peso,String ver1,String ver2){
        
        Edge aux = graph.addEdge(ver1+"-->"+ver2, ver1,ver2, true);
        aux.setAttribute("ui.label", peso);
        return graph;
        
    }
    
    /**
     * Funcion IndividualNode
     * Se utiliza para poder mostrar el grafo
     * @author Ulises,Andy,Hector
     * @param graph
     * @param cualquiera
     * @return 
     */

    
    public Graph IndividualNode(Graph graph, Vertex cualquiera){
       Node aux = graph.addNode(""+cualquiera.getName());
       aux.setAttribute("ui.label", cualquiera.getName());
       aux.setAttribute("ui.color", cualquiera.getName());
       return graph;
    }
    
    /**
     * Funcion CrearNodes
     * Se crea el nodo
     * @author Ulises,Andy,Hector
     * @param grafico
     * @return Graph
     */
    
    public Graph CrearNodes(Graph grafico){
        if (!this.vertices.IsEmpty()) 
        {
           Vertex aux = getVertices().getpFirst();
            while(aux != null){
                
                grafico = IndividualNode(grafico, aux);
                
                aux = aux.getSiguiente();
            }
        } else{
            JOptionPane.showMessageDialog(null, "Error al crear los vertices del graficos!");
        }
             
        return grafico;        
    }

    /**
     * Funcion CrearEdges
     * Se crean los arcos
     * @author Ulises,Andy,Hector
     * @param grafico
     * @return Graph
     */
    
    public Graph CrearEdges(Graph grafico){
        
        if (!this.peso.IsEmpty()) 
        {
            Nodoweight pesoInicial=getPeso().getpFirst();
            
            while(pesoInicial!=null){
                IndividualEdge(grafico,pesoInicial.getweight(),pesoInicial.getVertex1(),pesoInicial.getVertex2());
                pesoInicial = pesoInicial.getpNext();
            }
            
        } else{
            JOptionPane.showMessageDialog(null, "Error al hacer la grafica!");            
        }
        
        return grafico;
        
       
    }
    
}
