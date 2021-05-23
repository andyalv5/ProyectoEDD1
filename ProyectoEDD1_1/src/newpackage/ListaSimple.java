package newpackage;

import javax.swing.JOptionPane;

public class ListaSimple 
{
    private Nodoweight pFirst;
    private Nodoweight pLast;
    private int size;
    
    public ListaSimple(){
        
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;        
        
    }
    
    public Nodoweight getpFirst() {
        return pFirst;
    }

    public void setpFirst(Nodoweight pFirst) {
        this.pFirst = pFirst;
    }

    public Nodoweight getpLast() {
        return pLast;
    }

    public void setpLast(Nodoweight pLast) {
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
            Nodoweight pAct = this.getpFirst();
            while(pAct != null){
                lista_completa += pAct.getweight() + "\n";
                pAct = pAct.getpNext();
            }
        
            return lista_completa;           
        } 
        
        return "->lista vacia";
        
    }
    
    public void pntAllelmnt(){
        Nodoweight nodoTmp = pFirst;
        if(this.IsEmpty()){
         JOptionPane.showMessageDialog(null,"The list is empty");
        }
        while(nodoTmp != null){
            JOptionPane.showMessageDialog(null,nodoTmp);
            nodoTmp=nodoTmp.getpNext();
        }
        
    }
    
    public void addAtEnd(Nodoweight node){
        if(this.IsEmpty()){
            addElementbegin(node);
        }
        Nodoweight tempo = this.pLast;
        tempo.setpNext(node);
        pLast = node;
        size ++;
    }
    
    public void addElementbegin(Nodoweight newNodo){
        if(this.IsEmpty()){
            pFirst=pLast= newNodo;
        }
        else{
            Nodoweight pNew= pFirst; 
            pFirst=newNodo;
            pFirst.setpNext(pNew);
        }
        size++;
        
    }   
    public int searchWeight(String searched1,String searched2){
        
        Nodoweight aux = pFirst;
        int returningweight= 0;
        try{
            while(aux.getpNext() != null){
                if(aux.getVertex1().equals(searched1) && aux.getVertex2().equals(searched2)){
                    returningweight = aux.getweight();
                }
            }     
        }
        catch(Exception e){
            returningweight = -1;
        }
        return returningweight;
    }
}
