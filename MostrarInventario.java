import java.util.LinkedList;

import javax.swing.JOptionPane;

public class MostrarInventario {
    GestionPrestamo gestion = new GestionPrestamo();

    public void mostrarInventario(
        LinkedList<Estudiante_Ingenieria> prestamoIngenieria,
        LinkedList<Estudiante_Diseño> prestamoDiseno
    ) {
        if (prestamoDiseno.isEmpty() && prestamoIngenieria.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay préstamos registrados todavía.", "Inventario Vacío", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder detalle = new StringBuilder("==== INVENTARIO COMPLETO ====\n\n");

        if (!prestamoIngenieria.isEmpty()) {
            detalle.append(">>> Estudiantes de Ingeniería <<<\n\n");
            for (Estudiante_Ingenieria est : prestamoIngenieria) {
                detalle.append("Nombre: ").append(est.getNombre()).append(" ").append(est.getApellido()).append("\n");
                detalle.append("Cédula: ").append(est.getCedula()).append("\n");
                detalle.append("Computador: ").append(est.getComputador_Portatil().getMarca()).append(" - ").append(est.getComputador_Portatil().getSerial()).append("\n\n");
            }
        }

        if (!prestamoDiseno.isEmpty()) {
            detalle.append(">>> Estudiantes de Diseño <<<\n\n");
            for (Estudiante_Diseño est : prestamoDiseno) {
                detalle.append("Nombre: ").append(est.getNombre()).append(" ").append(est.getApellido()).append("\n");
                detalle.append("Cédula: ").append(est.getCedula()).append("\n");
                detalle.append("Tableta: ").append(est.getTableta_Grafica().getMarca()).append(" - ").append(est.getTableta_Grafica().getSerial()).append("\n\n");
            }
        }

        JOptionPane.showMessageDialog(null, detalle.toString(), "Inventario de Préstamos", JOptionPane.INFORMATION_MESSAGE);
    }
}
