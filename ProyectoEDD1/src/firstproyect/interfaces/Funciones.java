package firstproyect.interfaces;

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
    
    public ListaSimple Leer_txt(String path){
        ListaSimple lista = new ListaSimple();
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
                if (!"".equals(info)) {
                    String[] aux = info.split("\n");
                    for (int i = 0; i < aux.length; i++) {
                        lista.InsertarEnd(aux[i]);
                    }
                    
                }
                br.close();
                JOptionPane.showMessageDialog(null, "ÉXITO AL LEER! ");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ÉRROR AL LEER! ");
        }
        
        return lista;
    }
    
}
