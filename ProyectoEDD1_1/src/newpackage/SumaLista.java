package newpackage;

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
    this.pFirst = null;
    this.pLast = null;
    this.size = 0;

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
        NodoSuma nodoTmp = pFirst;
        if(this.IsEmpty()){
         JOptionPane.showMessageDialog(null,"The list is empty");
        }
        while(nodoTmp != null){
            JOptionPane.showMessageDialog(null,nodoTmp);
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
        NodoSuma auxiliar1=aux.pFirst;
        while(auxiliar1 !=null){
            if(nom.equals(auxiliar1.getNombre())){
                return auxiliar1.getCantidad();
            }
            auxiliar1 = auxiliar1.getSiguiente();
        }     
        return -1;
    }
    
   public NodoSuma BuscarVertex(String searched){
        
        NodoSuma aux;
        try{
            for(aux=this.pFirst;aux !=null;aux=aux.getSiguiente()){
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
        NodoSuma temp = this.pFirst;
        while(temp!=null){
            almacenes+= temp.getNombre() +",";
            temp = temp.getSiguiente();
        }
        return almacenes;
    }
    
    
    
    public void delAtEnd(){
        NodoSuma temp= pFirst;
        if(pFirst == pLast){
            pFirst = pLast = null;
        }
        else{
            while(temp.getSiguiente()!=pLast){
                temp = temp.getSiguiente();
            }
        pLast =temp;
        pLast.setSiguiente(null);
        }
    }
   
    
    public void delByName(String name){
        if(name.equals(this.pFirst.getNombre())){
            this.pFirst = this.pFirst.getSiguiente();
        }
        else if(name.equals(this.pLast.getNombre())){
            delAtEnd();
        }
        else{
            int contador =0;
            NodoSuma nodoTmp = this.pFirst;
            while(contador < size-1 && nodoTmp.getSiguiente() !=null){
                if(name.equals(nodoTmp.getSiguiente().getNombre())){
                    nodoTmp.setSiguiente(nodoTmp.getSiguiente().getSiguiente());
                }
                nodoTmp = nodoTmp.getSiguiente(); 
            }
        }
        size--;
    }
   
    
    public void sumar(){
        NodoSuma aux=this.pFirst;
        NodoSuma aux2=aux;
        while(aux2!=null){
            if(aux2.getNombre().equals(aux.getNombre())){
                
            }
        }
    }
}
            
            
