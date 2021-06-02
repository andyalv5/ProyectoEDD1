package newpackage;

public class Cola 
{
    private NodoCola cimaCola;
    private NodoCola ultimoCola;
    
    public void Colalista(){
        this.cimaCola=null;
        this.ultimoCola=null;
    }
    
    public boolean colaVacia(){
        return this.cimaCola==null;
    }
    
    public NodoCola desencolar(){
        NodoCola aux= this.cimaCola;
        if(!colaVacia()){
            try{
                aux = this.cimaCola;
                this.cimaCola = this.cimaCola.getSiguiente();
                aux.setSiguiente(null);
            }
            catch(Exception e){
                aux = this.cimaCola;
            }
        }
        else{
            aux=null;
        }
        return aux;
    }
    
    public void insertar(Vertex elemento){
        NodoCola nodo= new NodoCola(elemento);
        if(colaVacia()){
            this.cimaCola=nodo;
        }
        else{
            this.ultimoCola.setSiguiente(nodo);
        }
        this.ultimoCola = nodo;
    }
}
