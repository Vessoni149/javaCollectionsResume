package EjemplosColecciones.Set.HashSet;

public class ClaseWrapper {
    //Creamos un atributo privado llamado wrappedInstance que representa la instancia de la clase ClaseDeUn3ro que queremos envolver.
    private ClaseDeUn3ro wrappedInstance;

    //El constructor ClaseDeUn3roWrapper toma una instancia de ClaseDeUn3ro como parámetro y la asigna al atributo wrappedInstance
    public ClaseWrapper(ClaseDeUn3ro instance) {
        this.wrappedInstance = instance;
    }

    //getWrappedInstance(): Este método permite obtener la instancia envuelta. En caso de que necesitemos acceder a la instancia original, podemos utilizar este método.
    public ClaseDeUn3ro getWrappedInstance() {
        return wrappedInstance;
    }

    @Override
    public int hashCode() {
        return wrappedInstance.getN_cuenta().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClaseWrapper otherWrapper = (ClaseWrapper) obj;
        return wrappedInstance.getN_cuenta().equals(otherWrapper.wrappedInstance.getN_cuenta());
    }
}
