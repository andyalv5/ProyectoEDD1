package newpackage;

import javax.swing.JOptionPane;

/**
 * Clase Pila
 * En esta clase se encuentra lo relacionado a las pilas 
 * @author Ulises,Hector,Andy
 * @version 12/6/21
 */

public class Pila 
{
    private NodoPila cima;
    private int in;
    
    /**
     * Procedimiento Pila
     * Constructor que se utilizara para inicializar una pila en el programa
     * @author Ulises,Andy,Hector
     */
    
    public Pila()
    {
        this.cima = null;
        this.in = 0;        
    }

    /**
     * Funcion getCima
     * En esta funcion se retorna el elemento cima de la pila
     * @author Ulises,Andy,Hector
     * @return NodoPila la cima
     */
    
    public NodoPila getCima() {
        return cima;
    }

    /**
     * Procedimiento setCima
     * En este procedimiento se le asigna un valor al elemento cima de la pila
     * @author Ulises,Andy,Hector
     * @param cima 
     */
    
    public void setCima(NodoPila cima) {
        this.cima = cima;
    }

    /**
     * Funcion getIn
     * En esta funcion se retorna el elemento in de la pila
     * @author Ulises,Andy,Hector
     * @return int tamaño de la pila
     */
    
    public int getIn() {
        return in;
    }

    /**
     * Procedimiento setIn
     * En este procedimiento se le asigna un valor al elemento in de la pila
     * @author Ulises,Andy,Hector
     * @param in 
     */
    
    public void setIn(int in) {
        this.in = in;
    }
    
    /**
     * Procedimiento Destructor
     * Este procedimiento se usa para dejar vacia una pila
     * @author Ulises,Andy,Hector
     */
    
    public void Destructor(){
        this.in = 0;
        this.cima = null;
    }
    
    /**
     * Funcion IsEmpty
     * Esta funcion retorna un boolean con el cual se identifica si una pila esta
     vacia
     * @author Ulises,Andy,Hector
     * @return boolean si la pila esta vacia
     */
    
    public boolean IsEmpty(){
        return cima == null;
    }
    
    /**
     * Funcion Cima
     * Devuelve el elemento del nodo que es la cima de la pila
     * @author Ulises,Andy,Hector
     * @return Vertex el elemento 
     */
    
    public Vertex Cima(){
        return cima.getElemento();
    }
    
    /**
     * Procedimiento Apilar
     * En este procedimiento se apila un nuevo elemento a la pila
     * @author Ulises,Andy,Hector
     * @param inf 
     */
    
    public void Apilar(Vertex inf){
        
        NodoPila pNew = new NodoPila(inf);
        pNew.setSiguiente(cima);
        cima = pNew;
        in ++;
        
    }
    
    /**
     * Funcion isEmpty
     * Se utiliza para determinar si una pila esta vacia
     * @author Hector,Andy,Ulises
     * @return boolean true
     */
    
    public boolean isEmpty(){
        return true;
    }
    
    /**
     * Funcion Desapilar
     * Se utiliza para desapilar elementos en la pila 
     * @author Ulises,Hector,Andy
     * @return Vertex el elemento que se desapilo
     */
    
    public Vertex Desapilar(){
        
        NodoPila aux = this.cima;
        if (this.IsEmpty()) {
             JOptionPane.showMessageDialog(null, "Error! La pila esta vacia!");
        }else {
            this.cima = this.cima.getSiguiente();
            this.in--;
        }
        
        return aux.getElemento();         
       
    }
    
    /**
     * Funcion Invertir
     * Se utiliza para voltear una pila y retornarla
     * @author Ulises,Andy,Hector
     * @return Pila la pila invertida
     */
    
    public Pila Invertir(){
        Pila nueva = new Pila();
        
        while(!this.IsEmpty()){
            nueva.Apilar(this.Desapilar());
        }
        
        return nueva;
    }
}
