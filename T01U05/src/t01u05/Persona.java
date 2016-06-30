
package t01u05;

/**
 *
 * @author enrique
 */
public class Persona {
    private String nif;
    private String nombre;

    public Persona() {
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nif=" + nif + ", nombre=" + nombre + '}';
    }
}
