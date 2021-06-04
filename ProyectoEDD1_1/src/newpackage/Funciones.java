package newpackage;

import java.io.BufferedReader;
import java.io.File;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.PrintWriter;

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
    
       
    
    public void writeTxt(ListaVertex vertex, ListaSimple listsimp){
        String txt = "";
        String txt2 ="";
        
        if(!vertex.IsEmpty()){
            Vertex temp= vertex.getpFirst();
            
            for(int i = 0;i< vertex.getSize()-1;i++){
                txt +="Almacen "+ temp.getName() + ":"+"\n";
                Lista_productos lispro=temp.getListaver();
                Nodo_productos mynod= lispro.getPrimer_producto();
                for(int j = 0;j< lispro.getSize()-1;j++){
                    txt += mynod.getNombre() +","+mynod.getCantidad()+"\n";
                    mynod = mynod.getProximo();
                }
                txt +=mynod.getNombre() +","+mynod.getCantidad()+";"+"\n";
                temp =temp.getSiguiente();
            }  
        }
        
        if(!listsimp.IsEmpty()){
            Nodoweight temp1= listsimp.getpFirst();
            for(int z =0;z< listsimp.getSize()-1;z++){
                txt2 +=temp1.getVertex1()+","+temp1.getVertex2()+","+temp1.getWeight()+"\n";
                temp1 =temp1.getpNext();
            }  
        }
        
        try{
            PrintWriter pw = new PrintWriter("test//lista.txt");
            pw.print("Almacenes; Esta Linea se salta automaticamente"+"\n");
            pw.append(txt);
            pw.print("Rutas;"+"\n");
            pw.append(txt2);
            pw.close();
            JOptionPane.showMessageDialog(null, "Guardado Exitoso.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Fallo En Cargar Datos.");
        }

    } 
    
    
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
                
            } 
        }
                
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR AL LEER! ");
        }
        return lista; 
    }
    
    
    public MatrixGraph ExtraerArcos(String info, MatrixGraph gf)
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
    
    
    
        
        
        
            
            
