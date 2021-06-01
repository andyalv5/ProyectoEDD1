package organizedchaos;


public class Arco 
{
    private String origin;
    private String destino;
    private String peso;
    
    public Arco(String sale, String llega, String pes)
    {
        this.origin = sale;
        this.destino = llega;
        this.peso = pes;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String Destino) {
        this.destino = Destino;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    public void MostrarArco()
    {
        System.out.println("Origen: "+this.origin+" Destino: "+this.destino+" Peso: "+this.peso);        
    }
    
    public String MostrarArc()
    {
        return "Origen: "+this.origin+" Destino: "+this.destino+" Peso: "+this.peso;         
    }
    
    public String Paratxt(){
        return this.getOrigin()+","+this.getDestino()+","+this.getPeso();
    }
    
}
