package EjemplosColecciones.Set.HashSet;
import java.util.*;
//Como la I Set no debería permitir elementos repetidos veremos cómo validar ésto (usando métodos hashSet() y Equals())

//Índice:
//agregar elementos a:
//hashset con objetos java y recorrer elementos
//hashset con objetos de clases propias
//hashset con objetos de clases externas
//eliminar elementos
public class HashSetEj {
    public static void main(String[] args) {

        //HASHSET:
        //agregar elementos:
        System.out.println("Agregando objetos java:");
        String oracion1 = "hola mundo";
        String oracion2 = "hola mundo";

        Set<String> oraciones = new java.util.HashSet<String>();

        oraciones.add(oracion1);
        oraciones.add(oracion2);//Solo se agregará el primero, ya que al ser un Objeto de tipo String de java, el metodo add() puede detectar duplicidad
        //usando hashcode() y equals().
        //Como la clase String ya tiene los metodos equals y hashcode no necesito hacer nada para evitar repetidos.

        //Recorrer elementos:
        //Se puede recorrer con bucles y además puede usar el metodo iterator() ya que implementa la I Iterator.
        for (String oracion: oraciones){
            System.out.println(oracion);
        }


        System.out.println("----------------------------------------------");
        System.out.println("Agregando mis objetos:");
        //Instancio los objetos que agregaré:
        ClienteHashSet cl1 = new ClienteHashSet("Antonio", "00001", 200000);
        ClienteHashSet cl2 = new ClienteHashSet("Rafael", "00002", 250000);
        ClienteHashSet cl3 = new ClienteHashSet("Penelope", "00003", 300000);
        ClienteHashSet cl4 = new ClienteHashSet("Julio", "00004", 500000);
        ClienteHashSet cl5 = new ClienteHashSet("Julio", "00004", 500000); //creo 2 objetos iguales.

        Set<ClienteHashSet> clientesBanco = new java.util.HashSet<ClienteHashSet>();    //creo el HashSet de objetos creados en base a una clase mía.
        //agrego mis objetos al HashSet:
        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);
        clientesBanco.add(cl5); //agrego 2 objetos con el mismo contenido. Pero al momento de ser agregado no se va a detectar como igual y se va a poder
        //agregar, ya que la sobreescritura de los métodos hashcode() y equals() en la clase Cliente está comentada.
        //Si descomentamos esos métodos veremos que no agrega repetidos.

        for (ClienteHashSet cliente: clientesBanco) {
            System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo());
        }

        System.out.println("------------------------------");
        System.out.println("Agregando objetos de un tercero:");

        HashSet<ClaseWrapper> hashSet = new HashSet<>();
        //Hay que crear una clase Wraper que tenga los metodos hashcode y equals y su constructor reciba por parametro un objeto del tipo de la clase que queremos meter
        //al hashset. Luego instanciamos un objeto de ésta última y posteriormente instanciamos un objeto de la clase wraper que recibirá por parametro la instancia de
        //la clase que queremos meter al hashset.
        //Finalmente metemos al hashset esa clase wraper.
        ClaseDeUn3ro instance1 = new ClaseDeUn3ro("Juan", "12345", 1000.0);
        ClaseWrapper wrapper1 = new ClaseWrapper(instance1);

        ClaseDeUn3ro instance2 = new ClaseDeUn3ro("Maria", "54321", 2000.0);
        ClaseWrapper wrapper2 = new ClaseWrapper(instance2);

        hashSet.add(wrapper1);
        hashSet.add(wrapper2);

        System.out.println(hashSet.size()); // Debería ser 2, ya que los wrappers son distintos
        //si ponemos 2 wraper1 veremos que retorna 1.

        //Para eliminar elementos, como todas las clases que implementan Collection tenemos los métodos clear() y remove().

        //No tiene metodos para modificar elementos.
    }
}
