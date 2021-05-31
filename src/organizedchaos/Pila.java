package organizedchaos;

import javax.swing.JOptionPane;

public class Pila 
{
    private NodoVertice cima;
    private int in;
    
    public Pila()
    {
        this.cima = null;
        this.in = 0;        
    }

    public NodoVertice getCima() {
        return cima;
    }

    public void setCima(NodoVertice cima) {
        this.cima = cima;
    }

    public int getIn() {
        return in;
    }

    public void setIn(int in) {
        this.in = in;
    }
    
    public void Destructor(){
        this.in = 0;
        this.cima = null;
    }
    
    public boolean IsEmpty(){
        return cima == null;
    }
    
    public Vertice Cima(){
        return cima.getElement();
    }
    
    public void Apilar(Vertice inf){
        
        NodoVertice pNew = new NodoVertice(inf);
        pNew.setpNext(cima);
        cima = pNew;
        in ++;
        
    }
    
    public Vertice Desapilar(){
        
        NodoVertice aux = this.cima;
        if (this.IsEmpty()) {
             JOptionPane.showMessageDialog(null, "Error! La pila esta vacia!");
        }else {
            this.cima = this.cima.getpNext();
            this.in--;
        }
        
        return aux.getElement();         
       
    }
    
    public Pila Invertir(){
        Pila nueva = new Pila();
        
        while(!this.IsEmpty()){
            nueva.Apilar(this.Desapilar());
        }
        
        return nueva;
    }
}
