package newpackage;

import javax.swing.JOptionPane;

public class ListaVertex 
{
    private Vertex pFirst;
    private Vertex pLast;
    private int size;
    
    public ListaVertex(){
        
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;        
        
    }
    
    public Vertex getpFirst() {
        return pFirst;
    }

    public void setpFirst(Vertex pFirst) {
        this.pFirst = pFirst;
    }

    public Vertex getpLast() {
        return pLast;
    }

    public void setpLast(Vertex pLast) {
        this.pLast = pLast;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    //Primitivas
    
    public void DestroyList(){
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
       
    }
    
    public boolean IsEmpty(){
        return getpFirst() == null;
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
    

 
    public String printList()
    {
        
        
        if (!IsEmpty()) {
            String lista_completa = "->";
            Vertex pAct = this.getpFirst();
            while(pAct != null){
                lista_completa += pAct.getName() + "\n";
                pAct = pAct.getSiguiente();
            }
        
            return lista_completa;           
        } 
        
        return "->lista vacia";
        
    }
    
    public void pntAllelmnt(){
        Vertex nodoTmp = pFirst;
        if(this.IsEmpty()){
         JOptionPane.showMessageDialog(null,"The list is empty");
        }
        while(nodoTmp != null){
            JOptionPane.showMessageDialog(null,nodoTmp);
            nodoTmp=nodoTmp.getSiguiente();
        }
        
    }
    
    public void addAtEnd(Vertex node){
        if(this.IsEmpty()){
            addElementbegin(node);
        }
        Vertex tempo = this.pLast;
        tempo.setSiguiente(node);
        pLast = node;
        size ++;
    }
    
    public void addElementbegin(Vertex newNodo){
        if(this.IsEmpty()){
            pFirst=pLast= newNodo;
        }
        else{
            Vertex pNew= pFirst; 
            pFirst=newNodo;
            pFirst.setSiguiente(pNew);
        }
        size++;
        
    }   
    
    public int Buscar(String nom){
        
        ListaVertex aux =this;
        Vertex auxiliar1=aux.getpFirst();
        while(auxiliar1 !=null){
            if(nom.equals(auxiliar1.getName())){
                return auxiliar1.getVertexNum();
            }
            auxiliar1 = auxiliar1.getSiguiente();
        }     
        return -1;
    }
    
   public Vertex BuscarVertex(String searched){
        
        Vertex aux;
        try{
            for(aux=this.pFirst;aux !=null;aux=aux.getSiguiente()){
                if(searched.equals(aux.getName())){
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
        Vertex temp = this.pFirst;
        while(temp!=null){
            almacenes+= temp.getName() +",";
            temp = temp.getSiguiente();
        }
        return almacenes;
    }
    
    public void delAtEnd(){
        Vertex temp= pFirst;
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
        if(name.equals(this.pFirst.getName())){
            this.pFirst = this.pFirst.getSiguiente();
        }
        else if(name.equals(this.pLast.getName())){
            delAtEnd();
        }
        else{
            int contador =0;
            Vertex nodoTmp = this.pFirst;
            while(contador < size-1 && nodoTmp.getSiguiente() !=null){
                if(name.equals(nodoTmp.getSiguiente().getName())){
                    nodoTmp.setSiguiente(nodoTmp.getSiguiente().getSiguiente());
                }
                nodoTmp = nodoTmp.getSiguiente(); 
            }
        }
        size--;
    }
}
