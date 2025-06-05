
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class RegistroTabletaGrafica {

    public LinkedList<Tableta_Grafica> registroTabletaGrafica (LinkedList<Tableta_Grafica> ListaTG){
        int opcionDi = 0;
        float tamano = 0, precio = 0, peso = 0;
            Tableta_Grafica tb = new Tableta_Grafica(null, null, 0, 0, null, 0);
            JOptionPane.showMessageDialog(null, "Datos de la tableta");
            tb.setSerial(JOptionPane.showInputDialog(null, "Ingrese el serial de la tableta: "));
            tb.setMarca(JOptionPane.showInputDialog(null, "Ingrese la marca de la tableta: "));
            tb.setTamano(tamaño(tamano));
            tb.setPrecio(precioT(precio));
            tb.setAlmacenamiento(menuAlmacenamiento(opcionDi));
            tb.setPeso(pesoT(peso));
            ListaTG.add(tb);
        return ListaTG;
    }

    public String menuAlmacenamiento(int opcionDi){
        
        String menu = "MENU\n" 
        + "1. 256 GB\n"
        + "2. 512 GB\n"
        + "3. 1 TB\n"
        + "Ingrese la opcion deseada\n";

        opcionDi = Integer.parseInt(JOptionPane.showInputDialog(menu));

        switch (opcionDi) {
            case 1:
                return "256 GB";
            case 2:
                return "512 GB";
            case 3:
                return "1 TB";
            default:
                JOptionPane.showMessageDialog(null, "Opcion Invalida. Se le asignara 256 GB por defecto");
                return "256 GB";
        }
    }

    public float tamaño(float tamano) {
        float actual=0;
       
        do {
            String tam_pulgadas = JOptionPane.showInputDialog("Tamaño en pulgadas");
            try {

                 actual = Integer.parseInt(tam_pulgadas);

                 if(actual<1){
                    JOptionPane.showMessageDialog(null, "El tamaño debe ser mayor que cero", "Error",
                    JOptionPane.ERROR_MESSAGE);
                 }else{
                    tamano=actual;
                 }
                
                                   
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "No se permiten letras ni caracteres especiales", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (actual<1);

        return tamano;
    }

    public float precioT(float precio) {
        float actual=0;
       
        do {
            String dolares = JOptionPane.showInputDialog("Precio en dolares");
            try {

                 actual = Float.parseFloat(dolares);

                 if(actual<1){
                    JOptionPane.showMessageDialog(null, "El precio debe ser mayor que cero", "Error",
                    JOptionPane.ERROR_MESSAGE);
                 }else{
                    precio=actual;
                 }
                                                   
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "No se permiten letras ni caracteres especiales", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (actual<1);

        return precio;
    }

    public float pesoT(float peso) {
        float actual=0;
       
        do {
            String kilogramo = JOptionPane.showInputDialog("peso en kilogramos");
            try {

                 actual = Float.parseFloat(kilogramo);

                 if(actual <= 0){
                    JOptionPane.showMessageDialog(null, "El peso debe ser mayor que cero", "Error",
                    JOptionPane.ERROR_MESSAGE);
                 }else{
                    peso=actual;
                 }
                                                   
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "No se permiten letras ni caracteres especiales", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (actual<1);

        return peso;
    }
}
