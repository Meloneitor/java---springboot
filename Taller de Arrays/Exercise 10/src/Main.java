

public class Main {
    public static void main(String[] args) {
        // Definimos el array original
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Array original:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int inicio = 0;
        int fin = array.length - 1;
        while (inicio < fin) {
            // Intercambiamos los elementos
            int temp = array[inicio];
            array[inicio] = array[fin];
            array[fin] = temp;

            inicio++;
            fin--;
        }

        System.out.println("Array invertido:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}