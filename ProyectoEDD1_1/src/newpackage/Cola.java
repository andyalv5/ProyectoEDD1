package newpackage;

/**
 * Clase Cola
 * Esta es la clase que se utiliza para referneciar o trabajar todo lo que tiene que ver con la implementacion de colas
 * @author Andy
 * @version 12/6/21
 */

public class Cola 
{
    private NodoCola cimaCola;
    private NodoCola ultimoCola;
    
    
    /**
     * constructor
     * Este es el contructor que sirve como base para inicializar las colas
     * @author Andy,Ulises,Hector
     */
    
    public void Colalista(){
        this.cimaCola=null;
        this.ultimoCola=null;
    }
    
       /**
     * Funcion colaVacia
     * Esta funcion se utiliza para determinar si una cola que se esta usando tiene elementos o no
     * @author Andy
     * @return boolean si la cola esta vacia o no
     */
    
    public boolean colaVacia(){
        return this.cimaCola==null;
    }
    
     /**
     * Funcion desencolar
     * Esta funcion se utiliza para desencolar elementos en una cola designada, dependiendo del caso
     si la cola no esta vacia se le dara a cimaCola el valor del siguiente al cimaCola anterior, si esta
     vacia no se hace nada a la estructura de la cola
     * @author Andy
     * @return NodoCola el nodo desencolado
     */
    
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
    
    /**
     * Procedimeinto insertar
     * En este procedimiento se añade un elemento al final de la cola, solo de esta manera
     debido a la naturaleza de las colas, si la cola esta vacia solo se añade el elmento
     y se le asigna el valor cimaCola, si no esta vacia entonces se cambia ultimoCola al nuevo
     elemento incluido
     * @author Andy
     * @param elemento 
     */
    
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
