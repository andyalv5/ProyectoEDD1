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
    private ListaVertex vertices;
    private ListaSimple peso;
    private int numNodo;
    private Vertex [] vertexarray;
    private int [][] adjacent;
    
    //genera una matrix con un tamaño puesto por nosotros
    public MatrixGraph(ListaVertex vertices,ListaSimple peso,int NodoId){
        try{
            this.vertices=vertices;
            this.peso=peso;
            this.adjacent = new int[NodoId][NodoId];
            this.vertexarray = new Vertex[NodoId];
            for(int i=0; i<NodoId;i++){
                for(int j=0;i<NodoId;i++){
                    adjacent[i][j] =0;
                }
            numNodo =NodoId;
            }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ha introducido un tipo de dato inválido","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void newVertex(String chain, Lista_productos lis,ListaVertex lisV){
        if (returnIfVxFounded(chain) >= 0){
            boolean isFound = returnIfVxFounded(chain) >=0;
            if(!isFound){
                Vertex vx = new Vertex(chain,lis);
                vx.assingVtx(getNumNodo());
                lisV.addAtEnd(vx);
                vertexarray[numNodo++]=vx;
            }
        }
    }
    public void newVertexi(String chain, Lista_productos lis,ListaVertex lisV){
        if (returnIfVxFounded(chain) < 0){
            boolean isFound = returnIfVxFounded(chain) >=0;
            if(!isFound){
                Vertex vx = new Vertex(chain,lis);
                vx.assingVtx(getNumNodo());
                lisV.addAtEnd(vx);
                vertexarray[numNodo++]=vx;
            }
        }
    }
            
 //Devuelve verdadero o falso dependiendo si encuentra o no el elemento
    public int returnIfVxFounded(String chain){
        Vertex newVertex = new Vertex(chain);
        boolean Founded = false;
        int i =0;
        for(;i<getNumNodo();i++){
            if (!Founded){
                Founded = getVertexarray()[i].equals(newVertex);
                if (!Founded){
                    i++;
                }
            }
        }
        return (i<getNumNodo())? i:-1;
    }
    
    public void newArc(String firstChain, String secondChain,ListaSimple weightList){
        int firstVar= returnIfVxFounded(firstChain.toUpperCase());
        int secondVar = returnIfVxFounded(secondChain.toUpperCase());
        if(firstVar<0||secondVar<0){
            JOptionPane.showMessageDialog(null,"No existe el vértice");
            
        }
        else{
            int var = weightList.Buscar(firstChain,secondChain);
            adjacent[firstVar][secondVar] = var;
            }
        }
    
    public void newArcw(String firstChain, String secondChain,ListaSimple weightList,int weight){
        int firstVar= returnIfVxFounded(firstChain.toUpperCase());
        int secondVar = returnIfVxFounded(secondChain.toUpperCase());
        int var = weightList.Buscar(firstChain,secondChain);
        if(firstVar<0||secondVar<0){
            
            JOptionPane.showMessageDialog(null,"No existe el vértice");
            Nodoweight nodW=new Nodoweight(firstChain.toUpperCase(),secondChain.toUpperCase(),weight);
            weightList.addAtEnd(nodW);
        }
        else{
            adjacent[firstVar][secondVar] = var;
            }
        
    }
    public Graph MotrarGraph()
    {
        System.setProperty("org.graphstream.ui", "swing");
        
        Graph graph = new SingleGraph("GRAFO");
        graph.setAttribute("ui.stylesheet", "graph { padding: 40px; } edge { arrow-shape: arrow; arrow-size: 20px, 8px; } node { size: 40px; fill-color: yellow, black; fill-mode: gradient-horizontal; text-alignment: at-right; text-padding: 10px, 15px; text-background-mode: rounded-box; text-background-color: #EB2; text-color: #222; } ");    
        
        graph.display();
        
        return graph;
        
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
