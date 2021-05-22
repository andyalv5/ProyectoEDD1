package firstproyect.interfaces;


public class Graph {
    
    private ListaSimple[] vertices;//atibuto que contiene los vertices
    private Nodo[][] arcos;//contiene los arcos(relaciones entre vertices)
    private int numVertices;
    
    public void InsertarNodo(){};
    public void InsertarArco(){};
    public void EliminarNodo(){};
    public void EliminarArco(){};
    public void MotrarGraph(){};
}
