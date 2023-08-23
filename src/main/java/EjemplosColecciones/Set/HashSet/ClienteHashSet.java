package EjemplosColecciones.Set.HashSet;

import java.util.Objects;

public class ClienteHashSet {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteHashSet that = (ClienteHashSet) o;
        return Double.compare(that.saldo, saldo) == 0 && Objects.equals(n_cuenta, that.n_cuenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(n_cuenta, saldo);
    }

    public ClienteHashSet(String nombre, String n_cuenta, double saldo){
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
}
