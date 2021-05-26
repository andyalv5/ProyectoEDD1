package organizedchaos;

import org.graphstream.graph.Graph;

public class OrganizedChaos {

    public static void main(String[] args) {
        
        Funciones fc = new Funciones();
        
        String prueba = fc.Leer_txt("test\\Archivo.txt");
        Grafo jajaja = new Grafo();
        jajaja = fc.ExtraerVertices(prueba, jajaja);
        jajaja = fc.ExtraerArcos(prueba, jajaja);
        jajaja.setNumVertices(jajaja.getVertices().getSize());
        jajaja.setMatrizAdyacencia(jajaja.LlenarMatriz());
        jajaja.LlenarAdyacencia();
        
        jajaja.MostrarInfoGrafo();
        
        /*String[][] aux = new String[5][5];
        
        
        for (int i = 0; i < aux.length; i++) 
        {
            for (int j = 0; j < aux.length; j++)
            {
                aux[i][j] = "0";
            }
  
        }
        
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux.length; j++) {//no se que coño te pasa 
                System.out.print(" | " + aux[i][j] + " | ");  
            }
            System.out.println();
            
        }*/
        
        //Graph grafico = jajaja.MotrarGraph();
        
        //jajaja.CrearNodes(grafico);
        //jajaja.CrearEdges(grafico);
        
        
        /*Interfaz ventana = new Interfaz();
        
        ventana.setVisible(true);*/
    }
    
}
