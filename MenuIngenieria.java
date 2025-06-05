import java.util.LinkedList;

import javax.swing.JOptionPane;

public class MenuIngenieria {
     LinkedList<Estudiante_Ingenieria> Gestor_PrestamoING = new LinkedList<>();

    public void menuIng() {

        int continuar;
        int opcion;

        Registro_EstudiantesIngenieria RE = new Registro_EstudiantesIngenieria();
        RegistrarComputadorPortatil RCP = new RegistrarComputadorPortatil();
        GestionPrestamo gp = new GestionPrestamo();
        ExportarEstudiantesIngenieria IE = new ExportarEstudiantesIngenieria();
        Buscar Bus = new Buscar();
        Modificar MD = new Modificar();
        EliminarRegistro ER = new EliminarRegistro();
        MenuPrincipal MP = new MenuPrincipal();

        LinkedList<Estudiante_Ingenieria> ListaEI = new LinkedList<>();
        LinkedList<Computador_Portatil> ListaCP = new LinkedList<>();
       
        opcion = 0;
        do {

            String menu = "Menú\n"
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

                            RE.Registro_Est_Ingenieria(ListaEI);

                            RCP.RegistroComputador(ListaCP);

                            continuar = JOptionPane.showConfirmDialog(null, "Desea registrar un nuevo estudiante",
                                    "Mensaje", JOptionPane.YES_NO_OPTION);
                        } while (continuar == JOptionPane.YES_OPTION);
                    } else {
                        JOptionPane.showMessageDialog(null, "Volviendo al menu principal");
                    }
                    gp.prestamoIngenieria(ListaEI, ListaCP, Gestor_PrestamoING);
                    break;
                case 2:
                    MD.modificarIngenieria(Gestor_PrestamoING, ListaCP);
                    break;
                case 3:
                    ER.eliminarRegistroIngenieria(ListaEI, ListaCP, Gestor_PrestamoING);
                    break;
                case 4:
                    Bus.buscarEstudianteIngenieria(ListaEI);
                    break;
                case 5:
                    IE.exportarEstudiantesIngenieria(Gestor_PrestamoING);
                    break;
                case 6:
                    gp.mostrarEstudianteIng(Gestor_PrestamoING);
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
