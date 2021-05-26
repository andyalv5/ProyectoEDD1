package organizedchaos;

import javax.swing.JOptionPane;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;


public class Grafo {
    
    private ListaVertice vertices;//atibuto que contiene los vertices
    private ListaArco arcos;//contiene los arcos(relaciones entre vertices)
    private int numVertices;
    private String[][] matrizAdyacencia;
    
    //Consrtuctor vacio
    public Grafo(){
        this.arcos = new ListaArco();
        this.vertices = new ListaVertice();
        this.numVertices = this.vertices.getSize();
 
    }
    
    //Constructor con listas
    public Grafo(ListaVertice vert, ListaArco arc)
    {
        this.arcos = arc;
        this.vertices = vert;
        this.numVertices = vert.getSize();
  
    }

    public String[][] getMatrizAdyacencia() {
        return matrizAdyacencia;
    }

    public void setMatrizAdyacencia(String[][] matrizAdyacencia) {
        this.matrizAdyacencia = matrizAdyacencia;
    }
    

    public ListaVertice getVertices() {
        return vertices;
    }

    public void setVertices(ListaVertice vertices) {
        this.vertices = vertices;
    }

    public ListaArco getArcos() {
        return arcos;
    }

    public void setArcos(ListaArco arcos) {
        this.arcos = arcos;
    }

    public int getNumVertices() {
        return numVertices;
    }

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }
    
    
    public String[][] LlenarMatriz()
    {
        String[][] aux = new String[this.numVertices][this.numVertices];
        
        for (int i = 0; i < this.numVertices; i++) 
        {
            for (int j = 0; j < this.numVertices; j++)
            {
                aux[i][j] = "0";
            }
  
        }
        
        return aux;
       
    }
    
    public void LlenarAdyacencia()
    {
        String[][] vv = this.getMatrizAdyacencia();
        if (!arcos.IsEmpty()) 
        {
            NodoArco aux = arcos.getpFirst();
            while(aux != null){
                
                String coorI = aux.getElement().getOrigin();
                String coorJ = aux.getElement().getDestino();
                int i = vertices.getIndex(coorI);
                int j = vertices.getIndex(coorJ);
                
                vv[i][j] = aux.getElement().getPeso();
                
                aux = aux.getpNext();
            }
            
        }
    }

    public void ImprimirMatriz()
    {
        
        for (int i = 0; i < this.numVertices; i++) {
            for (int j = 0; j < this.numVertices; j++) { 
                System.out.print(" | " + this.getMatrizAdyacencia()[i][j] + " | ");  
            }
            System.out.println();
            
        }
                
    }
    
    public void InsertarVertice(Lista data, String nombre)
    {
        if (!this.vertices.ExisteVertice(nombre)) 
        {
            Vertice pVertice = new Vertice(data, nombre);
                    
            vertices.InsertarEnd(pVertice);
        } else{
            JOptionPane.showMessageDialog(null, "EL VERTICE YA EXISTE!");
        }
                        
    }
    
    public void InsertarArco(String origin, String destiny, String peso)
    {
        if (!this.arcos.ExisteArco(peso)) 
        {
            Arco arcoGrafo = new Arco(origin, destiny, peso);
        
            arcos.InsertarEnd(arcoGrafo);
            
        } else{
            JOptionPane.showMessageDialog(null, "EL ARCO YA EXISTE!");            
        }
        
    }
    
    public void EliminarVertice(){}
    public void EliminarArco(){}
    
    public void MostrarInfoGrafo(){
        System.out.println("Almacenes: \n");
        this.vertices.Imprimir();
        System.out.println("Arcos: \n");
        this.arcos.Imprimir();
        System.out.println("Número de vertices: "+ this.numVertices+"\n");
        System.out.println("Matriz Adyacencia: \n");
        this.ImprimirMatriz();        
        
    }
    
    public Graph MotrarGraph()
    {
        System.setProperty("org.graphstream.ui", "swing");
        
        Graph graph = new SingleGraph("GRAFO");
        graph.setAttribute("ui.stylesheet", "graph { padding: 40px; } edge { arrow-shape: arrow; arrow-size: 20px, 4px; } node { size: 20px; fill-color: red, black; fill-mode: gradient-horizontal; text-alignment: at-right; text-padding: 3px, 2px; text-background-mode: rounded-box; text-background-color: #EB2; text-color: #222; } ");    
        
        graph.display();
        
        return graph;
        
    }
    
    public Graph IndividualEdge(Graph graph, Arco cualquiera){
        
        Edge aux = graph.addEdge(cualquiera.getOrigin()+"-->"+cualquiera.getDestino(), cualquiera.getOrigin(), cualquiera.getDestino(), true);
        aux.setAttribute("ui.label", cualquiera.getPeso());
        return graph;
    }
    public Graph IndividualNode(Graph graph, Vertice cualquiera){
       Node aux = graph.addNode(""+cualquiera.getNombre());
       aux.setAttribute("ui.label", cualquiera.getNombre());
       aux.setAttribute("ui.color", cualquiera.getNombre());
       return graph;
    }
    
    public Graph CrearNodes(Graph grafico){
        if (!this.vertices.IsEmpty()) 
        {
            NodoVertice aux = vertices.getpFirst();
            while(aux != null){
                
                grafico = IndividualNode(grafico, aux.getElement());
                
                aux = aux.getpNext();
            }
        } else{
            JOptionPane.showMessageDialog(null, "Error al crear los vertices del graficos!");
        }
             
        return grafico;        
    }

    public Graph CrearEdges(Graph grafico){
        
        if (!this.arcos.IsEmpty()) 
        {
            NodoArco aux = arcos.getpFirst();
            while(aux != null){
                
                grafico = IndividualEdge(grafico, aux.getElement());
                
                aux = aux.getpNext();
            }
            
        } else{
            JOptionPane.showMessageDialog(null, "Error al hacer la grafica!");            
        }
        
        return grafico;
    }
}
