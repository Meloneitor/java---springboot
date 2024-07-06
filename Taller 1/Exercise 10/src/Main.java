import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Ejercicio 10: Calculadora de Propina
        System.out.println("Ingrese el total de la cuenta");
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        System.out.println("Que porcentaje desea dejar de propina");
        double porcentaje = scanner.nextDouble();

        double por = porcentaje / 100;
        double propina = total * por;
        double todo = total+propina;

        System.out.println("El valor de la propina es: " + propina);
        System.out.println("Valor total a pagar es: " + todo);
    }
}