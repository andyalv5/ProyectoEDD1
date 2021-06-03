package newpackage;



import newpackage.NodoSuma;
import javax.swing.JOptionPane;

public class SumaLista 
{
    private NodoSuma pFirst;
    private NodoSuma pLast;
    private int size;
    
    public SumaLista(){
        
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;        
        
    }
    public void DestroyList(){
        this.setpFirst(null);
        this.setpLast(null);
        this.setSize(0);

    }   
    
    public boolean IsEmpty(){
        return true;
    }
    
    
    
    public Nodoweight Proximo(Nodoweight pValue)
    {
        
        if(pValue.getpNext() != null){
            pValue = pValue.getpNext();
            return pValue;
        }else{
            return null;
        }
    }
    //prepa
    

 
    
    public void pntAllelmnt(){
        NodoSuma nodoTmp = getpFirst();
        if(this.IsEmpty()){
         JOptionPane.showMessageDialog(null,"The list is empty");
        }
        while(nodoTmp != null){
            nodoTmp=nodoTmp.getSiguiente();
        }
        
    }
    
    public void addAtEnd(NodoSuma node){
        if(this.IsEmpty()){
            addElementbegin(node);
        }
        else{
            NodoSuma tempo = this.pLast;
            tempo.setSiguiente(node);
            pLast = node;
        }
        size ++;
    }
    public void addElementbegin(NodoSuma newNodo){
        if(this.IsEmpty()){
            pFirst=pLast= newNodo;
        }
        else{
            NodoSuma pNew= pFirst; 
            pFirst=newNodo;
            pFirst.setSiguiente(pNew);
            
            size++;
        }
        
    }   
    
    public int Buscar(String nom){
        
        SumaLista aux =this;
        NodoSuma auxiliar1=aux.getpFirst();
        while(auxiliar1 !=null){
            if(nom.equals(auxiliar1.getNombre())){
                return Integer.parseInt(auxiliar1.getCantidad());
            }
            auxiliar1 = auxiliar1.getSiguiente();
        }     
        return -1;
    }
    
   public NodoSuma BuscarVertex(String searched){
        
        NodoSuma aux;
        try{
            for(aux=this.getpFirst();aux !=null;aux=aux.getSiguiente()){
                if(searched.equals(aux.getNombre())){
                    return aux;
                } 
            }     
        }
        catch(Exception e){
            return null;
        }
        return null;
    }
   
    public String returnAlmacenes(){
        String almacenes = "";
        NodoSuma temp = this.getpFirst();
        while(temp!=null){
            almacenes+= temp.getNombre() +",";
            temp = temp.getSiguiente();
        }
        return almacenes;
    }
    
    
    
    public void delAtEnd(){
        NodoSuma temp= getpFirst();
        if(getpFirst() == getpLast()){
            setpFirst(pLast = null);
        }
        else{
            while(temp.getSiguiente()!=getpLast()){
                temp = temp.getSiguiente();
            }
            setpLast(temp);
            getpLast().setSiguiente(null);
        }
    }
   
    
    public void delByName(String name){
        if(name.equals(this.getpFirst().getNombre())){
            this.setpFirst(this.getpFirst().getSiguiente());
        }
        else if(name.equals(this.getpLast().getNombre())){
            delAtEnd();
        }
        else{
            int contador =0;
            NodoSuma nodoTmp = this.getpFirst();
            while(contador < getSize()-1 && nodoTmp.getSiguiente() !=null){
                if(name.equals(nodoTmp.getSiguiente().getNombre())){
                    nodoTmp.setSiguiente(nodoTmp.getSiguiente().getSiguiente());
                }
                nodoTmp = nodoTmp.getSiguiente(); 
            }
        }
        setSize(getSize() - 1);
    }
   
    
    
    public void delFElement(){
        if(!this.IsEmpty()){
            NodoSuma aux = this.getpFirst().getSiguiente();
            this.getpFirst().setSiguiente(null);
            this.setpFirst(aux);
            setSize(getSize() - 1);
        }
        
    }

    /**
     * @return the pFirst
     */
    public NodoSuma getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(NodoSuma pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public NodoSuma getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(NodoSuma pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    public String SumarLista(ListaVertex lisver){
        
        String almacenes = "";
        Vertex temp = lisver.getpFirst();
        for(int s=0; s<lisver.getSize();s++){
            almacenes+= "Almacen "+temp.getName()+"\n";
            almacenes+= temp.getListaver().returnInlistProducts();
            almacenes+="\n";
            temp = temp.getSiguiente();
            
        }
        JOptionPane.showMessageDialog(null, almacenes);
        return almacenes;
        
    }

    
}
            
            
