import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class ExportarEstudiantesIngenieria {
    
    public void exportarEstudiantesIngenieria(LinkedList<Estudiante_Ingenieria> Gestor_Prestamo) {
   
        LinkedList<Estudiante_Ingenieria>Exportar= Gestor_Prestamo;
        try {
            File archivo = new File("Estudiantes.txt");
            boolean exits = archivo.exists();
            FileWriter exportar = new FileWriter(archivo,!exits);

            for (Estudiante_Ingenieria estudiante :Exportar) {
                exportar.write("Datos del estudiante\n");
                exportar.write("Cedula" + " : " + estudiante.getCedula() + "\n");
                exportar.write("Nombre" + " : " + estudiante.getNombre()+ "\n");
                exportar.write("Apellido" + " : " + estudiante.getApellido()+"\n");
                exportar.write("Telefono" + " : " + estudiante.getTelefono()+ "\n");
                exportar.write("Numero de semestre cursado" +" : " + estudiante.getNum_Semestre_Cursado()+"\n");
                exportar.write("Promedio acumulado" +" : " + estudiante.getPromedio_acumulado()+"\n");
                exportar.write("Numero de semestre cursado" +" : " + estudiante.getPromedio_acumulado()+"\n");
                exportar.write("Datos del computador\n");
                exportar.write("Serial" + " : " + estudiante.getComputador_Portatil().getSerial() + "\n");
                exportar.write("Marca" + " : " + estudiante.getComputador_Portatil().getMarca() + "\n");
                exportar.write("Tamaño" + " : " + estudiante.getComputador_Portatil().getTamano() + "\n");
                exportar.write("Precio" + " : " + estudiante.getComputador_Portatil().getPrecio() + "\n");
                exportar.write("Sistema Operativo" + " : " + estudiante.getComputador_Portatil().getSistema_Operativo() + "\n");
                exportar.write("Procesador" + " : " + estudiante.getComputador_Portatil().getProcesador() + "\n");
                exportar.write("\n\n");
            }
            exportar.close();
            JOptionPane.showMessageDialog(null,"Datos Exportados correctamente","Exportar", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al exportar los datos" + e.getMessage()+ " ","Exportar", 0);
        }
    }
}

    
