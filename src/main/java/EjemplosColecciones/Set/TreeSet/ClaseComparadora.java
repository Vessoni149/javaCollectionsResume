package EjemplosColecciones.Set.TreeSet;

import java.util.Comparator;
//Esta clase comparadora implementa Comparator y entre <> debe ir la clase que va a comparar, en este ej. compararemos
// ClaseDeTercero que simula ser una clase que no podemos modificar y por ende no podemos implementrar la I Comparable.
//Deberemos sobreescribir el metodo compare() y establecer la logica de comparación que queramos.
public class ClaseComparadora implements Comparator<ClaseDeTercero>{


//Compararemos según el apellido:
    @Override
    public int compare(ClaseDeTercero o3, ClaseDeTercero o4) {
        String apellido1 = o3.getApellido();
        String apellido2 = o4.getApellido();
        return apellido1.compareTo(apellido2);  //acá se está usando el compareTo() de las Strings, que ordena alfabéticamente.
    }

}
