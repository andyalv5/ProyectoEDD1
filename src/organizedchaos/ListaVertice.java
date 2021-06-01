package organizedchaos;

public class ListaVertice 
{
    private NodoVertice pFirst;
    private NodoVertice pLast;
    private int size;
    
    public ListaVertice(){
        
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;        
        
    }
    
    public NodoVertice getpFirst() {
        return pFirst;
    }

    public void setpFirst(NodoVertice pFirst) {
        this.pFirst = pFirst;
    }

    public NodoVertice getpLast() {
        return pLast;
    }

    public void setpLast(NodoVertice pLast) {
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
    
    public NodoVertice FirstElement(){
        return pFirst;
    }
    
    public NodoVertice LastElement(){
        return null;
    }
    
    public Object Access(NodoVertice pValue){
        return pValue.getElement();
    }
    
    public NodoVertice Proximo(NodoVertice pValue)
    {
        
        if(pValue.getpNext() != null){
            pValue = pValue.getpNext();
            return pValue;
        }else{
            return null;
        }
    }
    //prepa
    
    public NodoVertice Anterior(NodoVertice pValue)
    {
        NodoVertice aux = pFirst;
        NodoVertice ant = pFirst;
        
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
        
        NodoVertice aux = pFirst;
        
        for (int i = 0; i < size; i++) {
            System.out.println(aux.getElement().ObtenerInfo());
            aux = aux.getpNext();
            
        }
    }
    public String printList()
    {
        if (!IsEmpty()) {
            String lista_completa = "";
            NodoVertice pAct = this.pFirst;
            while(pAct != null){
                lista_completa += pAct.getElement().ObtenerInfo()+"\n";
                pAct = pAct.getpNext();
            }
        
            return lista_completa;           
        } 
        
        return "->lista vacia";
        
    }
    
    public void InsertarEnd(Vertice x)
    {
        
        NodoVertice aux = new NodoVertice(x);
        
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
        x.setIndiceV(size);
        
    }
 
    public NodoVertice getNodo(int posicion)
    {//retorna un nodo si se pasa la posición
        if (!IsEmpty() && posicion <= size) {
            
            NodoVertice aux = pFirst;
            
            for (int i = 0; i < posicion; i++) {
                
                aux = Proximo(aux);
                
            }
            return aux;
            
        }else{
            return null;
        }
    }
    
    public int getIndex(String nom)
    {//retona la posicion del parametro nom
        
        if (!IsEmpty()) 
        {
            NodoVertice aux = this.getpFirst();
            int id = 0;
            while(aux != null)
            {
                if(aux.getElement().getNombre().equals(nom)){
                
                    id = aux.getElement().getIndiceV();
                    return id;
                
                } else {
                    aux = aux.getpNext();
                }
                
            }
            return id;
   
        }else{
            return -1;
        }
    }
    
    public Vertice getNodoNombre(String nom)
    {//retona el vertice del parametro nom
        
        if (!IsEmpty()) 
        {
            NodoVertice aux = this.getpFirst();
            
            while(aux != null)
            {
                if(aux.getElement().getNombre().equals(nom)){
             
                    return aux.getElement();
                
                } 
                aux = aux.getpNext();
               
            }
   
        }
        return null;
        
    }
    // Primitivas profe --> Busca un elemento.
    
    public NodoVertice Buscar(Vertice x, NodoVertice pValue)
    {
        
        NodoVertice p = null;
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
    
    public void Insertar(Vertice x, NodoVertice pValue)
    {//Inserta despues de pValue
        
        NodoVertice pNew = new NodoVertice(x);
        
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
    
    public void Delete(NodoVertice pValue)
    {
        
        NodoVertice p;
        
        if (pValue!= LastElement()) {
            
            p = pValue.getpNext();
            pValue.pNext = p.pNext;
            
            p = null;
            
        }
        size--;
        
    }
    
    public boolean ExisteVertice(String nom)
    {
        NodoVertice aux = this.getpFirst();
        boolean exist = false;
        if (!IsEmpty()) {
            while(aux != null){
                 if (aux.getElement().getNombre().equals(nom)) {
                    exist = true;
                } else{
                     aux = aux.getpNext();
                 }
        
            }
            
        }
        
       return exist; 
    }
    //ORDENAR LISTA, SI TIENE DIFERENTES TIPOS DE DATOS QUE HAGO?
    //USAR ORDENAMIENTO BINARIO
    public void OrdenarLista(Vertice pValue)
    {
        if (!IsEmpty()) 
        {
                        
        }
        
    }
    
}
