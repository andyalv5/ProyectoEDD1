/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author andy
 */
public class Recorrido {
    /*
    public String ReporteAlmacenBFS(MatrixGraph matrix, ListaVertex lisver,String origen)//ANCHURA usar cola
    {
        Cola cola = new Cola();
        String reporte = "Reporte de almacenes por Ancho:\n";
        //INICIA DESDE EL ALMACEN DE MENOR ID
        Vertex pTemp = matrix.getVertices().getpFirst();
        ColaProceso vertice;
        pTemp.setVisitado(true);
        cola.Encolar(pTemp);
        int counter =0;
    
        while(counter !=20){
            vertice = cola.getCimaCola();
            cola.Eliminar();
            reporte +="Almacen: "+vertice.getElement().getName()+"/n";
            reporte += vertice.getElement().getListaver().returnInlistProducts();
            String segundo=matrix.getPeso().ReturnFE(vertice.getElement().getName());
            String primero=matrix.getPeso().ReturnSE(vertice.getElement().getName());
            String joint= primero +segundo;
            String[] jointvar = joint.split(",");
            
            counter ++;
            }
        
        }  
    }
*/
    public String ReporteAlmacenDFS(MatrixGraph matrix, ListaVertex lisver)//PROFUNDIDAD usar pila
    {
        //INICIA DESDE EL ALMACEN DE MENOR ID
        Pila pila = new Pila();
        String reporte = "<html><b>Tipo de Recorrido DFS (Depth-first search)-Busqueda en profundidad:</b><html>"+"\n";
        //INICIA DESDE EL ALMACEN DE MENOR ID
        Vertex pTemp = matrix.getVertices().getpFirst();
        Vertex vertice;
        pTemp.setVisitado(true);
        pila.Apilar(pTemp);
        while(!pila.IsEmpty())
        {
            vertice =pila.Desapilar();
            reporte +="Almacen: "+vertice.getName()+"\n";
            reporte += vertice.getListaver().returnInlistProducts();
            reporte += "\n";
            String segundo=matrix.getPeso().ReturnFE(vertice.getName());
            String primero=matrix.getPeso().ReturnSE(vertice.getName());
            String joint= primero +segundo;
            String[] jointvar = joint.split(",");
            for(int i =0; i<jointvar.length;i++){
                String st =jointvar[i];
                Vertex temporal=matrix.getVertices().BuscarVertex(st);
                if(!temporal.isVisitado()){
                    temporal.setVisitado(true);
                    pila.Apilar(temporal);
                }
            }
        }
        return reporte;
    }

    
    public void SetTrueDFS(MatrixGraph matrix, ListaVertex lisver)//PROFUNDIDAD usar pila
    {
        //INICIA DESDE EL ALMACEN DE MENOR ID
        Pila pila = new Pila();
        Vertex pTemp = matrix.getVertices().getpFirst();
        Vertex vertice;
        pTemp.setVisitado(true);
        pila.Apilar(pTemp);
        while(!pila.IsEmpty())
        {
            vertice =pila.Desapilar();
            String segundo=matrix.getPeso().ReturnFE(vertice.getName());
            String primero=matrix.getPeso().ReturnSE(vertice.getName());
            String joint= primero +segundo;
            String[] jointvar = joint.split(",");
            for(int i =0; i<jointvar.length;i++){
                String st =jointvar[i];
                Vertex temporal=matrix.getVertices().BuscarVertex(st);
                if(!temporal.isVisitado()){
                    temporal.setVisitado(true);
                    pila.Apilar(temporal);
                }
            }
        }
    }
        
