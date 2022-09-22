public class Main {
    /*
     * Declara conjuntos
     */
    ConjuntoADT<Integer> conjuntoADT_1 = new ConjuntoADT();
    ConjuntoADT<Integer> conjuntoADT_2 = new ConjuntoADT();

    /*
     * Agrega elementos
     */
    System.out.println("\nAgrega elementos");
    conjuntoADT_1.agregar(0);
    conjuntoADT_1.agregar(1);
    conjuntoADT_1.agregar(2);
    conjuntoADT_1.agregar(3);
    conjuntoADT_1.agregar(4);
    conjuntoADT_2.agregar(3);
    conjuntoADT_2.agregar(4);
    conjuntoADT_2.agregar(5);
    conjuntoADT_2.agregar(6);
    conjuntoADT_2.agregar(7);
    System.out.println("conjuntoADT_1: " + conjuntoADT_1);
    System.out.println("conjuntoADT_2: " + conjuntoADT_2);

    /*
     * Obtiene el tamaño
     */
    System.out.println("\nTamaños");
    System.out.println("longitud conjuntoADT_1: " + conjuntoADT_1.longitud());
    System.out.println("longitud conjuntoADT_2: " + conjuntoADT_2.longitud());

    /*
     * Verifica si contiene un elemento
     */
    System.out.println("\nContiene");
    System.out.println("conjuntoADT_1 contiene 0: " + conjuntoADT_1.contiene(0));
    System.out.println("conjuntoADT_1 contiene 5: " + conjuntoADT_1.contiene(5));

    /*
     * Elimina un elemento
     */
    System.out.println("\nElimina 0 de conjuntoADT_1");
    conjuntoADT_1.eliminar(0);
    System.out.println(conjuntoADT_1);

    /*
     * Verifica si son iguales
     */
    System.out.println("\nIgualdad");
    System.out.println("conjuntoADT_1 == conjuntoADT_2: " + conjuntoADT_1.igualA(conjuntoADT_2));

    /*
     * Verifica si es subconjunto
     */
    System.out.println("\nSubconjunto");
    System.out.println("conjuntoADT_1 subconjunto conjuntoADT_2: " + conjuntoADT_1.esSubconjunto(conjuntoADT_2));

    /*
     * Union
     */
    System.out.println("\nUnion");
    conjuntoADT_1.union(conjuntoADT_2);
    System.out.println(conjuntoADT_1);

    /*
     * Interseccion
     */
    System.out.println("\nInterseccion");
    ConjuntoADT<Integer> conjuntoADT_interseccion = conjuntoADT_1.interseccion(conjuntoADT_2);
    System.out.println("interseccion conjuntoADT_1 conjuntoADT_2: " + conjuntoADT_interseccion);

    /*
     * Diferencia
     */
    System.out.println("\nDiferencia");
    ConjuntoADT<Integer> conjuntoADT_diferencia = conjuntoADT_1.diferencia(conjuntoADT_2);
    System.out.println("diferencia conjuntoADT_1 conjuntoADT_2: " + conjuntoADT_diferencia);

    System.out.println("\nIterador");
    for (Integer elemento : conjuntoADT_1) {
        System.out.println("elemento: " + elemento);
    }

}
