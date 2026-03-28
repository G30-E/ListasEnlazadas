package umg.edu.gt.listasenlazadas.retos;

import umg.edu.gt.listasenlazadas.simple.SinglyLinkedList;

/**
 * Laboratorio de retos para obligar a extender el codigo base de las estructuras.
 *
 * Cada reto depende de un metodo nuevo que debe implementarse directamente
 * en la clase de estructura correspondiente.
 */
public final class LinkedListChallenges {

    private LinkedListChallenges() {
    }

    public static void run() {
        System.out.println("=== RETOS DE IMPLEMENTACION ===");
        challenge1CountOccurrences();
        System.out.println();
        challenge2ClearList();
        System.out.println();
        challenge3ReverseList();
        System.out.println();
        challenge4RemoveDuplicates();
        System.out.println();
    }

    private static void challenge1CountOccurrences() {
        SinglyLinkedList<String> eventos = new SinglyLinkedList<>();
        eventos.addLast("LOGIN");
        eventos.addLast("CLICK");
        eventos.addLast("LOGIN");
        eventos.addLast("SCROLL");
        eventos.addLast("LOGIN");

        System.out.println("Reto 1 - Analitica de eventos (lista simple)");
        System.out.println("Eventos: " + eventos);
        int totalLogins = eventos.countOccurrences("LOGIN");
        System.out.println("Resultado esperado para LOGIN: 3");
        System.out.println("Resultado obtenido: " + totalLogins);
    }

    private static void challenge2ClearList() {
        SinglyLinkedList<String> tareas = new SinglyLinkedList<>();
        tareas.addLast("Estudiar");
        tareas.addLast("Hacer tarea");
        tareas.addLast("Practicar Java");

        System.out.println("Reto 2 - Limpiar la lista");
        System.out.println("Lista antes de clear: " + tareas);

        tareas.clear();

        System.out.println("Resultado esperado: []");
        System.out.println("Resultado obtenido: " + tareas);
        System.out.println("Lista vacia?: " + tareas.isEmpty());
        System.out.println("Tamano esperado: 0");
        System.out.println("Tamano obtenido: " + tareas.size());
    }

    private static void challenge3ReverseList() {
        SinglyLinkedList<Integer> numeros = new SinglyLinkedList<>();
        numeros.addLast(2);
        numeros.addLast(4);
        numeros.addLast(5);
        numeros.addLast(6);

        System.out.println("Reto 3 - Invertir la lista");
        System.out.println("Lista original: " + numeros);

        numeros.reverse();

        System.out.println("Resultado esperado: [6, 5, 4, 2]");
        System.out.println("Resultado obtenido: " + numeros);
    }

    private static void challenge4RemoveDuplicates() {
        SinglyLinkedList<Integer> numeros = new SinglyLinkedList<>();
        numeros.addLast(2);
        numeros.addLast(4);
        numeros.addLast(5);
        numeros.addLast(4);
        numeros.addLast(6);
        numeros.addLast(2);

        System.out.println("Reto 4 - Eliminar duplicados");
        System.out.println("Lista original: " + numeros);

        numeros.removeDuplicates();

        System.out.println("Resultado esperado: [2, 4, 5, 6]");
        System.out.println("Resultado obtenido: " + numeros);
    }
}
