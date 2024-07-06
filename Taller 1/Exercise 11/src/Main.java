import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Ejercicio 11: Ordenando Tres Números
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número:");
        int num3 = scanner.nextInt();

        int menor, medio, mayor;

        scanner.close();

        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            medio = (num2 <= num3) ? num2 : num3;
            mayor = (num2 <= num3) ? num3 : num2;
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            medio = (num1 <= num3) ? num1 : num3;
            mayor = (num1 <= num3) ? num3 : num1;
        } else {
            menor = num3;
            medio = (num1 <= num2) ? num1 : num2;
            mayor = (num1 <= num2) ? num2 : num1;
        }

        System.out.println("Números ordenados de menor a mayor: " + menor + ", " + medio + ", " + mayor);

        // Operador ternario
        System.out.println("Respuesta con operador termario... :)");
        int menor1 = (num1 <= num2 && num1 <= num3) ? num1 : (num2 <= num1 && num2 <= num3) ? num2 : num3;
        int mayor1 = (num1 >= num2 && num1 >= num3) ? num1 : (num2 >= num1 && num2 >= num3) ? num2 : num3;
        int medio1 = (num1 != menor1 && num1 != mayor1) ? num1 : (num2 != menor1 && num2 != mayor1) ? num2 : num3;

        System.out.println("Números ordenados de menor a mayor: " + menor1 + ", " + medio1 + ", " + mayor1);
    }
}