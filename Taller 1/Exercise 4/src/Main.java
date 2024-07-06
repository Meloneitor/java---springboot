import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ejercicio 4: Calculadora de Índice de Masa Corporal (IMC)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        double MCI = peso/(altura * altura);
        System.out.println("Su MCI es: " + MCI);
        scanner.close();
    }
}