import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Ejercicio 9: Calculadora de Año Bisiesto

        System.out.print("Ingresa un año: ");

        Scanner scanner = new Scanner(System.in);
        int anio = scanner.nextInt();

        scanner.close();

        boolean esBisiesto = false;
        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                if (anio % 400 == 0) {
                    esBisiesto = true;
                }
            } else {
                esBisiesto = true;
            }
        }

        if (esBisiesto) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
    }
}