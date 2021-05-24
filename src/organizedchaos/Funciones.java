package organizedchaos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Funciones 
{
    public Funciones(){
        
    }
    
    /*public void Escribir_txt(Pila pila){
        
        String informacion = "";
        
        while(!pila.IsEmpty()) {
            String valor = (String) pila.Desapilar().getData();
            informacion += valor;        
        }
        try{
            PrintWriter pw = new PrintWriter("test\\Datos.txt");
            pw.print(informacion);
            pw.close();
            JOptionPane.showMessageDialog(null, "ÉXITO AL REGISTRAR! ");
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, "ÉRROR AL REGISTRAR! ");
        }
    }*/
    
    public String Leer_txt(String path){
        
        String line;
        String info = "";
        File file = new File(path);
        
        try{
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while((line = br.readLine()) != null){
                    if (!line.isEmpty()) {
                        info += line+"\n";
                    }
                }
                br.close();
                JOptionPane.showMessageDialog(null, "ÉXITO AL LEER! ");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ÉRROR AL LEER! ");
        }
        
        return info;
    }
    
    public Grafo ExtraerVertices(String info, Grafo gf)
    {

        if (!"".equals(info)) 
        {
            String[] aux = info.split(";");
            for (int i = 1; i < aux.length; i++) 
            {
                if(aux[i].equals("\nRutas"))
                {
                    break;                    
                } else
                {
                    String[] aux2 = aux[i].split("\n");
                    
                    String[] n = aux2[1].split("");
                    String nombreVertice = n[8];
                    
                    Lista infoVertice = new Lista();
                    
                    for (int j = 2; j < aux2.length; j++) 
                    {
                        infoVertice.InsertarEnd(aux2[j]);
                    }

                    gf.InsertarVertice(infoVertice, nombreVertice);
                    
                }
            }
         
        }
        
        return gf;
        
    }
    
    public Grafo ExtraerArcos(String info, Grafo gf)
    {
        
        if (!"".equals(info)) 
        {
            String[] aux = info.split(";");
            for (int i = aux.length-1; i >= 0 ; i--) {
                if(aux[i].equals("\nRutas"))
                {
                    break;                    
                }else
                {
                    String[] infoArcos = aux[i].split("\n");
                    for (int j = 1; j < infoArcos.length; j++) 
                    {
                        String[] aux2 = infoArcos[j].split(",");
                        gf.InsertarArco(aux2[0], aux2[1], aux2[2]);
                    }
                                        
                }
                
            }
                    
        }
        
        return gf;
    }
    
}
