package organizedchaos;

public class Lista 
{
    private Nodo pFirst;
    private Nodo pLast;
    private int size;
    
    public Lista(){
        
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;        
        
    }
    
    public Nodo getpFirst() {
        return pFirst;
    }

    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    public Nodo getpLast() {
        return pLast;
    }

    public void setpLast(Nodo pLast) {
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
    
    public Nodo FirstElement(){
        return pFirst;
    }
    
    public Nodo LastElement(){
        return null;
    }
    
    public String Access(Nodo pValue){
        return "Producto: "+pValue.getpNombre() + " Stock: "+pValue.getpStock();
    }
    
    public Nodo Proximo(Nodo pValue)
    {
        
        if(pValue.getpNext() != null){
            pValue = pValue.getpNext();
            return pValue;
        }else{
            return null;
        }
    }
    //prepa
    
    public Nodo Anterior(Nodo pValue)
    {
        Nodo aux = pFirst;
        Nodo ant = pFirst;
        
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
    
    public String EnviarAtxt()
    {
        String aux = "";
        if (!IsEmpty()) {
            Nodo pAct = this.pFirst;
            while(pAct != null){
                aux += pAct.getpNombre() + ","+pAct.getpStock()+ "\n";
                pAct = pAct.getpNext();
            }
        
            return aux;           
        }
        
        return aux+";";
    }
    
    public void Imprimir()
    {
        
        Nodo aux = pFirst;
        
        for (int i = 0; i < size; i++) {
            System.out.println("Producto: "+aux.getpNombre() + " Stock: "+aux.getpStock());
            aux = aux.getpNext();
            
        }
    }
    public String printList()
    {
        
        
        if (!IsEmpty()) {
            String lista_completa = "";
            Nodo pAct = this.pFirst;
            while(pAct != null){
                lista_completa += "Producto: "+pAct.getpNombre() + " Stock: "+pAct.getpStock()+ "->";
                pAct = pAct.getpNext();
            }
        
            return lista_completa;           
        } 
        
        return "->lista vacia";
        
    }
    
    public void InsertarEnd(String x)
    {
        
        Nodo aux = new Nodo(x);
        
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

    public Nodo getNodo(int posicion)
    {//retorna un nodo si se pasa la posición
        if (!IsEmpty() && posicion <= size) {
            
            Nodo aux = pFirst;
            
            for (int i = 0; i < posicion; i++) {
                
                aux = Proximo(aux);
                
            }
            return aux;
            
        }else{
            return null;
        }
    }
    
    public int getIndex(Nodo nodo)
    {//retona la posicion del parametro nodo
        
        if (!IsEmpty()) {
            
            Nodo aux = pFirst;
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
    
    public Nodo Buscar(String nom, Nodo pValue)
    {
        
        Nodo p = null;
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
                    if (p.getpNombre().equals(nom)) {
                        Proximo(p);  
                    } else{
                        if (p.getpNombre().equals(nom)){
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
    
    public void Insertar(String x, Nodo pValue)
    {//Inserta despues de pValue
        
        Nodo pNew = new Nodo(x);
        
        if (pValue == LastElement()) 
        {
            pFirst = pNew;
            
        } else
        {
            if (pValue == FirstElement()) {
                
                pNew.setpNext(FirstElement());
                pFirst = pNew;
                
            } else{
                
                pNew.setpNext(pValue.getpNext());
                pValue.setpNext(pNew);
                
            }
        }
        
        size++;
        
    }
    
    public void Delete(Nodo pValue)
    {
        
        Nodo p;
        
        if (pValue!= LastElement()) {
            
            p = pValue.getpNext();
            pValue.setpNext(p.getpNext());
            
            p = null;
            
        }
        size--;
        
    }
    
    
}
