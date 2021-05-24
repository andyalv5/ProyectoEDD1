/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreacionDelGrafo;

//Los comentarios servirán para luego hacer los DocStrings

import javax.swing.JOptionPane;


/**
 *
 * @author andynet
 */
public class MatrixGraph {
    private int totlNodoNum;
    private Nodo [] nodoArray;
    private int [][] adjacent;
    
    //genera una matrix con un tamaño puesto por nosotros
    public MatrixGraph(int num){
        try{
            this.adjacent = new int[num][num]; 
            this.nodoArray = new Nodo[num];
            for(int i=0; i<num;i++){
                for(int j=0;i<num;i++){
                    adjacent[i][j] =0;
                }
            this.totlNodoNum =0;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ha introducido un tipo inválido de dato", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
