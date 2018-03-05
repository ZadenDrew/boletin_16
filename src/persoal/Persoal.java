package persoal;

/**
 *
 * @author andrea
 */
public class Persoal {

    int telefono;
    String correo;

    public Persoal() {
    }

    public Persoal(int telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persoal{" + "telefono =" + telefono + ", correo =" + correo + '}';
    }
    
    
}
