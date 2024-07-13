import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {4, 8, 3},
                {9, 2, 7},
                {3, 7, 1}
        };
        // Imprimir el array bidimensional
        for (int h = 0; h < matrix.length; h++) {
            for (int j = 0; j < matrix[h].length; j++) {
                System.out.print(matrix[h][j] + " ");
            }
            System.out.println();
        }

        int row = matrix.length;
        int colum = matrix[0].length;
        int[][] transposed = new int[colum][row];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < colum; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matriz transpuesta: ");
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }

    }
}