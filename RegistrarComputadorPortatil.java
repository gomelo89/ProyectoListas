import java.util.LinkedList;

import javax.swing.JOptionPane;

public class RegistrarComputadorPortatil {

public LinkedList<Computador_Portatil> RegistroComputador(LinkedList<Computador_Portatil> ListaCP) {

    int opcionSO=0,opcionP=0;
    float tamaño=0,precio=0;
        Computador_Portatil pc = new Computador_Portatil(null, null, 0, 0, null, null);
        JOptionPane.showMessageDialog(null,"Datos del computador");
        pc.setSerial(JOptionPane.showInputDialog("Ingresa el serial del computador"));
        pc.setMarca(JOptionPane.showInputDialog("Ingresa la marca del computador"));
        pc.setTamano(tamaño(tamaño));
        pc.setPrecio(precio(precio));  
        pc.setSistema_Operativo(SistemaOperativo(opcionSO));
        pc.setProcesador(Procesador(opcionP));

        ListaCP.add(pc);
              
    return ListaCP;
}

    public String SistemaOperativo(int opcion) {

        String Menu = "MENU\n" + "1. Windows 7.\n" + "2. Windows 10.\n" + "3. Windows 11.\n"
                + "Ingrese la opcion deseada\n";

        opcion = Integer.parseInt(JOptionPane.showInputDialog(Menu));

        switch (opcion) {
            case 1:
               return "Windows 7";
              
            case 2:
               return  "Windows 10";
               
            case 3:
               return "Windows 11";
                
            default:
                JOptionPane.showMessageDialog(null, "Opcion Invalidad. Se le asignara Windows 10 por defecto");
                return "Windows 10";
        }
    }

    public String Procesador(int opcionP){

        String Menu = "MENU\n" + "1.AMD Ryzen. \n" + "2.Intel® Core™ i5.\n"+ "Ingrese la opcion deseada\n";

        opcionP = Integer.parseInt(JOptionPane.showInputDialog(Menu));

        switch (opcionP) {
            case 1:
               return "AMD Ryzen";
              
            case 2:
               return  "Intel® Core™ i5";
    
            default:
                JOptionPane.showMessageDialog(null, "Opcion Invalidad. Se le asignara AMD Ryzen por defecto");
                return "AMD Ryzen";
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

        public float precio(float precio) {
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
    }    

