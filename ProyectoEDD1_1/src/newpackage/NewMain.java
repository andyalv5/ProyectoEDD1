/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.swing.JOptionPane;
import org.graphstream.graph.Graph;

/**
 *
 * @author andynet
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funciones func = new Funciones();
        
        ListaVertex mylistsimp = func.Leer_matrix("test//lista.txt");
        ListaSimple mylistVer = func.Leer_txt("test//lista.txt",mylistsimp);
        MatrixGraph matrix = new MatrixGraph(mylistsimp,mylistVer,mylistVer.getSize());
        
        Graph grafico = matrix.MotrarGraph();
        
        matrix.CrearNodes(grafico);
        matrix.CrearEdges(grafico);
    }
    
}