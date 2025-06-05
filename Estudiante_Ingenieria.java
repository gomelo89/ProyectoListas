
import javax.swing.JOptionPane;
public class Estudiante_Ingenieria {
    
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private int Num_Semestre_Cursado;
    private float Promedio_acumulado;
    private Computador_Portatil Computador_Portatil;
   
    

    public Estudiante_Ingenieria(String cedula, String nombre, String apellido, String telefono,
            int num_Semestre_Cursado, float promedio_acumulado) {
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
        Num_Semestre_Cursado = num_Semestre_Cursado;
        Promedio_acumulado = promedio_acumulado;
        
    }

    public Estudiante_Ingenieria() {
    }

    public String getCedula() {
        
        return Cedula;
    }

    public void setCedula(String cedula) {

       do{

        if(!cedula.matches("^[0-9\\s]*$")){
        JOptionPane.showMessageDialog(null,"La cedula no permite letras ni caracteres especiales,","Error",JOptionPane.ERROR_MESSAGE);
        cedula = JOptionPane.showInputDialog(null, "Cedula:");
        }
        }while(!cedula.matches("^[0-9\\s]*$"));

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

    public int getNum_Semestre_Cursado() {
        return Num_Semestre_Cursado;
    }

    public void setNum_Semestre_Cursado(int num_Semestre_Cursado) {

            Num_Semestre_Cursado = num_Semestre_Cursado;
        }

    public float getPromedio_acumulado() {
        return Promedio_acumulado;
    }

    public void setPromedio_acumulado(float promedio_acumulado) {

        do{

            if(promedio_acumulado < 0 || promedio_acumulado>6 ){
            JOptionPane.showMessageDialog(null,"El promedio no es negativo o mayor que 5,","Error",JOptionPane.ERROR_MESSAGE);
            promedio_acumulado = Float.parseFloat(JOptionPane.showInputDialog(null, "Promedio:"));
            }
            }while(promedio_acumulado < 0 || promedio_acumulado>6);

        Promedio_acumulado = promedio_acumulado;


    }

    public Computador_Portatil getComputador_Portatil() {
        return Computador_Portatil;
    }

    public void setComputador_Portatil(Computador_Portatil computador_Portatil) {
        Computador_Portatil = computador_Portatil;
    }

}
