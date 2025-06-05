import java.util.LinkedList;

import javax.swing.JOptionPane;

public class EliminarRegistro {

    public LinkedList<Estudiante_Ingenieria> eliminarRegistroIngenieria(LinkedList<Estudiante_Ingenieria> ListaEI,
            LinkedList<Computador_Portatil> ListaCP, LinkedList<Estudiante_Ingenieria> Gestor_Prestamo) {
        String cedulaOSerial = JOptionPane.showInputDialog("Ingrese la cédula o serial:");

        for (Estudiante_Ingenieria estudiante : ListaEI) {
            if (estudiante.getCedula().equals(cedulaOSerial)
                    || estudiante.getComputador_Portatil().getSerial().equals(cedulaOSerial)) {
                ListaEI.remove(estudiante);
                ListaCP.remove(estudiante.getComputador_Portatil());
                Gestor_Prestamo.remove(estudiante);
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
                break;
            }
        }
        return Gestor_Prestamo;
    }

    public LinkedList<Estudiante_Diseño> eliminarRegistroDiseño(LinkedList<Estudiante_Diseño> ListaED, LinkedList<Tableta_Grafica> ListaTG, LinkedList<Estudiante_Diseño> Gestor_PrestamoD){
        String cedulaOSerial = JOptionPane.showInputDialog("Ingrese la cedula o serial: ");

        for (Estudiante_Diseño estudiante : ListaED) {
            if (estudiante.getCedula().equals(cedulaOSerial) || estudiante.getTableta_Grafica().getSerial().equals(cedulaOSerial)) {
                ListaED.remove(estudiante);
                ListaTG.remove(estudiante.getTableta_Grafica());
                Gestor_PrestamoD.remove(estudiante);
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
                break;
            }
        }
        return Gestor_PrestamoD;
    }
}
