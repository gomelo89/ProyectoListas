import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Buscar {
  public void buscarEstudianteDiseño(LinkedList<Estudiante_Diseño> listaEd) {
    if (listaEd.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No hay estudiantes registrados para buscar.", "Información", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    String input;
    while (true) {
        input = JOptionPane.showInputDialog("Ingrese la cédula del estudiante o serial de la tableta:");
        if (input == null) {
            return; 
        }
        if (!input.trim().isEmpty()) {
            break;
        }
        JOptionPane.showMessageDialog(null, "Debe ingresar un valor para buscar.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    boolean encontrado = false;
    StringBuilder resultado = new StringBuilder();

    for (Estudiante_Diseño estudiante : listaEd) {
        if (estudiante.getCedula().equalsIgnoreCase(input) ||
            estudiante.getTableta_Grafica().getSerial().equalsIgnoreCase(input)) {

            resultado.append("Estudiante Diseño:\n");
            resultado.append("Cédula: ").append(estudiante.getCedula()).append("\n");
            resultado.append("Nombre: ").append(estudiante.getNombre()).append("\n");
            resultado.append("Apellido: ").append(estudiante.getApellido()).append("\n");
            resultado.append("Teléfono: ").append(estudiante.getTelefono()).append("\n");
            resultado.append("Modalidad: ").append(estudiante.getModalidad_Estudio()).append("\n");
            resultado.append("Asignaturas: ").append(estudiante.getCantidad_Asignaturas()).append("\n\n");

            resultado.append("Tableta:\n");
            resultado.append("Serial: ").append(estudiante.getTableta_Grafica().getSerial()).append("\n");
            resultado.append("Marca: ").append(estudiante.getTableta_Grafica().getMarca()).append("\n");
            resultado.append("Tamaño: ").append(estudiante.getTableta_Grafica().getTamano()).append("\n");
            resultado.append("Precio: ").append(estudiante.getTableta_Grafica().getPrecio()).append("\n");
            resultado.append("Almacenamiento: ").append(estudiante.getTableta_Grafica().getAlmacenamiento()).append("\n");
            resultado.append("Peso: ").append(estudiante.getTableta_Grafica().getPeso()).append("\n");

            encontrado = true;
            break;
        }
    }

    if (encontrado) {
        JOptionPane.showMessageDialog(null, resultado.toString(), "Resultado de búsqueda", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "No se encontró ningún estudiante o equipo con ese dato.", "Sin resultados", JOptionPane.WARNING_MESSAGE);
    }
}


// ingenieria
public void buscarEstudianteIngenieria(LinkedList<Estudiante_Ingenieria> ListaEI) {
    if (ListaEI.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No hay estudiantes registrados para buscar.", "Información", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    String input;
    while (true) {
        input = JOptionPane.showInputDialog("Ingrese la cédula del estudiante o el serial del computador:");
        if (input == null) {
            return;
        }
        if (!input.trim().isEmpty()) {
            break;
        }
        JOptionPane.showMessageDialog(null, "Debe ingresar un valor para buscar.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    boolean encontrado = false;
    StringBuilder resultado = new StringBuilder();

    for (Estudiante_Ingenieria estudiante : ListaEI) {
        if (estudiante.getCedula().equalsIgnoreCase(input) ||
            estudiante.getComputador_Portatil().getSerial().equalsIgnoreCase(input)) {

            resultado.append("Estudiante Ingeniería:\n");
            resultado.append("Cédula: ").append(estudiante.getCedula()).append("\n");
            resultado.append("Nombre: ").append(estudiante.getNombre()).append("\n");
            resultado.append("Apellido: ").append(estudiante.getApellido()).append("\n");
            resultado.append("Teléfono: ").append(estudiante.getTelefono()).append("\n");
            resultado.append("Semestre: ").append(estudiante.getNum_Semestre_Cursado()).append("\n");
            resultado.append("Promedio: ").append(estudiante.getPromedio_acumulado()).append("\n\n");

            resultado.append("Computador:\n");
            resultado.append("Serial: ").append(estudiante.getComputador_Portatil().getSerial()).append("\n");
            resultado.append("Marca: ").append(estudiante.getComputador_Portatil().getMarca()).append("\n");
            resultado.append("Tamaño: ").append(estudiante.getComputador_Portatil().getTamano()).append("\n");
            resultado.append("Precio: ").append(estudiante.getComputador_Portatil().getPrecio()).append("\n");
            resultado.append("Sistema Operativo: ").append(estudiante.getComputador_Portatil().getSistema_Operativo()).append("\n");
            resultado.append("Procesador: ").append(estudiante.getComputador_Portatil().getProcesador()).append("\n");

            encontrado = true;
            break;
        }
    }

    if (encontrado) {
        JOptionPane.showMessageDialog(null, resultado.toString(), "Resultado de búsqueda", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "No se encontró ningún estudiante o equipo con ese dato.", "Sin resultados", JOptionPane.WARNING_MESSAGE);
    }
}

}
 
