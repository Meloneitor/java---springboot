import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        System.out.printf("Ingrese su edad: ");

        Scanner scanner = new Scanner(System.in);
        int edad = scanner.nextInt();

        if (edad < 18)
            System.out.println("Usted es menor de edad");
        else if (edad > 18) {
            System.out.println("Excelente, usted es mayor de edad");
        }

        scanner.close();
    }
}