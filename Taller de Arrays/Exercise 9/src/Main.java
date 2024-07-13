import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 2, 2, 3, 5, 1, 6, 7, 8, 8, 8};

        rep(list);
    }

    public static void rep(int[] arr) {
        Map<Integer, Integer> conteo = new HashMap<>();

        for (int num : arr) {
            conteo.put(num, conteo.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> listaOrdenada = new ArrayList<>(conteo.entrySet());

        listaOrdenada.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("Elementos repetidos (ordenados por frecuencia):");
        for (Map.Entry<Integer, Integer> entrada : listaOrdenada) {
            System.out.println("El elemento " + entrada.getKey() +
                    " se repite " + entrada.getValue() + " veces.");
        }
    }
}