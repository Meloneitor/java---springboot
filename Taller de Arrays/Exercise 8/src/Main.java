public class Main {
    public static void main(String[] args) {
        // Definimos una matriz cuadrada
        int[][] matriz = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        if (esSimetrica(matriz)) {
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz no es simétrica.");
        }
    }

    public static boolean esSimetrica(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            return false;
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}