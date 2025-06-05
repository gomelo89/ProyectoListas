
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Registro_EstudiantesIngenieria {

    public LinkedList<Estudiante_Ingenieria> Registro_Est_Ingenieria(LinkedList<Estudiante_Ingenieria> ListaEI) {

        int semestre=0;
        float promedio=0;

        Estudiante_Ingenieria EI = new Estudiante_Ingenieria(null, null, null, null, 0, 0);

        JOptionPane.showMessageDialog(null, "Datos del estudiante");
            EI.setCedula(JOptionPane.showInputDialog("Cedula"));
            EI.setNombre(JOptionPane.showInputDialog("Nombre"));
            EI.setApellido(JOptionPane.showInputDialog("Apellido"));
            EI.setTelefono(JOptionPane.showInputDialog("Telefono"));
            EI.setNum_Semestre_Cursado(SemestreActual(semestre));
            EI.setPromedio_acumulado(promedioI(promedio));

            ListaEI.add(EI);
        
        return ListaEI;
    }

    public int SemestreActual(int semeActual) {
        int actual=0;
       
        do {
            String semestre = JOptionPane.showInputDialog("Semestre actual");
            try {
                 actual = Integer.parseInt(semestre);
                if (actual <=0 || actual >=11) {
                    JOptionPane.showMessageDialog(null, "El número debe estar en el rango del 1 al 10", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    semeActual = actual;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "No se permiten letras ni caracteres especiales", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } while (actual <= 0 || actual >= 11);

        return semeActual;
    }

    public float promedioI(float promedio) {
        float actual=0;
        boolean valida = false;
       
        do {
            String prom_acumulado = JOptionPane.showInputDialog("Promedio acumulado");
            try {
                 actual = Float.parseFloat(prom_acumulado);
                if (actual <=-1 || actual >=6) {
                    JOptionPane.showMessageDialog(null, "El promedio debe ser un numero mayor a ", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    promedio = actual;
                    valida = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "No se permiten letras ni caracteres especiales", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } while (!valida);

        return promedio;
    }
}
