package firstproyect.interfaces;
public class ListaSimple 
{
    private NodoSimple pFirst;
    private NodoSimple pLast;
    private int size;
    
    public ListaSimple(){
        
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;        
        
    }
    
    public NodoSimple getpFirst() {
        return pFirst;
    }

    public void setpFirst(NodoSimple pFirst) {
        this.pFirst = pFirst;
    }

    public NodoSimple getpLast() {
        return pLast;
    }

    public void setpLast(NodoSimple pLast) {
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
    
    public NodoSimple FirstElement(){
        return pFirst;
    }
    
    public NodoSimple LastElement(){
        return null;
    }
    
    public Object Access(NodoSimple pValue){
        return pValue.getElement();
    }
    
    public NodoSimple Proximo(NodoSimple pValue)
    {
        
        if(pValue.getpNext() != null){
            pValue = pValue.getpNext();
            return pValue;
        }else{
            return null;
        }
    }
    //prepa
    
    public NodoSimple Anterior(NodoSimple pValue)
    {
        NodoSimple aux = pFirst;
        NodoSimple ant = pFirst;
        
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
        
        NodoSimple aux = pFirst;
        
        for (int i = 0; i < size; i++) {
            System.out.println(aux.getElement());
            aux = aux.getpNext();
            
        }
    }
    public String printList()
    {
        
        
        if (!IsEmpty()) {
            String lista_completa = "->";
            NodoSimple pAct = this.pFirst;
            while(pAct != null){
                lista_completa += pAct.getElement() + "\n";
                pAct = pAct.getpNext();
            }
        
            return lista_completa;           
        } 
        
        return "->lista vacia";
        
    }
    
    public void InsertarEnd(String x)
    {
        
        NodoSimple aux = new NodoSimple(x);
        
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


    
    public NodoSimple getNodo(int posicion)
    {//retorna un nodo si se pasa la posición
        if (IsEmpty() && posicion <= size) {
            
            NodoSimple aux = pFirst;
            
            for (int i = 0; i < posicion; i++) {
                
                aux = Proximo(aux);
                
            }
            return aux;
            
        }else{
            return null;
        }
    }
    
    public int getIndex(NodoSimple nodo)
    {//retona la posicion del parametro nodo
        
        if (IsEmpty()) {
            
            NodoSimple aux = pFirst;
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
    
    public NodoSimple Buscar(Object x, NodoSimple pValue)
    {
        
        NodoSimple p = null;
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
    
    public void Insertar(String x, NodoSimple pValue)
    {//Inserta despues de pValue
        
        NodoSimple pNew = new NodoSimple(x);
        
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
    
    public void Delete(NodoSimple pValue)
    {
        
        NodoSimple p;
        
        if (pValue!= LastElement()) {
            
            p = pValue.getpNext();
            pValue.pNext = p.pNext;
            
            p = null;
            
        }
        size--;
        
    }
    
    
    //ORDENAR LISTA, SI TIENE DIFERENTES TIPOS DE DATOS QUE HAGO?
    //USAR ORDENAMIENTO BINARIO
    public void OrdenarLista(Nodo pValue)
    {
        if (!IsEmpty()) 
        {
                        
        }
        
    }
    
}
