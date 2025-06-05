import javax.swing.JOptionPane;

public class Tableta_Grafica {

    private String Serial;
    private String Marca;
    private float Tamano;
    private float Precio;
    private String Almacenamiento;// Pendiente se puede colocar String o int
    private float Peso;

    public Tableta_Grafica(){ 
    }

    public Tableta_Grafica(String serial, String marca, float tamano, float precio, String almacenamiento, float peso) {
        Serial = serial;
        Marca = marca;
        Tamano = tamano;
        Precio = precio;
        Almacenamiento = almacenamiento;
        Peso = peso;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {

        do {

            if (!serial.matches("^[0-9a-zA-Z\\s]*$")) {
                JOptionPane.showMessageDialog(null, "El serial no permite caracteres especiales,", "Error", JOptionPane.ERROR_MESSAGE);
                serial = JOptionPane.showInputDialog(null, "Serial:");
            }
        } while (!serial.matches("^[0-9a-zA-Z\\s]*$"));
        Serial = serial;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {

        do {

            if (!marca.matches("^[a-zA-Z\\s]*$")) {
                JOptionPane.showMessageDialog(null, "La marca no permite Numeros ni caracteres especiales,", "Error", JOptionPane.ERROR_MESSAGE);
                marca = JOptionPane.showInputDialog(null, "Marca:");
            }
        } while (!marca.matches("^[a-zA-Z\\s]*$"));
        Marca = marca;
    }

    public float getTamano() {
        return Tamano;
    }

    public void setTamano(float tamano) {
        Tamano = tamano;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }

    public String getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        Almacenamiento = almacenamiento;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float peso) {
        Peso = peso;
    }

}