import javax.swing.JOptionPane;

public class Estudiante_Diseño {

    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String Modalidad_Estudio;
    private int Cantidad_Asignaturas;
    private Tableta_Grafica Tableta_Grafica;

    public Estudiante_Diseño(String cedula, String nombre, String apellido, String telefono, String modalidad_Estudio, int cantidad_Asignaturas) {
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
        Modalidad_Estudio = modalidad_Estudio;
        Cantidad_Asignaturas = cantidad_Asignaturas;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {

        do {

            if (!cedula.matches("^[0-9\\s]*$")) {
                JOptionPane.showMessageDialog(null, "La cedula no permite letras ni caracteres especiales,", "Error",JOptionPane.ERROR_MESSAGE);
                cedula = JOptionPane.showInputDialog(null, "Cedula:");
            }
        } while (!cedula.matches("^[0-9\\s]*$"));

        Cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {

        do{
            
            if(!nombre.matches("^[a-zA-Z\\s]*$")){
            JOptionPane.showMessageDialog(null,"El nombre no permite Numeros ni caracteres especiales,","Error",JOptionPane.ERROR_MESSAGE);
            nombre = JOptionPane.showInputDialog(null, "Nombre:");
        }
        }while(!nombre.matches("^[a-zA-Z\\s]*$"));
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {

        do{
            
            if(!apellido.matches("^[a-zA-Z\\s]*$")){
            JOptionPane.showMessageDialog(null,"El apellido no permite Numeros ni caracteres especiales,","Error",JOptionPane.ERROR_MESSAGE);
            apellido = JOptionPane.showInputDialog(null, "Apellido:");
        }
        }while(!apellido.matches("^[a-zA-Z\\s]*$"));

        Apellido = apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {

        do{

            if(!telefono.matches("^[0-9\\s]*$")){
            JOptionPane.showMessageDialog(null,"El telefono no permite letras ni caracteres especiales,","Error",JOptionPane.ERROR_MESSAGE);
            telefono = JOptionPane.showInputDialog(null, "Telefono:");
            }
            }while(!telefono.matches("^[0-9\\s]*$"));
        Telefono = telefono;
    }

    public String getModalidad_Estudio() {
        return Modalidad_Estudio;
    }

    public void setModalidad_Estudio(String modalidad_Estudio) {
        Modalidad_Estudio = modalidad_Estudio;
    }

    public int getCantidad_Asignaturas() {
        return Cantidad_Asignaturas;
    }

    public void setCantidad_Asignaturas(int cantidad_Asignaturas) {
        Cantidad_Asignaturas = cantidad_Asignaturas;
    }

    public Tableta_Grafica getTableta_Grafica() {
        return Tableta_Grafica;
    }

    public void setTableta_Grafica(Tableta_Grafica tableta_Grafica) {
        Tableta_Grafica = tableta_Grafica;
    }

}
