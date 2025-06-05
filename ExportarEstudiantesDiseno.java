
import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import javax.swing.JOptionPane;
public class ExportarEstudiantesDiseno {

    public void exportarEstudiantesDiseno(LinkedList<Estudiante_Diseño> Gestor_PrestamoD){
        
        LinkedList<Estudiante_Diseño> Exportar = Gestor_PrestamoD;

        try {
            File archivo = new File("Estudiantes.txt");
            boolean exits = archivo.exists();
            FileWriter exportar = new FileWriter(archivo,!exits);

            for (Estudiante_Diseño estudianteDiseno : Exportar) {
                exportar.write("Datos del estudiante\n");
                exportar.write("Cedula" + " : " + estudianteDiseno.getCedula() + "\n");
                exportar.write("Nombre" + " : " + estudianteDiseno.getNombre() + "\n");
                exportar.write("Apellido" + " : " + estudianteDiseno.getApellido() + "\n");
                exportar.write("Telefono" + " : " + estudianteDiseno.getTelefono() + "\n");
                exportar.write("Modalidad de estudio" + " : " + estudianteDiseno.getModalidad_Estudio() + "\n");
                exportar.write("Cantidad de asignaturas que esta viendo" + " : " + estudianteDiseno.getCantidad_Asignaturas() + "\n");
                exportar.write("Datos de la tableta grafica\n");
                exportar.write("Serial" + " : " + estudianteDiseno.getTableta_Grafica().getSerial() + "\n");
                exportar.write("Marca" + " : " + estudianteDiseno.getTableta_Grafica().getMarca() + "\n");
                exportar.write("Tamaño" + " : " + estudianteDiseno.getTableta_Grafica().getTamano() + "\n");
                exportar.write("Precio" + " : " + estudianteDiseno.getTableta_Grafica().getPrecio() + "\n");
                exportar.write("Almacenamiento" + " : " + estudianteDiseno.getTableta_Grafica().getAlmacenamiento() + "\n");
                exportar.write("Peso" + " : " + estudianteDiseno.getTableta_Grafica().getPeso() + "\n");
            }
            exportar.close();
            JOptionPane.showMessageDialog(null,"Datos Exportados correctamente","Exportar", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al exportar los datos" + e.getMessage()+ " ","Exportar", 0);
        }
    }

}
