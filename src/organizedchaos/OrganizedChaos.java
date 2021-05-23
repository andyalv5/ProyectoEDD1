package organizedchaos;

public class OrganizedChaos {

    public static void main(String[] args) {
        
        Funciones fc = new Funciones();
        
        String prueba = fc.Leer_txt("test\\Archivo.txt");
        
        System.out.println(prueba);
        
        ListaSimple lista = fc.ExtraerVertices(prueba);
        
        System.out.println(lista.printList());
        /*Interfaz ventana = new Interfaz();
        
        ventana.setVisible(true);*/
    }
    
}
