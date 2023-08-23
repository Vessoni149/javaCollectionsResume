package EjemplosColecciones.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEj {
    public static void main(String[] args) {

        //Crear
        HashMap<Integer, String> mapaEj = new HashMap<>();
        int dni = 54643135;
        String nombre = "Juan";

        //Añadir:
        //A dif. de las colecciones que usan add() los mapas usan put(K,V).
        mapaEj.put(dni,nombre);
        mapaEj.put(654864,"Pedro");
        //Si agregara un objeto con la misma clave, se reemplaaría.

        //Obtener :
        //get(key) de HashMap devuelve el valor de la calve especificada.
        //Map.Entry, que se verá más abajo tiene los métodos getKey() y getValue() para acceder a la calve y al valor respectivamente
        // y se aplican a cada "entrada".

        //Recorrer:
        System.out.println("recorrido con bucle for:");
        //Usando un bucle foreach sobre las claves.
        for (Integer key : mapaEj.keySet()) {
            String value = mapaEj.get(key);     //Este metodo recibe una llave y retorna el valor al que le corresponde.
            System.out.println("DNI: " + key + ", Nombre: " + value);
        }



        System.out.println("-----------------------------");
        // Usando un iterador sobre las entradas con entryMap().
        // Map.Entry: Es una interfaz anidada dentro de la interfaz Map, no es una I independiente, está definida dentro de Map.
        // Representa una entrada (clave-valor) en un mapa. Literalmente es una entrada a cada elemento del Map.
        // Cada instancia de Map.Entry contiene una clave y su valor asociado. La interfaz Map.Entry define tres métodos:
        //getKey(): Devuelve la clave de la entrada.
        //getValue(): Devuelve el valor asociado con la clave.
        //setValue(V): reemplaza un valor.
        //También tiene equals() y hashCode().
        //Por su parte entrySet no es de Map.Entry sino de Map:
        //entrySet(): Este método es parte de la interfaz Map y devuelve un conjunto de objetos Map.Entry. Cada objeto Map.Entry en el
        //conjunto representa una entrada única (clave-valor) en el mapa. El conjunto de Map.Entry te permite iterar a través de las
        // entradas del mapa y acceder a las claves y valores de cada entrada.
        System.out.println("Recorrido con Map.Entry:");
        for (Map.Entry<Integer, String> entry : mapaEj.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("DNI: " + key + ", Nombre: " + value);
        }

        //También se puede usar el método entrySet() que devuelve un Set y usar Iterator.

        //Síntesis de recorrido:
        //Cuando recorres un Map utilizando un bucle for común, generalmente iteras a través de las claves del mapa utilizando el método
        // keySet() y luego obtienes los valores asociados a esas claves utilizando el método get(key).
        //Por otro lado, al utilizar Map.Entry, obtienes directamente las entradas completas (clave-valor) del mapa como objetos
        // Map.Entry, lo que te permite acceder a las claves y valores de cada entrada directamente utilizando los métodos getKey() y
        // getValue().
        //La ventaja de utilizar Map.Entry es que te permite acceder a las claves y valores de cada entrada en una sola línea de
        // código, y no necesitas realizar una llamada adicional al método get() para obtener el valor correspondiente.
        //En general, si solo necesitas acceder a los valores del mapa, usar un bucle for común con keySet() y get() es suficiente.
        // Sin embargo, si deseas trabajar directamente con las entradas completas (clave-valor) y necesitas ambas partes, Map.Entry
        // te proporciona una forma más eficiente y conveniente de hacerlo.

        //Eliminar:
        //para eliminar elementos tenemos los métodos clear() y remove(K) al igual que las colecciones.
        System.out.println("-----------------------------");
        System.out.println("Modificar y recorrer modificado:");

        //Modificar:
        //Ni HashSet ni Map tienen un metodo para editar un valor.
        // Lo que se puede hacer es usar add() con una clave ya existente para sobreescrivir el valor.
        // Por otro lado Map.Entry sí tiene un metodo para editar.
        //El metodo entrada.setValue(V) modifica el valor de la entrada, manteniendo la misma key.
        //Pero para especificar qué valor vamos a modificar debemos usar un iterador:
        //Como entrySet() devuelve un Set, y Set tiene el metodo iterator() podemos usar el método de
        // Iterator next() para señalar un elemento.
        Map.Entry<Integer, String> entry = mapaEj.entrySet().iterator().next();
        entry.setValue("Updated Value");
        //mostramos el valor actualizado:
        System.out.println("Valor actualizado: " + entry.getValue());
        //recorremos  el map para ver sus elementos con el modificado:
        for (Map.Entry<Integer, String> entry2 : mapaEj.entrySet()) {
            int key = entry2.getKey();
            String value = entry2.getValue();
            System.out.println("DNI: " + key + ", Nombre: " + value);
        }


    }
}
