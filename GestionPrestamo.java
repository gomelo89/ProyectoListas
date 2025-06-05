
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class GestionPrestamo {

    public LinkedList<Estudiante_Ingenieria> prestamoIngenieria(LinkedList<Estudiante_Ingenieria> ListaEI,
            LinkedList<Computador_Portatil> ListaCP, LinkedList<Estudiante_Ingenieria> Gestor_PrestamoI) {


        LinkedList<Estudiante_Ingenieria> Listem = ListaEI;
    
        for (Estudiante_Ingenieria estudiante : Listem) {
            
            Computador_Portatil CP = ListaCP.removeFirst();
            estudiante.setComputador_Portatil(CP);
            Gestor_PrestamoI.add(estudiante);

        }
    
        return Gestor_PrestamoI;
    }

    public void mostrarEstudianteIng(LinkedList<Estudiante_Ingenieria> Gestor_PrestamoI) {
         if (Gestor_PrestamoI.isEmpty()) {
            JOptionPane.showMessageDialog(null, 
                "No se han registrado préstamos para estudiantes de Ingenieria.", 
                "Sin préstamos", 
            JOptionPane.WARNING_MESSAGE);
            return;
        }

        StringBuilder detalle = new StringBuilder();

        for (Estudiante_Ingenieria estudiante : Gestor_PrestamoI) {
            detalle.append("Estudiante Ingenieria:\n");
            detalle.append("Cedula: ").append(estudiante.getCedula()).append("\n");
            detalle.append("Nombre: ").append(estudiante.getNombre()).append("\n");
            detalle.append("Apellido: ").append(estudiante.getApellido()).append("\n");
            detalle.append("Telefono: ").append(estudiante.getTelefono()).append("\n");
            detalle.append("Número de semestre cursado: ").append(estudiante.getNum_Semestre_Cursado()).append("\n");
            detalle.append("Promedio acumulado: ").append(estudiante.getPromedio_acumulado()).append("\n");
            detalle.append("Detalle del computador:\n");
            detalle.append("Serial: ").append(estudiante.getComputador_Portatil().getSerial()).append("\n");
            detalle.append("Marca: ").append(estudiante.getComputador_Portatil().getMarca()).append("\n");
            detalle.append("Tamaño: ").append(estudiante.getComputador_Portatil().getTamano()).append("\n");
            detalle.append("Precio: ").append(estudiante.getComputador_Portatil().getPrecio()).append("\n");
            detalle.append("Sistema Operativo: ").append(estudiante.getComputador_Portatil().getSistema_Operativo()).append("\n");
            detalle.append("Procesador: ").append(estudiante.getComputador_Portatil().getProcesador()).append("\n");
            detalle.append("\n");
        }
        JOptionPane.showMessageDialog(null, detalle.toString(), "Estudiante Ingeniera",
                    JOptionPane.INFORMATION_MESSAGE);
    }

    public LinkedList<Estudiante_Diseño> prestamoDiseño(LinkedList<Estudiante_Diseño> ListaED,
            LinkedList<Tableta_Grafica> ListaTG,
            LinkedList<Estudiante_Diseño> Gestor_PrestamoD){
            
            LinkedList<Estudiante_Diseño> ListaTemp = ListaED;

            for (Estudiante_Diseño estudiante : ListaTemp) {
                if (!ListaTG.isEmpty()) {
                Tableta_Grafica TabletaG = ListaTG.removeFirst();
                estudiante.setTableta_Grafica(TabletaG);
                Gestor_PrestamoD.add(estudiante);
                } else {
                     JOptionPane.showMessageDialog(null, 
                     "No hay más tabletas gráficas disponibles para préstamo.", 
                     "Error", 
                     JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }
            return Gestor_PrestamoD;
    }

    public void mostrarEstudianteDis(LinkedList<Estudiante_Diseño> Gestor_PrestamoD){

        if (Gestor_PrestamoD.isEmpty()) {
            JOptionPane.showMessageDialog(null, 
                "No se han registrado préstamos para estudiantes de diseño.", 
                "Sin préstamos", 
            JOptionPane.WARNING_MESSAGE);
            return;
        }
        StringBuilder detalle = new StringBuilder();

        for (Estudiante_Diseño estudiante : Gestor_PrestamoD) {
            detalle.append("Estudiante Diseño:\n");
            detalle.append("Cedula: ").append(estudiante.getCedula()).append("\n");
            detalle.append("Nombre: ").append(estudiante.getNombre()).append("\n");
            detalle.append("Apellido: ").append(estudiante.getApellido()).append("\n");
            detalle.append("Telefono: ").append(estudiante.getTelefono()).append("\n");
            detalle.append("Modalidad de estudio: ").append(estudiante.getModalidad_Estudio()).append("\n");
            detalle.append("Cantidad de asignaturas: ").append(estudiante.getCantidad_Asignaturas()).append("\n");
            detalle.append("Detalle de la tableta grafica:\n");
            detalle.append("Serial: ").append(estudiante.getTableta_Grafica().getSerial()).append("\n");
            detalle.append("Marca: ").append(estudiante.getTableta_Grafica().getMarca()).append("\n");
            detalle.append("Tamaño: ").append(estudiante.getTableta_Grafica().getTamano()).append("\n");
            detalle.append("Precio: ").append(estudiante.getTableta_Grafica().getPrecio()).append("\n");
            detalle.append("Almacenamiento: ").append(estudiante.getTableta_Grafica().getAlmacenamiento()).append("\n");
            detalle.append("Peso: ").append(estudiante.getTableta_Grafica().getPeso()).append("\n");
            detalle.append("\n");
        }
        JOptionPane.showMessageDialog(null, detalle.toString(), "Estudiante Diseño",
                    JOptionPane.INFORMATION_MESSAGE);
    }

}
