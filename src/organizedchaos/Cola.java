package organizedchaos;

public class Cola 
{
    private NodoVertice cimaCola;
    private NodoVertice ultimoCola;
    private int in;
    
    public Cola()
    {
        this.cimaCola = null;
        this.ultimoCola = null;
        this.in = 0;
        
    }

    public NodoVertice getCimaCola() {
        return cimaCola;
    }

    public void setCimaCola(NodoVertice cimaCola) {
        this.cimaCola = cimaCola;
    }

    public NodoVertice getUltimoCola() {
        return ultimoCola;
    }

    public void setUltimoCola(NodoVertice ultimoCola) {
        this.ultimoCola = ultimoCola;
    }

    public int getIn() {
        return in;
    }

    public void setIn(int in) {
        this.in = in;
    }
    
    public void DestructorCola()
    {
        this.cimaCola = null;
        this.ultimoCola = null;
        this.in = 0;        
    }
    
    public void Encolar(Vertice x)
    {
        NodoVertice pNew = new NodoVertice(x);
        pNew.setpNext(null);
        
        if (this.getCimaCola() == null) 
        {
            this.setCimaCola(pNew);
            
        } else{
            this.getUltimoCola().setpNext(pNew);
        }
        this.setUltimoCola(pNew);
        in ++;
        
    }
    
    public NodoVertice Desencolar()
    {
        NodoVertice pTemp = this.getCimaCola();
        if (!this.IsEmpty()) 
        {
            this.setCimaCola(this.getCimaCola().getpNext());
            in --;
            
        }
        
        return pTemp;        
        
    }
    
    public boolean IsEmpty(){
        return in == 0;
    }
    
    public Vertice Cima(){
        return this.getCimaCola().getElement();
    }
    
}