    public String ReporteAlmacenBFS(MatrixGraph matrix, ListaVertex lisver)//ANCHURA usar cola
    {
        Cola cola = new Cola();
        String reporte = "<html><b>Tipo de Recorrido BFS (Breadth-first search)-Busqueda en Anchura:</b><html>"+"\n";
        JLabel label=new JLabel(reporte);
        label.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        //INICIA DESDE EL ALMACEN DE MENOR ID
        Vertex pTemp = matrix.getVertices().getpFirst();
        Vertex vertice;
        pTemp.setVisitado(true);
        cola.insertar(pTemp);
    
        while(!cola.colaVacia()){
            vertice = cola.desencolar().getElemento();
            
            reporte +="Almacen: "+vertice.getName()+"\n";
            reporte += vertice.getListaver().returnInlistProducts();
            reporte += "\n";
            String segundo=matrix.getPeso().ReturnFE(vertice.getName());
            String primero=matrix.getPeso().ReturnSE(vertice.getName());
            String joint= primero +segundo;
            String[] jointvar = joint.split(",");
            for(int i =0; i<jointvar.length;i++){
                String st =jointvar[i];
                Vertex temporal=matrix.getVertices().BuscarVertex(st);
                if(!temporal.isVisitado()){
                    temporal.setVisitado(true);
                    cola.insertar(temporal);
                }
            }
        }
        
        
        return reporte; 
    }
    
    public void SetTrueBFS(MatrixGraph matrix, ListaVertex lisver)//ANCHURA usar cola
    {
        Cola cola = new Cola();
        
        Vertex pTemp = matrix.getVertices().getpFirst();
        Vertex vertice;
        pTemp.setVisitado(true);
        cola.insertar(pTemp);
    
        while(!cola.colaVacia()){
            vertice = cola.desencolar().getElemento();
            
            
            String segundo=matrix.getPeso().ReturnFE(vertice.getName());
            String primero=matrix.getPeso().ReturnSE(vertice.getName());
            String joint= primero +segundo;
            String[] jointvar = joint.split(",");
            for(int i =0; i<jointvar.length;i++){
                String st =jointvar[i];
                Vertex temporal=matrix.getVertices().BuscarVertex(st);
                if(temporal.isVisitado()){
                    temporal.setVisitado(false);
                    cola.insertar(temporal);
                }
            }
        }
    }
    
  
    public String algoritmoFloyd(MatrixGraph matrix,ListaVertex lisver){
        int n= lisver.getSize();
        int[][]P =new int[n][n];
        String Caminos= "";
        String caminazos="";
        int temp1,temp2,temp3,temp4,minimo;
        for (int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                P[i][j]= matrix.adyacentebynum(i,j);
                JOptionPane.showMessageDialog(null,matrix.adyacentebynum(i,j));
            }
        
        }
        for(int k=0;k<n;k++){
            for(int x=0;x<n;x++){
                for(int j=0;j<n;j++){
                    temp1= P[x][j];
                    temp2= P[x][k];
                    temp3=P[k][j];
                    temp4=temp2+temp3;
                    minimo=Math.min(temp1,temp4);
                    P[x][j]= minimo;
                }
            }
        }
        for(int y=0;y<n;y++){
            for(int z=0;z<n;z++){
                Caminos=Caminos+="|"+P[y][z]+"|"+"\n";
            }
        }
        for(int f=0;f<n;f++){
            for(int g=0;g<n;g++){
                if(f!=g){
                    if(P[f][g]!=0){
                        caminazos+= "Del Almacen "+(f+1)+"---->"+" Al Almacen "+ (g+1)+"\n";
                        caminazos+="Se recorrera de la siguiente manera: "+"\n";
                        caminazos+="Almacen "+ (f+1)+"---->"+" Al Almacen "+ (g+1)+"\n";
                        caminazos+="\n";
                        caminazos+="\n";
                    }
                    else{
                        caminazos+= "Del Almacen "+(f+1)+"---->"+" Al Almacen "+ (g+1)+"\n";
                        caminazos+="Se recorrera de la siguiente manera: "+"\n";
                        
                        caminazos+="Almacen "+ (f+1)+"---->"+" Al Almacen "+ P[f][g]+" ----> Al Almacen "+ (g+1);
                        caminazos+="\n";
                        caminazos+="\n";
                    }
                    
                }
            }
        }
        JOptionPane.showMessageDialog(null, Caminos);
        JOptionPane.showMessageDialog(null, caminazos);
        return caminazos;
    }
}
