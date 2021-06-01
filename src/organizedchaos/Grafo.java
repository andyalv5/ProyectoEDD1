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
    public Grafo()
    {
        
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
    
    
    public void LlenarMatriz()
    {
        String[][] aux = new String[this.numVertices][this.numVertices];
        
        for (int i = 0; i < this.numVertices; i++) 
        {
            for (int j = 0; j < this.numVertices; j++)
            {
                aux[i][j] = "0";
            }
  
        }
        
        this.setMatrizAdyacencia(aux);
       
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
                
                vv[i-1][j-1] = aux.getElement().getPeso();
                
                aux = aux.getpNext();
            }
            this.setMatrizAdyacencia(vv);            
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
    public String RetornarMatriz()
    {
        String aux = "";
        for (int i = 0; i < this.numVertices; i++) {
            String line = "";
            for (int j = 0; j < this.numVertices; j++) { 
                line += " | " + this.getMatrizAdyacencia()[i][j] + " | ";  
            }
            aux += line+"\n";
            
        }
        
        return aux;
                
    }
    
    public String ReporteAlmacenBFS()//ANCHURA usar cola
    {
        Cola cola = new Cola();
        String reporte = "Reporte de almacenes:\n";
        //INICIA DESDE EL ALMACEN DE MENOR ID
        NodoVertice pTemp = vertices.getpFirst();
        NodoVertice vertice;
        
        while(pTemp != null)
        {
            // 1 marcar el vertice de partida
            pTemp.getElement().setVisitado(true);
            // 2 meter en la cola el vertice de partida
            cola.Encolar(pTemp.getElement());
            // 3 repetir 4 y 5 hasta que cola quede vacia
            while(cola.IsEmpty())
            {
                // 4 quitar el nodo cima de la cola, w,
                vertice = cola.Desencolar();
                //visitar w
                reporte += vertice.getElement().ObtenerInfo();
                // 5 Meter en la cola todos los vertices adyacentes a w, que no estén marcados
                //   marcar esos vertices
                ListaVertice adyacentes = this.VerticesAdyacentes(pTemp);
                NodoVertice node = adyacentes.getpFirst();
                while(node != null)
                {
                    cola.Encolar(node.getElement());
                    node.getElement().setVisitado(true);
                    node = node.getpNext();
                    
                }
                
                
            }
           
            pTemp = pTemp.getpNext();
        }
        
        // fin
        return reporte;       
        
        
    }
    public void ReporteProductosBFS(String nombreProducto)
    {
        //si se requiere saber la disponibilidad de un determinado producto, 
        //este debe ser ingresado al sistema y generar el reporte de la disponibilidad 
        //del mismo en cada uno de los almacenes
        
    }
    
    public String ReporteAlmacenDFS()//PROFUNDIDAD usar pila
    {
        //INICIA DESDE EL ALMACEN DE MENOR ID
        Pila pila = new Pila();
        String reporte = "Reporte de almacenes:\n";
        //INICIA DESDE EL ALMACEN DE MENOR ID
        NodoVertice pTemp = vertices.getpFirst();
        Vertice vertice;
        
        while(pTemp != null)
        {
            // 1 marcar el vertice de partida
            pTemp.getElement().setVisitado(true);
            // 2 meter en la pila el vertice de partida
            pila.Apilar(pTemp.getElement());
            // 3 repetir 4 y 5 hasta que pila quede vacia
            while(pila.IsEmpty())
            {
                // 4 quitar el nodo cima de la pila, w,
                vertice = pila.Desapilar();
                
                // 5 Meter en la pila todos los vertices adyacentes a w, que no estén marcados
                //   marcar esos vertices
                ListaVertice adyacentes = this.VerticesAdyacentes(pTemp);
                NodoVertice node = adyacentes.getpFirst();
                while(node != null)
                {
                    pila.Apilar(node.getElement());
                    node.getElement().setVisitado(true);
                    node = node.getpNext();
                    
                }
                //visitar w
                reporte += vertice.ObtenerInfo();
    
            }
           
            pTemp = pTemp.getpNext();
        }
        
        // fin
        return reporte;
        
    }
    
    public void ReporteProductosDFS(String nombreProducto)
    {
        //si se requiere saber la disponibilidad de un determinado producto, 
        //este debe ser ingresado al sistema y generar el reporte de la disponibilidad 
        //del mismo en cada uno de los almacenes
        
    }
    
    public ListaVertice VerticesAdyacentes(NodoVertice nodo)//retorna una lista de vertices adyacentes al parametro
    {
        ListaVertice adyacentesNodo = new ListaVertice();
        
        NodoArco arco = arcos.getpFirst();
        
        while(arco != null)
        {
            if (arco.getElement().getOrigin().equals(nodo.getElement().getNombre())) 
            {
                adyacentesNodo.InsertarEnd(vertices.getNodoNombre(arco.getElement().getDestino()));
            }
            
        }
        
        
        return adyacentesNodo;        
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
    
    public String InfoGrafo(){
        return "Almacenes: \n"+vertices.printList()+ "Arcos: \n"+arcos.printList()+"Número de vertices: "+this.numVertices+"\n"+this.RetornarMatriz();
        
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
