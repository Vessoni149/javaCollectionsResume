package EjemplosColecciones.Set.TreeSet;
//Esta clase simulará ser externa y no implementaremos la I comparable.
//No hay nada raro, solo 3 atributos con sus getter y setters y los 2 constructores.
public class ClaseDeTercero {
    private String nombre;
    private String Apellido;
    private int dni;

    public ClaseDeTercero() {

    }
    public ClaseDeTercero(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        Apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
