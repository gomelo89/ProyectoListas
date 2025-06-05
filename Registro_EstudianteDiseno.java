
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Registro_EstudianteDiseno {

    public LinkedList<Estudiante_Diseño> registroEstudianteDiseno(LinkedList<Estudiante_Diseño> ListaED) {
        int opcionModalidad = 0, cant_asignatura = 0;
        
        Estudiante_Diseño ED = new Estudiante_Diseño(null, null, null, null, null, 0);
        JOptionPane.showMessageDialog(null, "Datos del estudiante");
        ED.setCedula(JOptionPane.showInputDialog(null, "Ingrese la cedula: "));
        ED.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre: "));
        ED.setApellido(JOptionPane.showInputDialog(null, "Ingrese el apellido: "));
        ED.setTelefono(JOptionPane.showInputDialog(null, "Ingrese el telefono: "));
        ED.setModalidad_Estudio(modalidadEstudio(opcionModalidad));
        ED.setCantidad_Asignaturas(cantidadAsignaturas(cant_asignatura));
        ListaED.add(ED);
        return ListaED;
    }

    public String modalidadEstudio(int opcionModalidad) {
        String entrada = "";

        do{ 
            String Menu = "MENU\n"
                    + "1.Presencial \n"
                    + "En caso de no ser presencial, se le asigna virtual\n";

            entrada = JOptionPane.showInputDialog(Menu);
                if (entrada == null) {
                JOptionPane.showMessageDialog(null, "cancelado.");
                return null;
            }
             if (!entrada.matches("[1-2]")) {
                JOptionPane.showMessageDialog(null,
                        "Ingrese solo el número 1 o 2, sin letras ni caracteres especiales.",
                        "Entrada inválida", JOptionPane.ERROR_MESSAGE);
                continue;
             }
        
        opcionModalidad = Integer.parseInt(entrada);

            switch (opcionModalidad) {
                case 1:
                    return "Presencial";
                case 2:
                    return "Virtual";
                default:
                    JOptionPane.showMessageDialog(null,
                            "Opción inválida. Ingrese 1 o 2.",
                            "Error", JOptionPane.ERROR_MESSAGE);
            }

     } while (true);
        
    }

    public int cantidadAsignaturas(int cant_asignatura) {
        int actual=0;
       
        do {
            String asignatura = JOptionPane.showInputDialog("Cantidad Asignatura");
            try {
                 actual = Integer.parseInt(asignatura);
                if (actual <=0) {
                    JOptionPane.showMessageDialog(null, "Almenos debes estar viendo una asignatura", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    cant_asignatura = actual;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "No se permiten letras ni caracteres especiales", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } while (actual <= 0);

        return cant_asignatura;
    }

}
