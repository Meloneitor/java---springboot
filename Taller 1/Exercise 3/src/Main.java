import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ejercicio 3: Conversor de Unidades
        System.out.println("Vamos a convertir Kilometros a millas");
        System.out.println("Ingrese la distancia en kilometros: ");

        Scanner scanner = new Scanner(System.in);
        double klm = scanner.nextDouble();

        double millas = klm / 1.60934;

        System.out.println("El resultado es: " + millas + " millas");
        scanner.close();

    }
}