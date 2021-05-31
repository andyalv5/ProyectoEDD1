package newpackage;

import java.io.BufferedReader;
import java.io.File;
import javax.swing.JOptionPane;
import java.io.FileReader;

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
    
    public ListaSimple Leer_txt(String path,ListaVertex listaVer){
        ListaSimple lista = new ListaSimple();
        String line;
        String info = "";
        File file = new File(path);
        
        try{
            if (!file.exists()) {
                file.createNewFile();
            }   
            else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                br.readLine();
                while((line = br.readLine())!=null ){
                    if (line.endsWith("Rutas;")){
                        while((line = br.readLine())!=null ){
                            if (!line.isEmpty()) {
                                info += line +"\n";
                            }
                        }
                        break;
                    }
                }     
                if (!"".equals(info)){
                    String[] infos = info.split("\n");
                    for(int i = 0;i< infos.length;i++){
                        String[] infod = infos[i].split(",");
                        
                        Nodoweight mynod = new Nodoweight(infod[0],infod[1],Integer.parseInt(infod[2]));
                        lista.addAtEnd(mynod);    
                    }
                }
                
                br.close();
            } 
        }
                
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ÉRROR AL LEER! ");
        }
        
        return lista;
    }
    
    
    public ListaVertex Leer_matrix(String path){
        ListaVertex lista = new ListaVertex();
        String line;
        String infotd = "";
        
        File file = new File(path);
        
        try{
            if (!file.exists()) {
                file.createNewFile();
                JOptionPane.showMessageDialog(null,"Por favor introduzca al menos un Almacen con artículos al inicializar","No existe archivo",JOptionPane.WARNING_MESSAGE);
            }   
            else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                br.readLine();
                while((line = br.readLine())!=null && !line.endsWith("Rutas;")){
                    
                    infotd += line.replaceAll("Almacen ","") +"\n";         
                }
                
                if(!"".equals(infotd)){
                    String[] infos = infotd.split(";");
                    for(int i = 0;i< infos.length -1;i++){
                        String newel = infos[i];
                        String[]newell = newel.split(":");
                        String miAlmacen = newell[0].replaceAll("\n","");
                        newell[1] = newell[1].stripLeading();
                        String otros = newell[1].replace("\n",",");
                        String[] low = otros.split(",");
                        Lista_productos listprod =new Lista_productos();
                        
                        
                        for(int j = 0;j< low.length-1;j++){
                            int k=j;
                            int m =j+1;
                            Nodo_productos nod =new Nodo_productos(low[k],Integer.parseInt(low[m]));
                            j=j+1;
                            listprod.addAtEnd(nod);
                        }
                        Vertex vers =new Vertex(miAlmacen,listprod);
                        lista.addAtEnd(vers);
                    }
                }
                br.close();
                JOptionPane.showMessageDialog(null, "Exito al leer");
                
            } 
        }
                
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ÉRROR AL LEER! ");
        }
        return lista; 
    }
    
    
    
    
}
