package organizedchaos;

public class Nodo 
{
    private ListaSimple data; //atributo para guardar lo que contiene el almacén
    private int stock; //atributo para saber cuántos productos contiene
    private String nombre; //nombre del vertice
    private int indiceV; //indice del vertice
    
    public Nodo(ListaSimple info, String nom)
    {
        this.data = info;
        this.nombre = nom;
        this.indiceV = -1;
    }
    
    //GETTERS Y SETTERS
    public ListaSimple getData() 
    {
        return data;
    }

    public void setData(ListaSimple data) 
    {
        this.data = data;
    }

    public int getStock() 
    {
        return stock;
    }

    public void setStock(int stock) 
    {
        this.stock = stock;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public int getIndiceV() 
    {
        return indiceV;
    }

    public void setIndiceV(int indiceV) 
    {
        this.indiceV = indiceV;
    }
    
    public void CalcularStockAlmacen()
    {
        //depende de la manera en la que se trabaje el txt    
        
    }
    
    //retorna true si dos vertices son iguales
    public boolean Equals(Nodo n)
    {
        return this.nombre.equals(n.getNombre());
    }
    
    /*public void MostrarInfo()//imprime en consola la info del vertice
    {
        System.out.println("ID: "+this.getIndiceV()+"Nombre: "+this.nombre+"\n"+"Info: "+this.data);        
    }
    
    public String ObtenerInfo()//retorna string con la info del vertice
    {
        return "ID: "+this.getIndiceV()+"Nombre: "+this.nombre+"\n"+"Info: "+this.data;        
    }*/
        
    
}
