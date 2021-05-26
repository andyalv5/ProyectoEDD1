package organizedchaos;

import javax.swing.JOptionPane;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;


public class Grafo {
    
    private ListaVertice vertices;//atributo que contiene los vertices
    private ListaArco arcos;//contiene los arcos(relaciones entre vertices)
    private int numVertices;
    private String[][] matrizAdyacencia;
    
    //Consrtuctor vacio
    public Grafo(){
        this.arcos = new ListaArco();
        this.vertices = new ListaVertice();
        this.numVertices = this.vertices.getSize();
        this.matrizAdyacencia = LlenarMatriz();
        this.LlenarAdyacencia();
        
    }
    
    //Constructor con listas
    public Grafo(ListaVertice vert, ListaArco arc)
    {
        this.arcos = arc;
        this.vertices = vert;
        this.numVertices = vert.getSize();
        this.matrizAdyacencia = this.LlenarMatriz();
        
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
        //NodoArco axArco = this.arcos.FirstElement();
        //NodoVertice axVerticeCol = this.vertices.FirstElement();
        //NodoVertice axVerticeFila = this.vertices.FirstElement();
        
        for (int i = 0; i < this.numVertices; i++) 
        {
            for (int j = 0; j < this.numVertices; j++) //para cambiar los vertices columnas
            {
                aux[i][j] = "0";                
                /*
                //evalua si el vertice es el de origen en un arco. si lo es coloca el peso en la ubicación sino coloca un 0
                if ((axVerticeCol.getElement().getNombre().equals(axArco.getElement().getOrigin()))&&(axVerticeFila.getElement().getNombre().equals(axArco.getElement().getDestino()))) 
                {
                    aux[i][j] = axArco.getElement().getPeso();
                    
                    //pasar al siguiente arco
                    axArco = axArco.getpNext();
                    axVerticeCol = axVerticeCol.getpNext();
                } else
                {
                    aux[i][j] = "0";
                    //pasar al siguiente arco
                    axArco = axArco.getpNext();
                    axVerticeCol = axVerticeCol.getpNext();
                }*/


            }
            //pasar al siguiente vertice fila
            //axVerticeFila = axVerticeFila.getpNext();
            
        }
        
        return aux;
       
    }
    
    public void LlenarAdyacencia()
    {
        if (!arcos.IsEmpty()) 
        {
            NodoArco aux = arcos.getpFirst();
            while(aux != null){
                
                String coorI = aux.getElement().getOrigin();
                String coorJ = aux.getElement().getDestino();
                int i = vertices.getIndex(coorI);
                int j = vertices.getIndex(coorJ);
                
                this.matrizAdyacencia[i][j] = aux.getElement().getPeso();
                
                aux = aux.getpNext();
            }
        } 
    }
    
    public void ImprimirMatriz()
    {
        
        for (int i = 0; i < this.numVertices; i++) {
            for (int j = 0; j < this.numVertices; j++) {//no se que coño te pasa 
                System.out.println(" | " + this.matrizAdyacencia[i][j] + " | ");  
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
        //this.ImprimirMatriz();        
        
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
