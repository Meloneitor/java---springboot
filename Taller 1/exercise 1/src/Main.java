import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Ejercicio 1: Calculadora Básica
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio #1");
        String mensaje = "¿Que operacion deseas hacer?" +
                "\n1. sumar \n2. restar \n3. Multiplicar \n4. Dividir" +
                "\nOpcion: ";

        System.out.println(mensaje);

        int opt = scanner.nextInt();

        switch (opt){
            case 1:
                System.out.println("Ingresa un numero: ");
                int num1 = scanner.nextInt();
                System.out.println("Ingresa otro numero: ");
                int num2 = scanner.nextInt();

                int suma = num1 + num2;
                System.out.println(suma);
                break;
            case 2:
                System.out.println("Ingresa un numero: ");
                int num3 = scanner.nextInt();
                System.out.println("Ingresa otro numero: ");
                int num4 = scanner.nextInt();

                int resta = num3 - num4;
                System.out.println(resta);
                break;
            case 3:
                System.out.println("Ingresa un numero: ");
                int num5 = scanner.nextInt();
                System.out.println("Ingresa otro numero: ");
                int num6 = scanner.nextInt();

                int multi = num5 * num6;
                System.out.println(multi);
                break;
            case 4:
                System.out.println("Ingresa un numero: ");
                int num7 = scanner.nextInt();
                System.out.println("Ingresa otro numero: ");
                int num8 = scanner.nextInt();

                int div = num7 / num8;
                System.out.println(div);
                break;
            default:
                System.out.println("Escoja bien :)))");
        }
        scanner.close();
    }
}