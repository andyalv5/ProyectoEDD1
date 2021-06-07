/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.swing.JOptionPane;

/**
 *
 * @author Ulises
 */
public class Realizar_pedido {
    
    public void Buscar_producto (Vertex lista, String nombre, int cantidad, Productos_pedidos listaPP){
        
        Boolean encontrado = false;
        
        
        
        for (Nodo_productos aux = lista.getListaver().getPrimer_producto(); aux != null; aux = aux.getProximo()) {
            
            if (aux.getNombre().equals(nombre) && cantidad >= aux.getCantidad()){
                
                Nodo_Productos_pedidos auxp = new Nodo_Productos_pedidos(nombre, cantidad);
                aux.setCantidad(aux.getCantidad() - cantidad);
                listaPP.addAtEnd(auxp);
                encontrado = true;
                
            }
        }
            
        if (encontrado == false){
            
            ListaVertex listav = new ListaVertex();
            
            for (Vertex aux2 = listav.getpFirst(); aux2 != null; aux2.getSiguiente()) {
                
                for (Nodo_productos aux3 = aux2.getListaver().getPrimer_producto(); aux3 != null; aux3.getProximo()) {
                    
                    if (aux3.getNombre().equals(nombre) && cantidad >= aux3.getCantidad()){
                        
                        Productos_pedidos listaPP = new Productos_pedidos();
                        Nodo_Productos_pedidos auxp = new Nodo_Productos_pedidos(nombre, cantidad);
                        aux3.setCantidad(aux3.getCantidad() - cantidad);
                        listaPP.addAtEnd(auxp);
                        encontrado = true;
                        
                    }
                    
                }
                
            }
            
            
        }
        
        if (encontrado == false){
            
            JOptionPane.showMessageDialog(null, "El producto que busacaba no existe o no hay la cantidad que usted pide");
            
        }
            
        }
        
    
    
}
