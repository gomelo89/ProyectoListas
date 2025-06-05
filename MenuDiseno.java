import java.util.LinkedList;
import javax.swing.JOptionPane;

public class MenuDiseno {
    LinkedList<Estudiante_Diseño> Gestor_PrestamoDIS = new LinkedList<>();

    public void menuDis() {

        int continuar;
        int opcion;

        Registro_EstudianteDiseno RD = new Registro_EstudianteDiseno();
        RegistroTabletaGrafica RTG = new RegistroTabletaGrafica();
        GestionPrestamo GP = new GestionPrestamo();
        ExportarEstudiantesDiseno EXD = new ExportarEstudiantesDiseno();
        Buscar Bus = new Buscar();
        Modificar MD = new Modificar();
        EliminarRegistro ER = new EliminarRegistro();
        MenuPrincipal MP = new MenuPrincipal();

        LinkedList<Estudiante_Diseño> ListaED = new LinkedList<>();
        LinkedList<Tableta_Grafica> ListaTG = new LinkedList<>();
        
        opcion = 0;
        do {
            String menu = "Menu\n"
                    + "1.Registrar prestamo de equipo\n"
                    + "2.Modificar prestamo de equipo\n"
                    + "3.Devolucion de equipo\n"
                    + "4.Buscar equipo por serial o cedula\n"
                    + "5.Exportar Registro\n"
                    + "6.Mostrar archivo\n"
                    + "0.Salir";

             String entrada = JOptionPane.showInputDialog(menu);

            if (entrada == null) {
               break;
             }

            if (!entrada.matches("[0-6]")) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido entre 0 y 6, sin letras ni caracteres especiales.", "Entrada inválida",
                JOptionPane.ERROR_MESSAGE);
                continue;
            }
            opcion = Integer.parseInt(entrada);
            switch (opcion) {
                case 1:
                    continuar = JOptionPane.showConfirmDialog(null, "Desea registrar un nuevo estudiante", "Mensaje",
                            JOptionPane.YES_NO_OPTION);
                    if (continuar == JOptionPane.YES_OPTION) {
                        do {

                            RD.registroEstudianteDiseno(ListaED);

                            RTG.registroTabletaGrafica(ListaTG);

                            continuar = JOptionPane.showConfirmDialog(null, "Desea registrar un nuevo estudiante",
                                    "Mensaje", JOptionPane.YES_NO_OPTION);
                        } while (continuar == JOptionPane.YES_OPTION);
                    } else {
                        JOptionPane.showMessageDialog(null, "Volviendo al menu principal");
                    }
                    GP.prestamoDiseño(ListaED, ListaTG, Gestor_PrestamoDIS);
                    break;
                case 2:
                    MD.modificarDiseño(Gestor_PrestamoDIS, ListaTG);
                    break;
                case 3:
                    ER.eliminarRegistroDiseño(ListaED, ListaTG, Gestor_PrestamoDIS);
                    break;
                case 4:
                Bus.buscarEstudianteDiseño(ListaED);
                    break;
                case 5:
                    EXD.exportarEstudiantesDiseno(Gestor_PrestamoDIS);
                    break;
                case 6:
                    GP.mostrarEstudianteDis(Gestor_PrestamoDIS);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Volviendo al menu principal");
                    MP.menuPrincipal();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
                    break;
            }
        } while (opcion != 0);
    }
}
