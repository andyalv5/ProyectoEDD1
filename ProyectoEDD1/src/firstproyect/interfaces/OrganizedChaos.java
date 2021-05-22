package firstproyect.interfaces;

import firstproyect.interfaces.ListaSimple;
import firstproyect.interfaces.Funciones;

public class OrganizedChaos {

    public static void main(String[] args) {
        
        Funciones fc = new Funciones();
        
        ListaSimple prueba = fc.Leer_txt("test\\Archivo.txt");
        
        System.out.println(prueba.printList());
        /*Interfaz ventana = new Interfaz();
        
        ventana.setVisible(true);*/
    }
    
}
