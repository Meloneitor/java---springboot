import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("""
            Choose the option:
              1.Addition
              2.Subtract
              3.Multiply
              4.Divide
              5.Exit
            """);

            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("Enter a number: ");
                    int num1 = scanner.nextInt();
                    System.out.println("Enter another number: ");
                    int num2 = scanner.nextInt();

                    int suma = num1 + num2;
                    System.out.println(suma);
                    break;
                case 2:
                    System.out.println("Enter a number: ");
                    int num3 = scanner.nextInt();
                    System.out.println("Enter another number: ");
                    int num4 = scanner.nextInt();

                    int resta = num3 - num4;
                    System.out.println(resta);
                    break;
                case 3:
                    System.out.println("Enter a number: ");
                    int num5 = scanner.nextInt();
                    System.out.println("Enter another number: ");
                    int num6 = scanner.nextInt();

                    int multi = num5 * num6;
                    System.out.println(multi);
                    break;
                case 4:
                    System.out.println("Enter a number: ");
                    int num7 = scanner.nextInt();
                    System.out.println("Enter another number: ");
                    int num8 = scanner.nextInt();

                    int div = num7 / num8;
                    System.out.println(div);
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 5);

    }
}