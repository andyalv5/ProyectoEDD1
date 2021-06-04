package newpackage;

public class ListaArco 
{
    private NodoArco pFirst;
    private NodoArco pLast;
    private int size;
    
    public ListaArco(){
        
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;        
        
    }
    
    public NodoArco getpFirst() {
        return pFirst;
    }

    public void setpFirst(NodoArco pFirst) {
        this.pFirst = pFirst;
    }

    public NodoArco getpLast() {
        return pLast;
    }

    public void setpLast(NodoArco pLast) {
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
        return pFirst == null;
    }
    
    public NodoArco FirstElement(){
        return pFirst;
    }
    
    public NodoArco LastElement(){
        return null;
    }
    
    public Arco Access(NodoArco pValue){
        return pValue.getElement();
    }
    
    public NodoArco Proximo(NodoArco pValue)
    {
        
        if(pValue.getpNext() != null){
            pValue = pValue.getpNext();
            return pValue;
        }else{
            return null;
        }
    }
    //prepa
    
    public NodoArco Anterior(NodoArco pValue)
    {
        NodoArco aux = pFirst;
        NodoArco ant = pFirst;
        
        boolean find = false;
        
        if (aux == pValue) {
            return null;
            
        } else{
            while(aux != null && find == false){
                
                aux = Proximo(aux);
                if (aux == pValue) {
                    find = true;
                    return ant;
                } else{
                    ant = Proximo(ant);
                }
                
            }
        }
        return null;
    }
    
    public void Imprimir()
    {
        
        NodoArco aux = pFirst;
        
        for (int i = 0; i < size; i++) {
            System.out.println(aux.getElement().MostrarArc());
            aux = aux.getpNext();
            
        }
    }
    public String printList()
    {
        
        
        if (!IsEmpty()) {
            String lista_completa = "";
            NodoArco pAct = this.pFirst;
            while(pAct != null){
                lista_completa += pAct.getElement().MostrarArc()+ "\n";
                pAct = pAct.getpNext();
            }
        
            return lista_completa;           
        } 
        
        return "->lista vacia";
        
    }
    
    public void InsertarEnd(Arco x)
    {
        
        NodoArco aux = new NodoArco(x);
        
        if (IsEmpty()) {
            setpFirst(aux);
            setpLast(aux);
            //System.out.println("estaba vacia la lista");
            
        } else{
            pLast.setpNext(aux);
            pLast = aux;
            //System.out.println("ya tienne varios elementos");
             
        }
        size++;
        
    }


    
    public NodoArco getNodo(int posicion)
    {//retorna un nodo si se pasa la posición
        if (!IsEmpty() && posicion <= size) {
            
            NodoArco aux = pFirst;
            
            for (int i = 0; i < posicion; i++) {
                
                aux = Proximo(aux);
                
            }
            return aux;
            
        }else{
            return null;
        }
    }
    
    public int getIndex(NodoArco nodo)
    {//retona la posicion del parametro nodo
        
        if (!IsEmpty()) {
            
            NodoArco aux = pFirst;
            int contador = 0;
            
            while(aux != nodo){
                
                contador++;
                aux = Proximo(aux);
                
            }
            return contador;
            
        }else{
            return -1;
        }
    }
    // Primitivas profe --> Busca un elemento. --> esta chimbo
    
    public NodoArco Buscar(Arco x, NodoArco pValue)
    {
        
        NodoArco p = null;
        boolean find = false;
        
        if (IsEmpty()) 
        {
            return null;            
        } else
        {
            if (pValue != LastElement()) 
            {
                
                p = pValue;
                
                while(!find || p != LastElement())
                {
                    if (p.getElement() != x) {
                        Proximo(p);  
                    } else{
                        if (p.getElement() == x){
                            find = true;
                        } else{
                            p = null;
                        }
                    }
                }
                
            }
            return p;
            
        }
        
    }
    
    public void Insertar(Arco x, NodoArco pValue)
    {//Inserta despues de pValue
        
        NodoArco pNew = new NodoArco(x);
        
        if (pValue == LastElement()) 
        {
            pFirst = pNew;
            
        } else
        {
            if (pValue == FirstElement()) {
                
                pNew.pNext = FirstElement();
                pFirst = pNew;
                
            } else{
                
                pNew.pNext = pValue.pNext;
                pValue.pNext = pNew;
                
            }
        }
        
        size++;
        
    }
    
    public void Delete(NodoArco pValue)
    {
        
        NodoArco p;
        
        if (pValue!= LastElement()) {
            
            p = pValue.getpNext();
            pValue.pNext = p.pNext;
            
            p = null;
            
        }
        size--;
        
    }
    
    public boolean ExisteArco(String peso)
    {
        NodoArco aux = this.getpFirst();
        boolean exist = false;
        if (!IsEmpty()) {
            while(aux != null){
                 if (aux.getElement().getPeso().equals(peso)) {
                    exist = true;
                } else{
                     aux = aux.getpNext();
                 }
        
            }
            
        }
        
       return exist; 
    }
    
    
    
}
