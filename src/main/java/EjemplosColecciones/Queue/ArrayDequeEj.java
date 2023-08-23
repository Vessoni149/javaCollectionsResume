package EjemplosColecciones.Queue;

import java.util.ArrayDeque;

public class ArrayDequeEj {
    public static void main(String[] args) {

        ArrayDeque<String> colaString = new ArrayDeque<>();
        //Como en todas las Collections se usa add().
        colaString.add("Hola");
        colaString.add("colas");
        colaString.add("Hola");
        for (String e : colaString){
            System.out.println(e);
        }
        //También tiene los métodos addFirst() y addLast() para encolar delante y detrás.
        //Puede ser iterada con iterator().
        //Para eliminar tiene remove(), removeFirst() y removeLast(). También clear() para borrar todos.
        //No hay método para reemplazar un elemento específico. Si se quiere modificar un elemento
        // específico se lo debería transformar a un ArrayList como una opción.
        //Para obtener elementos tiene getFirst(), getLast() y element() que devuelve la cabeza de la cola.



    }

}
