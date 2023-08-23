package EjemplosColecciones.Set.TreeSet;
import java.util.TreeSet;
public class TreeSetEj {
    public static void main(String[] args) {
        System.out.println("TreeSet con objetos de tipo String:");
        //Creando TreeSet que contendrá objetos que vienen con Java:
        TreeSet<String> treeSetString = new TreeSet<>();
        treeSetString.add("asd");
        treeSetString.add("hola");
        treeSetString.add("mundo");
        treeSetString.add("asd");
        for (String setS : treeSetString){
            System.out.println(setS);
        }
        //Podemos ver que filtra los repetidos ya que los objetos java implementan la I Comparable que tiene el método
        // compareTo(), que además de ordenar los elementos, filtra los repetidos.

        System.out.println("TreeSet con objetos de clases creadas por nosotros:");
        //Para poder crear un TreeSet de objetos instanciados a partir de una clase creada por mí, esa clase si o si necesita implementar
        // la I Comparable, si no se lanzará un error "classCastException".
        //Al implementarla deberemos sobreescribir el método compareTo(), si bine el editor nos da la plantilla nosotros debemos
        //especificar la lógica comparativa según el atributo de la clase que queramos comparar.

        //Creamos un TreeSet que contendrá objetos de una clase creada por nosotros:
        TreeSet<ClienteTreeSet> treeSetClientes = new TreeSet<ClienteTreeSet>();
        ClienteTreeSet cliente1 = new ClienteTreeSet("Roman","54684",5488);
        ClienteTreeSet cliente2 = new ClienteTreeSet("Roman","7894",5488);
        ClienteTreeSet cliente3 = new ClienteTreeSet("Roman","54684",5488);
        ClienteTreeSet cliente4 = new ClienteTreeSet("Roman","54684",5488);
        treeSetClientes.add(cliente1);
        treeSetClientes.add(cliente2);
        treeSetClientes.add(cliente3);
        treeSetClientes.add(cliente4);
        System.out.println(treeSetClientes.size());
//Veremos que solo contiene 2 valores el treeSetClientes, ya que se filtraron 2 por tener el mismo número de cuenta.

        System.out.println("TreeSet de objetos creados a partir de la clase de un tercero en la que no podemos implementar la I comparable");

        //Tenemos que crear una instancia de la clase comparadora, ya que ésta irá como parámetro en el constructor de TreeSet
        // cuando lo creemos aquí abajo.
        ClaseComparadora claseComparadora = new ClaseComparadora();
        //Creamos el TreeSet que contendrá <ClaseDeTercero> y que en su constructor tendrá a la instancia de la ClaseComparadora
        // "claseComparadora".
        TreeSet<ClaseDeTercero> treeSetConObjetosDeClasesExternas = new TreeSet<ClaseDeTercero>(claseComparadora);
        ClaseDeTercero obj1 = new ClaseDeTercero("Agustin","Vessoni",39485648);
        ClaseDeTercero obj2 = new ClaseDeTercero("Agustin","Vessoni",5646);
        ClaseDeTercero obj3 = new ClaseDeTercero("Carlos","Carloso",45135487);
        treeSetConObjetosDeClasesExternas.add(obj1);
        treeSetConObjetosDeClasesExternas.add(obj2);
        treeSetConObjetosDeClasesExternas.add(obj3);
        System.out.println(treeSetConObjetosDeClasesExternas.size());
        //Recorrer:
       //Como en todas als colecciones, se puede usar Iterator() para recorrerse o algún bucle:
        for(ClaseDeTercero claseTercero : treeSetConObjetosDeClasesExternas){   //recorrerá treeSetConObjetosDeClasesExternas
            //que contendrá objetos de tipo ClaseDeTercero, donde cada unos de estos objetos estará representado por
            //"claseTercero".
            System.out.println(claseTercero.getApellido());
        }
        //como se compara por apellido, mostrará que el TreeSet tiene un tamaño de 2.



        //Para eliminar elementos, como todas las clases que implementan Collection tenemos los métodos clear() y remove().
        //No tiene métodos para modificar elementos.
        //Tiene varios métodos para retornar su contenido.
    }

}
