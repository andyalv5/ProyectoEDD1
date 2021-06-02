package newpackage;

import javax.swing.JOptionPane;

public class Pila 
{
    private NodoPila cima;
    private int in;
    
    public Pila()
    {
        this.cima = null;
        this.in = 0;        
    }

    public NodoPila getCima() {
        return cima;
    }

    public void setCima(NodoPila cima) {
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
    
    public Vertex Cima(){
        return cima.getElemento();
    }
    
    public void Apilar(Vertex inf){
        
        NodoPila pNew = new NodoPila(inf);
        pNew.setSiguiente(cima);
        cima = pNew;
        in ++;
        
    }
    public boolean isEmpty(){
        return true;
    }
    
    public Vertex Desapilar(){
        
        NodoPila aux = this.cima;
        if (this.IsEmpty()) {
             JOptionPane.showMessageDialog(null, "Error! La pila esta vacia!");
        }else {
            this.cima = this.cima.getSiguiente();
            this.in--;
        }
        
        return aux.getElemento();         
       
    }
    
    public Pila Invertir(){
        Pila nueva = new Pila();
        
        while(!this.IsEmpty()){
            nueva.Apilar(this.Desapilar());
        }
        
        return nueva;
    }
}
