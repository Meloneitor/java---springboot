import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Ejercicio 14: Convertidor de Temperatura
        System.out.println("¿que deseas convertir?\n" +
                "1.Celsius a Fahrenheit\n" +
                "2.Fahrenheit a Celsius");
        System.out.println("Opcion: ");
        Scanner scanner = new Scanner(System.in);

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese grados Celcius: ");
                float C = scanner.nextFloat();
                float F = C * 9/5 + 32;
                System.out.println(C + "grados Celcius son:" + F + "grados Fahrenheit");
                break;
            case 2:
                System.out.println("Ingrese grados Fahrenheit: ");
                float f = scanner.nextFloat();
                float c = (f - 32) * 5/9;
                System.out.println(f + "grados Fahrenheit son:" + c + "grados Celcius");
                break;

        }
    }
}