package organizedchaos;

public class Vertice 
{
    private Lista data; //atributo para guardar lo que contiene el almacén
    private String nombre; //nombre del vertice
    private int indiceV; //indice del vertice
    private boolean visitado;
    
    public Vertice(Lista info, String nom)
    {
        this.data = info;
        this.nombre = nom;
        this.indiceV = -1;
        this.visitado = false;
    }
    
    //GETTERS Y SETTERS

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    
    public Lista getData() 
    {
        return data;
    }

    public void setData(Lista data) 
    {
        this.data = data;
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
    
    //retorna true si dos vertices son iguales
    public boolean Equals(Vertice n)
    {
        return this.nombre.equals(n.getNombre());
    }
    
    public void MostrarInfo()//imprime en consola la info del vertice
    {
        System.out.println("ID: "+this.getIndiceV()+" Nombre: "+this.nombre+"\n"+" Info: "+this.data.printList());        
    }
    
    public String ObtenerInfo()//retorna string con la info del vertice
    {
        return "ID: "+this.getIndiceV()+" Nombre: "+this.nombre+"\n"+" Info: "+this.data.printList();        
    }
    
    public String ParaTXT(){
        return "Almacen "+this.getNombre()+":"+"\n"+this.getData().EnviarAtxt();
    }
}
