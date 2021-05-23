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
        //ListaSimple lista = new ListaSimple();
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
                        info += line +"\n";
                    }
                }
                /*if (!"".equals(info)) {
                    String[] aux = info.split("\n");
                    for (int i = 0; i < aux.length; i++) {
                        lista.InsertarEnd(aux[i]);
                    }
                    
                }*/
                br.close();
                JOptionPane.showMessageDialog(null, "ÉXITO AL LEER! ");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ÉRROR AL LEER! ");
        }
        
        return info;
    }
    
    public ListaSimple ExtraerArcos(String info)
    {
        ListaSimple lista = new ListaSimple();
        if (!"".equals(info)) 
        {
            String[] aux = info.split("\n");
            for (int i = 1; i < aux.length; i++) {
                if(aux[i].equals("Rutas;"))
                {
                    System.out.println("Llego a rutas");
                    break;                    
                }else
                {
                    lista.InsertarEnd(aux[i]);                                        
                }
                
            }
                    
        }
        
        return lista;
        
    }
    
    public ListaSimple ExtraerVertices(String info)
    {
        ListaSimple lista = new ListaSimple();
        if (!"".equals(info)) 
        {
            String[] aux = info.split("\n");
            for (String aux1 : aux) {
                if(aux1.equals("Rutas;")){
                    
                }
                lista.InsertarEnd(aux1);
            }
                    
        }
        
        return lista;
    }
    
}
