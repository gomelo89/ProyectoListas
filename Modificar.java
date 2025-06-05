
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Modificar {

    public LinkedList<Estudiante_Ingenieria> modificarIngenieria(LinkedList<Estudiante_Ingenieria> Gestor_Prestamo,
            LinkedList<Computador_Portatil> ListaCP) {
                 if (Gestor_Prestamo.isEmpty() || ListaCP.isEmpty()) {
                    JOptionPane.showMessageDialog(null, 
                    "No se han registrado préstamos para estudiantes de ingenieria.", 
                    "Sin préstamos", 
                  JOptionPane.WARNING_MESSAGE);
                  return Gestor_Prestamo;
                 }

        Computador_Portatil nuevoComputador = new Computador_Portatil();
        RegistrarComputadorPortatil registrar = new RegistrarComputadorPortatil();
        String cedulaSerial = JOptionPane.showInputDialog("Ingrese la cédula o serial:");

        for (Estudiante_Ingenieria estudiante : Gestor_Prestamo) {
            if (estudiante.getCedula().equals(cedulaSerial)
                    || estudiante.getComputador_Portatil().getSerial().equals(cedulaSerial)) {

                registrar.RegistroComputador(ListaCP);

                nuevoComputador = ListaCP.removeFirst();

                estudiante.setComputador_Portatil(nuevoComputador);

                JOptionPane.showMessageDialog(null, "Datos del computador actualizados correctamente.");
                Gestor_Prestamo.add(estudiante);
                break;
            }
        }

        return Gestor_Prestamo;
    }

    public LinkedList<Estudiante_Diseño> modificarDiseño(LinkedList<Estudiante_Diseño> Gestor_PrestamoD,
            LinkedList<Tableta_Grafica> ListaTG) {
                if (Gestor_PrestamoD.isEmpty() || ListaTG.isEmpty()) {
                    JOptionPane.showMessageDialog(null, 
                    "No se han registrado préstamos para estudiantes de Diseño.", 
                    "Sin préstamos", 
                  JOptionPane.WARNING_MESSAGE);
                  return Gestor_PrestamoD;
                 }


        Tableta_Grafica nuevaTableta = new Tableta_Grafica();
        RegistroTabletaGrafica register = new RegistroTabletaGrafica();
        String cedulaSerial = JOptionPane.showInputDialog("Ingrese la cedula o serial: ");

        for (Estudiante_Diseño estudiante : Gestor_PrestamoD) {
            if (estudiante.getCedula().equals(cedulaSerial)
                    || estudiante.getTableta_Grafica().getSerial().equals(cedulaSerial)) {
                register.registroTabletaGrafica(ListaTG);
                nuevaTableta = ListaTG.removeFirst();
                estudiante.setTableta_Grafica(nuevaTableta);
                JOptionPane.showMessageDialog(null, "Datos de la tableta actualizados correctamente.");
                Gestor_PrestamoD.add(estudiante);
                break;
            }
        }
        return Gestor_PrestamoD;
    }

}
