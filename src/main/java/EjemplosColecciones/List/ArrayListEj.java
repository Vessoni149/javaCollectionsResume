package EjemplosColecciones.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
//Para ejemplificar las Listas usaremos la Clase ArrayList, pero los métodos que veremos son los mismos que para LinkedList, lo
//mismo para recorrerlas. En los ejemplos usaremos como elementos internos de la lista objetos String, ya que como las listas
//permiten duplicados no importa si los objetos son creados por nosotros o de java. No hay que validar que los objetos que creemos
//sean iguales.
public class ArrayListEj {
    public static void main(String[] args) {
        //crear ArrayList con objetos de java:
        ArrayList<String> arrListString = new ArrayList();

        //Insertar:
        arrListString.add("removido");
        arrListString.add("hola");
        arrListString.add("array");
        arrListString.add("list");
        arrListString.add("hola");
        arrListString.add("hola");
        arrListString.add("hola");
        arrListString.add("asdf");
        //También se le puede poner 2 argumentos a add (index,element) para agregar en determinado lugar.
        arrListString.add(5,"chau");

        //Eliminar: remove() puede recibir el índice o el elemento, si recibe un elemento elimina la primer aparición.
        arrListString.remove(0);
        arrListString.remove("hola");

        //Modificar:
        arrListString.set(6,"modificado");  //como primero se eliminó, el indice 6 será donde se encuenta "asdf" en la L 16.

        //Leer:
        System.out.println(arrListString.get(2));
        System.out.println(arrListString.get(6));
        System.out.println("-------");

        //Recorrer:
        //Se pueden recorrer con bucles while, for, foreach y además con Iterator() y ListIterator().
        for(String cadena : arrListString){
            System.out.println(cadena);
        }

        System.out.println("-----------------");
        System.out.println("recorriendo con Iterator");
        //Iterator sirve para eliminar elementos MIENTRAS recorremos las colecciones
        Iterator<String> iterator = arrListString.iterator();
        /*while (iterator.hasNext()) {
            iterator.next();    //Salta al siguiente elemento
            iterator.remove();  //borra el elemento saltado
            System.out.println(arrListString);
        }*/
        //En este ej podemos ver cómo va eliminando desde el primer elemento en cada iteración.
        //Si no queremos que se borren todos los elementos podemos usar otro bucle y combinarlo con condicionales.

        System.out.println("recorriendo con ListIterator");
        //ListIterator
        //para ver este ejemplo comentar el bucle while anterior, de lo contrario se eliminarán todos los elementos.
        ListIterator<String> listIterator = arrListString.listIterator();
        System.out.println("dentro del bucle vemos como se va seteando uno por uno:");
        while (listIterator.hasNext()) {
            listIterator.next();
            listIterator.set("seteado");
            System.out.println(arrListString);
        }
        System.out.println("fuera del bucle vemos el arreglo todo modificado:");
        System.out.println(arrListString);
    }
}
