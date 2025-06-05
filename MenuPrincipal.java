import javax.swing.JOptionPane;
public class MenuPrincipal {

    public void menuPrincipal(){
        int opcion;
        
        MenuIngenieria MI = new MenuIngenieria();
        MenuDiseno MD = new MenuDiseno();        
        MostrarInventario mostrar = new MostrarInventario();

        opcion = 0;
        do {
            String menu = "Menú\n"
                    + "1.Estudiantes de Ingeniera\n"
                    + "2.Estudiantes de Diseño\n"
                    + "3. Mostrar Inventario\n"
                    + "4. salir\n";

            
            String entrada = JOptionPane.showInputDialog(menu);

            if (entrada == null) {
               break;
             }

            if (!entrada.matches("[1-4]")) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido entre 1 y 4, sin letras ni caracteres especiales.", "Entrada inválida",
                JOptionPane.ERROR_MESSAGE);
                continue;
            }
            opcion = Integer.parseInt(entrada);

                switch (opcion) {
                    case 1:
                        MI.menuIng();
                        break;
                    case 2:
                        MD.menuDis();
                        break;
                    case 3:
                        mostrar.mostrarInventario(MI.Gestor_PrestamoING, 
                        MD.Gestor_PrestamoDIS);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Hasta luego");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
                        break;
                }
        } while (opcion !=4);
    }
}
