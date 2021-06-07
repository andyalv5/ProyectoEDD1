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
 *
 * @author andynet
 */
public class MatrixGraph {

    /**
     * @return the vertices
     */
    public ListaVertex getVertices() {
        return vertices;
        
    }

    /**
     * @return the peso
     */
    public ListaSimple getPeso() {
        return peso;
    }

    /**
     * @return the numNodo
     */
    public int getNumNodo() {
        return numNodo;
    }

    /**
     * @return the vertexarray
     */
    public Vertex[] getVertexarray() {
        return vertexarray;
    }

    /**
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
    
    //genera una matrix con un tamaño puesto por nosotros
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
    
     public void pntAllelmnt(){
        
        for(int i=0; i<realnumNodo;i++){
            for(int j=0; j<realnumNodo;j++){
                JOptionPane.showMessageDialog(null,this.adjacent[i][j]);
            }
        }
    }
    
    public void newVertex(Vertex vertice){
        boolean isfound =returnIfVxFounded(vertice.getName());
        if(!isfound){
            vertexarray[realnumNodo++]=vertice;
        }
                
    }
 //Devuelve verdadero o falso dependiendo si encuentra o no el elemento
    public boolean returnIfVxFounded(String vertice){
       for(int i=0;i<realnumNodo;i++){
            if (vertice.equals(vertexarray[i].getName())){
                return true;
            }
        }
        return false;
    }
           
    public int getIndex(String v){
        for(int i =0; i<realnumNodo;i++){
           if(v.equals(vertexarray[i].getName())){
               return i;
           }

        }
        return-1;
    }
    
    public int getVertex(Vertex v){
        for(int i =0; i<realnumNodo;i++){
           if(v.getName().equals(vertexarray[i].getName())){
               return i;
           }

        }
        return-1;
    }
    
    public void newArc(String origen, String destino, int weight){
        boolean founded =returnIfVxFounded(origen);
        boolean founded2 = returnIfVxFounded(destino);
        if((founded==true)&&(founded2==true)){
            int i=getIndex(origen);
            int j=getIndex(destino);
            adjacent[i][j]=weight;
        }
    }
    
    
    public int adyacentebynum(int i,int k){
        return adjacent[k][i];
    }

    /**
     * @return the realnumNodo
     */
  
    public String RetornarMatriz()
    {
        String aux = "";
        for (int i = 0; i < this.realnumNodo; i++) {
            String line = "";
            for (int j = 0; j < this.realnumNodo; j++) { 
                line += " | " +this.getAdjacent()[j][i] + " | ";  
            }
            aux += line+"\n";
            
        }
        
        return aux;
                
    }
    
    public Graph MotrarGraph()
    {
        System.setProperty("org.graphstream.ui", "swing");
        
        Graph graph = new SingleGraph("GRAFO");
        graph.setAttribute("ui.stylesheet", "graph { padding: 40px; } edge { arrow-shape: arrow; arrow-size: 20px, 8px; } node { size: 40px; fill-color: yellow, black; fill-mode: gradient-horizontal; text-alignment: at-right; text-padding: 10px, 15px; text-background-mode: rounded-box; text-background-color: #EB2; text-color: #222; } ");    
        Viewer viewer = graph.display();
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
        
        return graph;
        
    }
    
    public Vertex getVerbyint(int index){
        Vertex s=this.vertexarray[index];
        return s;
    }
    
    public Graph IndividualEdge(Graph graph, int peso,String ver1,String ver2){
        
        Edge aux = graph.addEdge(ver1+"-->"+ver2, ver1,ver2, true);
        aux.setAttribute("ui.label", peso);
        return graph;
        
    }
    
    public Graph IndividualNode(Graph graph, Vertex cualquiera){
       Node aux = graph.addNode(""+cualquiera.getName());
       aux.setAttribute("ui.label", cualquiera.getName());
       aux.setAttribute("ui.color", cualquiera.getName());
       return graph;
    }
    
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
