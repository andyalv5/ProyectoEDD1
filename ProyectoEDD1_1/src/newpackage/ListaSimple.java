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
    public int Buscar(String nom,String nom2){
        
        ListaSimple aux =this;
        Nodoweight auxiliar1=this.pFirst;
        while(auxiliar1 !=null){
            if(nom.equals(aux.getpFirst().getVertex1())){
                if (nom2.equals(aux.pFirst.getpNext().getVertex2())){
                    return aux.getpFirst().getweight();
                }
            }
            auxiliar1 = auxiliar1.getpNext();
        }     
        return -1;
    }
    
    public String ReturnFE(String name){
        Nodoweight actual=pFirst;
        String myStr = "";
        boolean founded = false;
        while(actual !=null && !founded ){
            founded = actual.getVertex2().equals(name);
            if(!founded){
                actual=actual.getpNext();
            }
            if(founded){
                myStr+=actual.getVertex1()+",";
            }
        }
        return myStr;
    }
    
    public String ReturnSE(String name){
        String myStr="";
        Nodoweight actual=pFirst;
        boolean founded = false;
        while(actual !=null && !founded ){
            founded = actual.getVertex1().equals(name);
            if(!founded){
                actual=actual.getpNext();
            }
            if(founded){
                myStr+=actual.getVertex2()+",";
            }
        }
        return myStr;
    }
   
    
    public void delByNameSCE(String name){
        Nodoweight actual=pFirst;
        Nodoweight anterior =null;
        boolean founded = false;
        while(actual !=null && !founded ){
            founded = actual.getVertex1().equals(name);
            if(!founded){
                anterior =actual;
                actual=actual.getpNext();
            }
        
        }
        if(actual!=null){
            if (actual==pFirst){
                pFirst = actual.getpNext();
                if (actual==pFirst){
                    pFirst = actual.getpNext();
                }
            }
            else{
                anterior.setpNext(actual.getpNext());
            }
            actual=null;
        }
    }
    
    public void delByNameFE(String name){
        Nodoweight actual=pFirst;
        Nodoweight anterior =null;
        boolean founded = false;
        while(actual !=null && !founded ){
            founded = actual.getVertex2().equals(name);
            if(!founded){
                anterior =actual;
                actual=actual.getpNext();
            }
        }
        if(actual!=null){
            if (actual==pFirst){
                pFirst = actual.getpNext();
            }
            else{
                anterior.setpNext(actual.getpNext());
            }
            actual=null;
        
        }
    }
    
    public boolean ExistFE(String name){
        Nodoweight actual=pFirst;
        boolean founded = false;
        while(actual !=null && !founded ){
            founded = actual.getVertex2().equals(name);
            if(!founded){
                actual=actual.getpNext();
            }
            if(founded){
                return true;
            }
        }
        return false;
    }
    
    public boolean ExistSE(String name){
        Nodoweight actual=pFirst;
        boolean founded = false;
        while(actual !=null && !founded ){
            founded = actual.getVertex1().equals(name);
            if(!founded){
                actual=actual.getpNext();
            }
            if(founded){
                return true;
            }
        }
        return false;
    }
}
