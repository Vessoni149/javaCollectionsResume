package EjemplosColecciones.Set.TreeSet;

import static java.lang.Integer.parseInt;
//Esta clase al momento de implementar la I comparable debe seguidamente y entre <> especificar el tipo con el cual la clase
// es comparable, para este caso va a ser consigo misma.
public class ClienteTreeSet implements Comparable<ClienteTreeSet>{

    public ClienteTreeSet(String nombre, String n_cuenta, double saldo){
        this.nombre = nombre;
        this.n_cuenta = n_cuenta;
        this.saldo= saldo;
    }
    private String nombre;
    private String n_cuenta;
    private double saldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(String n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public int compareTo(ClienteTreeSet o) {
        int i = parseInt(n_cuenta) - parseInt(o.n_cuenta);
        return i;
    }
}
