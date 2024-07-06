import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Ejercicio 13: Calculadora de Tarifa de Taxi
        System.out.println("Ingrese los kilometros recorridos");
        Scanner scanner = new Scanner(System.in);
        double kl = scanner.nextDouble();
        scanner.close();
        double valor = 4200;

        double tarifa = kl * valor;

        System.out.println(tarifa);
    }
}